package com.cqupt.lplum.ContractDetection.app.cli;
import com.google.devtools.common.options.OptionsParser;
import com.cqupt.lplum.ContractDetection.RulesCached;
import com.cqupt.lplum.ContractDetection.RulesXml;
import com.cqupt.lplum.ContractDetection.app.DirectoryAnalysis;
import com.cqupt.lplum.ContractDetection.app.DirectoryAnalysisCombined;
import com.cqupt.lplum.ContractDetection.app.DirectoryAnalysisDefault;
import com.cqupt.lplum.ContractDetection.app.ReportDefault;
import com.cqupt.lplum.ContractDetection.app.SourceLanguage;
import com.cqupt.lplum.ContractDetection.app.SourceLanguages;
import com.cqupt.lplum.ContractDetection.app.TreeFactoryDefault;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathFactory;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;

/**
 *
 */
public final class Tool {

    /**
     * @param args args
     * @throws Exception exception
     */
    public static void main(final String[] args) throws Exception {
        OptionsParser parser = OptionsParser.newOptionsParser(CliOptions.class);
        parser.parseAndExitUponError(args);

        CliOptions options = parser.getOptions(CliOptions.class);

        if (options.help) {
            printUsage(parser);
            System.exit(0);
    }

        if (options.version) {
            System.out.println("ContractDetection, version 2.0");
            System.exit(0);
        }

        Path src = Paths.get(options.path);
        if (!Files.exists(src)) {
            System.err.println("Path not exists");
            printUsage(parser);
            System.exit(1);
        }

        //获取默认规则路径
        Function<SourceLanguage, RulesXml.Source> defaultRules =
                sourceLanguage -> () -> {
            String rulesFileName = sourceLanguage.rulesFileName();
            URI uri = RulesXml
                    .class
                    .getResource(rulesFileName)
                    .toURI();
            try {
                // initialize a new ZipFilesystem
                HashMap<String, String> env = new HashMap<>();
                env.put("create", "true");
                FileSystems.newFileSystem(uri, env);
            } catch (FileSystemAlreadyExistsException ex) {
                // great!
                // appease PMD
                int p = 0;
            }

            return Paths.get(uri);
        };

        //运行检测工具
        Function<SourceLanguage, RulesXml.Source> rules =
                options.rules.stream()
                .map(Paths::get)
                .filter(Files::isRegularFile)
                .<Function<SourceLanguage, RulesXml.Source>>
                        map(path -> language -> () -> path)
                .findAny().orElse(defaultRules);

        new Tool(src, rules).run();
    }

    /**
     * @param parser parser
     */
    private static void printUsage(final OptionsParser parser) {
        System.out.println("Usage: dectionbsr OPTIONS");
        System.out.println(parser.describeOptions(
                Collections.<String, String>emptyMap(),
                OptionsParser.HelpVerbosity.LONG));
    }


    /**
     *
     */
    private final Path source;
    /**
     *
     */
    private final Function<
            ? super SourceLanguage,
            ? extends RulesXml.Source
    > rules;

    /**
     * @param src source
     * @param rs rules
     */
    public Tool(
            final Path src,
            final Function<
                    ? super SourceLanguage,
                    ? extends RulesXml.Source
            > rs
    ) {
        this.source = src;
        this.rules = rs;
    }

    /**
     *
     * @param sourceLanguage source language
     * @return directory analysis
     * @throws Exception exception
     */
    //检测分析创建过程
    private DirectoryAnalysis makeDirectoryAnalysis(
            final SourceLanguage sourceLanguage
    ) throws Exception {
        return new DirectoryAnalysisDefault(
                this.source,
                p -> p.toString().endsWith(sourceLanguage.fileExtension()),
                new TreeFactoryDefault(
                        DocumentBuilderFactory
                                .newInstance()
                                .newDocumentBuilder(),
                        sourceLanguage
                ),
                new RulesCached(
                        new RulesXml(
                                this.rules.apply(sourceLanguage),
                                XPathFactory.newInstance().newXPath(),
                                Throwable::printStackTrace
                        )
                )
        );
    }

    /**
     * @throws Exception exception
     */
    //运行检测并报告漏洞过程
    public void run() throws Exception {
        final Integer[] total = {0};
        new ReportDefault(
                new DirectoryAnalysisCombined(
                    makeDirectoryAnalysis(new SourceLanguages.Solidity()),
                    makeDirectoryAnalysis(new SourceLanguages.Go())
                ),
                info -> {
                    LinkedList<List<String>> report_fields = new LinkedList<>();
                    Map<String, Integer> result = new HashMap<>();
                    info.treeReport().streamUnchecked().forEach(
                            tree -> tree.contexts().forEach(
                                    context -> {
                                        LinkedList<String> fields = new LinkedList<>();
                                        String rule_name;
                                        String rule_description;
                                        try {
                                            URL rule_name_resource = getClass().getClassLoader().getResource(
                                                    String.format(
                                                            "rule_descriptions/%s/name.txt",
                                                            tree.rule().id()));
                                            if (rule_name_resource != null) {
                                                rule_name = new String(Files.readAllBytes(
                                                        Paths.get(rule_name_resource.toURI())));
                                            } else {
                                                rule_name = "";
                                            }
                                        } catch (IOException | URISyntaxException e) {
                                            rule_name = "";
                                        }
                                        try {
                                            URL rule_description_resource = getClass().getClassLoader().getResource(
                                                    String.format(
                                                            "rule_descriptions/%s/description.txt",
                                                            tree.rule().id()));
                                            if (rule_description_resource != null) {
                                                rule_description = new String(Files.readAllBytes(
                                                        Paths.get(rule_description_resource.toURI())));
                                            } else {
                                                rule_description = "";
                                            }
                                        } catch (IOException | URISyntaxException e) {
                                            rule_description = "";
                                        }
                                        fields.addLast("");
                                        fields.addLast(String.format("line:%d",context.getStart().getLine()));
                                        fields.addLast(String.format("severity:%d", tree.pattern().severity()));
                                        fields.addLast(rule_name);
                                        fields.addLast(String.format("rulePattern:%s_%s", tree.rule().id(),
                                                tree.pattern().id()));
                                        fields.addLast(rule_description);
                                        result.compute(
                                                tree.rule().id(),
                                                (k, v) -> Optional
                                                        .ofNullable(v)
                                                        .map(i -> i + 1)
                                                        .orElse(1)
                                        );
                                        report_fields.addLast(fields);
                                    }
                            )
                    );
                    if (!report_fields.isEmpty()) {
                        System.out.println(info.file());
                        System.out.print(formatAsTable(report_fields));
                        total[0] += report_fields.size();
                    }
                }
        )
                .print();
        if (total[0] > 0) {
            System.out.printf("%n\u2716 total: %d errors %n", total[0]);
        }
    }

    public static String formatAsTable(List<List<String>> rows)
    {
        if (rows.isEmpty()) return "";
        int[] maxLengths = new int[rows.get(0).size()];
        for (List<String> row : rows)
        {
            for (int i = 0; i < row.size(); i++)
            {
                maxLengths[i] = Math.max(maxLengths[i], row.get(i).length());
            }
        }

        StringBuilder formatBuilder = new StringBuilder();
        for (int maxLength : maxLengths)
        {
            formatBuilder.append("%-").append(maxLength + 3).append("s");
        }
        String format = formatBuilder.toString();

        StringBuilder result = new StringBuilder();
        for (List<String> row : rows)
        {
            result.append(String.format(format, row.toArray(new String[0]))).append("\n");
        }
        return result.toString();
    }
}
