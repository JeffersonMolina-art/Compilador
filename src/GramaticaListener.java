// Generated from C:/Users/Jefferson Molina/Desktop/Universidad/Semestre 7/Compiladores/CompiladoProyecto/src/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(GramaticaParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(GramaticaParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declarationVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationVar(GramaticaParser.DeclarationVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declarationVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationVar(GramaticaParser.DeclarationVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#imp}.
	 * @param ctx the parse tree
	 */
	void enterImp(GramaticaParser.ImpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#imp}.
	 * @param ctx the parse tree
	 */
	void exitImp(GramaticaParser.ImpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#arit}.
	 * @param ctx the parse tree
	 */
	void enterArit(GramaticaParser.AritContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#arit}.
	 * @param ctx the parse tree
	 */
	void exitArit(GramaticaParser.AritContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(GramaticaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(GramaticaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(GramaticaParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(GramaticaParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#no}.
	 * @param ctx the parse tree
	 */
	void enterNo(GramaticaParser.NoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#no}.
	 * @param ctx the parse tree
	 */
	void exitNo(GramaticaParser.NoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(GramaticaParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(GramaticaParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#yy}.
	 * @param ctx the parse tree
	 */
	void enterYy(GramaticaParser.YyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#yy}.
	 * @param ctx the parse tree
	 */
	void exitYy(GramaticaParser.YyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#oo}.
	 * @param ctx the parse tree
	 */
	void enterOo(GramaticaParser.OoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#oo}.
	 * @param ctx the parse tree
	 */
	void exitOo(GramaticaParser.OoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(GramaticaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(GramaticaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(GramaticaParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(GramaticaParser.ParaContext ctx);
}