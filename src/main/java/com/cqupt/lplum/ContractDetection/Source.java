package com.cqupt.lplum.ContractDetection;

import org.antlr.v4.runtime.CharStream;

/**
 *
 */
public interface Source {

    /**
     * @return char chars
     * @throws Exception exception
     */
    CharStream chars() throws Exception;
}
