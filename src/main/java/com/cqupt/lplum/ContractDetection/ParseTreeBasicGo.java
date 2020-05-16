package com.cqupt.lplum.ContractDetection;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 *
 */
public final class ParseTreeBasicGo implements ParseTree {

    /**
     *
     */
    private final Source source;

    /**
     * @param src source
     */
    public ParseTreeBasicGo(final Source src) {
        this.source = src;
    }

    private Lexer lexerSetup(Lexer lexer) {
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        return lexer;
    }

    private GoParser parserSetup(GoParser parser) {
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        return parser;
    }

    @Override
    public RuleNode root() throws Exception {
        return parserSetup(
                new GoParser(
                        new CommonTokenStream(
                                lexerSetup(
                                        new GoLexer(
                                                this.source.chars()
                                        )
                                )
                        )
                )
        )
                .sourceUnit();
    }
}
