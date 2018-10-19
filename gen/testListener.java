// Generated from /Users/pooya/Desktop/University/Term 7(F 97)/Compilers and Programming Languages/Project/Phase1/test.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(testParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(testParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(testParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(testParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(testParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(testParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(testParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(testParser.AtomExpContext ctx);
}