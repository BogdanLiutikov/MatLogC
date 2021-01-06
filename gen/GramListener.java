// Generated from D:/Programming/Java/IJ/MatlogC\Gram.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramParser}.
 */
public interface GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GramParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GramParser.ExpressionContext ctx);
}