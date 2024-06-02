// Generated from C:/Users/Jefferson Molina/Desktop/Universidad/Semestre 7/Compiladores/CompiladoProyecto/src/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, TIPODATOS=19, LITERAL=20, ARIMETICOS=21, NUMERO=22, PUNCOM=23, 
		SIGNOS=24, MULTIOPER=25, ID=26, OPER_COND=27, LETTER=28, COMA=29, NEWLINE=30;
	public static final int
		RULE_star = 0, RULE_declarationVar = 1, RULE_imp = 2, RULE_arit = 3, RULE_main = 4, 
		RULE_si = 5, RULE_no = 6, RULE_sino = 7, RULE_yy = 8, RULE_oo = 9, RULE_return = 10, 
		RULE_para = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"star", "declarationVar", "imp", "arit", "main", "si", "no", "sino", 
			"yy", "oo", "return", "para"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "'imp {'", "'ARIT ('", "')'", "'main'", "'SI'", 
			"'['", "']'", "'NO'", "'SINO'", "'yy'", "'oo'", "'Return'", "'PARA ('", 
			"':'", "')['", null, null, null, null, "';'", null, null, null, null, 
			null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TIPODATOS", "LITERAL", "ARIMETICOS", 
			"NUMERO", "PUNCOM", "SIGNOS", "MULTIOPER", "ID", "OPER_COND", "LETTER", 
			"COMA", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ImpContext imp() {
			return getRuleContext(ImpContext.class,0);
		}
		public List<DeclarationVarContext> declarationVar() {
			return getRuleContexts(DeclarationVarContext.class);
		}
		public DeclarationVarContext declarationVar(int i) {
			return getRuleContext(DeclarationVarContext.class,i);
		}
		public AritContext arit() {
			return getRuleContext(AritContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public List<SiContext> si() {
			return getRuleContexts(SiContext.class);
		}
		public SiContext si(int i) {
			return getRuleContext(SiContext.class,i);
		}
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_star);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			main();
			setState(25);
			match(T__0);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(26);
				imp();
				}
			}

			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPODATOS || _la==ID) {
				{
				{
				setState(29);
				declarationVar();
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(30);
					si();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(41);
				arit();
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(44);
				para();
				}
			}

			setState(47);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationVarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode PUNCOM() { return getToken(GramaticaParser.PUNCOM, 0); }
		public TerminalNode TIPODATOS() { return getToken(GramaticaParser.TIPODATOS, 0); }
		public TerminalNode LITERAL() { return getToken(GramaticaParser.LITERAL, 0); }
		public TerminalNode NUMERO() { return getToken(GramaticaParser.NUMERO, 0); }
		public DeclarationVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclarationVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclarationVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclarationVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationVarContext declarationVar() throws RecognitionException {
		DeclarationVarContext _localctx = new DeclarationVarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarationVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPODATOS) {
				{
				setState(49);
				match(TIPODATOS);
				}
			}

			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(52);
				match(ID);
				setState(53);
				match(PUNCOM);
				}
				break;
			case 2:
				{
				setState(54);
				match(ID);
				setState(55);
				match(T__2);
				setState(56);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 72351744L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(57);
				match(PUNCOM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImpContext extends ParserRuleContext {
		public TerminalNode PUNCOM() { return getToken(GramaticaParser.PUNCOM, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(GramaticaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(GramaticaParser.NUMERO, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(GramaticaParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(GramaticaParser.LITERAL, i);
		}
		public List<TerminalNode> COMA() { return getTokens(GramaticaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GramaticaParser.COMA, i);
		}
		public ImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitImp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitImp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpContext imp() throws RecognitionException {
		ImpContext _localctx = new ImpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__3);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 609222656L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 609222656L) != 0) );
			setState(66);
			match(T__1);
			setState(67);
			match(PUNCOM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AritContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(GramaticaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(GramaticaParser.NUMERO, i);
		}
		public List<TerminalNode> ARIMETICOS() { return getTokens(GramaticaParser.ARIMETICOS); }
		public TerminalNode ARIMETICOS(int i) {
			return getToken(GramaticaParser.ARIMETICOS, i);
		}
		public TerminalNode PUNCOM() { return getToken(GramaticaParser.PUNCOM, 0); }
		public TerminalNode MULTIOPER() { return getToken(GramaticaParser.MULTIOPER, 0); }
		public AritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitArit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritContext arit() throws RecognitionException {
		AritContext _localctx = new AritContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__4);
			setState(70);
			match(NUMERO);
			setState(71);
			match(ARIMETICOS);
			setState(72);
			match(NUMERO);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARIMETICOS) {
				{
				setState(73);
				match(ARIMETICOS);
				setState(74);
				match(NUMERO);
				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIOPER) {
				{
				setState(77);
				match(MULTIOPER);
				}
			}

			setState(80);
			match(T__5);
			setState(81);
			match(PUNCOM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SiContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> OPER_COND() { return getTokens(GramaticaParser.OPER_COND); }
		public TerminalNode OPER_COND(int i) {
			return getToken(GramaticaParser.OPER_COND, i);
		}
		public TerminalNode PUNCOM() { return getToken(GramaticaParser.PUNCOM, 0); }
		public TerminalNode NUMERO() { return getToken(GramaticaParser.NUMERO, 0); }
		public List<DeclarationVarContext> declarationVar() {
			return getRuleContexts(DeclarationVarContext.class);
		}
		public DeclarationVarContext declarationVar(int i) {
			return getRuleContext(DeclarationVarContext.class,i);
		}
		public AritContext arit() {
			return getRuleContext(AritContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public ImpContext imp() {
			return getRuleContext(ImpContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public List<YyContext> yy() {
			return getRuleContexts(YyContext.class);
		}
		public YyContext yy(int i) {
			return getRuleContext(YyContext.class,i);
		}
		public List<OoContext> oo() {
			return getRuleContexts(OoContext.class);
		}
		public OoContext oo(int i) {
			return getRuleContext(OoContext.class,i);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__7);
			setState(86);
			match(ID);
			setState(87);
			match(OPER_COND);
			setState(88);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				{
				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(89);
					yy();
					}
					break;
				case T__13:
					{
					setState(90);
					oo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93);
				match(ID);
				setState(94);
				match(OPER_COND);
				setState(95);
				match(ID);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__8);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPODATOS || _la==ID) {
				{
				{
				setState(103);
				declarationVar();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(109);
				arit();
				}
			}

			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(112);
				si();
				}
			}

			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(115);
				imp();
				}
			}

			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(118);
				para();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(121);
				return_();
				}
			}

			setState(124);
			match(T__9);
			setState(125);
			match(PUNCOM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NoContext extends ParserRuleContext {
		public NoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoContext no() throws RecognitionException {
		NoContext _localctx = new NoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_no);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SinoContext extends ParserRuleContext {
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class YyContext extends ParserRuleContext {
		public YyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterYy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitYy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitYy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YyContext yy() throws RecognitionException {
		YyContext _localctx = new YyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_yy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OoContext extends ParserRuleContext {
		public OoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OoContext oo() throws RecognitionException {
		OoContext _localctx = new OoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_oo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(GramaticaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(GramaticaParser.NUMERO, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(GramaticaParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(GramaticaParser.LITERAL, i);
		}
		public List<TerminalNode> COMA() { return getTokens(GramaticaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GramaticaParser.COMA, i);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__14);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 609222656L) != 0)) {
				{
				{
				setState(136);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 609222656L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(141);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParaContext extends ParserRuleContext {
		public TerminalNode TIPODATOS() { return getToken(GramaticaParser.TIPODATOS, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(GramaticaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(GramaticaParser.NUMERO, i);
		}
		public TerminalNode OPER_COND() { return getToken(GramaticaParser.OPER_COND, 0); }
		public TerminalNode PUNCOM() { return getToken(GramaticaParser.PUNCOM, 0); }
		public List<TerminalNode> ARIMETICOS() { return getTokens(GramaticaParser.ARIMETICOS); }
		public TerminalNode ARIMETICOS(int i) {
			return getToken(GramaticaParser.ARIMETICOS, i);
		}
		public List<DeclarationVarContext> declarationVar() {
			return getRuleContexts(DeclarationVarContext.class);
		}
		public DeclarationVarContext declarationVar(int i) {
			return getRuleContext(DeclarationVarContext.class,i);
		}
		public AritContext arit() {
			return getRuleContext(AritContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public ImpContext imp() {
			return getRuleContext(ImpContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__15);
			setState(143);
			match(TIPODATOS);
			setState(144);
			match(ID);
			setState(145);
			match(T__2);
			setState(146);
			match(NUMERO);
			setState(147);
			match(T__16);
			setState(148);
			match(ID);
			setState(149);
			match(OPER_COND);
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151);
			match(T__16);
			setState(152);
			match(ID);
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				match(ARIMETICOS);
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ARIMETICOS );
			setState(158);
			match(T__17);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPODATOS || _la==ID) {
				{
				{
				setState(159);
				declarationVar();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(165);
				arit();
				}
			}

			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(168);
				si();
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(171);
				imp();
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(174);
				para();
				}
			}

			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(177);
				return_();
				}
			}

			setState(180);
			match(T__9);
			setState(181);
			match(PUNCOM);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001c\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0005\u0000"+
		"%\b\u0000\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0003\u0000+\b\u0000\u0001"+
		"\u0000\u0003\u0000.\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003"+
		"\u00013\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0001\u0002\u0004"+
		"\u0002?\b\u0002\u000b\u0002\f\u0002@\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003L\b\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\\\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005b\b\u0005\n\u0005"+
		"\f\u0005e\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005i\b\u0005\n\u0005"+
		"\f\u0005l\t\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0005\u0003\u0005"+
		"r\b\u0005\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0005\u0003\u0005x\b"+
		"\u0005\u0001\u0005\u0003\u0005{\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u008a\b\n\n\n\f\n\u008d\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u009b\b\u000b\u000b\u000b\f\u000b\u009c\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00a1\b\u000b\n\u000b\f\u000b\u00a4\t\u000b\u0001\u000b\u0003"+
		"\u000b\u00a7\b\u000b\u0001\u000b\u0003\u000b\u00aa\b\u000b\u0001\u000b"+
		"\u0003\u000b\u00ad\b\u000b\u0001\u000b\u0003\u000b\u00b0\b\u000b\u0001"+
		"\u000b\u0003\u000b\u00b3\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0000\u0003\u0003\u0000\u0014\u0014\u0016\u0016\u001a\u001a\u0004"+
		"\u0000\u0014\u0014\u0016\u0016\u001a\u001a\u001d\u001d\u0002\u0000\u0016"+
		"\u0016\u001a\u001a\u00c5\u0000\u0018\u0001\u0000\u0000\u0000\u00022\u0001"+
		"\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000"+
		"\u0000\bS\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000\u0000\f\u007f\u0001"+
		"\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000\u0000\u0010\u0083\u0001"+
		"\u0000\u0000\u0000\u0012\u0085\u0001\u0000\u0000\u0000\u0014\u0087\u0001"+
		"\u0000\u0000\u0000\u0016\u008e\u0001\u0000\u0000\u0000\u0018\u0019\u0003"+
		"\b\u0004\u0000\u0019\u001b\u0005\u0001\u0000\u0000\u001a\u001c\u0003\u0004"+
		"\u0002\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c&\u0001\u0000\u0000\u0000\u001d!\u0003\u0002\u0001\u0000"+
		"\u001e \u0003\n\u0005\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$\u001d\u0001"+
		"\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000)+\u0003\u0006\u0003\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+-\u0001\u0000\u0000\u0000,.\u0003\u0016\u000b\u0000-,\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0002\u0000\u00000\u0001\u0001\u0000\u0000\u000013\u0005\u0013"+
		"\u0000\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003:\u0001"+
		"\u0000\u0000\u000045\u0005\u001a\u0000\u00005;\u0005\u0017\u0000\u0000"+
		"67\u0005\u001a\u0000\u000078\u0005\u0003\u0000\u000089\u0007\u0000\u0000"+
		"\u00009;\u0005\u0017\u0000\u0000:4\u0001\u0000\u0000\u0000:6\u0001\u0000"+
		"\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<>\u0005\u0004\u0000\u0000"+
		"=?\u0007\u0001\u0000\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BC\u0005\u0002\u0000\u0000CD\u0005\u0017\u0000\u0000D\u0005"+
		"\u0001\u0000\u0000\u0000EF\u0005\u0005\u0000\u0000FG\u0005\u0016\u0000"+
		"\u0000GH\u0005\u0015\u0000\u0000HK\u0005\u0016\u0000\u0000IJ\u0005\u0015"+
		"\u0000\u0000JL\u0005\u0016\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MO\u0005\u0019\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0005\u0006\u0000\u0000QR\u0005\u0017\u0000\u0000R\u0007\u0001"+
		"\u0000\u0000\u0000ST\u0005\u0007\u0000\u0000T\t\u0001\u0000\u0000\u0000"+
		"UV\u0005\b\u0000\u0000VW\u0005\u001a\u0000\u0000WX\u0005\u001b\u0000\u0000"+
		"Xc\u0007\u0002\u0000\u0000Y\\\u0003\u0010\b\u0000Z\\\u0003\u0012\t\u0000"+
		"[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]^\u0005\u001a\u0000\u0000^_\u0005\u001b\u0000\u0000_`\u0005\u001a"+
		"\u0000\u0000`b\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000be\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fj\u0005\t\u0000\u0000"+
		"gi\u0003\u0002\u0001\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0003\u0006\u0003\u0000nm\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000"+
		"pr\u0003\n\u0005\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rt\u0001\u0000\u0000\u0000su\u0003\u0004\u0002\u0000ts\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vx\u0003\u0016"+
		"\u000b\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001"+
		"\u0000\u0000\u0000y{\u0003\u0014\n\u0000zy\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\n\u0000\u0000}~\u0005"+
		"\u0017\u0000\u0000~\u000b\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u000b"+
		"\u0000\u0000\u0080\r\u0001\u0000\u0000\u0000\u0081\u0082\u0005\f\u0000"+
		"\u0000\u0082\u000f\u0001\u0000\u0000\u0000\u0083\u0084\u0005\r\u0000\u0000"+
		"\u0084\u0011\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u000e\u0000\u0000"+
		"\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u008b\u0005\u000f\u0000\u0000"+
		"\u0088\u008a\u0007\u0001\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0015\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0010\u0000\u0000"+
		"\u008f\u0090\u0005\u0013\u0000\u0000\u0090\u0091\u0005\u001a\u0000\u0000"+
		"\u0091\u0092\u0005\u0003\u0000\u0000\u0092\u0093\u0005\u0016\u0000\u0000"+
		"\u0093\u0094\u0005\u0011\u0000\u0000\u0094\u0095\u0005\u001a\u0000\u0000"+
		"\u0095\u0096\u0005\u001b\u0000\u0000\u0096\u0097\u0007\u0002\u0000\u0000"+
		"\u0097\u0098\u0005\u0011\u0000\u0000\u0098\u009a\u0005\u001a\u0000\u0000"+
		"\u0099\u009b\u0005\u0015\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u00a2\u0005\u0012\u0000\u0000\u009f\u00a1\u0003\u0002\u0001\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0003\u0006\u0003\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a8\u00aa\u0003\n\u0005\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ad\u0003\u0004\u0002\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b0\u0003\u0016\u000b\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b3\u0003\u0014\n\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\n\u0000\u0000\u00b5\u00b6\u0005\u0017\u0000\u0000\u00b6\u0017\u0001"+
		"\u0000\u0000\u0000\u001a\u001b!&*-2:@KN[cjnqtwz\u008b\u009c\u00a2\u00a6"+
		"\u00a9\u00ac\u00af\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}