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
		TIPODATOS=18, LITERAL=19, ARIMETICOS=20, NUMERO=21, PUNCOM=22, SIGNOS=23, 
		MULTIOPER=24, ID=25, OPER_COND=26, LETTER=27, COMA=28, NEWLINE=29;
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
			null, "'{'", "'}'", "'='", "'imp ('", "')'", "'ARIT ('", "'main'", "'SI ('", 
			"') {'", "'NO'", "'SINO'", "'yy'", "'oo'", "'Return'", "'PARA ('", "':'", 
			"'){'", null, null, null, null, "';'", null, null, null, null, null, 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TIPODATOS", "LITERAL", "ARIMETICOS", 
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
		public AritContext arit() {
			return getRuleContext(AritContext.class,0);
		}
		public List<ImpContext> imp() {
			return getRuleContexts(ImpContext.class);
		}
		public ImpContext imp(int i) {
			return getRuleContext(ImpContext.class,i);
		}
		public List<ParaContext> para() {
			return getRuleContexts(ParaContext.class);
		}
		public ParaContext para(int i) {
			return getRuleContext(ParaContext.class,i);
		}
		public List<DeclarationVarContext> declarationVar() {
			return getRuleContexts(DeclarationVarContext.class);
		}
		public DeclarationVarContext declarationVar(int i) {
			return getRuleContext(DeclarationVarContext.class,i);
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
			if (_la==T__5) {
				{
				setState(26);
				arit();
				}
			}

			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(29);
				imp();
				}
				break;
			}
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(32);
				para();
				}
				break;
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPODATOS || _la==ID) {
				{
				{
				setState(35);
				declarationVar();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(36);
					si();
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(47);
				imp();
				}
			}

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(50);
				para();
				}
			}

			setState(53);
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
		public List<TerminalNode> LITERAL() { return getTokens(GramaticaParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(GramaticaParser.LITERAL, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(GramaticaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(GramaticaParser.NUMERO, i);
		}
		public List<TerminalNode> ARIMETICOS() { return getTokens(GramaticaParser.ARIMETICOS); }
		public TerminalNode ARIMETICOS(int i) {
			return getToken(GramaticaParser.ARIMETICOS, i);
		}
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPODATOS) {
				{
				setState(55);
				match(TIPODATOS);
				}
			}

			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(58);
				match(ID);
				setState(59);
				match(PUNCOM);
				}
				break;
			case 2:
				{
				setState(60);
				match(ID);
				setState(61);
				match(T__2);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37224448L) != 0)) {
					{
					{
					setState(62);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 37224448L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(68);
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
		public List<TerminalNode> ARIMETICOS() { return getTokens(GramaticaParser.ARIMETICOS); }
		public TerminalNode ARIMETICOS(int i) {
			return getToken(GramaticaParser.ARIMETICOS, i);
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
			setState(71);
			match(T__3);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 305659904L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 305659904L) != 0) );
			setState(77);
			match(T__4);
			setState(78);
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
			setState(80);
			match(T__5);
			setState(81);
			match(NUMERO);
			setState(82);
			match(ARIMETICOS);
			setState(83);
			match(NUMERO);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARIMETICOS) {
				{
				setState(84);
				match(ARIMETICOS);
				setState(85);
				match(NUMERO);
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIOPER) {
				{
				setState(88);
				match(MULTIOPER);
				}
			}

			setState(91);
			match(T__4);
			setState(92);
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
			setState(94);
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
		public List<AritContext> arit() {
			return getRuleContexts(AritContext.class);
		}
		public AritContext arit(int i) {
			return getRuleContext(AritContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__7);
			setState(97);
			match(ID);
			setState(98);
			match(OPER_COND);
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				{
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(100);
					yy();
					}
					break;
				case T__12:
					{
					setState(101);
					oo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(104);
				match(ID);
				setState(105);
				match(OPER_COND);
				setState(106);
				match(ID);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__8);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					declarationVar();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(120);
				arit();
				}
				break;
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(123);
				si();
				}
			}

			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(126);
				imp();
				}
			}

			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(129);
				para();
				}
			}

			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(132);
				return_();
				}
			}

			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPODATOS || _la==ID) {
				{
				setState(135);
				declarationVar();
				}
			}

			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(138);
				arit();
				}
			}

			setState(141);
			match(T__1);
			setState(142);
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
			setState(144);
			match(T__9);
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
			setState(146);
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
			setState(148);
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
			setState(150);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__13);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 304611328L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__14);
			setState(160);
			match(TIPODATOS);
			setState(161);
			match(ID);
			setState(162);
			match(T__2);
			setState(163);
			match(NUMERO);
			setState(164);
			match(T__15);
			setState(165);
			match(ID);
			setState(166);
			match(OPER_COND);
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			match(T__15);
			setState(169);
			match(ID);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				match(ARIMETICOS);
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ARIMETICOS );
			setState(175);
			match(T__16);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					declarationVar();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(182);
				arit();
				}
			}

			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(185);
				si();
				}
			}

			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(188);
				imp();
				}
			}

			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(191);
				para();
				}
			}

			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(194);
				return_();
				}
			}

			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPODATOS || _la==ID) {
				{
				setState(197);
				declarationVar();
				}
			}

			setState(200);
			match(T__1);
			setState(201);
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
		"\u0004\u0001\u001d\u00cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001c\b\u0000\u0001\u0000"+
		"\u0003\u0000\u001f\b\u0000\u0001\u0000\u0003\u0000\"\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0005\u0000"+
		"+\b\u0000\n\u0000\f\u0000.\t\u0000\u0001\u0000\u0003\u00001\b\u0000\u0001"+
		"\u0000\u0003\u00004\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003"+
		"\u00019\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0001\u0003"+
		"\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0004\u0002J\b\u0002\u000b\u0002"+
		"\f\u0002K\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003W\b\u0003"+
		"\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005m\b\u0005\n\u0005\f\u0005p\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005t\b\u0005\n\u0005\f\u0005w\t\u0005"+
		"\u0001\u0005\u0003\u0005z\b\u0005\u0001\u0005\u0003\u0005}\b\u0005\u0001"+
		"\u0005\u0003\u0005\u0080\b\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005"+
		"\u0001\u0005\u0003\u0005\u0086\b\u0005\u0001\u0005\u0003\u0005\u0089\b"+
		"\u0005\u0001\u0005\u0003\u0005\u008c\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u009b\b\n\n\n\f\n\u009e\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u00ac\b\u000b\u000b\u000b\f\u000b\u00ad\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00b2\b\u000b\n\u000b\f\u000b\u00b5\t\u000b\u0001\u000b\u0003"+
		"\u000b\u00b8\b\u000b\u0001\u000b\u0003\u000b\u00bb\b\u000b\u0001\u000b"+
		"\u0003\u000b\u00be\b\u000b\u0001\u000b\u0003\u000b\u00c1\b\u000b\u0001"+
		"\u000b\u0003\u000b\u00c4\b\u000b\u0001\u000b\u0003\u000b\u00c7\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0004\u0002\u0000"+
		"\u0013\u0015\u0019\u0019\u0003\u0000\u0013\u0015\u0019\u0019\u001c\u001c"+
		"\u0002\u0000\u0015\u0015\u0019\u0019\u0004\u0000\u0013\u0013\u0015\u0015"+
		"\u0019\u0019\u001c\u001c\u00df\u0000\u0018\u0001\u0000\u0000\u0000\u0002"+
		"8\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006P\u0001"+
		"\u0000\u0000\u0000\b^\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000"+
		"\f\u0090\u0001\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010"+
		"\u0094\u0001\u0000\u0000\u0000\u0012\u0096\u0001\u0000\u0000\u0000\u0014"+
		"\u0098\u0001\u0000\u0000\u0000\u0016\u009f\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0003\b\u0004\u0000\u0019\u001b\u0005\u0001\u0000\u0000\u001a\u001c"+
		"\u0003\u0006\u0003\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001f"+
		"\u0003\u0004\u0002\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \"\u0003\u0016"+
		"\u000b\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\",\u0001"+
		"\u0000\u0000\u0000#\'\u0003\u0002\u0001\u0000$&\u0003\n\u0005\u0000%$"+
		"\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000*#\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000/1\u0003\u0004\u0002\u00000/\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u000024\u0003\u0016"+
		"\u000b\u000032\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000056\u0005\u0002\u0000\u00006\u0001\u0001\u0000\u0000"+
		"\u000079\u0005\u0012\u0000\u000087\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009E\u0001\u0000\u0000\u0000:;\u0005\u0019\u0000\u0000;F\u0005"+
		"\u0016\u0000\u0000<=\u0005\u0019\u0000\u0000=A\u0005\u0003\u0000\u0000"+
		">@\u0007\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0005\u0016\u0000\u0000E:\u0001"+
		"\u0000\u0000\u0000E<\u0001\u0000\u0000\u0000F\u0003\u0001\u0000\u0000"+
		"\u0000GI\u0005\u0004\u0000\u0000HJ\u0007\u0001\u0000\u0000IH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0005\u0005\u0000\u0000"+
		"NO\u0005\u0016\u0000\u0000O\u0005\u0001\u0000\u0000\u0000PQ\u0005\u0006"+
		"\u0000\u0000QR\u0005\u0015\u0000\u0000RS\u0005\u0014\u0000\u0000SV\u0005"+
		"\u0015\u0000\u0000TU\u0005\u0014\u0000\u0000UW\u0005\u0015\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XZ\u0005\u0018\u0000\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0005\u0005\u0000\u0000\\]\u0005"+
		"\u0016\u0000\u0000]\u0007\u0001\u0000\u0000\u0000^_\u0005\u0007\u0000"+
		"\u0000_\t\u0001\u0000\u0000\u0000`a\u0005\b\u0000\u0000ab\u0005\u0019"+
		"\u0000\u0000bc\u0005\u001a\u0000\u0000cn\u0007\u0002\u0000\u0000dg\u0003"+
		"\u0010\b\u0000eg\u0003\u0012\t\u0000fd\u0001\u0000\u0000\u0000fe\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0019\u0000\u0000"+
		"ij\u0005\u001a\u0000\u0000jk\u0005\u0019\u0000\u0000km\u0001\u0000\u0000"+
		"\u0000lf\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qu\u0005\t\u0000\u0000rt\u0003\u0002\u0001\u0000sr\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000xz\u0003\u0006\u0003\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z|\u0001\u0000\u0000\u0000{}\u0003\n\u0005\u0000|{\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~\u0080\u0003\u0004\u0002\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0003\u0016\u000b\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0003\u0014\n\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0089\u0003"+
		"\u0002\u0001\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u008c\u0003"+
		"\u0006\u0003\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\u0002\u0000\u0000\u008e\u008f\u0005\u0016\u0000\u0000\u008f\u000b\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091\r\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005\u000b\u0000\u0000\u0093\u000f\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005\f\u0000\u0000\u0095\u0011\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\r\u0000\u0000\u0097\u0013\u0001\u0000\u0000\u0000"+
		"\u0098\u009c\u0005\u000e\u0000\u0000\u0099\u009b\u0007\u0003\u0000\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u0015\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\u000f\u0000\u0000\u00a0\u00a1\u0005\u0012\u0000\u0000"+
		"\u00a1\u00a2\u0005\u0019\u0000\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000"+
		"\u00a3\u00a4\u0005\u0015\u0000\u0000\u00a4\u00a5\u0005\u0010\u0000\u0000"+
		"\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6\u00a7\u0005\u001a\u0000\u0000"+
		"\u00a7\u00a8\u0007\u0002\u0000\u0000\u00a8\u00a9\u0005\u0010\u0000\u0000"+
		"\u00a9\u00ab\u0005\u0019\u0000\u0000\u00aa\u00ac\u0005\u0014\u0000\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b3\u0005\u0011\u0000\u0000"+
		"\u00b0\u00b2\u0003\u0002\u0001\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u0006\u0003\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00bb\u0003\n\u0005\u0000\u00ba"+
		"\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bc\u00be\u0003\u0004\u0002\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00c0\u0001\u0000\u0000\u0000\u00bf\u00c1\u0003\u0016\u000b\u0000\u00c0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003\u0014\n\u0000\u00c3\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c7\u0003\u0002\u0001\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0002\u0000\u0000\u00c9\u00ca"+
		"\u0005\u0016\u0000\u0000\u00ca\u0017\u0001\u0000\u0000\u0000 \u001b\u001e"+
		"!\',038AEKVYfnuy|\u007f\u0082\u0085\u0088\u008b\u009c\u00ad\u00b3\u00b7"+
		"\u00ba\u00bd\u00c0\u00c3\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}