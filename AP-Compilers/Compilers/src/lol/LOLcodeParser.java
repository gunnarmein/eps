// Generated from c:\Users\gmein\Documents\GitHub\eps\AP-Compilers\Compilers\src\lol\LOLcode.g4 by ANTLR 4.7.1

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
		MULTILINECOMMENT=1, SINGLELINECOMMENT=2, MINUS=3, DOT=4, INTEGER=5, FLOAT=6, 
		STRING=7, WIN=8, FAIL=9, BOOLEAN=10, NUMBR=11, NUMBAR=12, YARN=13, INTO=14, 
		SUM=15, DIFF=16, PRODUKT=17, QUOSHUNT=18, MOD=19, BIGGR=20, SMALLR=21, 
		IZ=22, MAEK=23, THAN=24, AN=25, OF=26, IT=27, MKAY=28, SMOOSH=29, TROOF=30, 
		NOOB=31, BOTH=32, EITHER=33, ANY=34, ALL=35, WON=36, NOT=37, SAEM=38, 
		DIFFRINT=39, I=40, HAS=41, A=42, R=43, ITZ=44, HOW=45, DUZ=46, YR=47, 
		IF=48, U=49, SAY=50, SO=51, IM=52, IN=53, OUTTA=54, TIL=55, WILE=56, UPPIN=57, 
		NERFIN=58, WTF=59, QUESTION=60, OIC=61, OMG=62, OMGWTF=63, FOUND=64, GTFO=65, 
		O=66, RLY=67, YA=68, NO=69, WAI=70, MEBBE=71, GIMMEH=72, INVISIBLE=73, 
		VISIBLE=74, EXCLAMATION=75, HAI=76, KTHXBYE=77, COMMA=78, NEWLINE=79, 
		IDENTIFIER=80, ELLIPSIS=81, WS=82;
	public static final int
		RULE_literal_value = 0, RULE_atom = 1, RULE_vartype = 2, RULE_sum = 3, 
		RULE_diff = 4, RULE_product = 5, RULE_quotient = 6, RULE_bigger = 7, RULE_smallr = 8, 
		RULE_min = 9, RULE_max = 10, RULE_mod = 11, RULE_not = 12, RULE_same = 13, 
		RULE_and = 14, RULE_either = 15, RULE_one = 16, RULE_all = 17, RULE_any = 18, 
		RULE_concat = 19, RULE_cast = 20, RULE_var_ref = 21, RULE_expr = 22, RULE_var_decl = 23, 
		RULE_var_assignment = 24, RULE_arg_decl = 25, RULE_more_args_decl = 26, 
		RULE_args_decl = 27, RULE_return_type = 28, RULE_func_decl = 29, RULE_return_statement = 30, 
		RULE_arg = 31, RULE_more_args = 32, RULE_args = 33, RULE_func_call = 34, 
		RULE_verb = 35, RULE_loop_action = 36, RULE_loop = 37, RULE_aswitch = 38, 
		RULE_acase = 39, RULE_adefault = 40, RULE_anif = 41, RULE_then = 42, RULE_elseif = 43, 
		RULE_anelse = 44, RULE_ifthenelseifelse = 45, RULE_input = 46, RULE_output_arg = 47, 
		RULE_output_args = 48, RULE_output = 49, RULE_core_statement = 50, RULE_inner_statement = 51, 
		RULE_top_level_statement = 52, RULE_separator = 53, RULE_block = 54, RULE_top_level_block = 55, 
		RULE_program = 56;
	public static final String[] ruleNames = {
		"literal_value", "atom", "vartype", "sum", "diff", "product", "quotient", 
		"bigger", "smallr", "min", "max", "mod", "not", "same", "and", "either", 
		"one", "all", "any", "concat", "cast", "var_ref", "expr", "var_decl", 
		"var_assignment", "arg_decl", "more_args_decl", "args_decl", "return_type", 
		"func_decl", "return_statement", "arg", "more_args", "args", "func_call", 
		"verb", "loop_action", "loop", "aswitch", "acase", "adefault", "anif", 
		"then", "elseif", "anelse", "ifthenelseifelse", "input", "output_arg", 
		"output_args", "output", "core_statement", "inner_statement", "top_level_statement", 
		"separator", "block", "top_level_block", "program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'-'", "'.'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'?'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'!'", null, null, "','", "'\n'", null, "'...\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MULTILINECOMMENT", "SINGLELINECOMMENT", "MINUS", "DOT", "INTEGER", 
		"FLOAT", "STRING", "WIN", "FAIL", "BOOLEAN", "NUMBR", "NUMBAR", "YARN", 
		"INTO", "SUM", "DIFF", "PRODUKT", "QUOSHUNT", "MOD", "BIGGR", "SMALLR", 
		"IZ", "MAEK", "THAN", "AN", "OF", "IT", "MKAY", "SMOOSH", "TROOF", "NOOB", 
		"BOTH", "EITHER", "ANY", "ALL", "WON", "NOT", "SAEM", "DIFFRINT", "I", 
		"HAS", "A", "R", "ITZ", "HOW", "DUZ", "YR", "IF", "U", "SAY", "SO", "IM", 
		"IN", "OUTTA", "TIL", "WILE", "UPPIN", "NERFIN", "WTF", "QUESTION", "OIC", 
		"OMG", "OMGWTF", "FOUND", "GTFO", "O", "RLY", "YA", "NO", "WAI", "MEBBE", 
		"GIMMEH", "INVISIBLE", "VISIBLE", "EXCLAMATION", "HAI", "KTHXBYE", "COMMA", 
		"NEWLINE", "IDENTIFIER", "ELLIPSIS", "WS"
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
		public TerminalNode INTEGER() { return getToken(LOLcodeParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(LOLcodeParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(LOLcodeParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(LOLcodeParser.BOOLEAN, 0); }
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
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) ) {
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case STRING:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				literal_value();
				}
				break;
			case IT:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(IT);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
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
		public TerminalNode NOOB() { return getToken(LOLcodeParser.NOOB, 0); }
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
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBR) | (1L << NUMBAR) | (1L << YARN) | (1L << TROOF) | (1L << NOOB))) != 0)) ) {
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
			setState(123);
			match(SUM);
			setState(124);
			match(OF);
			setState(125);
			expr();
			setState(126);
			match(AN);
			setState(127);
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
			setState(129);
			match(DIFF);
			setState(130);
			match(OF);
			setState(131);
			expr();
			setState(132);
			match(AN);
			setState(133);
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
			setState(135);
			match(PRODUKT);
			setState(136);
			match(OF);
			setState(137);
			expr();
			setState(138);
			match(AN);
			setState(139);
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
			setState(141);
			match(QUOSHUNT);
			setState(142);
			match(OF);
			setState(143);
			expr();
			setState(144);
			match(AN);
			setState(145);
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
			setState(147);
			match(IZ);
			setState(148);
			match(BIGGR);
			setState(149);
			expr();
			setState(150);
			match(THAN);
			setState(151);
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
			setState(153);
			match(IZ);
			setState(154);
			match(SMALLR);
			setState(155);
			expr();
			setState(156);
			match(THAN);
			setState(157);
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
			setState(159);
			match(SMALLR);
			setState(160);
			match(OF);
			setState(161);
			expr();
			setState(162);
			match(AN);
			setState(163);
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
			setState(165);
			match(BIGGR);
			setState(166);
			match(OF);
			setState(167);
			expr();
			setState(168);
			match(AN);
			setState(169);
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
			setState(171);
			match(MOD);
			setState(172);
			match(OF);
			setState(173);
			expr();
			setState(174);
			match(AN);
			setState(175);
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
			setState(177);
			match(NOT);
			setState(178);
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
			setState(180);
			match(BOTH);
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==SAEM || _la==DIFFRINT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(182);
			expr();
			setState(183);
			match(AN);
			setState(184);
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
			setState(186);
			match(BOTH);
			setState(187);
			match(OF);
			setState(188);
			expr();
			setState(189);
			match(AN);
			setState(190);
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
			setState(192);
			match(EITHER);
			setState(193);
			match(OF);
			setState(194);
			expr();
			setState(195);
			match(AN);
			setState(196);
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
			setState(198);
			match(WON);
			setState(199);
			match(OF);
			setState(200);
			expr();
			setState(201);
			match(AN);
			setState(202);
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
			setState(204);
			match(ALL);
			setState(205);
			match(OF);
			setState(206);
			expr();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(207);
				match(AN);
				setState(208);
				expr();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
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
			setState(216);
			match(ANY);
			setState(217);
			expr();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(218);
				match(AN);
				setState(219);
				expr();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
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
			setState(227);
			match(SMOOSH);
			setState(228);
			expr();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN || _la==COMMA) {
				{
				{
				setState(229);
				_la = _input.LA(1);
				if ( !(_la==AN || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				expr();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
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
			setState(238);
			match(MAEK);
			setState(239);
			expr();
			setState(240);
			match(A);
			setState(241);
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
			setState(243);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				sum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				diff();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				product();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				quotient();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				mod();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				not();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				same();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				and();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(253);
				either();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				one();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(255);
				all();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(256);
				any();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(257);
				concat();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(258);
				cast();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(259);
				var_ref();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(260);
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
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
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
			setState(263);
			match(I);
			setState(264);
			match(HAS);
			setState(265);
			match(A);
			setState(266);
			vartype();
			setState(267);
			match(IDENTIFIER);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ITZ) {
				{
				setState(268);
				match(ITZ);
				setState(269);
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
			setState(272);
			match(IDENTIFIER);
			setState(273);
			match(R);
			setState(274);
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
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
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
			setState(276);
			match(YR);
			setState(277);
			vartype();
			setState(278);
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
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(280);
				match(AN);
				setState(281);
				arg_decl();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
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
			setState(289);
			arg_decl();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AN || _la==MKAY) {
				{
				setState(290);
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

	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(LOLcodeParser.INTO, 0); }
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(INTO);
			setState(294);
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
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
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
		enterRule(_localctx, 58, RULE_func_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(HOW);
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==IZ || _la==DUZ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(298);
			match(I);
			setState(299);
			match(IDENTIFIER);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YR) {
				{
				setState(300);
				args_decl();
				}
			}

			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(303);
				return_type();
				}
			}

			setState(307); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(306);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(309); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT) | (1L << I) | (1L << IM) | (1L << WTF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOUND - 64)) | (1L << (GTFO - 64)) | (1L << (O - 64)) | (1L << (GIMMEH - 64)) | (1L << (VISIBLE - 64)) | (1L << (COMMA - 64)) | (1L << (NEWLINE - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(311);
				block();
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(312);
					separator();
					}
					}
					setState(315); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==NEWLINE );
				}
			}

			setState(319);
			match(IF);
			setState(320);
			match(U);
			setState(321);
			match(SAY);
			setState(322);
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
		enterRule(_localctx, 60, RULE_return_statement);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOUND:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(324);
				match(FOUND);
				setState(325);
				match(YR);
				setState(326);
				expr();
				}
				}
				break;
			case GTFO:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
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
		enterRule(_localctx, 62, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(YR);
			setState(331);
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
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
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
		enterRule(_localctx, 64, RULE_more_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(333);
				match(AN);
				setState(334);
				arg();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
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
		enterRule(_localctx, 66, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			arg();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AN || _la==MKAY) {
				{
				setState(343);
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
		enterRule(_localctx, 68, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(I);
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==IZ || _la==DUZ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(348);
			match(IDENTIFIER);
			setState(349);
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
		enterRule(_localctx, 70, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		enterRule(_localctx, 72, RULE_loop_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			verb();
			setState(354);
			match(YR);
			setState(355);
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
		enterRule(_localctx, 74, RULE_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(IM);
			setState(358);
			match(IN);
			setState(359);
			match(YR);
			setState(360);
			match(IDENTIFIER);
			setState(361);
			loop_action();
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==TIL || _la==WILE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(363);
			expr();
			setState(365); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(364);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(367); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(369);
			block();
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
			setState(375);
			match(IM);
			setState(376);
			match(OUTTA);
			setState(377);
			match(YR);
			setState(378);
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
		enterRule(_localctx, 76, RULE_aswitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(WTF);
			setState(381);
			match(QUESTION);
			setState(383); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(382);
				separator();
				}
				}
				setState(385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(387);
				acase();
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(388);
					separator();
					}
					}
					setState(391); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==NEWLINE );
				}
				}
				setState(395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OMG );
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OMGWTF) {
				{
				setState(397);
				adefault();
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(398);
					separator();
					}
					}
					setState(401); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==NEWLINE );
				}
			}

			setState(405);
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
		enterRule(_localctx, 78, RULE_acase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(OMG);
			setState(408);
			literal_value();
			setState(410); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(409);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(412); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(414);
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
		enterRule(_localctx, 80, RULE_adefault);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(OMGWTF);
			setState(418); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(417);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(420); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(422);
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
		enterRule(_localctx, 82, RULE_anif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(O);
			setState(425);
			match(RLY);
			setState(426);
			match(QUESTION);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 84, RULE_then);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(YA);
			setState(429);
			match(RLY);
			setState(431); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(430);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(433); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(435);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 86, RULE_elseif);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(MEBBE);
			setState(438);
			expr();
			setState(440); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(439);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(442); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(444);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 88, RULE_anelse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(NO);
			setState(447);
			match(WAI);
			setState(449); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(448);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(451); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(453);
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
		public TerminalNode OIC() { return getToken(LOLcodeParser.OIC, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
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
		enterRule(_localctx, 90, RULE_ifthenelseifelse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			anif();
			setState(457); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(456);
				separator();
				}
				}
				setState(459); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(461);
			then();
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(463); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(462);
						separator();
						}
						}
						setState(465); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA || _la==NEWLINE );
					setState(467);
					elseif();
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(474);
					separator();
					}
					}
					setState(477); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==NEWLINE );
				setState(479);
				anelse();
				}
				break;
			}
			setState(484); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(483);
				separator();
				}
				}
				setState(486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(488);
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
		enterRule(_localctx, 92, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(GIMMEH);
			setState(491);
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

	public static class Output_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Output_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterOutput_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitOutput_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitOutput_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_argContext output_arg() throws RecognitionException {
		Output_argContext _localctx = new Output_argContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_output_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
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

	public static class Output_argsContext extends ParserRuleContext {
		public List<Output_argContext> output_arg() {
			return getRuleContexts(Output_argContext.class);
		}
		public Output_argContext output_arg(int i) {
			return getRuleContext(Output_argContext.class,i);
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
		enterRule(_localctx, 96, RULE_output_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT))) != 0) || _la==IDENTIFIER) {
				{
				setState(495);
				output_arg();
				}
			}

			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(498);
					match(COMMA);
					setState(499);
					output_arg();
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(505);
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
		enterRule(_localctx, 98, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(VISIBLE);
			setState(509);
			output_args();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATION) {
				{
				setState(510);
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
		enterRule(_localctx, 100, RULE_core_statement);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				var_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(516);
				ifthenelseifelse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(517);
				aswitch();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(518);
				input();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(519);
				output();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(520);
				func_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(521);
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
		enterRule(_localctx, 102, RULE_inner_statement);
		try {
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				core_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				return_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
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
		enterRule(_localctx, 104, RULE_top_level_statement);
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case STRING:
			case BOOLEAN:
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
				setState(529);
				core_statement();
				}
				break;
			case HOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
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
		enterRule(_localctx, 106, RULE_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
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
		enterRule(_localctx, 108, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT) | (1L << I) | (1L << IM) | (1L << WTF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOUND - 64)) | (1L << (GTFO - 64)) | (1L << (O - 64)) | (1L << (GIMMEH - 64)) | (1L << (VISIBLE - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(535);
				inner_statement();
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(537); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(536);
							separator();
							}
							}
							setState(539); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==COMMA || _la==NEWLINE );
						setState(541);
						inner_statement();
						}
						} 
					}
					setState(547);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 110, RULE_top_level_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT) | (1L << I) | (1L << HOW) | (1L << IM) | (1L << WTF))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (O - 66)) | (1L << (GIMMEH - 66)) | (1L << (VISIBLE - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(550);
				top_level_statement();
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(552); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(551);
							separator();
							}
							}
							setState(554); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==COMMA || _la==NEWLINE );
						setState(556);
						top_level_statement();
						}
						} 
					}
					setState(562);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 112, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(HAI);
			setState(567); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(566);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(569); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(571);
			top_level_block();
			setState(573); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(572);
				separator();
				}
				}
				setState(575); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(577);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u0246\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\3\5\3z\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00d4\n\23"+
		"\f\23\16\23\u00d7\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00df\n\24"+
		"\f\24\16\24\u00e2\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00ea\n\25"+
		"\f\25\16\25\u00ed\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0108\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0111"+
		"\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u011d\n\34"+
		"\f\34\16\34\u0120\13\34\3\34\3\34\3\35\3\35\5\35\u0126\n\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u0130\n\37\3\37\5\37\u0133\n\37\3"+
		"\37\6\37\u0136\n\37\r\37\16\37\u0137\3\37\3\37\6\37\u013c\n\37\r\37\16"+
		"\37\u013d\5\37\u0140\n\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u014b"+
		"\n \3!\3!\3!\3\"\3\"\7\"\u0152\n\"\f\"\16\"\u0155\13\"\3\"\3\"\3#\3#\5"+
		"#\u015b\n#\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\6\'\u0170\n\'\r\'\16\'\u0171\3\'\3\'\6\'\u0176\n\'\r\'\16\'\u0177"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\6(\u0182\n(\r(\16(\u0183\3(\3(\6(\u0188"+
		"\n(\r(\16(\u0189\6(\u018c\n(\r(\16(\u018d\3(\3(\6(\u0192\n(\r(\16(\u0193"+
		"\5(\u0196\n(\3(\3(\3)\3)\3)\6)\u019d\n)\r)\16)\u019e\3)\3)\3*\3*\6*\u01a5"+
		"\n*\r*\16*\u01a6\3*\3*\3+\3+\3+\3+\3,\3,\3,\6,\u01b2\n,\r,\16,\u01b3\3"+
		",\3,\3-\3-\3-\6-\u01bb\n-\r-\16-\u01bc\3-\3-\3.\3.\3.\6.\u01c4\n.\r.\16"+
		".\u01c5\3.\3.\3/\3/\6/\u01cc\n/\r/\16/\u01cd\3/\3/\6/\u01d2\n/\r/\16/"+
		"\u01d3\3/\3/\7/\u01d8\n/\f/\16/\u01db\13/\3/\6/\u01de\n/\r/\16/\u01df"+
		"\3/\3/\5/\u01e4\n/\3/\6/\u01e7\n/\r/\16/\u01e8\3/\3/\3\60\3\60\3\60\3"+
		"\61\3\61\3\62\5\62\u01f3\n\62\3\62\3\62\7\62\u01f7\n\62\f\62\16\62\u01fa"+
		"\13\62\3\62\5\62\u01fd\n\62\3\63\3\63\3\63\5\63\u0202\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u020d\n\64\3\65\3\65\3\65\5\65"+
		"\u0212\n\65\3\66\3\66\5\66\u0216\n\66\3\67\3\67\38\38\68\u021c\n8\r8\16"+
		"8\u021d\38\38\78\u0222\n8\f8\168\u0225\138\58\u0227\n8\39\39\69\u022b"+
		"\n9\r9\169\u022c\39\39\79\u0231\n9\f9\169\u0234\139\59\u0236\n9\3:\3:"+
		"\6:\u023a\n:\r:\16:\u023b\3:\3:\6:\u0240\n:\r:\16:\u0241\3:\3:\3:\2\2"+
		";\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnpr\2\n\4\2\7\t\f\f\4\2\r\17 !\3\2()\4\2\33\33PP\4"+
		"\2\30\30\60\60\3\2;<\3\29:\3\2PQ\2\u0254\2t\3\2\2\2\4y\3\2\2\2\6{\3\2"+
		"\2\2\b}\3\2\2\2\n\u0083\3\2\2\2\f\u0089\3\2\2\2\16\u008f\3\2\2\2\20\u0095"+
		"\3\2\2\2\22\u009b\3\2\2\2\24\u00a1\3\2\2\2\26\u00a7\3\2\2\2\30\u00ad\3"+
		"\2\2\2\32\u00b3\3\2\2\2\34\u00b6\3\2\2\2\36\u00bc\3\2\2\2 \u00c2\3\2\2"+
		"\2\"\u00c8\3\2\2\2$\u00ce\3\2\2\2&\u00da\3\2\2\2(\u00e5\3\2\2\2*\u00f0"+
		"\3\2\2\2,\u00f5\3\2\2\2.\u0107\3\2\2\2\60\u0109\3\2\2\2\62\u0112\3\2\2"+
		"\2\64\u0116\3\2\2\2\66\u011e\3\2\2\28\u0123\3\2\2\2:\u0127\3\2\2\2<\u012a"+
		"\3\2\2\2>\u014a\3\2\2\2@\u014c\3\2\2\2B\u0153\3\2\2\2D\u0158\3\2\2\2F"+
		"\u015c\3\2\2\2H\u0161\3\2\2\2J\u0163\3\2\2\2L\u0167\3\2\2\2N\u017e\3\2"+
		"\2\2P\u0199\3\2\2\2R\u01a2\3\2\2\2T\u01aa\3\2\2\2V\u01ae\3\2\2\2X\u01b7"+
		"\3\2\2\2Z\u01c0\3\2\2\2\\\u01c9\3\2\2\2^\u01ec\3\2\2\2`\u01ef\3\2\2\2"+
		"b\u01f2\3\2\2\2d\u01fe\3\2\2\2f\u020c\3\2\2\2h\u0211\3\2\2\2j\u0215\3"+
		"\2\2\2l\u0217\3\2\2\2n\u0226\3\2\2\2p\u0235\3\2\2\2r\u0237\3\2\2\2tu\t"+
		"\2\2\2u\3\3\2\2\2vz\5\2\2\2wz\7\35\2\2xz\7R\2\2yv\3\2\2\2yw\3\2\2\2yx"+
		"\3\2\2\2z\5\3\2\2\2{|\t\3\2\2|\7\3\2\2\2}~\7\21\2\2~\177\7\34\2\2\177"+
		"\u0080\5.\30\2\u0080\u0081\7\33\2\2\u0081\u0082\5.\30\2\u0082\t\3\2\2"+
		"\2\u0083\u0084\7\22\2\2\u0084\u0085\7\34\2\2\u0085\u0086\5.\30\2\u0086"+
		"\u0087\7\33\2\2\u0087\u0088\5.\30\2\u0088\13\3\2\2\2\u0089\u008a\7\23"+
		"\2\2\u008a\u008b\7\34\2\2\u008b\u008c\5.\30\2\u008c\u008d\7\33\2\2\u008d"+
		"\u008e\5.\30\2\u008e\r\3\2\2\2\u008f\u0090\7\24\2\2\u0090\u0091\7\34\2"+
		"\2\u0091\u0092\5.\30\2\u0092\u0093\7\33\2\2\u0093\u0094\5.\30\2\u0094"+
		"\17\3\2\2\2\u0095\u0096\7\30\2\2\u0096\u0097\7\26\2\2\u0097\u0098\5.\30"+
		"\2\u0098\u0099\7\32\2\2\u0099\u009a\5.\30\2\u009a\21\3\2\2\2\u009b\u009c"+
		"\7\30\2\2\u009c\u009d\7\27\2\2\u009d\u009e\5.\30\2\u009e\u009f\7\32\2"+
		"\2\u009f\u00a0\5.\30\2\u00a0\23\3\2\2\2\u00a1\u00a2\7\27\2\2\u00a2\u00a3"+
		"\7\34\2\2\u00a3\u00a4\5.\30\2\u00a4\u00a5\7\33\2\2\u00a5\u00a6\5.\30\2"+
		"\u00a6\25\3\2\2\2\u00a7\u00a8\7\26\2\2\u00a8\u00a9\7\34\2\2\u00a9\u00aa"+
		"\5.\30\2\u00aa\u00ab\7\33\2\2\u00ab\u00ac\5.\30\2\u00ac\27\3\2\2\2\u00ad"+
		"\u00ae\7\25\2\2\u00ae\u00af\7\34\2\2\u00af\u00b0\5.\30\2\u00b0\u00b1\7"+
		"\33\2\2\u00b1\u00b2\5.\30\2\u00b2\31\3\2\2\2\u00b3\u00b4\7\'\2\2\u00b4"+
		"\u00b5\5.\30\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8\t\4\2"+
		"\2\u00b8\u00b9\5.\30\2\u00b9\u00ba\7\33\2\2\u00ba\u00bb\5.\30\2\u00bb"+
		"\35\3\2\2\2\u00bc\u00bd\7\"\2\2\u00bd\u00be\7\34\2\2\u00be\u00bf\5.\30"+
		"\2\u00bf\u00c0\7\33\2\2\u00c0\u00c1\5.\30\2\u00c1\37\3\2\2\2\u00c2\u00c3"+
		"\7#\2\2\u00c3\u00c4\7\34\2\2\u00c4\u00c5\5.\30\2\u00c5\u00c6\7\33\2\2"+
		"\u00c6\u00c7\5.\30\2\u00c7!\3\2\2\2\u00c8\u00c9\7&\2\2\u00c9\u00ca\7\34"+
		"\2\2\u00ca\u00cb\5.\30\2\u00cb\u00cc\7\33\2\2\u00cc\u00cd\5.\30\2\u00cd"+
		"#\3\2\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d0\7\34\2\2\u00d0\u00d5\5.\30\2"+
		"\u00d1\u00d2\7\33\2\2\u00d2\u00d4\5.\30\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7\36\2\2\u00d9%\3\2\2\2\u00da\u00db\7$\2\2"+
		"\u00db\u00e0\5.\30\2\u00dc\u00dd\7\33\2\2\u00dd\u00df\5.\30\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\36\2\2\u00e4\'\3\2\2"+
		"\2\u00e5\u00e6\7\37\2\2\u00e6\u00eb\5.\30\2\u00e7\u00e8\t\5\2\2\u00e8"+
		"\u00ea\5.\30\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\7\36\2\2\u00ef)\3\2\2\2\u00f0\u00f1\7\31\2\2\u00f1\u00f2\5.\30"+
		"\2\u00f2\u00f3\7,\2\2\u00f3\u00f4\5\6\4\2\u00f4+\3\2\2\2\u00f5\u00f6\7"+
		"R\2\2\u00f6-\3\2\2\2\u00f7\u0108\5\b\5\2\u00f8\u0108\5\n\6\2\u00f9\u0108"+
		"\5\f\7\2\u00fa\u0108\5\16\b\2\u00fb\u0108\5\30\r\2\u00fc\u0108\5\32\16"+
		"\2\u00fd\u0108\5\34\17\2\u00fe\u0108\5\36\20\2\u00ff\u0108\5 \21\2\u0100"+
		"\u0108\5\"\22\2\u0101\u0108\5$\23\2\u0102\u0108\5&\24\2\u0103\u0108\5"+
		"(\25\2\u0104\u0108\5*\26\2\u0105\u0108\5,\27\2\u0106\u0108\5\4\3\2\u0107"+
		"\u00f7\3\2\2\2\u0107\u00f8\3\2\2\2\u0107\u00f9\3\2\2\2\u0107\u00fa\3\2"+
		"\2\2\u0107\u00fb\3\2\2\2\u0107\u00fc\3\2\2\2\u0107\u00fd\3\2\2\2\u0107"+
		"\u00fe\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0100\3\2\2\2\u0107\u0101\3\2"+
		"\2\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108/\3\2\2\2\u0109\u010a\7*\2\2\u010a"+
		"\u010b\7+\2\2\u010b\u010c\7,\2\2\u010c\u010d\5\6\4\2\u010d\u0110\7R\2"+
		"\2\u010e\u010f\7.\2\2\u010f\u0111\5.\30\2\u0110\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\61\3\2\2\2\u0112\u0113\7R\2\2\u0113\u0114\7-\2\2\u0114"+
		"\u0115\5.\30\2\u0115\63\3\2\2\2\u0116\u0117\7\61\2\2\u0117\u0118\5\6\4"+
		"\2\u0118\u0119\7R\2\2\u0119\65\3\2\2\2\u011a\u011b\7\33\2\2\u011b\u011d"+
		"\5\64\33\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122"+
		"\7\36\2\2\u0122\67\3\2\2\2\u0123\u0125\5\64\33\2\u0124\u0126\5\66\34\2"+
		"\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u01269\3\2\2\2\u0127\u0128\7"+
		"\20\2\2\u0128\u0129\5\6\4\2\u0129;\3\2\2\2\u012a\u012b\7/\2\2\u012b\u012c"+
		"\t\6\2\2\u012c\u012d\7*\2\2\u012d\u012f\7R\2\2\u012e\u0130\58\35\2\u012f"+
		"\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0133\5:"+
		"\36\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0136\5l\67\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u013f\3\2\2\2\u0139\u013b\5n8\2\u013a\u013c"+
		"\5l\67\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0139\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7\62\2\2\u0142\u0143\7\63\2\2\u0143"+
		"\u0144\7\64\2\2\u0144\u0145\7\65\2\2\u0145=\3\2\2\2\u0146\u0147\7B\2\2"+
		"\u0147\u0148\7\61\2\2\u0148\u014b\5.\30\2\u0149\u014b\7C\2\2\u014a\u0146"+
		"\3\2\2\2\u014a\u0149\3\2\2\2\u014b?\3\2\2\2\u014c\u014d\7\61\2\2\u014d"+
		"\u014e\5.\30\2\u014eA\3\2\2\2\u014f\u0150\7\33\2\2\u0150\u0152\5@!\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7\36\2\2\u0157"+
		"C\3\2\2\2\u0158\u015a\5@!\2\u0159\u015b\5B\"\2\u015a\u0159\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015bE\3\2\2\2\u015c\u015d\7*\2\2\u015d\u015e\t\6\2\2\u015e"+
		"\u015f\7R\2\2\u015f\u0160\5D#\2\u0160G\3\2\2\2\u0161\u0162\t\7\2\2\u0162"+
		"I\3\2\2\2\u0163\u0164\5H%\2\u0164\u0165\7\61\2\2\u0165\u0166\7R\2\2\u0166"+
		"K\3\2\2\2\u0167\u0168\7\66\2\2\u0168\u0169\7\67\2\2\u0169\u016a\7\61\2"+
		"\2\u016a\u016b\7R\2\2\u016b\u016c\5J&\2\u016c\u016d\t\b\2\2\u016d\u016f"+
		"\5.\30\2\u016e\u0170\5l\67\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\5n"+
		"8\2\u0174\u0176\5l\67\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\66"+
		"\2\2\u017a\u017b\78\2\2\u017b\u017c\7\61\2\2\u017c\u017d\7R\2\2\u017d"+
		"M\3\2\2\2\u017e\u017f\7=\2\2\u017f\u0181\7>\2\2\u0180\u0182\5l\67\2\u0181"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u018b\3\2\2\2\u0185\u0187\5P)\2\u0186\u0188\5l\67\2\u0187\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0185\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u0195\3\2\2\2\u018f\u0191\5R*\2\u0190\u0192"+
		"\5l\67\2\u0191\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u018f\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7?\2\2\u0198O\3\2\2\2\u0199\u019a"+
		"\7@\2\2\u019a\u019c\5\2\2\2\u019b\u019d\5l\67\2\u019c\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a1\5n8\2\u01a1Q\3\2\2\2\u01a2\u01a4\7A\2\2\u01a3\u01a5\5"+
		"l\67\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\5n8\2\u01a9S\3\2\2\2\u01aa"+
		"\u01ab\7D\2\2\u01ab\u01ac\7E\2\2\u01ac\u01ad\7>\2\2\u01adU\3\2\2\2\u01ae"+
		"\u01af\7F\2\2\u01af\u01b1\7E\2\2\u01b0\u01b2\5l\67\2\u01b1\u01b0\3\2\2"+
		"\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b6\5n8\2\u01b6W\3\2\2\2\u01b7\u01b8\7I\2\2\u01b8\u01ba"+
		"\5.\30\2\u01b9\u01bb\5l\67\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5n"+
		"8\2\u01bfY\3\2\2\2\u01c0\u01c1\7G\2\2\u01c1\u01c3\7H\2\2\u01c2\u01c4\5"+
		"l\67\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\5n8\2\u01c8[\3\2\2\2\u01c9"+
		"\u01cb\5T+\2\u01ca\u01cc\5l\67\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3\2\2"+
		"\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d9"+
		"\5V,\2\u01d0\u01d2\5l\67\2\u01d1\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\5X"+
		"-\2\u01d6\u01d8\3\2\2\2\u01d7\u01d1\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01e3\3\2\2\2\u01db\u01d9\3\2"+
		"\2\2\u01dc\u01de\5l\67\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\5Z"+
		".\2\u01e2\u01e4\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e6\3\2\2\2\u01e5\u01e7\5l\67\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\7?\2\2\u01eb]\3\2\2\2\u01ec\u01ed\7J\2\2\u01ed\u01ee\7R\2\2\u01ee"+
		"_\3\2\2\2\u01ef\u01f0\5.\30\2\u01f0a\3\2\2\2\u01f1\u01f3\5`\61\2\u01f2"+
		"\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01fc\3\2\2\2\u01f4\u01f5\7P"+
		"\2\2\u01f5\u01f7\5`\61\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2"+
		"\2\2\u01fb\u01fd\7\36\2\2\u01fc\u01f8\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"c\3\2\2\2\u01fe\u01ff\7L\2\2\u01ff\u0201\5b\62\2\u0200\u0202\7M\2\2\u0201"+
		"\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202e\3\2\2\2\u0203\u020d\5\60\31"+
		"\2\u0204\u020d\5\62\32\2\u0205\u020d\5L\'\2\u0206\u020d\5\\/\2\u0207\u020d"+
		"\5N(\2\u0208\u020d\5^\60\2\u0209\u020d\5d\63\2\u020a\u020d\5F$\2\u020b"+
		"\u020d\5.\30\2\u020c\u0203\3\2\2\2\u020c\u0204\3\2\2\2\u020c\u0205\3\2"+
		"\2\2\u020c\u0206\3\2\2\2\u020c\u0207\3\2\2\2\u020c\u0208\3\2\2\2\u020c"+
		"\u0209\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020dg\3\2\2\2"+
		"\u020e\u0212\5f\64\2\u020f\u0212\5> \2\u0210\u0212\7C\2\2\u0211\u020e"+
		"\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212i\3\2\2\2\u0213"+
		"\u0216\5f\64\2\u0214\u0216\5<\37\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2"+
		"\2\2\u0216k\3\2\2\2\u0217\u0218\t\t\2\2\u0218m\3\2\2\2\u0219\u0223\5h"+
		"\65\2\u021a\u021c\5l\67\2\u021b\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\5h"+
		"\65\2\u0220\u0222\3\2\2\2\u0221\u021b\3\2\2\2\u0222\u0225\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0226\u0219\3\2\2\2\u0226\u0227\3\2\2\2\u0227o\3\2\2\2\u0228\u0232"+
		"\5j\66\2\u0229\u022b\5l\67\2\u022a\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\5j"+
		"\66\2\u022f\u0231\3\2\2\2\u0230\u022a\3\2\2\2\u0231\u0234\3\2\2\2\u0232"+
		"\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2"+
		"\2\2\u0235\u0228\3\2\2\2\u0235\u0236\3\2\2\2\u0236q\3\2\2\2\u0237\u0239"+
		"\7N\2\2\u0238\u023a\5l\67\2\u0239\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\5p"+
		"9\2\u023e\u0240\5l\67\2\u023f\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\7O"+
		"\2\2\u0244s\3\2\2\2\63y\u00d5\u00e0\u00eb\u0107\u0110\u011e\u0125\u012f"+
		"\u0132\u0137\u013d\u013f\u014a\u0153\u015a\u0171\u0177\u0183\u0189\u018d"+
		"\u0193\u0195\u019e\u01a6\u01b3\u01bc\u01c5\u01cd\u01d3\u01d9\u01df\u01e3"+
		"\u01e8\u01f2\u01f8\u01fc\u0201\u020c\u0211\u0215\u021d\u0223\u0226\u022c"+
		"\u0232\u0235\u023b\u0241";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}