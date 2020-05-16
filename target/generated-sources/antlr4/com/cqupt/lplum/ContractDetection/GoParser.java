// Generated from com\cqupt\lplum\ContractDetection\Go.g4 by ANTLR 4.7
package com.cqupt.lplum.ContractDetection;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, IDENTIFIER=62, KEYWORD=63, BINARY_OP=64, INT_LIT=65, 
		FLOAT_LIT=66, IMAGINARY_LIT=67, RUNE_LIT=68, LITTLE_U_VALUE=69, BIG_U_VALUE=70, 
		STRING_LIT=71, WS=72, COMMENT=73, TERMINATOR=74, LINE_COMMENT=75;
	public static final int
		RULE_sourceUnit = 0, RULE_packageDefinition = 1, RULE_importDefinition = 2, 
		RULE_importDeclaration = 3, RULE_importPath = 4, RULE_contractDefinition = 5, 
		RULE_declaration = 6, RULE_constDefinition = 7, RULE_constDeclaration = 8, 
		RULE_identifierList = 9, RULE_expressionList = 10, RULE_typeDefinition = 11, 
		RULE_typeDeclaration = 12, RULE_functionDefinition = 13, RULE_function = 14, 
		RULE_methodDefinition = 15, RULE_receiver = 16, RULE_varDefinition = 17, 
		RULE_varDeclaration = 18, RULE_block = 19, RULE_statementList = 20, RULE_statement = 21, 
		RULE_simpleStatement = 22, RULE_expressionStatement = 23, RULE_sendStatement = 24, 
		RULE_incDecStatement = 25, RULE_assignment = 26, RULE_assignOperator = 27, 
		RULE_shortVarDefinition = 28, RULE_emptyStatement = 29, RULE_labeledStatement = 30, 
		RULE_returnStatement = 31, RULE_breakStatement = 32, RULE_continueStatement = 33, 
		RULE_gotoStatement = 34, RULE_fallthroughStatement = 35, RULE_deferStatement = 36, 
		RULE_ifStatement = 37, RULE_switchStatement = 38, RULE_expressionSwitchStatement = 39, 
		RULE_expressionCaseClause = 40, RULE_expressionSwitchCase = 41, RULE_typeSwitchStatement = 42, 
		RULE_typeSwitchGuard = 43, RULE_typeCaseClause = 44, RULE_typeSwitchCase = 45, 
		RULE_typeSwitchCaseList = 46, RULE_selectStatement = 47, RULE_commClause = 48, 
		RULE_commCase = 49, RULE_recvStatement = 50, RULE_forStatement = 51, RULE_forClause = 52, 
		RULE_rangeClause = 53, RULE_goStatement = 54, RULE_typeExpression = 55, 
		RULE_typeName = 56, RULE_typeLiteral = 57, RULE_arrayType = 58, RULE_arrayLength = 59, 
		RULE_elementType = 60, RULE_pointerType = 61, RULE_interfaceType = 62, 
		RULE_sliceType = 63, RULE_mapType = 64, RULE_channelType = 65, RULE_methodDeclaration = 66, 
		RULE_functionType = 67, RULE_signature = 68, RULE_result = 69, RULE_parameters = 70, 
		RULE_parameterList = 71, RULE_parameterDeclaration = 72, RULE_operand = 73, 
		RULE_literal = 74, RULE_basicLiteral = 75, RULE_operandName = 76, RULE_qualifiedIdent = 77, 
		RULE_compositeLiteral = 78, RULE_literalType = 79, RULE_literalValue = 80, 
		RULE_elementList = 81, RULE_keyedElement = 82, RULE_key = 83, RULE_element = 84, 
		RULE_structType = 85, RULE_fieldDeclaration = 86, RULE_anonymousField = 87, 
		RULE_functionLiteral = 88, RULE_primaryExpression = 89, RULE_selectorType = 90, 
		RULE_index = 91, RULE_slice = 92, RULE_typeAssertion = 93, RULE_arguments = 94, 
		RULE_methodExpression = 95, RULE_receiverType = 96, RULE_expression = 97, 
		RULE_unaryExpression = 98, RULE_conversion = 99, RULE_identifier = 100, 
		RULE_end = 101;
	public static final String[] ruleNames = {
		"sourceUnit", "packageDefinition", "importDefinition", "importDeclaration", 
		"importPath", "contractDefinition", "declaration", "constDefinition", 
		"constDeclaration", "identifierList", "expressionList", "typeDefinition", 
		"typeDeclaration", "functionDefinition", "function", "methodDefinition", 
		"receiver", "varDefinition", "varDeclaration", "block", "statementList", 
		"statement", "simpleStatement", "expressionStatement", "sendStatement", 
		"incDecStatement", "assignment", "assignOperator", "shortVarDefinition", 
		"emptyStatement", "labeledStatement", "returnStatement", "breakStatement", 
		"continueStatement", "gotoStatement", "fallthroughStatement", "deferStatement", 
		"ifStatement", "switchStatement", "expressionSwitchStatement", "expressionCaseClause", 
		"expressionSwitchCase", "typeSwitchStatement", "typeSwitchGuard", "typeCaseClause", 
		"typeSwitchCase", "typeSwitchCaseList", "selectStatement", "commClause", 
		"commCase", "recvStatement", "forStatement", "forClause", "rangeClause", 
		"goStatement", "typeExpression", "typeName", "typeLiteral", "arrayType", 
		"arrayLength", "elementType", "pointerType", "interfaceType", "sliceType", 
		"mapType", "channelType", "methodDeclaration", "functionType", "signature", 
		"result", "parameters", "parameterList", "parameterDeclaration", "operand", 
		"literal", "basicLiteral", "operandName", "qualifiedIdent", "compositeLiteral", 
		"literalType", "literalValue", "elementList", "keyedElement", "key", "element", 
		"structType", "fieldDeclaration", "anonymousField", "functionLiteral", 
		"primaryExpression", "selectorType", "index", "slice", "typeAssertion", 
		"arguments", "methodExpression", "receiverType", "expression", "unaryExpression", 
		"conversion", "identifier", "end"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "'import'", "'('", "')'", "'.'", "'const'", "'='", 
		"','", "'type'", "'func'", "'var'", "'{'", "'}'", "'<-'", "'++'", "'--'", 
		"'+'", "'-'", "'|'", "'^'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'&'", 
		"'&^'", "':='", "';'", "':'", "'return'", "'break'", "'continue'", "'goto'", 
		"'fallthrough'", "'defer'", "'if'", "'else'", "'switch'", "'case'", "'default'", 
		"'select'", "'for'", "'range'", "'go'", "'['", "']'", "'interface'", "'map'", 
		"'chan'", "'...'", "'struct'", "'||'", "'&&'", "'=='", "'!='", "'<'", 
		"'<='", "'>'", "'>='", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "IDENTIFIER", "KEYWORD", "BINARY_OP", "INT_LIT", "FLOAT_LIT", 
		"IMAGINARY_LIT", "RUNE_LIT", "LITTLE_U_VALUE", "BIG_U_VALUE", "STRING_LIT", 
		"WS", "COMMENT", "TERMINATOR", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Go.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    /**
	     * @return {@code true} iff on the current index of the parser's
	     * token stream a token exists on the {@code HIDDEN} channel which
	     * either is a line terminator, or is a multi line comment that
	     * contains a line terminator.
	     */
	    private boolean lineTerminatorAhead() {
	        // 获取ahead符号的当前索引
	        int possibleIndexEndToken = this.getCurrentToken().getTokenIndex() - 1;
	        Token ahead = _input.get(possibleIndexEndToken);
	        if (ahead.getChannel() != Lexer.HIDDEN) {
	            // 只获取 HIDDEN 通道的符号.
	            return false;
	        }

	        if (ahead.getType() == TERMINATOR) {
	            // 一定有一个行终止符ahead
	            return true;
	        }

	        if (ahead.getType() == WS) {
	            // 获取当前为空白的符号ahead
	            possibleIndexEndToken = this.getCurrentToken().getTokenIndex() - 2;
	            ahead = _input.get(possibleIndexEndToken);
	        }

	        // 获取符号的文本和类型
	        String text = ahead.getText();
	        int typeExpression = ahead.getType();

	        // 检查符号的类型
	        return (typeExpression == COMMENT && (text.contains("\r") || text.contains("\n"))) ||
	                (typeExpression == TERMINATOR);
	    }

	     /**
	     * @return {@code true} if no line terminator exists between the specified
	     * token offset and the prior one on the {@code HIDDEN} channel.
	     */
	    private boolean noTerminatorBetween(int tokenOffset) {
	        BufferedTokenStream stream = (BufferedTokenStream)_input;
	        List<Token> tokens = stream.getHiddenTokensToLeft(stream.LT(tokenOffset).getTokenIndex());

	        if (tokens == null) {
	            return true;
	        }

	        for (Token token : tokens) {
	            if (token.getText().contains("\n"))
	                return false;
	        }

	        return true;
	    }

	     /**
	     * @return {@code true} if no line terminator exists after any encounterd
	     * parameters beyond the specified token offset and the next on the
	     * {@code HIDDEN} channel.
	     */
	    private boolean noTerminatorAfterParams(int tokenOffset) {
	        BufferedTokenStream stream = (BufferedTokenStream)_input;
	        int leftParams = 1;
	        int rightParams = 0;
	        String value;
	        if (stream.LT(tokenOffset).getText().equals("(")) {
	            //扫描过去的参数
	            while (leftParams != rightParams) {
	                tokenOffset++;
	                value = stream.LT(tokenOffset).getText();
	                if (value.equals("(")) {
	                    leftParams++;
	                }
	                else if (value.equals(")")) {
	                    rightParams++;
	                }
	            }

	            tokenOffset++;
	            return noTerminatorBetween(tokenOffset);
	        }

	        return true;
	    }

	public GoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceUnitContext extends ParserRuleContext {
		public PackageDefinitionContext packageDefinition() {
			return getRuleContext(PackageDefinitionContext.class,0);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public List<ImportDefinitionContext> importDefinition() {
			return getRuleContexts(ImportDefinitionContext.class);
		}
		public ImportDefinitionContext importDefinition(int i) {
			return getRuleContext(ImportDefinitionContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitSourceUnit(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			packageDefinition();
			setState(205);
			end();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(206);
				importDefinition();
				setState(207);
				end();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				{
				setState(214);
				contractDefinition();
				setState(215);
				end();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterPackageDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitPackageDefinition(this);
		}
	}

	public final PackageDefinitionContext packageDefinition() throws RecognitionException {
		PackageDefinitionContext _localctx = new PackageDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__0);
			setState(223);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDefinitionContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public ImportDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterImportDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitImportDefinition(this);
		}
	}

	public final ImportDefinitionContext importDefinition() throws RecognitionException {
		ImportDefinitionContext _localctx = new ImportDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__1);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case IDENTIFIER:
			case STRING_LIT:
				{
				setState(226);
				importDeclaration();
				}
				break;
			case T__2:
				{
				setState(227);
				match(T__2);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4 || _la==IDENTIFIER || _la==STRING_LIT) {
					{
					{
					setState(228);
					importDeclaration();
					setState(229);
					end();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(239);
				match(T__4);
				}
				break;
			case IDENTIFIER:
				{
				setState(240);
				identifier();
				}
				break;
			case STRING_LIT:
				break;
			default:
				break;
			}
			setState(243);
			importPath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(GoParser.STRING_LIT, 0); }
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitImportPath(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(STRING_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractDefinitionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitContractDefinition(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_contractDefinition);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				methodDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ConstDefinitionContext constDefinition() {
			return getRuleContext(ConstDefinitionContext.class,0);
		}
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
		}
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				constDefinition();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				typeDefinition();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				varDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDefinitionContext extends ParserRuleContext {
		public List<ConstDeclarationContext> constDeclaration() {
			return getRuleContexts(ConstDeclarationContext.class);
		}
		public ConstDeclarationContext constDeclaration(int i) {
			return getRuleContext(ConstDeclarationContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public ConstDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterConstDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitConstDefinition(this);
		}
	}

	public final ConstDefinitionContext constDefinition() throws RecognitionException {
		ConstDefinitionContext _localctx = new ConstDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__5);
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(258);
				constDeclaration();
				}
				break;
			case T__2:
				{
				setState(259);
				match(T__2);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(260);
					constDeclaration();
					setState(261);
					end();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			identifierList();
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__20) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(272);
					typeExpression();
					}
				}

				setState(275);
				match(T__6);
				setState(276);
				expressionList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			identifier();
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					match(T__7);
					setState(281);
					identifier();
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expression(0);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					match(T__7);
					setState(289);
					expression(0);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeDefinition(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__8);
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(296);
				typeDeclaration();
				}
				break;
			case T__2:
				{
				setState(297);
				match(T__2);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(298);
					typeDeclaration();
					setState(299);
					end();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			identifier();
			setState(310);
			typeExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__9);
			setState(313);
			identifier();
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(314);
				function();
				}
				break;
			case 2:
				{
				setState(315);
				signature();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			signature();
			setState(319);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefinitionContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitMethodDefinition(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__9);
			setState(322);
			receiver();
			setState(323);
			identifier();
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(324);
				function();
				}
				break;
			case 2:
				{
				setState(325);
				signature();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefinitionContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitVarDefinition(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__10);
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(331);
				varDeclaration();
				}
				break;
			case T__2:
				{
				setState(332);
				match(T__2);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(333);
					varDeclaration();
					setState(334);
					end();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			identifierList();
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__13:
			case T__20:
			case T__45:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case IDENTIFIER:
				{
				setState(345);
				typeExpression();
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(346);
					match(T__6);
					setState(347);
					expressionList();
					}
					break;
				}
				}
				break;
			case T__6:
				{
				setState(350);
				match(T__6);
				setState(351);
				expressionList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__11);
			setState(355);
			statementList();
			setState(356);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				{
				setState(358);
				statement();
				setState(359);
				end();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public GoStatementContext goStatement() {
			return getRuleContext(GoStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public FallthroughStatementContext fallthroughStatement() {
			return getRuleContext(FallthroughStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public DeferStatementContext deferStatement() {
			return getRuleContext(DeferStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				simpleStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				goStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				breakStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(372);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(373);
				gotoStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(374);
				fallthroughStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(375);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(376);
				ifStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(377);
				switchStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(378);
				selectStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(379);
				forStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(380);
				deferStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public SendStatementContext sendStatement() {
			return getRuleContext(SendStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IncDecStatementContext incDecStatement() {
			return getRuleContext(IncDecStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ShortVarDefinitionContext shortVarDefinition() {
			return getRuleContext(ShortVarDefinitionContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simpleStatement);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				sendStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				incDecStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(387);
				shortVarDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				emptyStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SendStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SendStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterSendStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitSendStatement(this);
		}
	}

	public final SendStatementContext sendStatement() throws RecognitionException {
		SendStatementContext _localctx = new SendStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sendStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			expression(0);
			setState(394);
			match(T__13);
			setState(395);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncDecStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterIncDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitIncDecStatement(this);
		}
	}

	public final IncDecStatementContext incDecStatement() throws RecognitionException {
		IncDecStatementContext _localctx = new IncDecStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_incDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			expression(0);
			setState(398);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			expressionList();
			setState(401);
			assignOperator();
			setState(402);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignOperatorContext extends ParserRuleContext {
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitAssignOperator(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) {
				{
				setState(404);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(407);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortVarDefinitionContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ShortVarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortVarDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterShortVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitShortVarDefinition(this);
		}
	}

	public final ShortVarDefinitionContext shortVarDefinition() throws RecognitionException {
		ShortVarDefinitionContext _localctx = new ShortVarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_shortVarDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			identifierList();
			setState(410);
			match(T__27);
			setState(411);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			identifier();
			setState(416);
			match(T__29);
			setState(417);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__30);
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(420);
				expressionList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__31);
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(424);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T__32);
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(428);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitGotoStatement(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__33);
			setState(432);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FallthroughStatementContext extends ParserRuleContext {
		public FallthroughStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterFallthroughStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitFallthroughStatement(this);
		}
	}

	public final FallthroughStatementContext fallthroughStatement() throws RecognitionException {
		FallthroughStatementContext _localctx = new FallthroughStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fallthroughStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeferStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterDeferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitDeferStatement(this);
		}
	}

	public final DeferStatementContext deferStatement() throws RecognitionException {
		DeferStatementContext _localctx = new DeferStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_deferStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(T__35);
			setState(437);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__36);
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(440);
				simpleStatement();
				setState(441);
				match(T__28);
				}
				break;
			}
			setState(445);
			expression(0);
			setState(446);
			block();
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(447);
				match(T__37);
				setState(450);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__36:
					{
					setState(448);
					ifStatement();
					}
					break;
				case T__11:
					{
					setState(449);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionSwitchStatementContext expressionSwitchStatement() {
			return getRuleContext(ExpressionSwitchStatementContext.class,0);
		}
		public TypeSwitchStatementContext typeSwitchStatement() {
			return getRuleContext(TypeSwitchStatementContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_switchStatement);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				expressionSwitchStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				typeSwitchStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSwitchStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ExpressionCaseClauseContext> expressionCaseClause() {
			return getRuleContexts(ExpressionCaseClauseContext.class);
		}
		public ExpressionCaseClauseContext expressionCaseClause(int i) {
			return getRuleContext(ExpressionCaseClauseContext.class,i);
		}
		public ExpressionSwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSwitchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterExpressionSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitExpressionSwitchStatement(this);
		}
	}

	public final ExpressionSwitchStatementContext expressionSwitchStatement() throws RecognitionException {
		ExpressionSwitchStatementContext _localctx = new ExpressionSwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionSwitchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__38);
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(459);
				simpleStatement();
				setState(460);
				match(T__28);
				}
				break;
			}
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				setState(464);
				expression(0);
				}
			}

			setState(467);
			match(T__11);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==T__40) {
				{
				{
				setState(468);
				expressionCaseClause();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionCaseClauseContext extends ParserRuleContext {
		public ExpressionSwitchCaseContext expressionSwitchCase() {
			return getRuleContext(ExpressionSwitchCaseContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExpressionCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterExpressionCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitExpressionCaseClause(this);
		}
	}

	public final ExpressionCaseClauseContext expressionCaseClause() throws RecognitionException {
		ExpressionCaseClauseContext _localctx = new ExpressionCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			expressionSwitchCase();
			setState(477);
			match(T__29);
			setState(478);
			statementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSwitchCaseContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterExpressionSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitExpressionSwitchCase(this);
		}
	}

	public final ExpressionSwitchCaseContext expressionSwitchCase() throws RecognitionException {
		ExpressionSwitchCaseContext _localctx = new ExpressionSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionSwitchCase);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(T__39);
				setState(481);
				expressionList();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(T__40);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSwitchStatementContext extends ParserRuleContext {
		public TypeSwitchGuardContext typeSwitchGuard() {
			return getRuleContext(TypeSwitchGuardContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public List<TypeCaseClauseContext> typeCaseClause() {
			return getRuleContexts(TypeCaseClauseContext.class);
		}
		public TypeCaseClauseContext typeCaseClause(int i) {
			return getRuleContext(TypeCaseClauseContext.class,i);
		}
		public TypeSwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeSwitchStatement(this);
		}
	}

	public final TypeSwitchStatementContext typeSwitchStatement() throws RecognitionException {
		TypeSwitchStatementContext _localctx = new TypeSwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeSwitchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__38);
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(486);
				simpleStatement();
				setState(487);
				match(T__28);
				}
				break;
			}
			setState(491);
			typeSwitchGuard();
			setState(492);
			match(T__11);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==T__40) {
				{
				{
				setState(493);
				typeCaseClause();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSwitchGuardContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeSwitchGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeSwitchGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeSwitchGuard(this);
		}
	}

	public final TypeSwitchGuardContext typeSwitchGuard() throws RecognitionException {
		TypeSwitchGuardContext _localctx = new TypeSwitchGuardContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(501);
				identifier();
				setState(502);
				match(T__27);
				}
				break;
			}
			setState(506);
			primaryExpression(0);
			setState(507);
			match(T__4);
			setState(508);
			match(T__2);
			setState(509);
			match(T__8);
			setState(510);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCaseClauseContext extends ParserRuleContext {
		public TypeSwitchCaseContext typeSwitchCase() {
			return getRuleContext(TypeSwitchCaseContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TypeCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeCaseClause(this);
		}
	}

	public final TypeCaseClauseContext typeCaseClause() throws RecognitionException {
		TypeCaseClauseContext _localctx = new TypeCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			typeSwitchCase();
			setState(513);
			match(T__29);
			setState(514);
			statementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSwitchCaseContext extends ParserRuleContext {
		public TypeSwitchCaseListContext typeSwitchCaseList() {
			return getRuleContext(TypeSwitchCaseListContext.class,0);
		}
		public TypeSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeSwitchCase(this);
		}
	}

	public final TypeSwitchCaseContext typeSwitchCase() throws RecognitionException {
		TypeSwitchCaseContext _localctx = new TypeSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeSwitchCase);
		try {
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(T__39);
				setState(517);
				typeSwitchCaseList();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(T__40);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSwitchCaseListContext extends ParserRuleContext {
		public List<TypeExpressionContext> typeExpression() {
			return getRuleContexts(TypeExpressionContext.class);
		}
		public TypeExpressionContext typeExpression(int i) {
			return getRuleContext(TypeExpressionContext.class,i);
		}
		public TypeSwitchCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchCaseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeSwitchCaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeSwitchCaseList(this);
		}
	}

	public final TypeSwitchCaseListContext typeSwitchCaseList() throws RecognitionException {
		TypeSwitchCaseListContext _localctx = new TypeSwitchCaseListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeSwitchCaseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			typeExpression();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(522);
				match(T__7);
				setState(523);
				typeExpression();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public List<CommClauseContext> commClause() {
			return getRuleContexts(CommClauseContext.class);
		}
		public CommClauseContext commClause(int i) {
			return getRuleContext(CommClauseContext.class,i);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitSelectStatement(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(T__41);
			setState(530);
			match(T__11);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==T__40) {
				{
				{
				setState(531);
				commClause();
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommClauseContext extends ParserRuleContext {
		public CommCaseContext commCase() {
			return getRuleContext(CommCaseContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CommClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterCommClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitCommClause(this);
		}
	}

	public final CommClauseContext commClause() throws RecognitionException {
		CommClauseContext _localctx = new CommClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_commClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			commCase();
			setState(540);
			match(T__29);
			setState(541);
			statementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommCaseContext extends ParserRuleContext {
		public SendStatementContext sendStatement() {
			return getRuleContext(SendStatementContext.class,0);
		}
		public RecvStatementContext recvStatement() {
			return getRuleContext(RecvStatementContext.class,0);
		}
		public CommCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterCommCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitCommCase(this);
		}
	}

	public final CommCaseContext commCase() throws RecognitionException {
		CommCaseContext _localctx = new CommCaseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_commCase);
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(T__39);
				setState(546);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(544);
					sendStatement();
					}
					break;
				case 2:
					{
					setState(545);
					recvStatement();
					}
					break;
				}
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				match(T__40);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecvStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public RecvStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recvStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterRecvStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitRecvStatement(this);
		}
	}

	public final RecvStatementContext recvStatement() throws RecognitionException {
		RecvStatementContext _localctx = new RecvStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_recvStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(551);
				expressionList();
				setState(552);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(554);
				identifierList();
				setState(555);
				match(T__27);
				}
				break;
			}
			setState(559);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(T__42);
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(562);
				expression(0);
				}
				break;
			case 2:
				{
				setState(563);
				forClause();
				}
				break;
			case 3:
				{
				setState(564);
				rangeClause();
				}
				break;
			}
			setState(567);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public List<SimpleStatementContext> simpleStatement() {
			return getRuleContexts(SimpleStatementContext.class);
		}
		public SimpleStatementContext simpleStatement(int i) {
			return getRuleContext(SimpleStatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitForClause(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(569);
				simpleStatement();
				}
				break;
			}
			setState(572);
			match(T__28);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				setState(573);
				expression(0);
				}
			}

			setState(576);
			match(T__28);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__28) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				setState(577);
				simpleStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitRangeClause(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(580);
				expressionList();
				setState(581);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(583);
				identifierList();
				setState(584);
				match(T__27);
				}
				break;
			}
			setState(588);
			match(T__43);
			setState(589);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterGoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitGoStatement(this);
		}
	}

	public final GoStatementContext goStatement() throws RecognitionException {
		GoStatementContext _localctx = new GoStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_goStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(T__44);
			setState(592);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeLiteralContext typeLiteral() {
			return getRuleContext(TypeLiteralContext.class,0);
		}
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeExpression(this);
		}
	}

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeExpression);
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				typeName();
				}
				break;
			case T__9:
			case T__13:
			case T__20:
			case T__45:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				typeLiteral();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				match(T__2);
				setState(597);
				typeExpression();
				setState(598);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeName);
		try {
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				qualifiedIdent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeLiteralContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public ChannelTypeContext channelType() {
			return getRuleContext(ChannelTypeContext.class,0);
		}
		public TypeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeLiteral(this);
		}
	}

	public final TypeLiteralContext typeLiteral() throws RecognitionException {
		TypeLiteralContext _localctx = new TypeLiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeLiteral);
		try {
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				pointerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(609);
				functionType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(610);
				interfaceType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(611);
				sliceType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(612);
				mapType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(613);
				channelType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(T__45);
			setState(617);
			arrayLength();
			setState(618);
			match(T__46);
			setState(619);
			elementType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitArrayLength(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementTypeContext extends ParserRuleContext {
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitElementType(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			typeExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerTypeContext extends ParserRuleContext {
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitPointerType(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(T__20);
			setState(626);
			typeExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_interfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(T__47);
			setState(629);
			match(T__11);
			setState(635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(630);
					methodDeclaration();
					setState(631);
					end();
					}
					} 
				}
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(638);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SliceTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterSliceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitSliceType(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(T__45);
			setState(641);
			match(T__46);
			setState(642);
			elementType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapTypeContext extends ParserRuleContext {
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitMapType(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(T__48);
			setState(645);
			match(T__45);
			setState(646);
			typeExpression();
			setState(647);
			match(T__46);
			setState(648);
			elementType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChannelTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ChannelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterChannelType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitChannelType(this);
		}
	}

	public final ChannelTypeContext channelType() throws RecognitionException {
		ChannelTypeContext _localctx = new ChannelTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_channelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(650);
				match(T__49);
				}
				break;
			case 2:
				{
				setState(651);
				match(T__49);
				setState(652);
				match(T__13);
				}
				break;
			case 3:
				{
				setState(653);
				match(T__13);
				setState(654);
				match(T__49);
				}
				break;
			}
			setState(657);
			elementType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_methodDeclaration);
		try {
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				if (!(noTerminatorAfterParams(2))) throw new FailedPredicateException(this, "noTerminatorAfterParams(2)");
				setState(660);
				identifier();
				setState(661);
				parameters();
				setState(662);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				typeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				identifier();
				setState(666);
				parameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(T__9);
			setState(671);
			signature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitSignature(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_signature);
		try {
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				if (!(noTerminatorAfterParams(1))) throw new FailedPredicateException(this, "noTerminatorAfterParams(1)");
				setState(674);
				parameters();
				setState(675);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				parameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_result);
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				typeExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(T__2);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__20) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(685);
				parameterList();
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(686);
					match(T__7);
					}
				}

				}
			}

			setState(691);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			parameterDeclaration();
			setState(698);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(694);
					match(T__7);
					setState(695);
					parameterDeclaration();
					}
					} 
				}
				setState(700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(701);
				identifierList();
				}
				break;
			}
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__50) {
				{
				setState(704);
				match(T__50);
				}
			}

			setState(707);
			typeExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandNameContext operandName() {
			return getRuleContext(OperandNameContext.class,0);
		}
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_operand);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				methodExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				match(T__2);
				setState(713);
				expression(0);
				setState(714);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public BasicLiteralContext basicLiteral() {
			return getRuleContext(BasicLiteralContext.class,0);
		}
		public CompositeLiteralContext compositeLiteral() {
			return getRuleContext(CompositeLiteralContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_literal);
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				basicLiteral();
				}
				break;
			case T__45:
			case T__48:
			case T__51:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				compositeLiteral();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				functionLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicLiteralContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(GoParser.INT_LIT, 0); }
		public TerminalNode FLOAT_LIT() { return getToken(GoParser.FLOAT_LIT, 0); }
		public TerminalNode IMAGINARY_LIT() { return getToken(GoParser.IMAGINARY_LIT, 0); }
		public TerminalNode RUNE_LIT() { return getToken(GoParser.RUNE_LIT, 0); }
		public TerminalNode STRING_LIT() { return getToken(GoParser.STRING_LIT, 0); }
		public BasicLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterBasicLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitBasicLiteral(this);
		}
	}

	public final BasicLiteralContext basicLiteral() throws RecognitionException {
		BasicLiteralContext _localctx = new BasicLiteralContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_basicLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterOperandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitOperandName(this);
		}
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_operandName);
		try {
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				qualifiedIdent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterQualifiedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitQualifiedIdent(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			identifier();
			setState(730);
			match(T__4);
			setState(731);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositeLiteralContext extends ParserRuleContext {
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public CompositeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterCompositeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitCompositeLiteral(this);
		}
	}

	public final CompositeLiteralContext compositeLiteral() throws RecognitionException {
		CompositeLiteralContext _localctx = new CompositeLiteralContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_compositeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			literalType();
			setState(734);
			literalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralTypeContext extends ParserRuleContext {
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterLiteralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitLiteralType(this);
		}
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_literalType);
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				structType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(738);
				match(T__45);
				setState(739);
				match(T__50);
				setState(740);
				match(T__46);
				setState(741);
				elementType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(742);
				sliceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(743);
				mapType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(744);
				typeName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralValueContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitLiteralValue(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_literalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(T__11);
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				setState(748);
				elementList();
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(749);
					match(T__7);
					}
				}

				}
			}

			setState(754);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<KeyedElementContext> keyedElement() {
			return getRuleContexts(KeyedElementContext.class);
		}
		public KeyedElementContext keyedElement(int i) {
			return getRuleContext(KeyedElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_elementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			keyedElement();
			setState(761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(757);
					match(T__7);
					setState(758);
					keyedElement();
					}
					} 
				}
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyedElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public KeyedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterKeyedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitKeyedElement(this);
		}
	}

	public final KeyedElementContext keyedElement() throws RecognitionException {
		KeyedElementContext _localctx = new KeyedElementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_keyedElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(764);
				key();
				setState(765);
				match(T__29);
				}
				break;
			}
			setState(769);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_key);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(773);
				literalValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_element);
		try {
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__13:
			case T__16:
			case T__17:
			case T__19:
			case T__20:
			case T__25:
			case T__45:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case T__60:
			case IDENTIFIER:
			case INT_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				expression(0);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				literalValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructTypeContext extends ParserRuleContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitStructType(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_structType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(T__51);
			setState(781);
			match(T__11);
			setState(787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(782);
					fieldDeclaration();
					setState(783);
					end();
					}
					} 
				}
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(790);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public AnonymousFieldContext anonymousField() {
			return getRuleContext(AnonymousFieldContext.class,0);
		}
		public TerminalNode STRING_LIT() { return getToken(GoParser.STRING_LIT, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(792);
				if (!(noTerminatorBetween(2))) throw new FailedPredicateException(this, "noTerminatorBetween(2)");
				setState(793);
				identifierList();
				setState(794);
				typeExpression();
				}
				break;
			case 2:
				{
				setState(796);
				anonymousField();
				}
				break;
			}
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(799);
				match(STRING_LIT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousFieldContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AnonymousFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterAnonymousField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitAnonymousField(this);
		}
	}

	public final AnonymousFieldContext anonymousField() throws RecognitionException {
		AnonymousFieldContext _localctx = new AnonymousFieldContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_anonymousField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(802);
				match(T__20);
				}
			}

			setState(805);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionLiteralContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterFunctionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitFunctionLiteral(this);
		}
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_functionLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(T__9);
			setState(808);
			function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SelectorTypeContext selectorType() {
			return getRuleContext(SelectorTypeContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public SliceContext slice() {
			return getRuleContext(SliceContext.class,0);
		}
		public TypeAssertionContext typeAssertion() {
			return getRuleContext(TypeAssertionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_primaryExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(811);
				operand();
				}
				break;
			case 2:
				{
				setState(812);
				conversion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(827);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(825);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(815);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(816);
						selectorType();
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(817);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(818);
						index();
						}
						break;
					case 3:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(819);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(820);
						slice();
						}
						break;
					case 4:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(821);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(822);
						typeAssertion();
						}
						break;
					case 5:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(823);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(824);
						arguments();
						}
						break;
					}
					} 
				}
				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectorTypeContext extends ParserRuleContext {
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public SelectorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterSelectorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitSelectorType(this);
		}
	}

	public final SelectorTypeContext selectorType() throws RecognitionException {
		SelectorTypeContext _localctx = new SelectorTypeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_selectorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(T__4);
			setState(831);
			typeExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(T__45);
			setState(834);
			expression(0);
			setState(835);
			match(T__46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SliceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitSlice(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_slice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(T__45);
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				{
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
					{
					setState(838);
					expression(0);
					}
				}

				setState(841);
				match(T__29);
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
					{
					setState(842);
					expression(0);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
					{
					setState(845);
					expression(0);
					}
				}

				setState(848);
				match(T__29);
				setState(849);
				expression(0);
				setState(850);
				match(T__29);
				setState(851);
				expression(0);
				}
				}
				break;
			}
			setState(855);
			match(T__46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAssertionContext extends ParserRuleContext {
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TypeAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeAssertion(this);
		}
	}

	public final TypeAssertionContext typeAssertion() throws RecognitionException {
		TypeAssertionContext _localctx = new TypeAssertionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(T__4);
			setState(858);
			match(T__2);
			setState(859);
			typeExpression();
			setState(860);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(T__2);
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__60) | (1L << IDENTIFIER))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT_LIT - 65)) | (1L << (FLOAT_LIT - 65)) | (1L << (IMAGINARY_LIT - 65)) | (1L << (RUNE_LIT - 65)) | (1L << (STRING_LIT - 65)))) != 0)) {
				{
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(863);
					expressionList();
					}
					break;
				case 2:
					{
					setState(864);
					typeExpression();
					setState(867);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(865);
						match(T__7);
						setState(866);
						expressionList();
						}
						break;
					}
					}
					break;
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(871);
					match(T__50);
					}
				}

				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(874);
					match(T__7);
					}
				}

				}
			}

			setState(879);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodExpressionContext extends ParserRuleContext {
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitMethodExpression(this);
		}
	}

	public final MethodExpressionContext methodExpression() throws RecognitionException {
		MethodExpressionContext _localctx = new MethodExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_methodExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			receiverType();
			setState(882);
			match(T__4);
			setState(883);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public ReceiverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterReceiverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitReceiverType(this);
		}
	}

	public final ReceiverTypeContext receiverType() throws RecognitionException {
		ReceiverTypeContext _localctx = new ReceiverTypeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_receiverType);
		try {
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				match(T__2);
				setState(887);
				match(T__20);
				setState(888);
				typeName();
				setState(889);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(891);
				match(T__2);
				setState(892);
				receiverType();
				setState(893);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(898);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(900);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(901);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(902);
					expression(2);
					}
					} 
				}
				setState(907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_unaryExpression);
		int _la;
		try {
			setState(911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				primaryExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__60))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(910);
				unaryExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionContext extends ParserRuleContext {
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitConversion(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			typeExpression();
			setState(914);
			match(T__2);
			setState(915);
			expression(0);
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(916);
				match(T__7);
				}
			}

			setState(919);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GoParser.EOF, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_end);
		try {
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(925);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(926);
				if (!(_input.LT(1).getText().equals("}") )) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"}\") ");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 66:
			return methodDeclaration_sempred((MethodDeclarationContext)_localctx, predIndex);
		case 68:
			return signature_sempred((SignatureContext)_localctx, predIndex);
		case 86:
			return fieldDeclaration_sempred((FieldDeclarationContext)_localctx, predIndex);
		case 89:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 97:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 101:
			return end_sempred((EndContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean methodDeclaration_sempred(MethodDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return noTerminatorAfterParams(2);
		}
		return true;
	}
	private boolean signature_sempred(SignatureContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return noTerminatorAfterParams(1);
		}
		return true;
	}
	private boolean fieldDeclaration_sempred(FieldDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return noTerminatorBetween(2);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean end_sempred(EndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return lineTerminatorAhead();
		case 10:
			return _input.LT(1).getText().equals("}") ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\u03a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\2\3\2\3\2\7\2"+
		"\u00d4\n\2\f\2\16\2\u00d7\13\2\3\2\3\2\3\2\7\2\u00dc\n\2\f\2\16\2\u00df"+
		"\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00ea\n\4\f\4\16\4\u00ed"+
		"\13\4\3\4\5\4\u00f0\n\4\3\5\3\5\5\5\u00f4\n\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\5\7\u00fd\n\7\3\b\3\b\3\b\5\b\u0102\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u010a\n\t\f\t\16\t\u010d\13\t\3\t\5\t\u0110\n\t\3\n\3\n\5\n\u0114\n"+
		"\n\3\n\3\n\5\n\u0118\n\n\3\13\3\13\3\13\7\13\u011d\n\13\f\13\16\13\u0120"+
		"\13\13\3\f\3\f\3\f\7\f\u0125\n\f\f\f\16\f\u0128\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u0130\n\r\f\r\16\r\u0133\13\r\3\r\5\r\u0136\n\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\5\17\u013f\n\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0149\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u0153\n\23\f\23\16\23\u0156\13\23\3\23\5\23\u0159\n\23\3\24\3\24\3\24"+
		"\3\24\5\24\u015f\n\24\3\24\3\24\5\24\u0163\n\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\7\26\u016c\n\26\f\26\16\26\u016f\13\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0180"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0188\n\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\5\35\u0198\n\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\5!\u01a8\n!\3\""+
		"\3\"\5\"\u01ac\n\"\3#\3#\5#\u01b0\n#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\5\'\u01be\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u01c5\n\'\5\'\u01c7\n\'\3"+
		"(\3(\5(\u01cb\n(\3)\3)\3)\3)\5)\u01d1\n)\3)\5)\u01d4\n)\3)\3)\7)\u01d8"+
		"\n)\f)\16)\u01db\13)\3)\3)\3*\3*\3*\3*\3+\3+\3+\5+\u01e6\n+\3,\3,\3,\3"+
		",\5,\u01ec\n,\3,\3,\3,\7,\u01f1\n,\f,\16,\u01f4\13,\3,\3,\3-\3-\3-\5-"+
		"\u01fb\n-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\5/\u020a\n/\3\60\3\60"+
		"\3\60\7\60\u020f\n\60\f\60\16\60\u0212\13\60\3\61\3\61\3\61\7\61\u0217"+
		"\n\61\f\61\16\61\u021a\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\5\63\u0225\n\63\3\63\5\63\u0228\n\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0230\n\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u0238\n\65\3\65\3"+
		"\65\3\66\5\66\u023d\n\66\3\66\3\66\5\66\u0241\n\66\3\66\3\66\5\66\u0245"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u024d\n\67\3\67\3\67\3\67\38"+
		"\38\38\39\39\39\39\39\39\59\u025b\n9\3:\3:\5:\u025f\n:\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\5;\u0269\n;\3<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3?\3@\3@\3@\3@"+
		"\3@\7@\u027c\n@\f@\16@\u027f\13@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3"+
		"C\3C\3C\3C\3C\5C\u0292\nC\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u029f\n"+
		"D\3E\3E\3E\3F\3F\3F\3F\3F\5F\u02a9\nF\3G\3G\5G\u02ad\nG\3H\3H\3H\5H\u02b2"+
		"\nH\5H\u02b4\nH\3H\3H\3I\3I\3I\7I\u02bb\nI\fI\16I\u02be\13I\3J\5J\u02c1"+
		"\nJ\3J\5J\u02c4\nJ\3J\3J\3K\3K\3K\3K\3K\3K\3K\5K\u02cf\nK\3L\3L\3L\5L"+
		"\u02d4\nL\3M\3M\3N\3N\5N\u02da\nN\3O\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\5Q\u02ec\nQ\3R\3R\3R\5R\u02f1\nR\5R\u02f3\nR\3R\3R\3S\3S"+
		"\3S\7S\u02fa\nS\fS\16S\u02fd\13S\3T\3T\3T\5T\u0302\nT\3T\3T\3U\3U\3U\5"+
		"U\u0309\nU\3V\3V\5V\u030d\nV\3W\3W\3W\3W\3W\7W\u0314\nW\fW\16W\u0317\13"+
		"W\3W\3W\3X\3X\3X\3X\3X\5X\u0320\nX\3X\5X\u0323\nX\3Y\5Y\u0326\nY\3Y\3"+
		"Y\3Z\3Z\3Z\3[\3[\3[\5[\u0330\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\7[\u033c"+
		"\n[\f[\16[\u033f\13[\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\5^\u034a\n^\3^\3^\5"+
		"^\u034e\n^\3^\5^\u0351\n^\3^\3^\3^\3^\3^\5^\u0358\n^\3^\3^\3_\3_\3_\3"+
		"_\3_\3`\3`\3`\3`\3`\5`\u0366\n`\5`\u0368\n`\3`\5`\u036b\n`\3`\5`\u036e"+
		"\n`\5`\u0370\n`\3`\3`\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0382"+
		"\nb\3c\3c\3c\3c\3c\3c\7c\u038a\nc\fc\16c\u038d\13c\3d\3d\3d\5d\u0392\n"+
		"d\3e\3e\3e\3e\5e\u0398\ne\3e\3e\3f\3f\3g\3g\3g\3g\5g\u03a2\ng\3g\2\4\u00b4"+
		"\u00c4h\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\2\7\3\2\21\22\3"+
		"\2\23\35\4\2CFII\4\2\23\35\67>\7\2\20\20\23\24\26\27\34\34??\2\u03ca\2"+
		"\u00ce\3\2\2\2\4\u00e0\3\2\2\2\6\u00e3\3\2\2\2\b\u00f3\3\2\2\2\n\u00f7"+
		"\3\2\2\2\f\u00fc\3\2\2\2\16\u0101\3\2\2\2\20\u0103\3\2\2\2\22\u0111\3"+
		"\2\2\2\24\u0119\3\2\2\2\26\u0121\3\2\2\2\30\u0129\3\2\2\2\32\u0137\3\2"+
		"\2\2\34\u013a\3\2\2\2\36\u0140\3\2\2\2 \u0143\3\2\2\2\"\u014a\3\2\2\2"+
		"$\u014c\3\2\2\2&\u015a\3\2\2\2(\u0164\3\2\2\2*\u016d\3\2\2\2,\u017f\3"+
		"\2\2\2.\u0187\3\2\2\2\60\u0189\3\2\2\2\62\u018b\3\2\2\2\64\u018f\3\2\2"+
		"\2\66\u0192\3\2\2\28\u0197\3\2\2\2:\u019b\3\2\2\2<\u019f\3\2\2\2>\u01a1"+
		"\3\2\2\2@\u01a5\3\2\2\2B\u01a9\3\2\2\2D\u01ad\3\2\2\2F\u01b1\3\2\2\2H"+
		"\u01b4\3\2\2\2J\u01b6\3\2\2\2L\u01b9\3\2\2\2N\u01ca\3\2\2\2P\u01cc\3\2"+
		"\2\2R\u01de\3\2\2\2T\u01e5\3\2\2\2V\u01e7\3\2\2\2X\u01fa\3\2\2\2Z\u0202"+
		"\3\2\2\2\\\u0209\3\2\2\2^\u020b\3\2\2\2`\u0213\3\2\2\2b\u021d\3\2\2\2"+
		"d\u0227\3\2\2\2f\u022f\3\2\2\2h\u0233\3\2\2\2j\u023c\3\2\2\2l\u024c\3"+
		"\2\2\2n\u0251\3\2\2\2p\u025a\3\2\2\2r\u025e\3\2\2\2t\u0268\3\2\2\2v\u026a"+
		"\3\2\2\2x\u026f\3\2\2\2z\u0271\3\2\2\2|\u0273\3\2\2\2~\u0276\3\2\2\2\u0080"+
		"\u0282\3\2\2\2\u0082\u0286\3\2\2\2\u0084\u0291\3\2\2\2\u0086\u029e\3\2"+
		"\2\2\u0088\u02a0\3\2\2\2\u008a\u02a8\3\2\2\2\u008c\u02ac\3\2\2\2\u008e"+
		"\u02ae\3\2\2\2\u0090\u02b7\3\2\2\2\u0092\u02c0\3\2\2\2\u0094\u02ce\3\2"+
		"\2\2\u0096\u02d3\3\2\2\2\u0098\u02d5\3\2\2\2\u009a\u02d9\3\2\2\2\u009c"+
		"\u02db\3\2\2\2\u009e\u02df\3\2\2\2\u00a0\u02eb\3\2\2\2\u00a2\u02ed\3\2"+
		"\2\2\u00a4\u02f6\3\2\2\2\u00a6\u0301\3\2\2\2\u00a8\u0308\3\2\2\2\u00aa"+
		"\u030c\3\2\2\2\u00ac\u030e\3\2\2\2\u00ae\u031f\3\2\2\2\u00b0\u0325\3\2"+
		"\2\2\u00b2\u0329\3\2\2\2\u00b4\u032f\3\2\2\2\u00b6\u0340\3\2\2\2\u00b8"+
		"\u0343\3\2\2\2\u00ba\u0347\3\2\2\2\u00bc\u035b\3\2\2\2\u00be\u0360\3\2"+
		"\2\2\u00c0\u0373\3\2\2\2\u00c2\u0381\3\2\2\2\u00c4\u0383\3\2\2\2\u00c6"+
		"\u0391\3\2\2\2\u00c8\u0393\3\2\2\2\u00ca\u039b\3\2\2\2\u00cc\u03a1\3\2"+
		"\2\2\u00ce\u00cf\5\4\3\2\u00cf\u00d5\5\u00ccg\2\u00d0\u00d1\5\6\4\2\u00d1"+
		"\u00d2\5\u00ccg\2\u00d2\u00d4\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00dd\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\5\f\7\2\u00d9\u00da\5\u00ccg\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\3\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\3\2\2"+
		"\u00e1\u00e2\5\u00caf\2\u00e2\5\3\2\2\2\u00e3\u00ef\7\4\2\2\u00e4\u00f0"+
		"\5\b\5\2\u00e5\u00eb\7\5\2\2\u00e6\u00e7\5\b\5\2\u00e7\u00e8\5\u00ccg"+
		"\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\7\6\2\2\u00ef\u00e4\3\2\2\2\u00ef\u00e5\3\2\2\2\u00f0\7\3\2\2\2"+
		"\u00f1\u00f4\7\7\2\2\u00f2\u00f4\5\u00caf\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5\n"+
		"\6\2\u00f6\t\3\2\2\2\u00f7\u00f8\7I\2\2\u00f8\13\3\2\2\2\u00f9\u00fd\5"+
		"\16\b\2\u00fa\u00fd\5\34\17\2\u00fb\u00fd\5 \21\2\u00fc\u00f9\3\2\2\2"+
		"\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\r\3\2\2\2\u00fe\u0102\5"+
		"\20\t\2\u00ff\u0102\5\30\r\2\u0100\u0102\5$\23\2\u0101\u00fe\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\17\3\2\2\2\u0103\u010f\7\b\2"+
		"\2\u0104\u0110\5\22\n\2\u0105\u010b\7\5\2\2\u0106\u0107\5\22\n\2\u0107"+
		"\u0108\5\u00ccg\2\u0108\u010a\3\2\2\2\u0109\u0106\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0110\7\6\2\2\u010f\u0104\3\2\2\2\u010f\u0105\3\2"+
		"\2\2\u0110\21\3\2\2\2\u0111\u0117\5\24\13\2\u0112\u0114\5p9\2\u0113\u0112"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7\t\2\2\u0116"+
		"\u0118\5\26\f\2\u0117\u0113\3\2\2\2\u0117\u0118\3\2\2\2\u0118\23\3\2\2"+
		"\2\u0119\u011e\5\u00caf\2\u011a\u011b\7\n\2\2\u011b\u011d\5\u00caf\2\u011c"+
		"\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\25\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0126\5\u00c4c\2\u0122"+
		"\u0123\7\n\2\2\u0123\u0125\5\u00c4c\2\u0124\u0122\3\2\2\2\u0125\u0128"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\27\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u0135\7\13\2\2\u012a\u0136\5\32\16\2\u012b\u0131"+
		"\7\5\2\2\u012c\u012d\5\32\16\2\u012d\u012e\5\u00ccg\2\u012e\u0130\3\2"+
		"\2\2\u012f\u012c\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\7\6"+
		"\2\2\u0135\u012a\3\2\2\2\u0135\u012b\3\2\2\2\u0136\31\3\2\2\2\u0137\u0138"+
		"\5\u00caf\2\u0138\u0139\5p9\2\u0139\33\3\2\2\2\u013a\u013b\7\f\2\2\u013b"+
		"\u013e\5\u00caf\2\u013c\u013f\5\36\20\2\u013d\u013f\5\u008aF\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013d\3\2\2\2\u013f\35\3\2\2\2\u0140\u0141\5\u008aF\2\u0141"+
		"\u0142\5(\25\2\u0142\37\3\2\2\2\u0143\u0144\7\f\2\2\u0144\u0145\5\"\22"+
		"\2\u0145\u0148\5\u00caf\2\u0146\u0149\5\36\20\2\u0147\u0149\5\u008aF\2"+
		"\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149!\3\2\2\2\u014a\u014b\5"+
		"\u008eH\2\u014b#\3\2\2\2\u014c\u0158\7\r\2\2\u014d\u0159\5&\24\2\u014e"+
		"\u0154\7\5\2\2\u014f\u0150\5&\24\2\u0150\u0151\5\u00ccg\2\u0151\u0153"+
		"\3\2\2\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\7\6"+
		"\2\2\u0158\u014d\3\2\2\2\u0158\u014e\3\2\2\2\u0159%\3\2\2\2\u015a\u0162"+
		"\5\24\13\2\u015b\u015e\5p9\2\u015c\u015d\7\t\2\2\u015d\u015f\5\26\f\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0163\3\2\2\2\u0160\u0161"+
		"\7\t\2\2\u0161\u0163\5\26\f\2\u0162\u015b\3\2\2\2\u0162\u0160\3\2\2\2"+
		"\u0163\'\3\2\2\2\u0164\u0165\7\16\2\2\u0165\u0166\5*\26\2\u0166\u0167"+
		"\7\17\2\2\u0167)\3\2\2\2\u0168\u0169\5,\27\2\u0169\u016a\5\u00ccg\2\u016a"+
		"\u016c\3\2\2\2\u016b\u0168\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e+\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0180"+
		"\5\16\b\2\u0171\u0180\5> \2\u0172\u0180\5.\30\2\u0173\u0180\5n8\2\u0174"+
		"\u0180\5@!\2\u0175\u0180\5B\"\2\u0176\u0180\5D#\2\u0177\u0180\5F$\2\u0178"+
		"\u0180\5H%\2\u0179\u0180\5(\25\2\u017a\u0180\5L\'\2\u017b\u0180\5N(\2"+
		"\u017c\u0180\5`\61\2\u017d\u0180\5h\65\2\u017e\u0180\5J&\2\u017f\u0170"+
		"\3\2\2\2\u017f\u0171\3\2\2\2\u017f\u0172\3\2\2\2\u017f\u0173\3\2\2\2\u017f"+
		"\u0174\3\2\2\2\u017f\u0175\3\2\2\2\u017f\u0176\3\2\2\2\u017f\u0177\3\2"+
		"\2\2\u017f\u0178\3\2\2\2\u017f\u0179\3\2\2\2\u017f\u017a\3\2\2\2\u017f"+
		"\u017b\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2"+
		"\2\2\u0180-\3\2\2\2\u0181\u0188\5\62\32\2\u0182\u0188\5\60\31\2\u0183"+
		"\u0188\5\64\33\2\u0184\u0188\5\66\34\2\u0185\u0188\5:\36\2\u0186\u0188"+
		"\5<\37\2\u0187\u0181\3\2\2\2\u0187\u0182\3\2\2\2\u0187\u0183\3\2\2\2\u0187"+
		"\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188/\3\2\2\2"+
		"\u0189\u018a\5\u00c4c\2\u018a\61\3\2\2\2\u018b\u018c\5\u00c4c\2\u018c"+
		"\u018d\7\20\2\2\u018d\u018e\5\u00c4c\2\u018e\63\3\2\2\2\u018f\u0190\5"+
		"\u00c4c\2\u0190\u0191\t\2\2\2\u0191\65\3\2\2\2\u0192\u0193\5\26\f\2\u0193"+
		"\u0194\58\35\2\u0194\u0195\5\26\f\2\u0195\67\3\2\2\2\u0196\u0198\t\3\2"+
		"\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a"+
		"\7\t\2\2\u019a9\3\2\2\2\u019b\u019c\5\24\13\2\u019c\u019d\7\36\2\2\u019d"+
		"\u019e\5\26\f\2\u019e;\3\2\2\2\u019f\u01a0\7\37\2\2\u01a0=\3\2\2\2\u01a1"+
		"\u01a2\5\u00caf\2\u01a2\u01a3\7 \2\2\u01a3\u01a4\5,\27\2\u01a4?\3\2\2"+
		"\2\u01a5\u01a7\7!\2\2\u01a6\u01a8\5\26\f\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8A\3\2\2\2\u01a9\u01ab\7\"\2\2\u01aa\u01ac\5\u00caf\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01acC\3\2\2\2\u01ad\u01af\7#\2\2\u01ae"+
		"\u01b0\5\u00caf\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0E\3\2\2"+
		"\2\u01b1\u01b2\7$\2\2\u01b2\u01b3\5\u00caf\2\u01b3G\3\2\2\2\u01b4\u01b5"+
		"\7%\2\2\u01b5I\3\2\2\2\u01b6\u01b7\7&\2\2\u01b7\u01b8\5\u00c4c\2\u01b8"+
		"K\3\2\2\2\u01b9\u01bd\7\'\2\2\u01ba\u01bb\5.\30\2\u01bb\u01bc\7\37\2\2"+
		"\u01bc\u01be\3\2\2\2\u01bd\u01ba\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c0\5\u00c4c\2\u01c0\u01c6\5(\25\2\u01c1\u01c4\7(\2\2"+
		"\u01c2\u01c5\5L\'\2\u01c3\u01c5\5(\25\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3"+
		"\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"M\3\2\2\2\u01c8\u01cb\5P)\2\u01c9\u01cb\5V,\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01cbO\3\2\2\2\u01cc\u01d0\7)\2\2\u01cd\u01ce\5.\30\2\u01ce"+
		"\u01cf\7\37\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d0\u01d1\3"+
		"\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d4\5\u00c4c\2\u01d3\u01d2\3\2\2\2"+
		"\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d9\7\16\2\2\u01d6\u01d8"+
		"\5R*\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7\17"+
		"\2\2\u01ddQ\3\2\2\2\u01de\u01df\5T+\2\u01df\u01e0\7 \2\2\u01e0\u01e1\5"+
		"*\26\2\u01e1S\3\2\2\2\u01e2\u01e3\7*\2\2\u01e3\u01e6\5\26\f\2\u01e4\u01e6"+
		"\7+\2\2\u01e5\u01e2\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6U\3\2\2\2\u01e7\u01eb"+
		"\7)\2\2\u01e8\u01e9\5.\30\2\u01e9\u01ea\7\37\2\2\u01ea\u01ec\3\2\2\2\u01eb"+
		"\u01e8\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\5X"+
		"-\2\u01ee\u01f2\7\16\2\2\u01ef\u01f1\5Z.\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4"+
		"\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f5\u01f6\7\17\2\2\u01f6W\3\2\2\2\u01f7\u01f8\5\u00ca"+
		"f\2\u01f8\u01f9\7\36\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f7\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\5\u00b4[\2\u01fd\u01fe"+
		"\7\7\2\2\u01fe\u01ff\7\5\2\2\u01ff\u0200\7\13\2\2\u0200\u0201\7\6\2\2"+
		"\u0201Y\3\2\2\2\u0202\u0203\5\\/\2\u0203\u0204\7 \2\2\u0204\u0205\5*\26"+
		"\2\u0205[\3\2\2\2\u0206\u0207\7*\2\2\u0207\u020a\5^\60\2\u0208\u020a\7"+
		"+\2\2\u0209\u0206\3\2\2\2\u0209\u0208\3\2\2\2\u020a]\3\2\2\2\u020b\u0210"+
		"\5p9\2\u020c\u020d\7\n\2\2\u020d\u020f\5p9\2\u020e\u020c\3\2\2\2\u020f"+
		"\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211_\3\2\2\2"+
		"\u0212\u0210\3\2\2\2\u0213\u0214\7,\2\2\u0214\u0218\7\16\2\2\u0215\u0217"+
		"\5b\62\2\u0216\u0215\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\7\17"+
		"\2\2\u021ca\3\2\2\2\u021d\u021e\5d\63\2\u021e\u021f\7 \2\2\u021f\u0220"+
		"\5*\26\2\u0220c\3\2\2\2\u0221\u0224\7*\2\2\u0222\u0225\5\62\32\2\u0223"+
		"\u0225\5f\64\2\u0224\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225\u0228\3\2"+
		"\2\2\u0226\u0228\7+\2\2\u0227\u0221\3\2\2\2\u0227\u0226\3\2\2\2\u0228"+
		"e\3\2\2\2\u0229\u022a\5\26\f\2\u022a\u022b\7\t\2\2\u022b\u0230\3\2\2\2"+
		"\u022c\u022d\5\24\13\2\u022d\u022e\7\36\2\2\u022e\u0230\3\2\2\2\u022f"+
		"\u0229\3\2\2\2\u022f\u022c\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u0232\5\u00c4c\2\u0232g\3\2\2\2\u0233\u0237\7-\2\2\u0234\u0238"+
		"\5\u00c4c\2\u0235\u0238\5j\66\2\u0236\u0238\5l\67\2\u0237\u0234\3\2\2"+
		"\2\u0237\u0235\3\2\2\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u023a\5(\25\2\u023ai\3\2\2\2\u023b\u023d\5.\30\2\u023c"+
		"\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\7\37"+
		"\2\2\u023f\u0241\5\u00c4c\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0244\7\37\2\2\u0243\u0245\5.\30\2\u0244\u0243\3"+
		"\2\2\2\u0244\u0245\3\2\2\2\u0245k\3\2\2\2\u0246\u0247\5\26\f\2\u0247\u0248"+
		"\7\t\2\2\u0248\u024d\3\2\2\2\u0249\u024a\5\24\13\2\u024a\u024b\7\36\2"+
		"\2\u024b\u024d\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u0249\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7.\2\2\u024f\u0250\5\u00c4c\2"+
		"\u0250m\3\2\2\2\u0251\u0252\7/\2\2\u0252\u0253\5\u00c4c\2\u0253o\3\2\2"+
		"\2\u0254\u025b\5r:\2\u0255\u025b\5t;\2\u0256\u0257\7\5\2\2\u0257\u0258"+
		"\5p9\2\u0258\u0259\7\6\2\2\u0259\u025b\3\2\2\2\u025a\u0254\3\2\2\2\u025a"+
		"\u0255\3\2\2\2\u025a\u0256\3\2\2\2\u025bq\3\2\2\2\u025c\u025f\5\u00ca"+
		"f\2\u025d\u025f\5\u009cO\2\u025e\u025c\3\2\2\2\u025e\u025d\3\2\2\2\u025f"+
		"s\3\2\2\2\u0260\u0269\5v<\2\u0261\u0269\5\u00acW\2\u0262\u0269\5|?\2\u0263"+
		"\u0269\5\u0088E\2\u0264\u0269\5~@\2\u0265\u0269\5\u0080A\2\u0266\u0269"+
		"\5\u0082B\2\u0267\u0269\5\u0084C\2\u0268\u0260\3\2\2\2\u0268\u0261\3\2"+
		"\2\2\u0268\u0262\3\2\2\2\u0268\u0263\3\2\2\2\u0268\u0264\3\2\2\2\u0268"+
		"\u0265\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0267\3\2\2\2\u0269u\3\2\2\2"+
		"\u026a\u026b\7\60\2\2\u026b\u026c\5x=\2\u026c\u026d\7\61\2\2\u026d\u026e"+
		"\5z>\2\u026ew\3\2\2\2\u026f\u0270\5\u00c4c\2\u0270y\3\2\2\2\u0271\u0272"+
		"\5p9\2\u0272{\3\2\2\2\u0273\u0274\7\27\2\2\u0274\u0275\5p9\2\u0275}\3"+
		"\2\2\2\u0276\u0277\7\62\2\2\u0277\u027d\7\16\2\2\u0278\u0279\5\u0086D"+
		"\2\u0279\u027a\5\u00ccg\2\u027a\u027c\3\2\2\2\u027b\u0278\3\2\2\2\u027c"+
		"\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2"+
		"\2\2\u027f\u027d\3\2\2\2\u0280\u0281\7\17\2\2\u0281\177\3\2\2\2\u0282"+
		"\u0283\7\60\2\2\u0283\u0284\7\61\2\2\u0284\u0285\5z>\2\u0285\u0081\3\2"+
		"\2\2\u0286\u0287\7\63\2\2\u0287\u0288\7\60\2\2\u0288\u0289\5p9\2\u0289"+
		"\u028a\7\61\2\2\u028a\u028b\5z>\2\u028b\u0083\3\2\2\2\u028c\u0292\7\64"+
		"\2\2\u028d\u028e\7\64\2\2\u028e\u0292\7\20\2\2\u028f\u0290\7\20\2\2\u0290"+
		"\u0292\7\64\2\2\u0291\u028c\3\2\2\2\u0291\u028d\3\2\2\2\u0291\u028f\3"+
		"\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\5z>\2\u0294\u0085\3\2\2\2\u0295"+
		"\u0296\6D\2\2\u0296\u0297\5\u00caf\2\u0297\u0298\5\u008eH\2\u0298\u0299"+
		"\5\u008cG\2\u0299\u029f\3\2\2\2\u029a\u029f\5r:\2\u029b\u029c\5\u00ca"+
		"f\2\u029c\u029d\5\u008eH\2\u029d\u029f\3\2\2\2\u029e\u0295\3\2\2\2\u029e"+
		"\u029a\3\2\2\2\u029e\u029b\3\2\2\2\u029f\u0087\3\2\2\2\u02a0\u02a1\7\f"+
		"\2\2\u02a1\u02a2\5\u008aF\2\u02a2\u0089\3\2\2\2\u02a3\u02a4\6F\3\2\u02a4"+
		"\u02a5\5\u008eH\2\u02a5\u02a6\5\u008cG\2\u02a6\u02a9\3\2\2\2\u02a7\u02a9"+
		"\5\u008eH\2\u02a8\u02a3\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9\u008b\3\2\2"+
		"\2\u02aa\u02ad\5\u008eH\2\u02ab\u02ad\5p9\2\u02ac\u02aa\3\2\2\2\u02ac"+
		"\u02ab\3\2\2\2\u02ad\u008d\3\2\2\2\u02ae\u02b3\7\5\2\2\u02af\u02b1\5\u0090"+
		"I\2\u02b0\u02b2\7\n\2\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b4\3\2\2\2\u02b3\u02af\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\u02b6\7\6\2\2\u02b6\u008f\3\2\2\2\u02b7\u02bc\5\u0092J\2\u02b8"+
		"\u02b9\7\n\2\2\u02b9\u02bb\5\u0092J\2\u02ba\u02b8\3\2\2\2\u02bb\u02be"+
		"\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u0091\3\2\2\2\u02be"+
		"\u02bc\3\2\2\2\u02bf\u02c1\5\24\13\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3"+
		"\2\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02c4\7\65\2\2\u02c3\u02c2\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\5p9\2\u02c6\u0093\3\2\2"+
		"\2\u02c7\u02cf\5\u0096L\2\u02c8\u02cf\5\u009aN\2\u02c9\u02cf\5\u00c0a"+
		"\2\u02ca\u02cb\7\5\2\2\u02cb\u02cc\5\u00c4c\2\u02cc\u02cd\7\6\2\2\u02cd"+
		"\u02cf\3\2\2\2\u02ce\u02c7\3\2\2\2\u02ce\u02c8\3\2\2\2\u02ce\u02c9\3\2"+
		"\2\2\u02ce\u02ca\3\2\2\2\u02cf\u0095\3\2\2\2\u02d0\u02d4\5\u0098M\2\u02d1"+
		"\u02d4\5\u009eP\2\u02d2\u02d4\5\u00b2Z\2\u02d3\u02d0\3\2\2\2\u02d3\u02d1"+
		"\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4\u0097\3\2\2\2\u02d5\u02d6\t\4\2\2\u02d6"+
		"\u0099\3\2\2\2\u02d7\u02da\5\u00caf\2\u02d8\u02da\5\u009cO\2\u02d9\u02d7"+
		"\3\2\2\2\u02d9\u02d8\3\2\2\2\u02da\u009b\3\2\2\2\u02db\u02dc\5\u00caf"+
		"\2\u02dc\u02dd\7\7\2\2\u02dd\u02de\5\u00caf\2\u02de\u009d\3\2\2\2\u02df"+
		"\u02e0\5\u00a0Q\2\u02e0\u02e1\5\u00a2R\2\u02e1\u009f\3\2\2\2\u02e2\u02ec"+
		"\5\u00acW\2\u02e3\u02ec\5v<\2\u02e4\u02e5\7\60\2\2\u02e5\u02e6\7\65\2"+
		"\2\u02e6\u02e7\7\61\2\2\u02e7\u02ec\5z>\2\u02e8\u02ec\5\u0080A\2\u02e9"+
		"\u02ec\5\u0082B\2\u02ea\u02ec\5r:\2\u02eb\u02e2\3\2\2\2\u02eb\u02e3\3"+
		"\2\2\2\u02eb\u02e4\3\2\2\2\u02eb\u02e8\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb"+
		"\u02ea\3\2\2\2\u02ec\u00a1\3\2\2\2\u02ed\u02f2\7\16\2\2\u02ee\u02f0\5"+
		"\u00a4S\2\u02ef\u02f1\7\n\2\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2"+
		"\u02f1\u02f3\3\2\2\2\u02f2\u02ee\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4"+
		"\3\2\2\2\u02f4\u02f5\7\17\2\2\u02f5\u00a3\3\2\2\2\u02f6\u02fb\5\u00a6"+
		"T\2\u02f7\u02f8\7\n\2\2\u02f8\u02fa\5\u00a6T\2\u02f9\u02f7\3\2\2\2\u02fa"+
		"\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u00a5\3\2"+
		"\2\2\u02fd\u02fb\3\2\2\2\u02fe\u02ff\5\u00a8U\2\u02ff\u0300\7 \2\2\u0300"+
		"\u0302\3\2\2\2\u0301\u02fe\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2"+
		"\2\2\u0303\u0304\5\u00aaV\2\u0304\u00a7\3\2\2\2\u0305\u0309\5\u00caf\2"+
		"\u0306\u0309\5\u00c4c\2\u0307\u0309\5\u00a2R\2\u0308\u0305\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0308\u0307\3\2\2\2\u0309\u00a9\3\2\2\2\u030a\u030d\5\u00c4"+
		"c\2\u030b\u030d\5\u00a2R\2\u030c\u030a\3\2\2\2\u030c\u030b\3\2\2\2\u030d"+
		"\u00ab\3\2\2\2\u030e\u030f\7\66\2\2\u030f\u0315\7\16\2\2\u0310\u0311\5"+
		"\u00aeX\2\u0311\u0312\5\u00ccg\2\u0312\u0314\3\2\2\2\u0313\u0310\3\2\2"+
		"\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318"+
		"\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u0319\7\17\2\2\u0319\u00ad\3\2\2\2"+
		"\u031a\u031b\6X\4\2\u031b\u031c\5\24\13\2\u031c\u031d\5p9\2\u031d\u0320"+
		"\3\2\2\2\u031e\u0320\5\u00b0Y\2\u031f\u031a\3\2\2\2\u031f\u031e\3\2\2"+
		"\2\u0320\u0322\3\2\2\2\u0321\u0323\7I\2\2\u0322\u0321\3\2\2\2\u0322\u0323"+
		"\3\2\2\2\u0323\u00af\3\2\2\2\u0324\u0326\7\27\2\2\u0325\u0324\3\2\2\2"+
		"\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\5r:\2\u0328\u00b1"+
		"\3\2\2\2\u0329\u032a\7\f\2\2\u032a\u032b\5\36\20\2\u032b\u00b3\3\2\2\2"+
		"\u032c\u032d\b[\1\2\u032d\u0330\5\u0094K\2\u032e\u0330\5\u00c8e\2\u032f"+
		"\u032c\3\2\2\2\u032f\u032e\3\2\2\2\u0330\u033d\3\2\2\2\u0331\u0332\f\7"+
		"\2\2\u0332\u033c\5\u00b6\\\2\u0333\u0334\f\6\2\2\u0334\u033c\5\u00b8]"+
		"\2\u0335\u0336\f\5\2\2\u0336\u033c\5\u00ba^\2\u0337\u0338\f\4\2\2\u0338"+
		"\u033c\5\u00bc_\2\u0339\u033a\f\3\2\2\u033a\u033c\5\u00be`\2\u033b\u0331"+
		"\3\2\2\2\u033b\u0333\3\2\2\2\u033b\u0335\3\2\2\2\u033b\u0337\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2"+
		"\2\2\u033e\u00b5\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0341\7\7\2\2\u0341"+
		"\u0342\5p9\2\u0342\u00b7\3\2\2\2\u0343\u0344\7\60\2\2\u0344\u0345\5\u00c4"+
		"c\2\u0345\u0346\7\61\2\2\u0346\u00b9\3\2\2\2\u0347\u0357\7\60\2\2\u0348"+
		"\u034a\5\u00c4c\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b"+
		"\3\2\2\2\u034b\u034d\7 \2\2\u034c\u034e\5\u00c4c\2\u034d\u034c\3\2\2\2"+
		"\u034d\u034e\3\2\2\2\u034e\u0358\3\2\2\2\u034f\u0351\5\u00c4c\2\u0350"+
		"\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\7 "+
		"\2\2\u0353\u0354\5\u00c4c\2\u0354\u0355\7 \2\2\u0355\u0356\5\u00c4c\2"+
		"\u0356\u0358\3\2\2\2\u0357\u0349\3\2\2\2\u0357\u0350\3\2\2\2\u0358\u0359"+
		"\3\2\2\2\u0359\u035a\7\61\2\2\u035a\u00bb\3\2\2\2\u035b\u035c\7\7\2\2"+
		"\u035c\u035d\7\5\2\2\u035d\u035e\5p9\2\u035e\u035f\7\6\2\2\u035f\u00bd"+
		"\3\2\2\2\u0360\u036f\7\5\2\2\u0361\u0368\5\26\f\2\u0362\u0365\5p9\2\u0363"+
		"\u0364\7\n\2\2\u0364\u0366\5\26\f\2\u0365\u0363\3\2\2\2\u0365\u0366\3"+
		"\2\2\2\u0366\u0368\3\2\2\2\u0367\u0361\3\2\2\2\u0367\u0362\3\2\2\2\u0368"+
		"\u036a\3\2\2\2\u0369\u036b\7\65\2\2\u036a\u0369\3\2\2\2\u036a\u036b\3"+
		"\2\2\2\u036b\u036d\3\2\2\2\u036c\u036e\7\n\2\2\u036d\u036c\3\2\2\2\u036d"+
		"\u036e\3\2\2\2\u036e\u0370\3\2\2\2\u036f\u0367\3\2\2\2\u036f\u0370\3\2"+
		"\2\2\u0370\u0371\3\2\2\2\u0371\u0372\7\6\2\2\u0372\u00bf\3\2\2\2\u0373"+
		"\u0374\5\u00c2b\2\u0374\u0375\7\7\2\2\u0375\u0376\5\u00caf\2\u0376\u00c1"+
		"\3\2\2\2\u0377\u0382\5r:\2\u0378\u0379\7\5\2\2\u0379\u037a\7\27\2\2\u037a"+
		"\u037b\5r:\2\u037b\u037c\7\6\2\2\u037c\u0382\3\2\2\2\u037d\u037e\7\5\2"+
		"\2\u037e\u037f\5\u00c2b\2\u037f\u0380\7\6\2\2\u0380\u0382\3\2\2\2\u0381"+
		"\u0377\3\2\2\2\u0381\u0378\3\2\2\2\u0381\u037d\3\2\2\2\u0382\u00c3\3\2"+
		"\2\2\u0383\u0384\bc\1\2\u0384\u0385\5\u00c6d\2\u0385\u038b\3\2\2\2\u0386"+
		"\u0387\f\3\2\2\u0387\u0388\t\5\2\2\u0388\u038a\5\u00c4c\4\u0389\u0386"+
		"\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u00c5\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u0392\5\u00b4[\2\u038f\u0390"+
		"\t\6\2\2\u0390\u0392\5\u00c6d\2\u0391\u038e\3\2\2\2\u0391\u038f\3\2\2"+
		"\2\u0392\u00c7\3\2\2\2\u0393\u0394\5p9\2\u0394\u0395\7\5\2\2\u0395\u0397"+
		"\5\u00c4c\2\u0396\u0398\7\n\2\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2"+
		"\2\u0398\u0399\3\2\2\2\u0399\u039a\7\6\2\2\u039a\u00c9\3\2\2\2\u039b\u039c"+
		"\7@\2\2\u039c\u00cb\3\2\2\2\u039d\u03a2\7\37\2\2\u039e\u03a2\7\2\2\3\u039f"+
		"\u03a2\6g\13\2\u03a0\u03a2\6g\f\2\u03a1\u039d\3\2\2\2\u03a1\u039e\3\2"+
		"\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a0\3\2\2\2\u03a2\u00cd\3\2\2\2`\u00d5"+
		"\u00dd\u00eb\u00ef\u00f3\u00fc\u0101\u010b\u010f\u0113\u0117\u011e\u0126"+
		"\u0131\u0135\u013e\u0148\u0154\u0158\u015e\u0162\u016d\u017f\u0187\u0197"+
		"\u01a7\u01ab\u01af\u01bd\u01c4\u01c6\u01ca\u01d0\u01d3\u01d9\u01e5\u01eb"+
		"\u01f2\u01fa\u0209\u0210\u0218\u0224\u0227\u022f\u0237\u023c\u0240\u0244"+
		"\u024c\u025a\u025e\u0268\u027d\u0291\u029e\u02a8\u02ac\u02b1\u02b3\u02bc"+
		"\u02c0\u02c3\u02ce\u02d3\u02d9\u02eb\u02f0\u02f2\u02fb\u0301\u0308\u030c"+
		"\u0315\u031f\u0322\u0325\u032f\u033b\u033d\u0349\u034d\u0350\u0357\u0365"+
		"\u0367\u036a\u036d\u036f\u0381\u038b\u0391\u0397\u03a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}