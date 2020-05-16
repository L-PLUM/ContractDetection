package com.cqupt.lplum.ContractDetection.app;

import com.cqupt.lplum.ContractDetection.ParseTree;
import com.cqupt.lplum.ContractDetection.Source;

/**
 *
 */
public interface SourceLanguage {
    /**
     *
     * @param src src
     * @return ParseTree
     */
    ParseTree createParseTree(Source src);

    /**
     *
     * @return rule names
     */
    String[] getRuleNames();

    /**
     *
     * @return file extension
     */
    String fileExtension();

    /**
     *
     * @return rules file name
     */
    String rulesFileName();
}
