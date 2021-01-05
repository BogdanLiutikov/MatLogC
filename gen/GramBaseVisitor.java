// Generated from D:/Programming/Java/IJ/MatlogC/.idea\Gram.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link GramVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class GramBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements GramVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpression(GramParser.ExpressionContext ctx) { return visitChildren(ctx); }
}