package com.cqupt.lplum.ContractDetection.app;

import com.cqupt.lplum.ContractDetection.SolidityParser;
import com.cqupt.lplum.ContractDetection.GoParser;
import lombok.EqualsAndHashCode;
import com.cqupt.lplum.ContractDetection.ParseTree;
import com.cqupt.lplum.ContractDetection.ParseTreeBasicSolidity;
import com.cqupt.lplum.ContractDetection.ParseTreeBasicGo;
import com.cqupt.lplum.ContractDetection.Source;

import java.nio.file.Path;

/**
 *
 */
public final class SourceLanguages {

    /**
     *
     */
    private SourceLanguages() { }

    /**
     *
     */
    @EqualsAndHashCode
    public static final class Solidity implements SourceLanguage {
        @Override
        public ParseTree createParseTree(final Source src) {
            return new ParseTreeBasicSolidity(src);
        }

        @Override
        public String[] getRuleNames() {
            return SolidityParser.ruleNames;
        }

        @Override
        public String fileExtension() {
            return ".sol";
        }

        @Override
        public String rulesFileName() {
            return "/solidity-rules.xml";
        }
    }

    /**
     *
     */
    @EqualsAndHashCode
    public static final class Go implements SourceLanguage {
        @Override
        public ParseTree createParseTree(final Source src) {
            return new ParseTreeBasicGo(src);
        }

        @Override
        public String[] getRuleNames() {
            return GoParser.ruleNames;
        }

        @Override
        public String fileExtension() {
            return ".go";
        }

        @Override
        public String rulesFileName() {
            return "/go-rules.xml";
        }
    }

    /**
     *
     * @param file file
     * @return source language
     */
    public static SourceLanguage fromFileName(final Path file) {
        final SourceLanguage solidity = new Solidity();
        if (file.toString().endsWith(solidity.fileExtension())) {
            return solidity;
        }
        final SourceLanguage go = new Go();
        if (file.toString().endsWith(go.fileExtension())) {
            return go;
        }
        return null;
    }
}
