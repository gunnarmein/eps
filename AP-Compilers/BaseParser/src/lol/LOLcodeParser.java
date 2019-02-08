// Generated from c:\Users\gmein\Documents\NetBeansProjects\BaseParser\src\lol\LOLcode.g4 by ANTLR 4.7.1

   package lol;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LOLcodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MULTILINECOMMENT=1, SINGLELINECOMMENT=2, MINUS=3, DOT=4, NUMBER=5, YARN_LITERAL=6, 
		WIN=7, FAIL=8, NUMBR=9, NUMBAR=10, YARN=11, SUM=12, DIFF=13, PRODUKT=14, 
		QUOSHUNT=15, MOD=16, BIGGR=17, SMALLR=18, IZ=19, MAEK=20, THAN=21, AN=22, 
		OF=23, IT=24, MKAY=25, SMOOSH=26, TROOF=27, BOTH=28, EITHER=29, ANY=30, 
		ALL=31, WON=32, NOT=33, SAEM=34, DIFFRINT=35, I=36, HAS=37, A=38, R=39, 
		ITZ=40, HOW=41, DUZ=42, YR=43, IF=44, U=45, SAY=46, SO=47, IM=48, IN=49, 
		OUTTA=50, TIL=51, WILE=52, UPPIN=53, NERFIN=54, WTF=55, QUESTION=56, OIC=57, 
		OMG=58, OMGWTF=59, FOUND=60, GTFO=61, O=62, RLY=63, YA=64, NO=65, WAI=66, 
		MEBBE=67, GIMMEH=68, INVISIBLE=69, VISIBLE=70, EXCLAMATION=71, HAI=72, 
		KTHXBYE=73, COMMA=74, NEWLINE=75, IDENTIFIER=76, ELLIPSIS=77, WS=78;
	public static final int
		RULE_literal_value = 0, RULE_atom = 1, RULE_vartype = 2, RULE_sum = 3, 
		RULE_diff = 4, RULE_product = 5, RULE_quotient = 6, RULE_bigger = 7, RULE_smallr = 8, 
		RULE_min = 9, RULE_max = 10, RULE_mod = 11, RULE_not = 12, RULE_same = 13, 
		RULE_and = 14, RULE_either = 15, RULE_one = 16, RULE_all = 17, RULE_any = 18, 
		RULE_concat = 19, RULE_cast = 20, RULE_var_ref = 21, RULE_expr = 22, RULE_var_decl = 23, 
		RULE_var_assignment = 24, RULE_arg_decl = 25, RULE_more_args_decl = 26, 
		RULE_args_decl = 27, RULE_func_decl = 28, RULE_return_statement = 29, 
		RULE_arg = 30, RULE_more_args = 31, RULE_args = 32, RULE_func_call = 33, 
		RULE_verb = 34, RULE_loop_action = 35, RULE_loop = 36, RULE_aswitch = 37, 
		RULE_acase = 38, RULE_adefault = 39, RULE_anif = 40, RULE_then = 41, RULE_elseif = 42, 
		RULE_anelse = 43, RULE_ifthenelseifelse = 44, RULE_input = 45, RULE_output_args = 46, 
		RULE_output = 47, RULE_core_statement = 48, RULE_inner_statement = 49, 
		RULE_top_level_statement = 50, RULE_separator = 51, RULE_block = 52, RULE_top_level_block = 53, 
		RULE_program = 54;
	public static final String[] ruleNames = {
		"literal_value", "atom", "vartype", "sum", "diff", "product", "quotient", 
		"bigger", "smallr", "min", "max", "mod", "not", "same", "and", "either", 
		"one", "all", "any", "concat", "cast", "var_ref", "expr", "var_decl", 
		"var_assignment", "arg_decl", "more_args_decl", "args_decl", "func_decl", 
		"return_statement", "arg", "more_args", "args", "func_call", "verb", "loop_action", 
		"loop", "aswitch", "acase", "adefault", "anif", "then", "elseif", "anelse", 
		"ifthenelseifelse", "input", "output_args", "output", "core_statement", 
		"inner_statement", "top_level_statement", "separator", "block", "top_level_block", 
		"program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'-'", "'.'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'?'", null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'!'", 
		null, null, "','", "'\n'", null, "'...\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MULTILINECOMMENT", "SINGLELINECOMMENT", "MINUS", "DOT", "NUMBER", 
		"YARN_LITERAL", "WIN", "FAIL", "NUMBR", "NUMBAR", "YARN", "SUM", "DIFF", 
		"PRODUKT", "QUOSHUNT", "MOD", "BIGGR", "SMALLR", "IZ", "MAEK", "THAN", 
		"AN", "OF", "IT", "MKAY", "SMOOSH", "TROOF", "BOTH", "EITHER", "ANY", 
		"ALL", "WON", "NOT", "SAEM", "DIFFRINT", "I", "HAS", "A", "R", "ITZ", 
		"HOW", "DUZ", "YR", "IF", "U", "SAY", "SO", "IM", "IN", "OUTTA", "TIL", 
		"WILE", "UPPIN", "NERFIN", "WTF", "QUESTION", "OIC", "OMG", "OMGWTF", 
		"FOUND", "GTFO", "O", "RLY", "YA", "NO", "WAI", "MEBBE", "GIMMEH", "INVISIBLE", 
		"VISIBLE", "EXCLAMATION", "HAI", "KTHXBYE", "COMMA", "NEWLINE", "IDENTIFIER", 
		"ELLIPSIS", "WS"
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
	public String getGrammarFileName() { return "LOLcode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LOLcodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(LOLcodeParser.NUMBER, 0); }
		public TerminalNode YARN_LITERAL() { return getToken(LOLcodeParser.YARN_LITERAL, 0); }
		public TerminalNode WIN() { return getToken(LOLcodeParser.WIN, 0); }
		public TerminalNode FAIL() { return getToken(LOLcodeParser.FAIL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << YARN_LITERAL) | (1L << WIN) | (1L << FAIL))) != 0)) ) {
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

	public static class AtomContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode IT() { return getToken(LOLcodeParser.IT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LOLcodeParser.IDENTIFIER, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_atom);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case YARN_LITERAL:
			case WIN:
			case FAIL:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				literal_value();
				}
				break;
			case IT:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(IT);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(IDENTIFIER);
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

	public static class VartypeContext extends ParserRuleContext {
		public TerminalNode NUMBR() { return getToken(LOLcodeParser.NUMBR, 0); }
		public TerminalNode NUMBAR() { return getToken(LOLcodeParser.NUMBAR, 0); }
		public TerminalNode YARN() { return getToken(LOLcodeParser.YARN, 0); }
		public TerminalNode TROOF() { return getToken(LOLcodeParser.TROOF, 0); }
		public VartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterVartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitVartype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitVartype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VartypeContext vartype() throws RecognitionException {
		VartypeContext _localctx = new VartypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBR) | (1L << NUMBAR) | (1L << YARN) | (1L << TROOF))) != 0)) ) {
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

	public static class SumContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(LOLcodeParser.SUM, 0); }
		public TerminalNode OF() { return getToken(LOLcodeParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AN() { return getToken(LOLcodeParser.AN, 0); }
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(SUM);
			setState(120);
			match(OF);
			setState(121);
			expr();
			setState(122);
			match(AN);
			setState(123);
			expr();
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

	public static class DiffContext extends ParserRuleContext {
		public TerminalNode DIFF() { return getToken(LOLcodeParser.DIFF, 0); }
		public TerminalNode OF() { return getToken(LOLcodeParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AN() { return getToken(LOLcodeParser.AN, 0); }
		public DiffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitDiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitDiff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiffContext diff() throws RecognitionException {
		DiffContext _localctx = new DiffContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_diff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DIFF);
			setState(126);
			match(OF);
			setState(127);
			expr();
			setState(128);
			match(AN);
			setState(129);
			expr();
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

	public static class ProductContext extends ParserRuleContext {
		public TerminalNode PRODUKT() { return getToken(LOLcodeParser.PRODUKT, 0); }
		public TerminalNode OF() { return getToken(LOLcodeParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AN() { return getToken(LOLcodeParser.AN, 0); }
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(PRODUKT);
			setState(132);
			match(OF);
			setState(133);
			expr();
			setState(134);
			match(AN);
			setState(135);
			expr();
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

	public static class QuotientContext extends ParserRuleContext {
		public TerminalNode QUOSHUNT() { return getToken(LOLcodeParser.QUOSHUNT, 0); }
		public TerminalNode OF() { return getToken(LOLcodeParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AN() { return getToken(LOLcodeParser.AN, 0); }
		public QuotientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterQuotient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitQuotient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitQuotient(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotientContext quotient() throws RecognitionException {
		QuotientContext _localctx = new QuotientContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quotient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(QUOSHUNT);
			setState(138);
			match(OF);
			setState(139);
			expr();
			setState(140);
			match(AN);
			setState(141);
			expr();
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

	public static class BiggerContext extends ParserRuleContext {
		public TerminalNode IZ() { return getToken(LOLcodeParser.IZ, 0); }
		public TerminalNode BIGGR() { return getToken(LOLcodeParser.BIGGR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THAN() { return getToken(LOLcodeParser.THAN, 0); }
		public BiggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterBigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitBigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitBigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BiggerContext bigger() throws RecognitionException {
		BiggerContext _localctx = new BiggerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IZ);
			setState(144);
			match(BIGGR);
			setState(145);
			expr();
			setState(146);
			match(THAN);
			setState(147);
			expr();
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

	public static class SmallrContext extends ParserRuleContext {
		public TerminalNode IZ() { return getToken(LOLcodeParser.IZ, 0); }
		public TerminalNode SMALLR() { return getToken(LOLcodeParser.SMALLR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THAN() { return getToken(LOLcodeParser.THAN, 0); }
		public SmallrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smallr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterSmallr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitSmallr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitSmallr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmallrContext smallr() throws RecognitionException {
		SmallrContext _localctx = new SmallrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_smallr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IZ);
			setState(150);
			match(SMALLR);
			setState(151);
			expr();
			setState(152);
			match(THAN);
			setState(153);
			expr();
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

	public static class MinContext extends ParserRuleContext {
		public TerminalNode SMALLR() { return getToken(LOLcodeParser.SMALLR, 0); }
		public TerminalNode OF() { return getToken(LOLcodeParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AN() { return getToken(LOLcodeParser.AN, 0); }
		public MinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitMin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinContext min() throws RecognitionException {
		MinContext _localctx = new MinContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_min);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SMALLR);
			setState(156);
			match(OF);
			setState(157);
			expr();
			setState(158);
			match(AN);
			setState(159);
			expr();
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

	public static class MaxContext extends ParserRuleContext {
		public TerminalNode BIGGR() { return getToken(LOLcodeParser.BIGGR, 0); }
		public TerminalNode OF() { return getToken(LOLcodeParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AN() { return getToken(LOLcodeParser.AN, 0); }
		public MaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitMax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxContext max() throws RecognitionException {
		MaxContext _localctx = new MaxContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_max);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(BIGGR);
			setState(162);
			match(OF);
			setState(163);
			expr();
			setState(164);
			match(AN);
			setState(165);
			expr();
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

	public static class ModContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(LOLcodeParser.MOD, 0); }
		public TerminalNode OF() { return getToken(LOLcodeParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AN() { return getToken(LOLcodeParser.AN, 0); }
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(MOD);
			setState(168);
			match(OF);
			setState(169);
			expr();
			setState(170);
			match(AN);
			setState(171);
			expr();
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

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(LOLcodeParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(NOT);
			setState(174);
			expr();
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

	public static class SameContext extends ParserRuleContext {
		public TerminalNode BOTH() { return getToken(LOLcodeParser.BOTH, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AN() { return getToken(LOLcodeParser.AN, 0); }
		public TerminalNode SAEM() { return getToken(LOLcodeParser.SAEM, 0); }
		public TerminalNode DIFFRINT() { return getToken(LOLcodeParser.DIFFRINT, 0); }
		public SameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterSame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitSame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitSame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SameContext same() throws RecognitionException {
		SameContext _localctx = new SameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_same);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(BOTH);
			setState(177);
			_la = _input.LA(1);
			if ( !(_la==SAEM || _la==DIFFRINT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			expr();
			setState(179);
			match(AN);
			setState(180);
			expr();
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

	public static class AndContext extends ParserRuleContext {
		public TerminalNode BOTH() { return getToken(LOLcodeParser.BOTH, 0); }
		public TerminalNode OF() { return getToken(LOLcodeParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AN() { return getToken(LOLcodeParser.AN, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(BOTH);
			setState(183);
			match(OF);
			setState(184);
			expr();
			setState(185);
			match(AN);
			setState(186);
			expr();
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

	public static class EitherContext extends ParserRuleContext {
		public TerminalNode EITHER() { return getToken(LOLcodeParser.EITHER, 0); }
		public TerminalNode OF() { return getToken(LOLcodeParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AN() { return getToken(LOLcodeParser.AN, 0); }
		public EitherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_either; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterEither(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitEither(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitEither(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EitherContext either() throws RecognitionException {
		EitherContext _localctx = new EitherContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_either);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(EITHER);
			setState(189);
			match(OF);
			setState(190);
			expr();
			setState(191);
			match(AN);
			setState(192);
			expr();
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

	public static class OneContext extends ParserRuleContext {
		public TerminalNode WON() { return getToken(LOLcodeParser.WON, 0); }
		public TerminalNode OF() { return getToken(LOLcodeParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AN() { return getToken(LOLcodeParser.AN, 0); }
		public OneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneContext one() throws RecognitionException {
		OneContext _localctx = new OneContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(WON);
			setState(195);
			match(OF);
			setState(196);
			expr();
			setState(197);
			match(AN);
			setState(198);
			expr();
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

	public static class AllContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(LOLcodeParser.ALL, 0); }
		public TerminalNode OF() { return getToken(LOLcodeParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MKAY() { return getToken(LOLcodeParser.MKAY, 0); }
		public List<TerminalNode> AN() { return getTokens(LOLcodeParser.AN); }
		public TerminalNode AN(int i) {
			return getToken(LOLcodeParser.AN, i);
		}
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_all);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ALL);
			setState(201);
			match(OF);
			setState(202);
			expr();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(203);
				match(AN);
				setState(204);
				expr();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(MKAY);
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

	public static class AnyContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(LOLcodeParser.ANY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MKAY() { return getToken(LOLcodeParser.MKAY, 0); }
		public List<TerminalNode> AN() { return getTokens(LOLcodeParser.AN); }
		public TerminalNode AN(int i) {
			return getToken(LOLcodeParser.AN, i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_any);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ANY);
			setState(213);
			expr();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(214);
				match(AN);
				setState(215);
				expr();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(MKAY);
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

	public static class ConcatContext extends ParserRuleContext {
		public TerminalNode SMOOSH() { return getToken(LOLcodeParser.SMOOSH, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MKAY() { return getToken(LOLcodeParser.MKAY, 0); }
		public List<TerminalNode> AN() { return getTokens(LOLcodeParser.AN); }
		public TerminalNode AN(int i) {
			return getToken(LOLcodeParser.AN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LOLcodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LOLcodeParser.COMMA, i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_concat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(SMOOSH);
			setState(224);
			expr();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN || _la==COMMA) {
				{
				{
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==AN || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				expr();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(MKAY);
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

	public static class CastContext extends ParserRuleContext {
		public TerminalNode MAEK() { return getToken(LOLcodeParser.MAEK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode A() { return getToken(LOLcodeParser.A, 0); }
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(MAEK);
			setState(235);
			expr();
			setState(236);
			match(A);
			setState(237);
			vartype();
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

	public static class Var_refContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LOLcodeParser.IDENTIFIER, 0); }
		public Var_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterVar_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitVar_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitVar_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_refContext var_ref() throws RecognitionException {
		Var_refContext _localctx = new Var_refContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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

	public static class ExprContext extends ParserRuleContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public DiffContext diff() {
			return getRuleContext(DiffContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public QuotientContext quotient() {
			return getRuleContext(QuotientContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public SameContext same() {
			return getRuleContext(SameContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public EitherContext either() {
			return getRuleContext(EitherContext.class,0);
		}
		public OneContext one() {
			return getRuleContext(OneContext.class,0);
		}
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public Var_refContext var_ref() {
			return getRuleContext(Var_refContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				sum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				diff();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				product();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				quotient();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				mod();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				not();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				same();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				and();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				either();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(250);
				one();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(251);
				all();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(252);
				any();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(253);
				concat();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(254);
				cast();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(255);
				var_ref();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(256);
				atom();
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode I() { return getToken(LOLcodeParser.I, 0); }
		public TerminalNode HAS() { return getToken(LOLcodeParser.HAS, 0); }
		public TerminalNode A() { return getToken(LOLcodeParser.A, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LOLcodeParser.IDENTIFIER, 0); }
		public TerminalNode ITZ() { return getToken(LOLcodeParser.ITZ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(I);
			setState(260);
			match(HAS);
			setState(261);
			match(A);
			setState(262);
			match(IDENTIFIER);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ITZ) {
				{
				setState(263);
				match(ITZ);
				setState(264);
				expr();
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

	public static class Var_assignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LOLcodeParser.IDENTIFIER, 0); }
		public TerminalNode R() { return getToken(LOLcodeParser.R, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterVar_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitVar_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitVar_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignmentContext var_assignment() throws RecognitionException {
		Var_assignmentContext _localctx = new Var_assignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_var_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(IDENTIFIER);
			setState(268);
			match(R);
			setState(269);
			expr();
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

	public static class Arg_declContext extends ParserRuleContext {
		public TerminalNode YR() { return getToken(LOLcodeParser.YR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LOLcodeParser.IDENTIFIER, 0); }
		public Arg_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterArg_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitArg_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitArg_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_declContext arg_decl() throws RecognitionException {
		Arg_declContext _localctx = new Arg_declContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arg_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(YR);
			setState(272);
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

	public static class More_args_declContext extends ParserRuleContext {
		public TerminalNode MKAY() { return getToken(LOLcodeParser.MKAY, 0); }
		public List<TerminalNode> AN() { return getTokens(LOLcodeParser.AN); }
		public TerminalNode AN(int i) {
			return getToken(LOLcodeParser.AN, i);
		}
		public List<Arg_declContext> arg_decl() {
			return getRuleContexts(Arg_declContext.class);
		}
		public Arg_declContext arg_decl(int i) {
			return getRuleContext(Arg_declContext.class,i);
		}
		public More_args_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_args_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterMore_args_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitMore_args_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitMore_args_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final More_args_declContext more_args_decl() throws RecognitionException {
		More_args_declContext _localctx = new More_args_declContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_more_args_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(274);
				match(AN);
				setState(275);
				arg_decl();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(MKAY);
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

	public static class Args_declContext extends ParserRuleContext {
		public Arg_declContext arg_decl() {
			return getRuleContext(Arg_declContext.class,0);
		}
		public More_args_declContext more_args_decl() {
			return getRuleContext(More_args_declContext.class,0);
		}
		public Args_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterArgs_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitArgs_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitArgs_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_declContext args_decl() throws RecognitionException {
		Args_declContext _localctx = new Args_declContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_args_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			arg_decl();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AN || _la==MKAY) {
				{
				setState(284);
				more_args_decl();
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

	public static class Func_declContext extends ParserRuleContext {
		public TerminalNode HOW() { return getToken(LOLcodeParser.HOW, 0); }
		public TerminalNode I() { return getToken(LOLcodeParser.I, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LOLcodeParser.IDENTIFIER, 0); }
		public TerminalNode IF() { return getToken(LOLcodeParser.IF, 0); }
		public TerminalNode U() { return getToken(LOLcodeParser.U, 0); }
		public TerminalNode SAY() { return getToken(LOLcodeParser.SAY, 0); }
		public TerminalNode SO() { return getToken(LOLcodeParser.SO, 0); }
		public TerminalNode IZ() { return getToken(LOLcodeParser.IZ, 0); }
		public TerminalNode DUZ() { return getToken(LOLcodeParser.DUZ, 0); }
		public Args_declContext args_decl() {
			return getRuleContext(Args_declContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitFunc_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitFunc_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_func_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(HOW);
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==IZ || _la==DUZ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(289);
			match(I);
			setState(290);
			match(IDENTIFIER);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YR) {
				{
				setState(291);
				args_decl();
				}
			}

			setState(295); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(294);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(297); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << YARN_LITERAL) | (1L << WIN) | (1L << FAIL) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT) | (1L << I) | (1L << IM) | (1L << WTF) | (1L << FOUND) | (1L << GTFO) | (1L << O))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (GIMMEH - 68)) | (1L << (VISIBLE - 68)) | (1L << (COMMA - 68)) | (1L << (NEWLINE - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(299);
				block();
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					separator();
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==NEWLINE );
				}
			}

			setState(307);
			match(IF);
			setState(308);
			match(U);
			setState(309);
			match(SAY);
			setState(310);
			match(SO);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode FOUND() { return getToken(LOLcodeParser.FOUND, 0); }
		public TerminalNode YR() { return getToken(LOLcodeParser.YR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode GTFO() { return getToken(LOLcodeParser.GTFO, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_return_statement);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOUND:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(312);
				match(FOUND);
				setState(313);
				match(YR);
				setState(314);
				expr();
				}
				}
				break;
			case GTFO:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(GTFO);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode YR() { return getToken(LOLcodeParser.YR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(YR);
			setState(319);
			expr();
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

	public static class More_argsContext extends ParserRuleContext {
		public TerminalNode MKAY() { return getToken(LOLcodeParser.MKAY, 0); }
		public List<TerminalNode> AN() { return getTokens(LOLcodeParser.AN); }
		public TerminalNode AN(int i) {
			return getToken(LOLcodeParser.AN, i);
		}
		public List<Arg_declContext> arg_decl() {
			return getRuleContexts(Arg_declContext.class);
		}
		public Arg_declContext arg_decl(int i) {
			return getRuleContext(Arg_declContext.class,i);
		}
		public More_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterMore_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitMore_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitMore_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final More_argsContext more_args() throws RecognitionException {
		More_argsContext _localctx = new More_argsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_more_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(321);
				match(AN);
				setState(322);
				arg_decl();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(MKAY);
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public More_argsContext more_args() {
			return getRuleContext(More_argsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			arg();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AN || _la==MKAY) {
				{
				setState(331);
				more_args();
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode I() { return getToken(LOLcodeParser.I, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LOLcodeParser.IDENTIFIER, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode DUZ() { return getToken(LOLcodeParser.DUZ, 0); }
		public TerminalNode IZ() { return getToken(LOLcodeParser.IZ, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(I);
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==IZ || _la==DUZ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(336);
			match(IDENTIFIER);
			setState(337);
			args();
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

	public static class VerbContext extends ParserRuleContext {
		public TerminalNode UPPIN() { return getToken(LOLcodeParser.UPPIN, 0); }
		public TerminalNode NERFIN() { return getToken(LOLcodeParser.NERFIN, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitVerb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==UPPIN || _la==NERFIN) ) {
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

	public static class Loop_actionContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public TerminalNode YR() { return getToken(LOLcodeParser.YR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LOLcodeParser.IDENTIFIER, 0); }
		public Loop_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterLoop_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitLoop_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitLoop_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_actionContext loop_action() throws RecognitionException {
		Loop_actionContext _localctx = new Loop_actionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_loop_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			verb();
			setState(342);
			match(YR);
			setState(343);
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

	public static class LoopContext extends ParserRuleContext {
		public List<TerminalNode> IM() { return getTokens(LOLcodeParser.IM); }
		public TerminalNode IM(int i) {
			return getToken(LOLcodeParser.IM, i);
		}
		public TerminalNode IN() { return getToken(LOLcodeParser.IN, 0); }
		public List<TerminalNode> YR() { return getTokens(LOLcodeParser.YR); }
		public TerminalNode YR(int i) {
			return getToken(LOLcodeParser.YR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(LOLcodeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LOLcodeParser.IDENTIFIER, i);
		}
		public Loop_actionContext loop_action() {
			return getRuleContext(Loop_actionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OUTTA() { return getToken(LOLcodeParser.OUTTA, 0); }
		public TerminalNode TIL() { return getToken(LOLcodeParser.TIL, 0); }
		public TerminalNode WILE() { return getToken(LOLcodeParser.WILE, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(IM);
			setState(346);
			match(IN);
			setState(347);
			match(YR);
			setState(348);
			match(IDENTIFIER);
			setState(349);
			loop_action();
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==TIL || _la==WILE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(351);
			expr();
			setState(353); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(352);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(355); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(357);
			block();
			setState(359); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(358);
				separator();
				}
				}
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(363);
			match(IM);
			setState(364);
			match(OUTTA);
			setState(365);
			match(YR);
			setState(366);
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

	public static class AswitchContext extends ParserRuleContext {
		public TerminalNode WTF() { return getToken(LOLcodeParser.WTF, 0); }
		public TerminalNode QUESTION() { return getToken(LOLcodeParser.QUESTION, 0); }
		public TerminalNode OIC() { return getToken(LOLcodeParser.OIC, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<AcaseContext> acase() {
			return getRuleContexts(AcaseContext.class);
		}
		public AcaseContext acase(int i) {
			return getRuleContext(AcaseContext.class,i);
		}
		public AdefaultContext adefault() {
			return getRuleContext(AdefaultContext.class,0);
		}
		public AswitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aswitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterAswitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitAswitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitAswitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AswitchContext aswitch() throws RecognitionException {
		AswitchContext _localctx = new AswitchContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_aswitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(WTF);
			setState(369);
			match(QUESTION);
			setState(371); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(370);
				separator();
				}
				}
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(381); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				acase();
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(376);
					separator();
					}
					}
					setState(379); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==NEWLINE );
				}
				}
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OMG );
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OMGWTF) {
				{
				setState(385);
				adefault();
				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(386);
					separator();
					}
					}
					setState(389); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==NEWLINE );
				}
			}

			setState(393);
			match(OIC);
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

	public static class AcaseContext extends ParserRuleContext {
		public TerminalNode OMG() { return getToken(LOLcodeParser.OMG, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public AcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterAcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitAcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitAcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcaseContext acase() throws RecognitionException {
		AcaseContext _localctx = new AcaseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_acase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(OMG);
			setState(396);
			literal_value();
			setState(398); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(397);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(400); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(402);
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

	public static class AdefaultContext extends ParserRuleContext {
		public TerminalNode OMGWTF() { return getToken(LOLcodeParser.OMGWTF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public AdefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterAdefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitAdefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitAdefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdefaultContext adefault() throws RecognitionException {
		AdefaultContext _localctx = new AdefaultContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_adefault);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(OMGWTF);
			setState(406); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(405);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(408); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(410);
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

	public static class AnifContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(LOLcodeParser.O, 0); }
		public TerminalNode RLY() { return getToken(LOLcodeParser.RLY, 0); }
		public TerminalNode QUESTION() { return getToken(LOLcodeParser.QUESTION, 0); }
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public AnifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterAnif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitAnif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitAnif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnifContext anif() throws RecognitionException {
		AnifContext _localctx = new AnifContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_anif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(O);
			setState(413);
			match(RLY);
			setState(414);
			match(QUESTION);
			setState(415);
			separator();
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

	public static class ThenContext extends ParserRuleContext {
		public TerminalNode YA() { return getToken(LOLcodeParser.YA, 0); }
		public TerminalNode RLY() { return getToken(LOLcodeParser.RLY, 0); }
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(YA);
			setState(418);
			match(RLY);
			setState(419);
			separator();
			setState(420);
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

	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode MEBBE() { return getToken(LOLcodeParser.MEBBE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(MEBBE);
			setState(423);
			expr();
			setState(424);
			separator();
			setState(425);
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

	public static class AnelseContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(LOLcodeParser.NO, 0); }
		public TerminalNode WAI() { return getToken(LOLcodeParser.WAI, 0); }
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AnelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterAnelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitAnelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitAnelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnelseContext anelse() throws RecognitionException {
		AnelseContext _localctx = new AnelseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_anelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(NO);
			setState(428);
			match(WAI);
			setState(429);
			separator();
			setState(430);
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

	public static class IfthenelseifelseContext extends ParserRuleContext {
		public AnifContext anif() {
			return getRuleContext(AnifContext.class,0);
		}
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode OIC() { return getToken(LOLcodeParser.OIC, 0); }
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public AnelseContext anelse() {
			return getRuleContext(AnelseContext.class,0);
		}
		public IfthenelseifelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthenelseifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterIfthenelseifelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitIfthenelseifelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitIfthenelseifelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfthenelseifelseContext ifthenelseifelse() throws RecognitionException {
		IfthenelseifelseContext _localctx = new IfthenelseifelseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ifthenelseifelse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			anif();
			setState(433);
			then();
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(434);
					separator();
					setState(435);
					elseif();
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(442);
				separator();
				setState(443);
				anelse();
				}
				break;
			}
			setState(447);
			separator();
			setState(448);
			match(OIC);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode GIMMEH() { return getToken(LOLcodeParser.GIMMEH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LOLcodeParser.IDENTIFIER, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(GIMMEH);
			setState(451);
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

	public static class Output_argsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MKAY() { return getToken(LOLcodeParser.MKAY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LOLcodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LOLcodeParser.COMMA, i);
		}
		public Output_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterOutput_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitOutput_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitOutput_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_argsContext output_args() throws RecognitionException {
		Output_argsContext _localctx = new Output_argsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_output_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << YARN_LITERAL) | (1L << WIN) | (1L << FAIL) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT))) != 0) || _la==IDENTIFIER) {
				{
				setState(453);
				expr();
				}
			}

			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(456);
					match(COMMA);
					setState(457);
					expr();
					}
					}
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(463);
				match(MKAY);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode VISIBLE() { return getToken(LOLcodeParser.VISIBLE, 0); }
		public Output_argsContext output_args() {
			return getRuleContext(Output_argsContext.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(LOLcodeParser.EXCLAMATION, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(VISIBLE);
			setState(467);
			output_args();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATION) {
				{
				setState(468);
				match(EXCLAMATION);
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

	public static class Core_statementContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignmentContext var_assignment() {
			return getRuleContext(Var_assignmentContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public IfthenelseifelseContext ifthenelseifelse() {
			return getRuleContext(IfthenelseifelseContext.class,0);
		}
		public AswitchContext aswitch() {
			return getRuleContext(AswitchContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Core_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_core_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterCore_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitCore_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitCore_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Core_statementContext core_statement() throws RecognitionException {
		Core_statementContext _localctx = new Core_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_core_statement);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				var_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(474);
				ifthenelseifelse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(475);
				aswitch();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(476);
				input();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(477);
				output();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(478);
				func_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(479);
				expr();
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

	public static class Inner_statementContext extends ParserRuleContext {
		public Core_statementContext core_statement() {
			return getRuleContext(Core_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode GTFO() { return getToken(LOLcodeParser.GTFO, 0); }
		public Inner_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterInner_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitInner_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitInner_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_statementContext inner_statement() throws RecognitionException {
		Inner_statementContext _localctx = new Inner_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_inner_statement);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				core_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				return_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(GTFO);
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

	public static class Top_level_statementContext extends ParserRuleContext {
		public Core_statementContext core_statement() {
			return getRuleContext(Core_statementContext.class,0);
		}
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Top_level_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterTop_level_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitTop_level_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitTop_level_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_level_statementContext top_level_statement() throws RecognitionException {
		Top_level_statementContext _localctx = new Top_level_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_top_level_statement);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case YARN_LITERAL:
			case WIN:
			case FAIL:
			case SUM:
			case DIFF:
			case PRODUKT:
			case QUOSHUNT:
			case MOD:
			case MAEK:
			case IT:
			case SMOOSH:
			case BOTH:
			case EITHER:
			case ANY:
			case ALL:
			case WON:
			case NOT:
			case I:
			case IM:
			case WTF:
			case O:
			case GIMMEH:
			case VISIBLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				core_statement();
				}
				break;
			case HOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				func_decl();
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

	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(LOLcodeParser.COMMA, 0); }
		public TerminalNode NEWLINE() { return getToken(LOLcodeParser.NEWLINE, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==NEWLINE) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public List<Inner_statementContext> inner_statement() {
			return getRuleContexts(Inner_statementContext.class);
		}
		public Inner_statementContext inner_statement(int i) {
			return getRuleContext(Inner_statementContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << YARN_LITERAL) | (1L << WIN) | (1L << FAIL) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT) | (1L << I) | (1L << IM) | (1L << WTF) | (1L << FOUND) | (1L << GTFO) | (1L << O))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (GIMMEH - 68)) | (1L << (VISIBLE - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(493);
				inner_statement();
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(495); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(494);
							separator();
							}
							}
							setState(497); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==COMMA || _la==NEWLINE );
						setState(499);
						inner_statement();
						}
						} 
					}
					setState(505);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
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

	public static class Top_level_blockContext extends ParserRuleContext {
		public List<Top_level_statementContext> top_level_statement() {
			return getRuleContexts(Top_level_statementContext.class);
		}
		public Top_level_statementContext top_level_statement(int i) {
			return getRuleContext(Top_level_statementContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Top_level_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterTop_level_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitTop_level_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitTop_level_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_level_blockContext top_level_block() throws RecognitionException {
		Top_level_blockContext _localctx = new Top_level_blockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_top_level_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << YARN_LITERAL) | (1L << WIN) | (1L << FAIL) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT) | (1L << I) | (1L << HOW) | (1L << IM) | (1L << WTF) | (1L << O))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (GIMMEH - 68)) | (1L << (VISIBLE - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(508);
				top_level_statement();
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(510); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(509);
							separator();
							}
							}
							setState(512); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==COMMA || _la==NEWLINE );
						setState(514);
						top_level_statement();
						}
						} 
					}
					setState(520);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode HAI() { return getToken(LOLcodeParser.HAI, 0); }
		public Top_level_blockContext top_level_block() {
			return getRuleContext(Top_level_blockContext.class,0);
		}
		public TerminalNode KTHXBYE() { return getToken(LOLcodeParser.KTHXBYE, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(HAI);
			setState(525); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(524);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(527); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(529);
			top_level_block();
			setState(531); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(530);
				separator();
				}
				}
				setState(533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(535);
			match(KTHXBYE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u021c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\3\5\3v\n\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00d0\n\23\f\23\16\23\u00d3"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00db\n\24\f\24\16\24\u00de"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00e6\n\25\f\25\16\25\u00e9"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0104"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u010c\n\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\7\34\u0117\n\34\f\34\16\34\u011a\13\34\3\34"+
		"\3\34\3\35\3\35\5\35\u0120\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0127\n"+
		"\36\3\36\6\36\u012a\n\36\r\36\16\36\u012b\3\36\3\36\6\36\u0130\n\36\r"+
		"\36\16\36\u0131\5\36\u0134\n\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\5\37\u013f\n\37\3 \3 \3 \3!\3!\7!\u0146\n!\f!\16!\u0149\13!\3!\3"+
		"!\3\"\3\"\5\"\u014f\n\"\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\6&\u0164\n&\r&\16&\u0165\3&\3&\6&\u016a\n&\r&\16&\u016b\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\6\'\u0176\n\'\r\'\16\'\u0177\3\'\3\'\6\'\u017c"+
		"\n\'\r\'\16\'\u017d\6\'\u0180\n\'\r\'\16\'\u0181\3\'\3\'\6\'\u0186\n\'"+
		"\r\'\16\'\u0187\5\'\u018a\n\'\3\'\3\'\3(\3(\3(\6(\u0191\n(\r(\16(\u0192"+
		"\3(\3(\3)\3)\6)\u0199\n)\r)\16)\u019a\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\7.\u01b8\n.\f.\16.\u01bb"+
		"\13.\3.\3.\3.\5.\u01c0\n.\3.\3.\3.\3/\3/\3/\3\60\5\60\u01c9\n\60\3\60"+
		"\3\60\7\60\u01cd\n\60\f\60\16\60\u01d0\13\60\3\60\5\60\u01d3\n\60\3\61"+
		"\3\61\3\61\5\61\u01d8\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u01e3\n\62\3\63\3\63\3\63\5\63\u01e8\n\63\3\64\3\64\5\64\u01ec\n"+
		"\64\3\65\3\65\3\66\3\66\6\66\u01f2\n\66\r\66\16\66\u01f3\3\66\3\66\7\66"+
		"\u01f8\n\66\f\66\16\66\u01fb\13\66\5\66\u01fd\n\66\3\67\3\67\6\67\u0201"+
		"\n\67\r\67\16\67\u0202\3\67\3\67\7\67\u0207\n\67\f\67\16\67\u020a\13\67"+
		"\5\67\u020c\n\67\38\38\68\u0210\n8\r8\168\u0211\38\38\68\u0216\n8\r8\16"+
		"8\u0217\38\38\38\2\29\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\n\3\2\7\n\4\2\13\r\35\35\3"+
		"\2$%\4\2\30\30LL\4\2\25\25,,\3\2\678\3\2\65\66\3\2LM\2\u0224\2p\3\2\2"+
		"\2\4u\3\2\2\2\6w\3\2\2\2\by\3\2\2\2\n\177\3\2\2\2\f\u0085\3\2\2\2\16\u008b"+
		"\3\2\2\2\20\u0091\3\2\2\2\22\u0097\3\2\2\2\24\u009d\3\2\2\2\26\u00a3\3"+
		"\2\2\2\30\u00a9\3\2\2\2\32\u00af\3\2\2\2\34\u00b2\3\2\2\2\36\u00b8\3\2"+
		"\2\2 \u00be\3\2\2\2\"\u00c4\3\2\2\2$\u00ca\3\2\2\2&\u00d6\3\2\2\2(\u00e1"+
		"\3\2\2\2*\u00ec\3\2\2\2,\u00f1\3\2\2\2.\u0103\3\2\2\2\60\u0105\3\2\2\2"+
		"\62\u010d\3\2\2\2\64\u0111\3\2\2\2\66\u0118\3\2\2\28\u011d\3\2\2\2:\u0121"+
		"\3\2\2\2<\u013e\3\2\2\2>\u0140\3\2\2\2@\u0147\3\2\2\2B\u014c\3\2\2\2D"+
		"\u0150\3\2\2\2F\u0155\3\2\2\2H\u0157\3\2\2\2J\u015b\3\2\2\2L\u0172\3\2"+
		"\2\2N\u018d\3\2\2\2P\u0196\3\2\2\2R\u019e\3\2\2\2T\u01a3\3\2\2\2V\u01a8"+
		"\3\2\2\2X\u01ad\3\2\2\2Z\u01b2\3\2\2\2\\\u01c4\3\2\2\2^\u01c8\3\2\2\2"+
		"`\u01d4\3\2\2\2b\u01e2\3\2\2\2d\u01e7\3\2\2\2f\u01eb\3\2\2\2h\u01ed\3"+
		"\2\2\2j\u01fc\3\2\2\2l\u020b\3\2\2\2n\u020d\3\2\2\2pq\t\2\2\2q\3\3\2\2"+
		"\2rv\5\2\2\2sv\7\32\2\2tv\7N\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\5\3\2"+
		"\2\2wx\t\3\2\2x\7\3\2\2\2yz\7\16\2\2z{\7\31\2\2{|\5.\30\2|}\7\30\2\2}"+
		"~\5.\30\2~\t\3\2\2\2\177\u0080\7\17\2\2\u0080\u0081\7\31\2\2\u0081\u0082"+
		"\5.\30\2\u0082\u0083\7\30\2\2\u0083\u0084\5.\30\2\u0084\13\3\2\2\2\u0085"+
		"\u0086\7\20\2\2\u0086\u0087\7\31\2\2\u0087\u0088\5.\30\2\u0088\u0089\7"+
		"\30\2\2\u0089\u008a\5.\30\2\u008a\r\3\2\2\2\u008b\u008c\7\21\2\2\u008c"+
		"\u008d\7\31\2\2\u008d\u008e\5.\30\2\u008e\u008f\7\30\2\2\u008f\u0090\5"+
		".\30\2\u0090\17\3\2\2\2\u0091\u0092\7\25\2\2\u0092\u0093\7\23\2\2\u0093"+
		"\u0094\5.\30\2\u0094\u0095\7\27\2\2\u0095\u0096\5.\30\2\u0096\21\3\2\2"+
		"\2\u0097\u0098\7\25\2\2\u0098\u0099\7\24\2\2\u0099\u009a\5.\30\2\u009a"+
		"\u009b\7\27\2\2\u009b\u009c\5.\30\2\u009c\23\3\2\2\2\u009d\u009e\7\24"+
		"\2\2\u009e\u009f\7\31\2\2\u009f\u00a0\5.\30\2\u00a0\u00a1\7\30\2\2\u00a1"+
		"\u00a2\5.\30\2\u00a2\25\3\2\2\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\7\31"+
		"\2\2\u00a5\u00a6\5.\30\2\u00a6\u00a7\7\30\2\2\u00a7\u00a8\5.\30\2\u00a8"+
		"\27\3\2\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\7\31\2\2\u00ab\u00ac\5.\30"+
		"\2\u00ac\u00ad\7\30\2\2\u00ad\u00ae\5.\30\2\u00ae\31\3\2\2\2\u00af\u00b0"+
		"\7#\2\2\u00b0\u00b1\5.\30\2\u00b1\33\3\2\2\2\u00b2\u00b3\7\36\2\2\u00b3"+
		"\u00b4\t\4\2\2\u00b4\u00b5\5.\30\2\u00b5\u00b6\7\30\2\2\u00b6\u00b7\5"+
		".\30\2\u00b7\35\3\2\2\2\u00b8\u00b9\7\36\2\2\u00b9\u00ba\7\31\2\2\u00ba"+
		"\u00bb\5.\30\2\u00bb\u00bc\7\30\2\2\u00bc\u00bd\5.\30\2\u00bd\37\3\2\2"+
		"\2\u00be\u00bf\7\37\2\2\u00bf\u00c0\7\31\2\2\u00c0\u00c1\5.\30\2\u00c1"+
		"\u00c2\7\30\2\2\u00c2\u00c3\5.\30\2\u00c3!\3\2\2\2\u00c4\u00c5\7\"\2\2"+
		"\u00c5\u00c6\7\31\2\2\u00c6\u00c7\5.\30\2\u00c7\u00c8\7\30\2\2\u00c8\u00c9"+
		"\5.\30\2\u00c9#\3\2\2\2\u00ca\u00cb\7!\2\2\u00cb\u00cc\7\31\2\2\u00cc"+
		"\u00d1\5.\30\2\u00cd\u00ce\7\30\2\2\u00ce\u00d0\5.\30\2\u00cf\u00cd\3"+
		"\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\33\2\2\u00d5%\3\2\2\2"+
		"\u00d6\u00d7\7 \2\2\u00d7\u00dc\5.\30\2\u00d8\u00d9\7\30\2\2\u00d9\u00db"+
		"\5.\30\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\33"+
		"\2\2\u00e0\'\3\2\2\2\u00e1\u00e2\7\34\2\2\u00e2\u00e7\5.\30\2\u00e3\u00e4"+
		"\t\5\2\2\u00e4\u00e6\5.\30\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00eb\7\33\2\2\u00eb)\3\2\2\2\u00ec\u00ed\7\26\2\2\u00ed\u00ee"+
		"\5.\30\2\u00ee\u00ef\7(\2\2\u00ef\u00f0\5\6\4\2\u00f0+\3\2\2\2\u00f1\u00f2"+
		"\7N\2\2\u00f2-\3\2\2\2\u00f3\u0104\5\b\5\2\u00f4\u0104\5\n\6\2\u00f5\u0104"+
		"\5\f\7\2\u00f6\u0104\5\16\b\2\u00f7\u0104\5\30\r\2\u00f8\u0104\5\32\16"+
		"\2\u00f9\u0104\5\34\17\2\u00fa\u0104\5\36\20\2\u00fb\u0104\5 \21\2\u00fc"+
		"\u0104\5\"\22\2\u00fd\u0104\5$\23\2\u00fe\u0104\5&\24\2\u00ff\u0104\5"+
		"(\25\2\u0100\u0104\5*\26\2\u0101\u0104\5,\27\2\u0102\u0104\5\4\3\2\u0103"+
		"\u00f3\3\2\2\2\u0103\u00f4\3\2\2\2\u0103\u00f5\3\2\2\2\u0103\u00f6\3\2"+
		"\2\2\u0103\u00f7\3\2\2\2\u0103\u00f8\3\2\2\2\u0103\u00f9\3\2\2\2\u0103"+
		"\u00fa\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00fc\3\2\2\2\u0103\u00fd\3\2"+
		"\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104/\3\2\2\2\u0105\u0106\7&\2\2\u0106"+
		"\u0107\7\'\2\2\u0107\u0108\7(\2\2\u0108\u010b\7N\2\2\u0109\u010a\7*\2"+
		"\2\u010a\u010c\5.\30\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\61"+
		"\3\2\2\2\u010d\u010e\7N\2\2\u010e\u010f\7)\2\2\u010f\u0110\5.\30\2\u0110"+
		"\63\3\2\2\2\u0111\u0112\7-\2\2\u0112\u0113\7N\2\2\u0113\65\3\2\2\2\u0114"+
		"\u0115\7\30\2\2\u0115\u0117\5\64\33\2\u0116\u0114\3\2\2\2\u0117\u011a"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011c\7\33\2\2\u011c\67\3\2\2\2\u011d\u011f\5\64"+
		"\33\2\u011e\u0120\5\66\34\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"9\3\2\2\2\u0121\u0122\7+\2\2\u0122\u0123\t\6\2\2\u0123\u0124\7&\2\2\u0124"+
		"\u0126\7N\2\2\u0125\u0127\58\35\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0129\3\2\2\2\u0128\u012a\5h\65\2\u0129\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0133\3\2"+
		"\2\2\u012d\u012f\5j\66\2\u012e\u0130\5h\65\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u012d\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\7.\2\2\u0136\u0137\7/\2\2\u0137\u0138\7\60\2\2\u0138\u0139\7\61"+
		"\2\2\u0139;\3\2\2\2\u013a\u013b\7>\2\2\u013b\u013c\7-\2\2\u013c\u013f"+
		"\5.\30\2\u013d\u013f\7?\2\2\u013e\u013a\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"=\3\2\2\2\u0140\u0141\7-\2\2\u0141\u0142\5.\30\2\u0142?\3\2\2\2\u0143"+
		"\u0144\7\30\2\2\u0144\u0146\5\64\33\2\u0145\u0143\3\2\2\2\u0146\u0149"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014b\7\33\2\2\u014bA\3\2\2\2\u014c\u014e\5> \2\u014d"+
		"\u014f\5@!\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014fC\3\2\2\2\u0150"+
		"\u0151\7&\2\2\u0151\u0152\t\6\2\2\u0152\u0153\7N\2\2\u0153\u0154\5B\""+
		"\2\u0154E\3\2\2\2\u0155\u0156\t\7\2\2\u0156G\3\2\2\2\u0157\u0158\5F$\2"+
		"\u0158\u0159\7-\2\2\u0159\u015a\7N\2\2\u015aI\3\2\2\2\u015b\u015c\7\62"+
		"\2\2\u015c\u015d\7\63\2\2\u015d\u015e\7-\2\2\u015e\u015f\7N\2\2\u015f"+
		"\u0160\5H%\2\u0160\u0161\t\b\2\2\u0161\u0163\5.\30\2\u0162\u0164\5h\65"+
		"\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\5j\66\2\u0168\u016a\5h\65\2\u0169"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7\62\2\2\u016e\u016f\7\64\2\2\u016f"+
		"\u0170\7-\2\2\u0170\u0171\7N\2\2\u0171K\3\2\2\2\u0172\u0173\79\2\2\u0173"+
		"\u0175\7:\2\2\u0174\u0176\5h\65\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017f\3\2\2\2\u0179"+
		"\u017b\5N(\2\u017a\u017c\5h\65\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2"+
		"\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u0179"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0189\3\2\2\2\u0183\u0185\5P)\2\u0184\u0186\5h\65\2\u0185\u0184\3\2\2"+
		"\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a"+
		"\3\2\2\2\u0189\u0183\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\7;\2\2\u018cM\3\2\2\2\u018d\u018e\7<\2\2\u018e\u0190\5\2\2\2\u018f"+
		"\u0191\5h\65\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2"+
		"\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\5j\66\2\u0195"+
		"O\3\2\2\2\u0196\u0198\7=\2\2\u0197\u0199\5h\65\2\u0198\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019d\5j\66\2\u019dQ\3\2\2\2\u019e\u019f\7@\2\2\u019f\u01a0"+
		"\7A\2\2\u01a0\u01a1\7:\2\2\u01a1\u01a2\5h\65\2\u01a2S\3\2\2\2\u01a3\u01a4"+
		"\7B\2\2\u01a4\u01a5\7A\2\2\u01a5\u01a6\5h\65\2\u01a6\u01a7\5j\66\2\u01a7"+
		"U\3\2\2\2\u01a8\u01a9\7E\2\2\u01a9\u01aa\5.\30\2\u01aa\u01ab\5h\65\2\u01ab"+
		"\u01ac\5j\66\2\u01acW\3\2\2\2\u01ad\u01ae\7C\2\2\u01ae\u01af\7D\2\2\u01af"+
		"\u01b0\5h\65\2\u01b0\u01b1\5j\66\2\u01b1Y\3\2\2\2\u01b2\u01b3\5R*\2\u01b3"+
		"\u01b9\5T+\2\u01b4\u01b5\5h\65\2\u01b5\u01b6\5V,\2\u01b6\u01b8\3\2\2\2"+
		"\u01b7\u01b4\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01bf\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\5h\65\2\u01bd"+
		"\u01be\5X-\2\u01be\u01c0\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01c0\3\2\2"+
		"\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\5h\65\2\u01c2\u01c3\7;\2\2\u01c3[\3"+
		"\2\2\2\u01c4\u01c5\7F\2\2\u01c5\u01c6\7N\2\2\u01c6]\3\2\2\2\u01c7\u01c9"+
		"\5.\30\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01d2\3\2\2\2\u01ca"+
		"\u01cb\7L\2\2\u01cb\u01cd\5.\30\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d1\u01d3\7\33\2\2\u01d2\u01ce\3\2\2\2\u01d2\u01d3\3"+
		"\2\2\2\u01d3_\3\2\2\2\u01d4\u01d5\7H\2\2\u01d5\u01d7\5^\60\2\u01d6\u01d8"+
		"\7I\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8a\3\2\2\2\u01d9\u01e3"+
		"\5\60\31\2\u01da\u01e3\5\62\32\2\u01db\u01e3\5J&\2\u01dc\u01e3\5Z.\2\u01dd"+
		"\u01e3\5L\'\2\u01de\u01e3\5\\/\2\u01df\u01e3\5`\61\2\u01e0\u01e3\5D#\2"+
		"\u01e1\u01e3\5.\30\2\u01e2\u01d9\3\2\2\2\u01e2\u01da\3\2\2\2\u01e2\u01db"+
		"\3\2\2\2\u01e2\u01dc\3\2\2\2\u01e2\u01dd\3\2\2\2\u01e2\u01de\3\2\2\2\u01e2"+
		"\u01df\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3c\3\2\2\2"+
		"\u01e4\u01e8\5b\62\2\u01e5\u01e8\5<\37\2\u01e6\u01e8\7?\2\2\u01e7\u01e4"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8e\3\2\2\2\u01e9"+
		"\u01ec\5b\62\2\u01ea\u01ec\5:\36\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2"+
		"\2\2\u01ecg\3\2\2\2\u01ed\u01ee\t\t\2\2\u01eei\3\2\2\2\u01ef\u01f9\5d"+
		"\63\2\u01f0\u01f2\5h\65\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\5d"+
		"\63\2\u01f6\u01f8\3\2\2\2\u01f7\u01f1\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fc\u01ef\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fdk\3\2\2\2\u01fe\u0208"+
		"\5f\64\2\u01ff\u0201\5h\65\2\u0200\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\5f"+
		"\64\2\u0205\u0207\3\2\2\2\u0206\u0200\3\2\2\2\u0207\u020a\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020b\u01fe\3\2\2\2\u020b\u020c\3\2\2\2\u020cm\3\2\2\2\u020d\u020f"+
		"\7J\2\2\u020e\u0210\5h\65\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\5l"+
		"\67\2\u0214\u0216\5h\65\2\u0215\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\7K"+
		"\2\2\u021ao\3\2\2\2+u\u00d1\u00dc\u00e7\u0103\u010b\u0118\u011f\u0126"+
		"\u012b\u0131\u0133\u013e\u0147\u014e\u0165\u016b\u0177\u017d\u0181\u0187"+
		"\u0189\u0192\u019a\u01b9\u01bf\u01c8\u01ce\u01d2\u01d7\u01e2\u01e7\u01eb"+
		"\u01f3\u01f9\u01fc\u0202\u0208\u020b\u0211\u0217";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}