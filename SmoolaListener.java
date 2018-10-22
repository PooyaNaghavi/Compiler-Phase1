// Generated from Smoola.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmoolaParser}.
 */
public interface SmoolaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SmoolaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SmoolaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#main_class}.
	 * @param ctx the parse tree
	 */
	void enterMain_class(SmoolaParser.Main_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#main_class}.
	 * @param ctx the parse tree
	 */
	void exitMain_class(SmoolaParser.Main_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#classes}.
	 * @param ctx the parse tree
	 */
	void enterClasses(SmoolaParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#classes}.
	 * @param ctx the parse tree
	 */
	void exitClasses(SmoolaParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(SmoolaParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(SmoolaParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SmoolaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SmoolaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SmoolaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SmoolaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#declration}.
	 * @param ctx the parse tree
	 */
	void enterDeclration(SmoolaParser.DeclrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#declration}.
	 * @param ctx the parse tree
	 */
	void exitDeclration(SmoolaParser.DeclrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#function_declration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declration(SmoolaParser.Function_declrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#function_declration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declration(SmoolaParser.Function_declrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#function_input}.
	 * @param ctx the parse tree
	 */
	void enterFunction_input(SmoolaParser.Function_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#function_input}.
	 * @param ctx the parse tree
	 */
	void exitFunction_input(SmoolaParser.Function_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(SmoolaParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(SmoolaParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#if_then}.
	 * @param ctx the parse tree
	 */
	void enterIf_then(SmoolaParser.If_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#if_then}.
	 * @param ctx the parse tree
	 */
	void exitIf_then(SmoolaParser.If_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SmoolaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SmoolaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SmoolaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SmoolaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(SmoolaParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(SmoolaParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#return_main}.
	 * @param ctx the parse tree
	 */
	void enterReturn_main(SmoolaParser.Return_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#return_main}.
	 * @param ctx the parse tree
	 */
	void exitReturn_main(SmoolaParser.Return_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(SmoolaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(SmoolaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#return_value}.
	 * @param ctx the parse tree
	 */
	void enterReturn_value(SmoolaParser.Return_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#return_value}.
	 * @param ctx the parse tree
	 */
	void exitReturn_value(SmoolaParser.Return_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(SmoolaParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(SmoolaParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#class_call}.
	 * @param ctx the parse tree
	 */
	void enterClass_call(SmoolaParser.Class_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#class_call}.
	 * @param ctx the parse tree
	 */
	void exitClass_call(SmoolaParser.Class_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(SmoolaParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(SmoolaParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmoolaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SmoolaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmoolaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SmoolaParser.AssignmentContext ctx);
}