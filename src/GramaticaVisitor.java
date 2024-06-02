// Generated from C:/Users/Jefferson Molina/Desktop/Universidad/Semestre 7/Compiladores/CompiladoProyecto/src/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(GramaticaParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declarationVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationVar(GramaticaParser.DeclarationVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#imp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImp(GramaticaParser.ImpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArit(GramaticaParser.AritContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(GramaticaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(GramaticaParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo(GramaticaParser.NoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(GramaticaParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#yy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYy(GramaticaParser.YyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#oo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOo(GramaticaParser.OoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(GramaticaParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(GramaticaParser.ParaContext ctx);
}