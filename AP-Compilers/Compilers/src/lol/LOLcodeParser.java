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
		RULE_var_rvalue = 24, RULE_var_assignment = 25, RULE_arg_decl = 26, RULE_more_args_decl = 27, 
		RULE_args_decl = 28, RULE_return_type = 29, RULE_func_decl = 30, RULE_return_statement = 31, 
		RULE_naked_arg = 32, RULE_arg = 33, RULE_more_args = 34, RULE_args = 35, 
		RULE_func_call = 36, RULE_loop_action = 37, RULE_loop_condition = 38, 
		RULE_loop_end = 39, RULE_loop = 40, RULE_aswitch = 41, RULE_acase = 42, 
		RULE_adefault = 43, RULE_anif = 44, RULE_then = 45, RULE_elseif = 46, 
		RULE_anelse = 47, RULE_ifthenelseifelse = 48, RULE_input = 49, RULE_output_arg = 50, 
		RULE_output_args = 51, RULE_output = 52, RULE_statement_affecting_it = 53, 
		RULE_core_statement = 54, RULE_inner_statement = 55, RULE_top_level_statement = 56, 
		RULE_separator = 57, RULE_block = 58, RULE_top_level_block = 59, RULE_program = 60;
	public static final String[] ruleNames = {
		"literal_value", "atom", "vartype", "sum", "diff", "product", "quotient", 
		"bigger", "smallr", "min", "max", "mod", "not", "same", "and", "either", 
		"one", "all", "any", "concat", "cast", "var_ref", "expr", "var_decl", 
		"var_rvalue", "var_assignment", "arg_decl", "more_args_decl", "args_decl", 
		"return_type", "func_decl", "return_statement", "naked_arg", "arg", "more_args", 
		"args", "func_call", "loop_action", "loop_condition", "loop_end", "loop", 
		"aswitch", "acase", "adefault", "anif", "then", "elseif", "anelse", "ifthenelseifelse", 
		"input", "output_arg", "output_args", "output", "statement_affecting_it", 
		"core_statement", "inner_statement", "top_level_statement", "separator", 
		"block", "top_level_block", "program"
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
			setState(122);
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
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case STRING:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				literal_value();
				}
				break;
			case IT:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(IT);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
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
			setState(129);
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(131);
			match(SUM);
			setState(132);
			match(OF);
			setState(133);
			naked_arg();
			setState(134);
			match(AN);
			setState(135);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(137);
			match(DIFF);
			setState(138);
			match(OF);
			setState(139);
			naked_arg();
			setState(140);
			match(AN);
			setState(141);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(143);
			match(PRODUKT);
			setState(144);
			match(OF);
			setState(145);
			naked_arg();
			setState(146);
			match(AN);
			setState(147);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(149);
			match(QUOSHUNT);
			setState(150);
			match(OF);
			setState(151);
			naked_arg();
			setState(152);
			match(AN);
			setState(153);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(155);
			match(IZ);
			setState(156);
			match(BIGGR);
			setState(157);
			naked_arg();
			setState(158);
			match(THAN);
			setState(159);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(161);
			match(IZ);
			setState(162);
			match(SMALLR);
			setState(163);
			naked_arg();
			setState(164);
			match(THAN);
			setState(165);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(167);
			match(SMALLR);
			setState(168);
			match(OF);
			setState(169);
			naked_arg();
			setState(170);
			match(AN);
			setState(171);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(173);
			match(BIGGR);
			setState(174);
			match(OF);
			setState(175);
			naked_arg();
			setState(176);
			match(AN);
			setState(177);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(179);
			match(MOD);
			setState(180);
			match(OF);
			setState(181);
			naked_arg();
			setState(182);
			match(AN);
			setState(183);
			naked_arg();
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
		public Naked_argContext naked_arg() {
			return getRuleContext(Naked_argContext.class,0);
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
			setState(185);
			match(NOT);
			setState(186);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(188);
			match(BOTH);
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==SAEM || _la==DIFFRINT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(190);
			naked_arg();
			setState(191);
			match(AN);
			setState(192);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(194);
			match(BOTH);
			setState(195);
			match(OF);
			setState(196);
			naked_arg();
			setState(197);
			match(AN);
			setState(198);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(200);
			match(EITHER);
			setState(201);
			match(OF);
			setState(202);
			naked_arg();
			setState(203);
			match(AN);
			setState(204);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(206);
			match(WON);
			setState(207);
			match(OF);
			setState(208);
			naked_arg();
			setState(209);
			match(AN);
			setState(210);
			naked_arg();
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(212);
			match(ALL);
			setState(213);
			match(OF);
			setState(214);
			naked_arg();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(215);
				match(AN);
				setState(216);
				naked_arg();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(224);
			match(ANY);
			setState(225);
			naked_arg();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(226);
				match(AN);
				setState(227);
				naked_arg();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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
		public List<Naked_argContext> naked_arg() {
			return getRuleContexts(Naked_argContext.class);
		}
		public Naked_argContext naked_arg(int i) {
			return getRuleContext(Naked_argContext.class,i);
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
			setState(235);
			match(SMOOSH);
			setState(236);
			naked_arg();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN || _la==COMMA) {
				{
				{
				setState(237);
				_la = _input.LA(1);
				if ( !(_la==AN || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				naked_arg();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
		public Naked_argContext naked_arg() {
			return getRuleContext(Naked_argContext.class,0);
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
			setState(246);
			match(MAEK);
			setState(247);
			naked_arg();
			setState(248);
			match(A);
			setState(249);
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
			setState(251);
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
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				sum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				diff();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				product();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				quotient();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				mod();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				not();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(259);
				same();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(260);
				and();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(261);
				either();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(262);
				one();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(263);
				all();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(264);
				any();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(265);
				concat();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(266);
				cast();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(267);
				var_ref();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(268);
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
			setState(271);
			match(I);
			setState(272);
			match(HAS);
			setState(273);
			match(A);
			setState(274);
			vartype();
			setState(275);
			match(IDENTIFIER);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ITZ) {
				{
				setState(276);
				match(ITZ);
				setState(277);
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

	public static class Var_rvalueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LOLcodeParser.IDENTIFIER, 0); }
		public Var_rvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterVar_rvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitVar_rvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitVar_rvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_rvalueContext var_rvalue() throws RecognitionException {
		Var_rvalueContext _localctx = new Var_rvalueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_var_rvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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

	public static class Var_assignmentContext extends ParserRuleContext {
		public Var_rvalueContext var_rvalue() {
			return getRuleContext(Var_rvalueContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_var_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			var_rvalue();
			setState(283);
			match(R);
			setState(284);
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
		enterRule(_localctx, 52, RULE_arg_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(YR);
			setState(287);
			vartype();
			setState(288);
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
		enterRule(_localctx, 54, RULE_more_args_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(290);
				match(AN);
				setState(291);
				arg_decl();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
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
		enterRule(_localctx, 56, RULE_args_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			arg_decl();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AN || _la==MKAY) {
				{
				setState(300);
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
		enterRule(_localctx, 58, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(INTO);
			setState(304);
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
		enterRule(_localctx, 60, RULE_func_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(HOW);
			setState(307);
			_la = _input.LA(1);
			if ( !(_la==IZ || _la==DUZ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(308);
			match(I);
			setState(309);
			match(IDENTIFIER);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YR) {
				{
				setState(310);
				args_decl();
				}
			}

			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(313);
				return_type();
				}
			}

			setState(317); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(316);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(319); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT) | (1L << I) | (1L << IM) | (1L << WTF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOUND - 64)) | (1L << (GTFO - 64)) | (1L << (O - 64)) | (1L << (GIMMEH - 64)) | (1L << (VISIBLE - 64)) | (1L << (COMMA - 64)) | (1L << (NEWLINE - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(321);
				block();
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(322);
					separator();
					}
					}
					setState(325); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==NEWLINE );
				}
			}

			setState(329);
			match(IF);
			setState(330);
			match(U);
			setState(331);
			match(SAY);
			setState(332);
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
		enterRule(_localctx, 62, RULE_return_statement);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOUND:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(334);
				match(FOUND);
				setState(335);
				match(YR);
				setState(336);
				expr();
				}
				}
				break;
			case GTFO:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
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

	public static class Naked_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Naked_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naked_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterNaked_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitNaked_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitNaked_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Naked_argContext naked_arg() throws RecognitionException {
		Naked_argContext _localctx = new Naked_argContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_naked_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode YR() { return getToken(LOLcodeParser.YR, 0); }
		public Naked_argContext naked_arg() {
			return getRuleContext(Naked_argContext.class,0);
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
		enterRule(_localctx, 66, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(YR);
			setState(343);
			naked_arg();
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
		enterRule(_localctx, 68, RULE_more_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(345);
				match(AN);
				setState(346);
				arg();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
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
		enterRule(_localctx, 70, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			arg();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AN || _la==MKAY) {
				{
				setState(355);
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
		public TerminalNode DUZ() { return getToken(LOLcodeParser.DUZ, 0); }
		public TerminalNode IZ() { return getToken(LOLcodeParser.IZ, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(I);
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==IZ || _la==DUZ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(360);
			match(IDENTIFIER);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YR) {
				{
				setState(361);
				args();
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

	public static class Loop_actionContext extends ParserRuleContext {
		public TerminalNode YR() { return getToken(LOLcodeParser.YR, 0); }
		public Var_rvalueContext var_rvalue() {
			return getRuleContext(Var_rvalueContext.class,0);
		}
		public TerminalNode UPPIN() { return getToken(LOLcodeParser.UPPIN, 0); }
		public TerminalNode NERFIN() { return getToken(LOLcodeParser.NERFIN, 0); }
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
		enterRule(_localctx, 74, RULE_loop_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==UPPIN || _la==NERFIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(365);
			match(YR);
			setState(366);
			var_rvalue();
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

	public static class Loop_conditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TIL() { return getToken(LOLcodeParser.TIL, 0); }
		public TerminalNode WILE() { return getToken(LOLcodeParser.WILE, 0); }
		public Loop_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterLoop_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitLoop_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitLoop_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_conditionContext loop_condition() throws RecognitionException {
		Loop_conditionContext _localctx = new Loop_conditionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_loop_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !(_la==TIL || _la==WILE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(369);
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

	public static class Loop_endContext extends ParserRuleContext {
		public TerminalNode IM() { return getToken(LOLcodeParser.IM, 0); }
		public TerminalNode OUTTA() { return getToken(LOLcodeParser.OUTTA, 0); }
		public TerminalNode YR() { return getToken(LOLcodeParser.YR, 0); }
		public Loop_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterLoop_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitLoop_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitLoop_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_endContext loop_end() throws RecognitionException {
		Loop_endContext _localctx = new Loop_endContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_loop_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(IM);
			setState(372);
			match(OUTTA);
			setState(373);
			match(YR);
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
		public TerminalNode IM() { return getToken(LOLcodeParser.IM, 0); }
		public TerminalNode IN() { return getToken(LOLcodeParser.IN, 0); }
		public TerminalNode YR() { return getToken(LOLcodeParser.YR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(LOLcodeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LOLcodeParser.IDENTIFIER, i);
		}
		public Loop_actionContext loop_action() {
			return getRuleContext(Loop_actionContext.class,0);
		}
		public Loop_conditionContext loop_condition() {
			return getRuleContext(Loop_conditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Loop_endContext loop_end() {
			return getRuleContext(Loop_endContext.class,0);
		}
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
		enterRule(_localctx, 80, RULE_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(IM);
			setState(376);
			match(IN);
			setState(377);
			match(YR);
			setState(378);
			match(IDENTIFIER);
			setState(379);
			loop_action();
			setState(380);
			loop_condition();
			setState(382); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(381);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(384); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(386);
			block();
			setState(388); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(387);
				separator();
				}
				}
				setState(390); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(392);
			loop_end();
			setState(393);
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
		enterRule(_localctx, 82, RULE_aswitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(WTF);
			setState(396);
			match(QUESTION);
			setState(398); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(397);
				separator();
				}
				}
				setState(400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(402);
				acase();
				setState(404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(403);
					separator();
					}
					}
					setState(406); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==NEWLINE );
				}
				}
				setState(410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OMG );
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OMGWTF) {
				{
				setState(412);
				adefault();
				setState(414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(413);
					separator();
					}
					}
					setState(416); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==NEWLINE );
				}
			}

			setState(420);
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
		enterRule(_localctx, 84, RULE_acase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(OMG);
			setState(423);
			literal_value();
			setState(425); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(424);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(427); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(429);
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
		enterRule(_localctx, 86, RULE_adefault);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(OMGWTF);
			setState(433); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(432);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(435); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(437);
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
		enterRule(_localctx, 88, RULE_anif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(O);
			setState(440);
			match(RLY);
			setState(441);
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
		enterRule(_localctx, 90, RULE_then);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(YA);
			setState(444);
			match(RLY);
			setState(446); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(445);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(448); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(450);
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
		enterRule(_localctx, 92, RULE_elseif);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(MEBBE);
			setState(453);
			expr();
			setState(455); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(454);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(457); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(459);
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
		enterRule(_localctx, 94, RULE_anelse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(NO);
			setState(462);
			match(WAI);
			setState(464); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(463);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(466); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(468);
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
		enterRule(_localctx, 96, RULE_ifthenelseifelse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			anif();
			setState(472); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(471);
				separator();
				}
				}
				setState(474); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(476);
			then();
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(477);
						separator();
						}
						}
						setState(480); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA || _la==NEWLINE );
					setState(482);
					elseif();
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(490); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(489);
					separator();
					}
					}
					setState(492); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==NEWLINE );
				setState(494);
				anelse();
				}
				break;
			}
			setState(499); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(498);
				separator();
				}
				}
				setState(501); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(503);
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
		public Var_rvalueContext var_rvalue() {
			return getRuleContext(Var_rvalueContext.class,0);
		}
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
		enterRule(_localctx, 98, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(GIMMEH);
			setState(506);
			var_rvalue();
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
		enterRule(_localctx, 100, RULE_output_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
		enterRule(_localctx, 102, RULE_output_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT))) != 0) || _la==IDENTIFIER) {
				{
				setState(510);
				output_arg();
				}
			}

			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(513);
					match(COMMA);
					setState(514);
					output_arg();
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520);
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
		enterRule(_localctx, 104, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(VISIBLE);
			setState(524);
			output_args();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATION) {
				{
				setState(525);
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

	public static class Statement_affecting_itContext extends ParserRuleContext {
		public Var_assignmentContext var_assignment() {
			return getRuleContext(Var_assignmentContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Statement_affecting_itContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_affecting_it; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).enterStatement_affecting_it(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLcodeListener ) ((LOLcodeListener)listener).exitStatement_affecting_it(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLcodeVisitor ) return ((LOLcodeVisitor<? extends T>)visitor).visitStatement_affecting_it(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_affecting_itContext statement_affecting_it() throws RecognitionException {
		Statement_affecting_itContext _localctx = new Statement_affecting_itContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_statement_affecting_it);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				var_assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				var_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				input();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				func_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(532);
				output();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(533);
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

	public static class Core_statementContext extends ParserRuleContext {
		public Statement_affecting_itContext statement_affecting_it() {
			return getRuleContext(Statement_affecting_itContext.class,0);
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
		enterRule(_localctx, 108, RULE_core_statement);
		try {
			setState(540);
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
			case GIMMEH:
			case VISIBLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				statement_affecting_it();
				}
				break;
			case IM:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				loop();
				}
				break;
			case O:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				ifthenelseifelse();
				}
				break;
			case WTF:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				aswitch();
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
		enterRule(_localctx, 110, RULE_inner_statement);
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				core_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				return_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
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
		enterRule(_localctx, 112, RULE_top_level_statement);
		try {
			setState(549);
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
				setState(547);
				core_statement();
				}
				break;
			case HOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
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
		enterRule(_localctx, 114, RULE_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
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
		enterRule(_localctx, 116, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT) | (1L << I) | (1L << IM) | (1L << WTF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOUND - 64)) | (1L << (GTFO - 64)) | (1L << (O - 64)) | (1L << (GIMMEH - 64)) | (1L << (VISIBLE - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(553);
				inner_statement();
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(555); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(554);
							separator();
							}
							}
							setState(557); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==COMMA || _la==NEWLINE );
						setState(559);
						inner_statement();
						}
						} 
					}
					setState(565);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 118, RULE_top_level_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << SUM) | (1L << DIFF) | (1L << PRODUKT) | (1L << QUOSHUNT) | (1L << MOD) | (1L << MAEK) | (1L << IT) | (1L << SMOOSH) | (1L << BOTH) | (1L << EITHER) | (1L << ANY) | (1L << ALL) | (1L << WON) | (1L << NOT) | (1L << I) | (1L << HOW) | (1L << IM) | (1L << WTF))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (O - 66)) | (1L << (GIMMEH - 66)) | (1L << (VISIBLE - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(568);
				top_level_statement();
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(570); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(569);
							separator();
							}
							}
							setState(572); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==COMMA || _la==NEWLINE );
						setState(574);
						top_level_statement();
						}
						} 
					}
					setState(580);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 120, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(HAI);
			setState(585); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(584);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(587); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(589);
			top_level_block();
			setState(591); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(590);
				separator();
				}
				}
				setState(593); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==NEWLINE );
			setState(595);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u0258\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\3\5\3\u0082\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00dc\n\23\f\23\16\23\u00df\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\7\24\u00e7\n\24\f\24\16\24\u00ea\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\7\25\u00f2\n\25\f\25\16\25\u00f5\13\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0110\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0119\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\7\35\u0127\n\35\f\35\16\35\u012a\13\35\3\35\3\35"+
		"\3\36\3\36\5\36\u0130\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u013a\n \3"+
		" \5 \u013d\n \3 \6 \u0140\n \r \16 \u0141\3 \3 \6 \u0146\n \r \16 \u0147"+
		"\5 \u014a\n \3 \3 \3 \3 \3 \3!\3!\3!\3!\5!\u0155\n!\3\"\3\"\3#\3#\3#\3"+
		"$\3$\7$\u015e\n$\f$\16$\u0161\13$\3$\3$\3%\3%\5%\u0167\n%\3&\3&\3&\3&"+
		"\5&\u016d\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\6*\u0181\n*\r*\16*\u0182\3*\3*\6*\u0187\n*\r*\16*\u0188\3*\3*\3*\3+"+
		"\3+\3+\6+\u0191\n+\r+\16+\u0192\3+\3+\6+\u0197\n+\r+\16+\u0198\6+\u019b"+
		"\n+\r+\16+\u019c\3+\3+\6+\u01a1\n+\r+\16+\u01a2\5+\u01a5\n+\3+\3+\3,\3"+
		",\3,\6,\u01ac\n,\r,\16,\u01ad\3,\3,\3-\3-\6-\u01b4\n-\r-\16-\u01b5\3-"+
		"\3-\3.\3.\3.\3.\3/\3/\3/\6/\u01c1\n/\r/\16/\u01c2\3/\3/\3\60\3\60\3\60"+
		"\6\60\u01ca\n\60\r\60\16\60\u01cb\3\60\3\60\3\61\3\61\3\61\6\61\u01d3"+
		"\n\61\r\61\16\61\u01d4\3\61\3\61\3\62\3\62\6\62\u01db\n\62\r\62\16\62"+
		"\u01dc\3\62\3\62\6\62\u01e1\n\62\r\62\16\62\u01e2\3\62\3\62\7\62\u01e7"+
		"\n\62\f\62\16\62\u01ea\13\62\3\62\6\62\u01ed\n\62\r\62\16\62\u01ee\3\62"+
		"\3\62\5\62\u01f3\n\62\3\62\6\62\u01f6\n\62\r\62\16\62\u01f7\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\65\5\65\u0202\n\65\3\65\3\65\7\65\u0206\n"+
		"\65\f\65\16\65\u0209\13\65\3\65\5\65\u020c\n\65\3\66\3\66\3\66\5\66\u0211"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0219\n\67\38\38\38\38\58\u021f"+
		"\n8\39\39\39\59\u0224\n9\3:\3:\5:\u0228\n:\3;\3;\3<\3<\6<\u022e\n<\r<"+
		"\16<\u022f\3<\3<\7<\u0234\n<\f<\16<\u0237\13<\5<\u0239\n<\3=\3=\6=\u023d"+
		"\n=\r=\16=\u023e\3=\3=\7=\u0243\n=\f=\16=\u0246\13=\5=\u0248\n=\3>\3>"+
		"\6>\u024c\n>\r>\16>\u024d\3>\3>\6>\u0252\n>\r>\16>\u0253\3>\3>\3>\2\2"+
		"?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz\2\n\4\2\7\t\f\f\4\2\r\17 !\3\2()\4\2\33\33"+
		"PP\4\2\30\30\60\60\3\2;<\3\29:\3\2PQ\2\u0263\2|\3\2\2\2\4\u0081\3\2\2"+
		"\2\6\u0083\3\2\2\2\b\u0085\3\2\2\2\n\u008b\3\2\2\2\f\u0091\3\2\2\2\16"+
		"\u0097\3\2\2\2\20\u009d\3\2\2\2\22\u00a3\3\2\2\2\24\u00a9\3\2\2\2\26\u00af"+
		"\3\2\2\2\30\u00b5\3\2\2\2\32\u00bb\3\2\2\2\34\u00be\3\2\2\2\36\u00c4\3"+
		"\2\2\2 \u00ca\3\2\2\2\"\u00d0\3\2\2\2$\u00d6\3\2\2\2&\u00e2\3\2\2\2(\u00ed"+
		"\3\2\2\2*\u00f8\3\2\2\2,\u00fd\3\2\2\2.\u010f\3\2\2\2\60\u0111\3\2\2\2"+
		"\62\u011a\3\2\2\2\64\u011c\3\2\2\2\66\u0120\3\2\2\28\u0128\3\2\2\2:\u012d"+
		"\3\2\2\2<\u0131\3\2\2\2>\u0134\3\2\2\2@\u0154\3\2\2\2B\u0156\3\2\2\2D"+
		"\u0158\3\2\2\2F\u015f\3\2\2\2H\u0164\3\2\2\2J\u0168\3\2\2\2L\u016e\3\2"+
		"\2\2N\u0172\3\2\2\2P\u0175\3\2\2\2R\u0179\3\2\2\2T\u018d\3\2\2\2V\u01a8"+
		"\3\2\2\2X\u01b1\3\2\2\2Z\u01b9\3\2\2\2\\\u01bd\3\2\2\2^\u01c6\3\2\2\2"+
		"`\u01cf\3\2\2\2b\u01d8\3\2\2\2d\u01fb\3\2\2\2f\u01fe\3\2\2\2h\u0201\3"+
		"\2\2\2j\u020d\3\2\2\2l\u0218\3\2\2\2n\u021e\3\2\2\2p\u0223\3\2\2\2r\u0227"+
		"\3\2\2\2t\u0229\3\2\2\2v\u0238\3\2\2\2x\u0247\3\2\2\2z\u0249\3\2\2\2|"+
		"}\t\2\2\2}\3\3\2\2\2~\u0082\5\2\2\2\177\u0082\7\35\2\2\u0080\u0082\7R"+
		"\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\5\3\2"+
		"\2\2\u0083\u0084\t\3\2\2\u0084\7\3\2\2\2\u0085\u0086\7\21\2\2\u0086\u0087"+
		"\7\34\2\2\u0087\u0088\5B\"\2\u0088\u0089\7\33\2\2\u0089\u008a\5B\"\2\u008a"+
		"\t\3\2\2\2\u008b\u008c\7\22\2\2\u008c\u008d\7\34\2\2\u008d\u008e\5B\""+
		"\2\u008e\u008f\7\33\2\2\u008f\u0090\5B\"\2\u0090\13\3\2\2\2\u0091\u0092"+
		"\7\23\2\2\u0092\u0093\7\34\2\2\u0093\u0094\5B\"\2\u0094\u0095\7\33\2\2"+
		"\u0095\u0096\5B\"\2\u0096\r\3\2\2\2\u0097\u0098\7\24\2\2\u0098\u0099\7"+
		"\34\2\2\u0099\u009a\5B\"\2\u009a\u009b\7\33\2\2\u009b\u009c\5B\"\2\u009c"+
		"\17\3\2\2\2\u009d\u009e\7\30\2\2\u009e\u009f\7\26\2\2\u009f\u00a0\5B\""+
		"\2\u00a0\u00a1\7\32\2\2\u00a1\u00a2\5B\"\2\u00a2\21\3\2\2\2\u00a3\u00a4"+
		"\7\30\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6\5B\"\2\u00a6\u00a7\7\32\2\2"+
		"\u00a7\u00a8\5B\"\2\u00a8\23\3\2\2\2\u00a9\u00aa\7\27\2\2\u00aa\u00ab"+
		"\7\34\2\2\u00ab\u00ac\5B\"\2\u00ac\u00ad\7\33\2\2\u00ad\u00ae\5B\"\2\u00ae"+
		"\25\3\2\2\2\u00af\u00b0\7\26\2\2\u00b0\u00b1\7\34\2\2\u00b1\u00b2\5B\""+
		"\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\5B\"\2\u00b4\27\3\2\2\2\u00b5\u00b6"+
		"\7\25\2\2\u00b6\u00b7\7\34\2\2\u00b7\u00b8\5B\"\2\u00b8\u00b9\7\33\2\2"+
		"\u00b9\u00ba\5B\"\2\u00ba\31\3\2\2\2\u00bb\u00bc\7\'\2\2\u00bc\u00bd\5"+
		"B\"\2\u00bd\33\3\2\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\t\4\2\2\u00c0\u00c1"+
		"\5B\"\2\u00c1\u00c2\7\33\2\2\u00c2\u00c3\5B\"\2\u00c3\35\3\2\2\2\u00c4"+
		"\u00c5\7\"\2\2\u00c5\u00c6\7\34\2\2\u00c6\u00c7\5B\"\2\u00c7\u00c8\7\33"+
		"\2\2\u00c8\u00c9\5B\"\2\u00c9\37\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc"+
		"\7\34\2\2\u00cc\u00cd\5B\"\2\u00cd\u00ce\7\33\2\2\u00ce\u00cf\5B\"\2\u00cf"+
		"!\3\2\2\2\u00d0\u00d1\7&\2\2\u00d1\u00d2\7\34\2\2\u00d2\u00d3\5B\"\2\u00d3"+
		"\u00d4\7\33\2\2\u00d4\u00d5\5B\"\2\u00d5#\3\2\2\2\u00d6\u00d7\7%\2\2\u00d7"+
		"\u00d8\7\34\2\2\u00d8\u00dd\5B\"\2\u00d9\u00da\7\33\2\2\u00da\u00dc\5"+
		"B\"\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\36"+
		"\2\2\u00e1%\3\2\2\2\u00e2\u00e3\7$\2\2\u00e3\u00e8\5B\"\2\u00e4\u00e5"+
		"\7\33\2\2\u00e5\u00e7\5B\"\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ec\7\36\2\2\u00ec\'\3\2\2\2\u00ed\u00ee\7\37\2\2\u00ee\u00f3"+
		"\5B\"\2\u00ef\u00f0\t\5\2\2\u00f0\u00f2\5B\"\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\36\2\2\u00f7)\3\2\2\2\u00f8\u00f9"+
		"\7\31\2\2\u00f9\u00fa\5B\"\2\u00fa\u00fb\7,\2\2\u00fb\u00fc\5\6\4\2\u00fc"+
		"+\3\2\2\2\u00fd\u00fe\7R\2\2\u00fe-\3\2\2\2\u00ff\u0110\5\b\5\2\u0100"+
		"\u0110\5\n\6\2\u0101\u0110\5\f\7\2\u0102\u0110\5\16\b\2\u0103\u0110\5"+
		"\30\r\2\u0104\u0110\5\32\16\2\u0105\u0110\5\34\17\2\u0106\u0110\5\36\20"+
		"\2\u0107\u0110\5 \21\2\u0108\u0110\5\"\22\2\u0109\u0110\5$\23\2\u010a"+
		"\u0110\5&\24\2\u010b\u0110\5(\25\2\u010c\u0110\5*\26\2\u010d\u0110\5,"+
		"\27\2\u010e\u0110\5\4\3\2\u010f\u00ff\3\2\2\2\u010f\u0100\3\2\2\2\u010f"+
		"\u0101\3\2\2\2\u010f\u0102\3\2\2\2\u010f\u0103\3\2\2\2\u010f\u0104\3\2"+
		"\2\2\u010f\u0105\3\2\2\2\u010f\u0106\3\2\2\2\u010f\u0107\3\2\2\2\u010f"+
		"\u0108\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010a\3\2\2\2\u010f\u010b\3\2"+
		"\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110"+
		"/\3\2\2\2\u0111\u0112\7*\2\2\u0112\u0113\7+\2\2\u0113\u0114\7,\2\2\u0114"+
		"\u0115\5\6\4\2\u0115\u0118\7R\2\2\u0116\u0117\7.\2\2\u0117\u0119\5.\30"+
		"\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\61\3\2\2\2\u011a\u011b"+
		"\7R\2\2\u011b\63\3\2\2\2\u011c\u011d\5\62\32\2\u011d\u011e\7-\2\2\u011e"+
		"\u011f\5.\30\2\u011f\65\3\2\2\2\u0120\u0121\7\61\2\2\u0121\u0122\5\6\4"+
		"\2\u0122\u0123\7R\2\2\u0123\67\3\2\2\2\u0124\u0125\7\33\2\2\u0125\u0127"+
		"\5\66\34\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c"+
		"\7\36\2\2\u012c9\3\2\2\2\u012d\u012f\5\66\34\2\u012e\u0130\58\35\2\u012f"+
		"\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130;\3\2\2\2\u0131\u0132\7\20\2\2"+
		"\u0132\u0133\5\6\4\2\u0133=\3\2\2\2\u0134\u0135\7/\2\2\u0135\u0136\t\6"+
		"\2\2\u0136\u0137\7*\2\2\u0137\u0139\7R\2\2\u0138\u013a\5:\36\2\u0139\u0138"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u013d\5<\37\2\u013c"+
		"\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0140\5t"+
		";\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0149\3\2\2\2\u0143\u0145\5v<\2\u0144\u0146\5t;\2"+
		"\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0143\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\7\62\2\2\u014c\u014d\7\63\2\2\u014d\u014e\7"+
		"\64\2\2\u014e\u014f\7\65\2\2\u014f?\3\2\2\2\u0150\u0151\7B\2\2\u0151\u0152"+
		"\7\61\2\2\u0152\u0155\5.\30\2\u0153\u0155\7C\2\2\u0154\u0150\3\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0155A\3\2\2\2\u0156\u0157\5.\30\2\u0157C\3\2\2\2\u0158"+
		"\u0159\7\61\2\2\u0159\u015a\5B\"\2\u015aE\3\2\2\2\u015b\u015c\7\33\2\2"+
		"\u015c\u015e\5D#\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0163\7\36\2\2\u0163G\3\2\2\2\u0164\u0166\5D#\2\u0165\u0167\5F$\2\u0166"+
		"\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167I\3\2\2\2\u0168\u0169\7*\2\2\u0169"+
		"\u016a\t\6\2\2\u016a\u016c\7R\2\2\u016b\u016d\5H%\2\u016c\u016b\3\2\2"+
		"\2\u016c\u016d\3\2\2\2\u016dK\3\2\2\2\u016e\u016f\t\7\2\2\u016f\u0170"+
		"\7\61\2\2\u0170\u0171\5\62\32\2\u0171M\3\2\2\2\u0172\u0173\t\b\2\2\u0173"+
		"\u0174\5.\30\2\u0174O\3\2\2\2\u0175\u0176\7\66\2\2\u0176\u0177\78\2\2"+
		"\u0177\u0178\7\61\2\2\u0178Q\3\2\2\2\u0179\u017a\7\66\2\2\u017a\u017b"+
		"\7\67\2\2\u017b\u017c\7\61\2\2\u017c\u017d\7R\2\2\u017d\u017e\5L\'\2\u017e"+
		"\u0180\5N(\2\u017f\u0181\5t;\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2"+
		"\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186"+
		"\5v<\2\u0185\u0187\5t;\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5P"+
		")\2\u018b\u018c\7R\2\2\u018cS\3\2\2\2\u018d\u018e\7=\2\2\u018e\u0190\7"+
		">\2\2\u018f\u0191\5t;\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u019a\3\2\2\2\u0194\u0196\5V"+
		",\2\u0195\u0197\5t;\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0194\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a4\3\2"+
		"\2\2\u019e\u01a0\5X-\2\u019f\u01a1\5t;\2\u01a0\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u019e\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7?"+
		"\2\2\u01a7U\3\2\2\2\u01a8\u01a9\7@\2\2\u01a9\u01ab\5\2\2\2\u01aa\u01ac"+
		"\5t;\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\5v<\2\u01b0W\3\2\2\2\u01b1"+
		"\u01b3\7A\2\2\u01b2\u01b4\5t;\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5\3\2\2"+
		"\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8"+
		"\5v<\2\u01b8Y\3\2\2\2\u01b9\u01ba\7D\2\2\u01ba\u01bb\7E\2\2\u01bb\u01bc"+
		"\7>\2\2\u01bc[\3\2\2\2\u01bd\u01be\7F\2\2\u01be\u01c0\7E\2\2\u01bf\u01c1"+
		"\5t;\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\5v<\2\u01c5]\3\2\2\2\u01c6"+
		"\u01c7\7I\2\2\u01c7\u01c9\5.\30\2\u01c8\u01ca\5t;\2\u01c9\u01c8\3\2\2"+
		"\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd"+
		"\3\2\2\2\u01cd\u01ce\5v<\2\u01ce_\3\2\2\2\u01cf\u01d0\7G\2\2\u01d0\u01d2"+
		"\7H\2\2\u01d1\u01d3\5t;\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\5v"+
		"<\2\u01d7a\3\2\2\2\u01d8\u01da\5Z.\2\u01d9\u01db\5t;\2\u01da\u01d9\3\2"+
		"\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e8\5\\/\2\u01df\u01e1\5t;\2\u01e0\u01df\3\2\2"+
		"\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e5\5^\60\2\u01e5\u01e7\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e7"+
		"\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01f2\3\2"+
		"\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ed\5t;\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\5`\61\2\u01f1\u01f3\3\2\2\2\u01f2\u01ec\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f6\5t;\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fa\7?\2\2\u01fac\3\2\2\2\u01fb\u01fc\7J\2\2\u01fc\u01fd\5\62\32\2"+
		"\u01fde\3\2\2\2\u01fe\u01ff\5.\30\2\u01ffg\3\2\2\2\u0200\u0202\5f\64\2"+
		"\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u020b\3\2\2\2\u0203\u0204"+
		"\7P\2\2\u0204\u0206\5f\64\2\u0205\u0203\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020a\u020c\7\36\2\2\u020b\u0207\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"i\3\2\2\2\u020d\u020e\7L\2\2\u020e\u0210\5h\65\2\u020f\u0211\7M\2\2\u0210"+
		"\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211k\3\2\2\2\u0212\u0219\5\64\33"+
		"\2\u0213\u0219\5\60\31\2\u0214\u0219\5d\63\2\u0215\u0219\5J&\2\u0216\u0219"+
		"\5j\66\2\u0217\u0219\5.\30\2\u0218\u0212\3\2\2\2\u0218\u0213\3\2\2\2\u0218"+
		"\u0214\3\2\2\2\u0218\u0215\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2"+
		"\2\2\u0219m\3\2\2\2\u021a\u021f\5l\67\2\u021b\u021f\5R*\2\u021c\u021f"+
		"\5b\62\2\u021d\u021f\5T+\2\u021e\u021a\3\2\2\2\u021e\u021b\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021fo\3\2\2\2\u0220\u0224\5n8\2\u0221"+
		"\u0224\5@!\2\u0222\u0224\7C\2\2\u0223\u0220\3\2\2\2\u0223\u0221\3\2\2"+
		"\2\u0223\u0222\3\2\2\2\u0224q\3\2\2\2\u0225\u0228\5n8\2\u0226\u0228\5"+
		"> \2\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228s\3\2\2\2\u0229\u022a"+
		"\t\t\2\2\u022au\3\2\2\2\u022b\u0235\5p9\2\u022c\u022e\5t;\2\u022d\u022c"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0232\5p9\2\u0232\u0234\3\2\2\2\u0233\u022d\3\2\2"+
		"\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0239"+
		"\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u022b\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"w\3\2\2\2\u023a\u0244\5r:\2\u023b\u023d\5t;\2\u023c\u023b\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0241\5r:\2\u0241\u0243\3\2\2\2\u0242\u023c\3\2\2\2\u0243\u0246"+
		"\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0248\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0247\u023a\3\2\2\2\u0247\u0248\3\2\2\2\u0248y\3\2\2\2"+
		"\u0249\u024b\7N\2\2\u024a\u024c\5t;\2\u024b\u024a\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0251\5x=\2\u0250\u0252\5t;\2\u0251\u0250\3\2\2\2\u0252\u0253\3\2\2\2"+
		"\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256"+
		"\7O\2\2\u0256{\3\2\2\2\65\u0081\u00dd\u00e8\u00f3\u010f\u0118\u0128\u012f"+
		"\u0139\u013c\u0141\u0147\u0149\u0154\u015f\u0166\u016c\u0182\u0188\u0192"+
		"\u0198\u019c\u01a2\u01a4\u01ad\u01b5\u01c2\u01cb\u01d4\u01dc\u01e2\u01e8"+
		"\u01ee\u01f2\u01f7\u0201\u0207\u020b\u0210\u0218\u021e\u0223\u0227\u022f"+
		"\u0235\u0238\u023e\u0244\u0247\u024d\u0253";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}