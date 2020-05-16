// Generated from com\cqupt\lplum\ContractDetection\Go.g4 by ANTLR 4.7
package com.cqupt.lplum.ContractDetection;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GoParser}.
 */
public interface GoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GoParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void enterSourceUnit(GoParser.SourceUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void exitSourceUnit(GoParser.SourceUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#packageDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPackageDefinition(GoParser.PackageDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#packageDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPackageDefinition(GoParser.PackageDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#importDefinition}.
	 * @param ctx the parse tree
	 */
	void enterImportDefinition(GoParser.ImportDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#importDefinition}.
	 * @param ctx the parse tree
	 */
	void exitImportDefinition(GoParser.ImportDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(GoParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(GoParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(GoParser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(GoParser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(GoParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(GoParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GoParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GoParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstDefinition(GoParser.ConstDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstDefinition(GoParser.ConstDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(GoParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(GoParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(GoParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(GoParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(GoParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(GoParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(GoParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(GoParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(GoParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(GoParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(GoParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(GoParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GoParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GoParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(GoParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(GoParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(GoParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(GoParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(GoParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(GoParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(GoParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(GoParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(GoParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(GoParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(GoParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(GoParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(GoParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(GoParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void enterSendStatement(GoParser.SendStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#sendStatement}.
	 * @param ctx the parse tree
	 */
	void exitSendStatement(GoParser.SendStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#incDecStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStatement(GoParser.IncDecStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#incDecStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStatement(GoParser.IncDecStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GoParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GoParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(GoParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(GoParser.AssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#shortVarDefinition}.
	 * @param ctx the parse tree
	 */
	void enterShortVarDefinition(GoParser.ShortVarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#shortVarDefinition}.
	 * @param ctx the parse tree
	 */
	void exitShortVarDefinition(GoParser.ShortVarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(GoParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(GoParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(GoParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(GoParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(GoParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(GoParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(GoParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(GoParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(GoParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(GoParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(GoParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(GoParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#fallthroughStatement}.
	 * @param ctx the parse tree
	 */
	void enterFallthroughStatement(GoParser.FallthroughStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#fallthroughStatement}.
	 * @param ctx the parse tree
	 */
	void exitFallthroughStatement(GoParser.FallthroughStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeferStatement(GoParser.DeferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeferStatement(GoParser.DeferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GoParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GoParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(GoParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(GoParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#expressionSwitchStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSwitchStatement(GoParser.ExpressionSwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#expressionSwitchStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSwitchStatement(GoParser.ExpressionSwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#expressionCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCaseClause(GoParser.ExpressionCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#expressionCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCaseClause(GoParser.ExpressionCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#expressionSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSwitchCase(GoParser.ExpressionSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#expressionSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSwitchCase(GoParser.ExpressionSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeSwitchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchStatement(GoParser.TypeSwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeSwitchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchStatement(GoParser.TypeSwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchGuard(GoParser.TypeSwitchGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchGuard(GoParser.TypeSwitchGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeCaseClause(GoParser.TypeCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeCaseClause(GoParser.TypeCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchCase(GoParser.TypeSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchCase(GoParser.TypeSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeSwitchCaseList}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchCaseList(GoParser.TypeSwitchCaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeSwitchCaseList}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchCaseList(GoParser.TypeSwitchCaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(GoParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(GoParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#commClause}.
	 * @param ctx the parse tree
	 */
	void enterCommClause(GoParser.CommClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#commClause}.
	 * @param ctx the parse tree
	 */
	void exitCommClause(GoParser.CommClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#commCase}.
	 * @param ctx the parse tree
	 */
	void enterCommCase(GoParser.CommCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#commCase}.
	 * @param ctx the parse tree
	 */
	void exitCommCase(GoParser.CommCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#recvStatement}.
	 * @param ctx the parse tree
	 */
	void enterRecvStatement(GoParser.RecvStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#recvStatement}.
	 * @param ctx the parse tree
	 */
	void exitRecvStatement(GoParser.RecvStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(GoParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(GoParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(GoParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(GoParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRangeClause(GoParser.RangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRangeClause(GoParser.RangeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#goStatement}.
	 * @param ctx the parse tree
	 */
	void enterGoStatement(GoParser.GoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#goStatement}.
	 * @param ctx the parse tree
	 */
	void exitGoStatement(GoParser.GoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpression(GoParser.TypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpression(GoParser.TypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(GoParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(GoParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTypeLiteral(GoParser.TypeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTypeLiteral(GoParser.TypeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(GoParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(GoParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(GoParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(GoParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#elementType}.
	 * @param ctx the parse tree
	 */
	void enterElementType(GoParser.ElementTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#elementType}.
	 * @param ctx the parse tree
	 */
	void exitElementType(GoParser.ElementTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(GoParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(GoParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(GoParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(GoParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void enterSliceType(GoParser.SliceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void exitSliceType(GoParser.SliceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#mapType}.
	 * @param ctx the parse tree
	 */
	void enterMapType(GoParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#mapType}.
	 * @param ctx the parse tree
	 */
	void exitMapType(GoParser.MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#channelType}.
	 * @param ctx the parse tree
	 */
	void enterChannelType(GoParser.ChannelTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#channelType}.
	 * @param ctx the parse tree
	 */
	void exitChannelType(GoParser.ChannelTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(GoParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(GoParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(GoParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(GoParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(GoParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(GoParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(GoParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(GoParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GoParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GoParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GoParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GoParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(GoParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(GoParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(GoParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(GoParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GoParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#basicLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBasicLiteral(GoParser.BasicLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#basicLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBasicLiteral(GoParser.BasicLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#operandName}.
	 * @param ctx the parse tree
	 */
	void enterOperandName(GoParser.OperandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#operandName}.
	 * @param ctx the parse tree
	 */
	void exitOperandName(GoParser.OperandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdent(GoParser.QualifiedIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdent(GoParser.QualifiedIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#compositeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCompositeLiteral(GoParser.CompositeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#compositeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCompositeLiteral(GoParser.CompositeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#literalType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralType(GoParser.LiteralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#literalType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralType(GoParser.LiteralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(GoParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(GoParser.LiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(GoParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(GoParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#keyedElement}.
	 * @param ctx the parse tree
	 */
	void enterKeyedElement(GoParser.KeyedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#keyedElement}.
	 * @param ctx the parse tree
	 */
	void exitKeyedElement(GoParser.KeyedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(GoParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(GoParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(GoParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(GoParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#structType}.
	 * @param ctx the parse tree
	 */
	void enterStructType(GoParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#structType}.
	 * @param ctx the parse tree
	 */
	void exitStructType(GoParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(GoParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(GoParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#anonymousField}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousField(GoParser.AnonymousFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#anonymousField}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousField(GoParser.AnonymousFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteral(GoParser.FunctionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteral(GoParser.FunctionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(GoParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(GoParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#selectorType}.
	 * @param ctx the parse tree
	 */
	void enterSelectorType(GoParser.SelectorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#selectorType}.
	 * @param ctx the parse tree
	 */
	void exitSelectorType(GoParser.SelectorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(GoParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(GoParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(GoParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(GoParser.SliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssertion(GoParser.TypeAssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssertion(GoParser.TypeAssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GoParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GoParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#methodExpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpression(GoParser.MethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#methodExpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpression(GoParser.MethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void enterReceiverType(GoParser.ReceiverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void exitReceiverType(GoParser.ReceiverTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(GoParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(GoParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#conversion}.
	 * @param ctx the parse tree
	 */
	void enterConversion(GoParser.ConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#conversion}.
	 * @param ctx the parse tree
	 */
	void exitConversion(GoParser.ConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GoParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GoParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(GoParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(GoParser.EndContext ctx);
}