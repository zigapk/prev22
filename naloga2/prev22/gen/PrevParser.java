// Generated from /Users/zigapk/University/prev/naloga1/prev22/src/prev/phase/synan/PrevParser.g4 by ANTLR 4.9.2


	package prev.phase.synan;
	
	import java.util.*;
	
	import prev.common.report.*;
	//import prev.data.ast.tree.*;
	//import prev.data.ast.tree.decl.*;
	//import prev.data.ast.tree.expr.*;
	//import prev.data.ast.tree.stmt.*;
	//import prev.data.ast.tree.type.*;
	import prev.phase.lexan.*;
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrevParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KWORD_BOOL=1, KWORD_CHAR=2, KWORD_DEL=3, KWORD_DO=4, KWORD_ELSE=5, KWORD_FUN=6, 
		KWORD_IF=7, KWORD_INT=8, KWORD_NEW=9, KWORD_THEN=10, KWORD_TYP=11, KWORD_VAR=12, 
		KWORD_VOID=13, KWORD_WHERE=14, KWORD_WHILE=15, SYM_LEFT_BRACE=16, SYM_RIGHT_BRACE=17, 
		SYM_LEFT_CURLY_BRACE=18, SYM_RIGHT_CURLY_BRACE=19, SYM_LEFT_BRACKET=20, 
		SYM_RIGHT_BRACKET=21, SYM_DOT=22, SYM_COMMA=23, SYM_COLON=24, SYM_SEMICOLON=25, 
		SYM_AND=26, SYM_OR=27, SYM_NOT=28, SYM_EQU=29, SYM_NEQ=30, SYM_LS=31, 
		SYM_GT=32, SYM_LSE=33, SYM_GTE=34, SYM_MUL=35, SYM_DIV=36, SYM_MOD=37, 
		SYM_PLUS=38, SYM_MINUS=39, SYM_POW=40, SYM_SET=41, CONST_VOID=42, CONST_BOOL=43, 
		CONST_INT=44, CONST_CHAR=45, CONST_STR=46, IDENTIFIER=47, COMMENT=48, 
		WHITE_SPACE=49, ERROR=50;
	public static final int
		RULE_source = 0, RULE_decl = 1, RULE_decl_type = 2, RULE_decl_var = 3, 
		RULE_decl_fun = 4, RULE_decl_fun_args = 5, RULE_decl_fun_arg = 6, RULE_type = 7, 
		RULE_type_atomic = 8, RULE_type_named = 9, RULE_type_array = 10, RULE_type_pointer = 11, 
		RULE_type_record = 12, RULE_type_enclosed = 13, RULE_record_atom = 14, 
		RULE_expr = 15, RULE_expr_const = 16, RULE_expr_var_access = 17, RULE_expr_fun_call = 18, 
		RULE_expr_alloc = 19, RULE_expr_compound = 20, RULE_expr_typecast = 21, 
		RULE_expr_enclosed = 22, RULE_expr_infix_mul = 23, RULE_expr_infix_add = 24, 
		RULE_expr_infix_rel = 25, RULE_expr_infix_and = 26, RULE_expr_infix_or = 27, 
		RULE_expr_prefix = 28, RULE_expr_postfix = 29, RULE_expr_where = 30, RULE_stmt = 31, 
		RULE_stmt_expr = 32, RULE_stmt_assign = 33, RULE_stmt_cond = 34, RULE_stmt_loop = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "decl", "decl_type", "decl_var", "decl_fun", "decl_fun_args", 
			"decl_fun_arg", "type", "type_atomic", "type_named", "type_array", "type_pointer", 
			"type_record", "type_enclosed", "record_atom", "expr", "expr_const", 
			"expr_var_access", "expr_fun_call", "expr_alloc", "expr_compound", "expr_typecast", 
			"expr_enclosed", "expr_infix_mul", "expr_infix_add", "expr_infix_rel", 
			"expr_infix_and", "expr_infix_or", "expr_prefix", "expr_postfix", "expr_where", 
			"stmt", "stmt_expr", "stmt_assign", "stmt_cond", "stmt_loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'char'", "'del'", "'do'", "'else'", "'fun'", "'if'", 
			"'int'", "'new'", "'then'", "'typ'", "'var'", "'void'", "'where'", "'while'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "','", "':'", "';'", 
			"'&'", "'|'", "'!'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'^'", "'='", "'none'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KWORD_BOOL", "KWORD_CHAR", "KWORD_DEL", "KWORD_DO", "KWORD_ELSE", 
			"KWORD_FUN", "KWORD_IF", "KWORD_INT", "KWORD_NEW", "KWORD_THEN", "KWORD_TYP", 
			"KWORD_VAR", "KWORD_VOID", "KWORD_WHERE", "KWORD_WHILE", "SYM_LEFT_BRACE", 
			"SYM_RIGHT_BRACE", "SYM_LEFT_CURLY_BRACE", "SYM_RIGHT_CURLY_BRACE", "SYM_LEFT_BRACKET", 
			"SYM_RIGHT_BRACKET", "SYM_DOT", "SYM_COMMA", "SYM_COLON", "SYM_SEMICOLON", 
			"SYM_AND", "SYM_OR", "SYM_NOT", "SYM_EQU", "SYM_NEQ", "SYM_LS", "SYM_GT", 
			"SYM_LSE", "SYM_GTE", "SYM_MUL", "SYM_DIV", "SYM_MOD", "SYM_PLUS", "SYM_MINUS", 
			"SYM_POW", "SYM_SET", "CONST_VOID", "CONST_BOOL", "CONST_INT", "CONST_CHAR", 
			"CONST_STR", "IDENTIFIER", "COMMENT", "WHITE_SPACE", "ERROR"
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
	public String getGrammarFileName() { return "PrevParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



		private Location loc(Token     tok) { return new Location((prev.data.sym.Token)tok); }
		private Location loc(Locatable loc) { return new Location(loc                 ); }
		private Location loc(Token     tok1, Token     tok2) { return new Location((prev.data.sym.Token)tok1, (prev.data.sym.Token)tok2); }
		private Location loc(Token     tok1, Locatable loc2) { return new Location((prev.data.sym.Token)tok1, loc2); }
		private Location loc(Locatable loc1, Token     tok2) { return new Location(loc1,                      (prev.data.sym.Token)tok2); }
		private Location loc(Locatable loc1, Locatable loc2) { return new Location(loc1,                      loc2); }


	public PrevParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public TerminalNode EOF() { return getToken(PrevParser.EOF, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			decl();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KWORD_FUN) | (1L << KWORD_TYP) | (1L << KWORD_VAR))) != 0)) {
				{
				{
				setState(73);
				decl();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(EOF);
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

	public static class DeclContext extends ParserRuleContext {
		public Decl_typeContext decl_type() {
			return getRuleContext(Decl_typeContext.class,0);
		}
		public Decl_varContext decl_var() {
			return getRuleContext(Decl_varContext.class,0);
		}
		public Decl_funContext decl_fun() {
			return getRuleContext(Decl_funContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KWORD_TYP:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				decl_type();
				}
				break;
			case KWORD_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				decl_var();
				}
				break;
			case KWORD_FUN:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				decl_fun();
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

	public static class Decl_typeContext extends ParserRuleContext {
		public TerminalNode KWORD_TYP() { return getToken(PrevParser.KWORD_TYP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PrevParser.IDENTIFIER, 0); }
		public TerminalNode SYM_SET() { return getToken(PrevParser.SYM_SET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Decl_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterDecl_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitDecl_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitDecl_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_typeContext decl_type() throws RecognitionException {
		Decl_typeContext _localctx = new Decl_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(KWORD_TYP);
			setState(87);
			match(IDENTIFIER);
			setState(88);
			match(SYM_SET);
			setState(89);
			type();
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

	public static class Decl_varContext extends ParserRuleContext {
		public TerminalNode KWORD_VAR() { return getToken(PrevParser.KWORD_VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PrevParser.IDENTIFIER, 0); }
		public TerminalNode SYM_COLON() { return getToken(PrevParser.SYM_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Decl_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterDecl_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitDecl_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitDecl_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_varContext decl_var() throws RecognitionException {
		Decl_varContext _localctx = new Decl_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(KWORD_VAR);
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(SYM_COLON);
			setState(94);
			type();
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

	public static class Decl_funContext extends ParserRuleContext {
		public TerminalNode KWORD_FUN() { return getToken(PrevParser.KWORD_FUN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PrevParser.IDENTIFIER, 0); }
		public TerminalNode SYM_LEFT_BRACE() { return getToken(PrevParser.SYM_LEFT_BRACE, 0); }
		public Decl_fun_argsContext decl_fun_args() {
			return getRuleContext(Decl_fun_argsContext.class,0);
		}
		public TerminalNode SYM_RIGHT_BRACE() { return getToken(PrevParser.SYM_RIGHT_BRACE, 0); }
		public TerminalNode SYM_COLON() { return getToken(PrevParser.SYM_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SYM_SET() { return getToken(PrevParser.SYM_SET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Decl_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterDecl_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitDecl_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitDecl_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_funContext decl_fun() throws RecognitionException {
		Decl_funContext _localctx = new Decl_funContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(KWORD_FUN);
			setState(97);
			match(IDENTIFIER);
			setState(98);
			match(SYM_LEFT_BRACE);
			setState(99);
			decl_fun_args();
			setState(100);
			match(SYM_RIGHT_BRACE);
			setState(101);
			match(SYM_COLON);
			setState(102);
			type();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_SET) {
				{
				setState(103);
				match(SYM_SET);
				setState(104);
				expr(0);
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

	public static class Decl_fun_argsContext extends ParserRuleContext {
		public List<Decl_fun_argContext> decl_fun_arg() {
			return getRuleContexts(Decl_fun_argContext.class);
		}
		public Decl_fun_argContext decl_fun_arg(int i) {
			return getRuleContext(Decl_fun_argContext.class,i);
		}
		public List<TerminalNode> SYM_COMMA() { return getTokens(PrevParser.SYM_COMMA); }
		public TerminalNode SYM_COMMA(int i) {
			return getToken(PrevParser.SYM_COMMA, i);
		}
		public Decl_fun_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_fun_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterDecl_fun_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitDecl_fun_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitDecl_fun_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_fun_argsContext decl_fun_args() throws RecognitionException {
		Decl_fun_argsContext _localctx = new Decl_fun_argsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decl_fun_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(107);
				decl_fun_arg();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(108);
					match(SYM_COMMA);
					setState(109);
					decl_fun_arg();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Decl_fun_argContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PrevParser.IDENTIFIER, 0); }
		public TerminalNode SYM_COLON() { return getToken(PrevParser.SYM_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Decl_fun_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_fun_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterDecl_fun_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitDecl_fun_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitDecl_fun_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_fun_argContext decl_fun_arg() throws RecognitionException {
		Decl_fun_argContext _localctx = new Decl_fun_argContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl_fun_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IDENTIFIER);
			setState(118);
			match(SYM_COLON);
			setState(119);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public Type_atomicContext type_atomic() {
			return getRuleContext(Type_atomicContext.class,0);
		}
		public Type_namedContext type_named() {
			return getRuleContext(Type_namedContext.class,0);
		}
		public Type_arrayContext type_array() {
			return getRuleContext(Type_arrayContext.class,0);
		}
		public Type_pointerContext type_pointer() {
			return getRuleContext(Type_pointerContext.class,0);
		}
		public Type_recordContext type_record() {
			return getRuleContext(Type_recordContext.class,0);
		}
		public Type_enclosedContext type_enclosed() {
			return getRuleContext(Type_enclosedContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KWORD_BOOL:
			case KWORD_CHAR:
			case KWORD_INT:
			case KWORD_VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				type_atomic();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				type_named();
				}
				break;
			case SYM_LEFT_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				type_array();
				}
				break;
			case SYM_POW:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				type_pointer();
				}
				break;
			case SYM_LEFT_CURLY_BRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				type_record();
				}
				break;
			case SYM_LEFT_BRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				type_enclosed();
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

	public static class Type_atomicContext extends ParserRuleContext {
		public TerminalNode KWORD_VOID() { return getToken(PrevParser.KWORD_VOID, 0); }
		public TerminalNode KWORD_CHAR() { return getToken(PrevParser.KWORD_CHAR, 0); }
		public TerminalNode KWORD_INT() { return getToken(PrevParser.KWORD_INT, 0); }
		public TerminalNode KWORD_BOOL() { return getToken(PrevParser.KWORD_BOOL, 0); }
		public Type_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterType_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitType_atomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitType_atomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_atomicContext type_atomic() throws RecognitionException {
		Type_atomicContext _localctx = new Type_atomicContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_atomic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KWORD_BOOL) | (1L << KWORD_CHAR) | (1L << KWORD_INT) | (1L << KWORD_VOID))) != 0)) ) {
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

	public static class Type_namedContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PrevParser.IDENTIFIER, 0); }
		public Type_namedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_named; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterType_named(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitType_named(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitType_named(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_namedContext type_named() throws RecognitionException {
		Type_namedContext _localctx = new Type_namedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_named);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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

	public static class Type_arrayContext extends ParserRuleContext {
		public TerminalNode SYM_LEFT_BRACKET() { return getToken(PrevParser.SYM_LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SYM_RIGHT_BRACKET() { return getToken(PrevParser.SYM_RIGHT_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterType_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitType_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitType_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_arrayContext type_array() throws RecognitionException {
		Type_arrayContext _localctx = new Type_arrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SYM_LEFT_BRACKET);
			setState(134);
			expr(0);
			setState(135);
			match(SYM_RIGHT_BRACKET);
			setState(136);
			type();
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

	public static class Type_pointerContext extends ParserRuleContext {
		public TerminalNode SYM_POW() { return getToken(PrevParser.SYM_POW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterType_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitType_pointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitType_pointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_pointerContext type_pointer() throws RecognitionException {
		Type_pointerContext _localctx = new Type_pointerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(SYM_POW);
			setState(139);
			type();
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

	public static class Type_recordContext extends ParserRuleContext {
		public TerminalNode SYM_LEFT_CURLY_BRACE() { return getToken(PrevParser.SYM_LEFT_CURLY_BRACE, 0); }
		public List<Record_atomContext> record_atom() {
			return getRuleContexts(Record_atomContext.class);
		}
		public Record_atomContext record_atom(int i) {
			return getRuleContext(Record_atomContext.class,i);
		}
		public TerminalNode SYM_RIGHT_CURLY_BRACE() { return getToken(PrevParser.SYM_RIGHT_CURLY_BRACE, 0); }
		public List<TerminalNode> SYM_COMMA() { return getTokens(PrevParser.SYM_COMMA); }
		public TerminalNode SYM_COMMA(int i) {
			return getToken(PrevParser.SYM_COMMA, i);
		}
		public Type_recordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterType_record(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitType_record(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitType_record(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_recordContext type_record() throws RecognitionException {
		Type_recordContext _localctx = new Type_recordContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(SYM_LEFT_CURLY_BRACE);
			setState(142);
			record_atom();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_COMMA) {
				{
				{
				setState(143);
				match(SYM_COMMA);
				setState(144);
				record_atom();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(SYM_RIGHT_CURLY_BRACE);
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

	public static class Type_enclosedContext extends ParserRuleContext {
		public TerminalNode SYM_LEFT_BRACE() { return getToken(PrevParser.SYM_LEFT_BRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SYM_RIGHT_BRACE() { return getToken(PrevParser.SYM_RIGHT_BRACE, 0); }
		public Type_enclosedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_enclosed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterType_enclosed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitType_enclosed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitType_enclosed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_enclosedContext type_enclosed() throws RecognitionException {
		Type_enclosedContext _localctx = new Type_enclosedContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type_enclosed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(SYM_LEFT_BRACE);
			setState(153);
			type();
			setState(154);
			match(SYM_RIGHT_BRACE);
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

	public static class Record_atomContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PrevParser.IDENTIFIER, 0); }
		public TerminalNode SYM_COLON() { return getToken(PrevParser.SYM_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Record_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterRecord_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitRecord_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitRecord_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_atomContext record_atom() throws RecognitionException {
		Record_atomContext _localctx = new Record_atomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_record_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IDENTIFIER);
			setState(157);
			match(SYM_COLON);
			setState(158);
			type();
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
		public Expr_constContext expr_const() {
			return getRuleContext(Expr_constContext.class,0);
		}
		public Expr_var_accessContext expr_var_access() {
			return getRuleContext(Expr_var_accessContext.class,0);
		}
		public Expr_fun_callContext expr_fun_call() {
			return getRuleContext(Expr_fun_callContext.class,0);
		}
		public Expr_allocContext expr_alloc() {
			return getRuleContext(Expr_allocContext.class,0);
		}
		public Expr_compoundContext expr_compound() {
			return getRuleContext(Expr_compoundContext.class,0);
		}
		public Expr_typecastContext expr_typecast() {
			return getRuleContext(Expr_typecastContext.class,0);
		}
		public Expr_enclosedContext expr_enclosed() {
			return getRuleContext(Expr_enclosedContext.class,0);
		}
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_infix_mulContext expr_infix_mul() {
			return getRuleContext(Expr_infix_mulContext.class,0);
		}
		public Expr_infix_addContext expr_infix_add() {
			return getRuleContext(Expr_infix_addContext.class,0);
		}
		public Expr_infix_relContext expr_infix_rel() {
			return getRuleContext(Expr_infix_relContext.class,0);
		}
		public Expr_infix_andContext expr_infix_and() {
			return getRuleContext(Expr_infix_andContext.class,0);
		}
		public Expr_infix_orContext expr_infix_or() {
			return getRuleContext(Expr_infix_orContext.class,0);
		}
		public Expr_postfixContext expr_postfix() {
			return getRuleContext(Expr_postfixContext.class,0);
		}
		public Expr_whereContext expr_where() {
			return getRuleContext(Expr_whereContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(161);
				expr_const();
				}
				break;
			case 2:
				{
				setState(162);
				expr_var_access();
				}
				break;
			case 3:
				{
				setState(163);
				expr_fun_call();
				}
				break;
			case 4:
				{
				setState(164);
				expr_alloc();
				}
				break;
			case 5:
				{
				setState(165);
				expr_compound();
				}
				break;
			case 6:
				{
				setState(166);
				expr_typecast();
				}
				break;
			case 7:
				{
				setState(167);
				expr_enclosed();
				}
				break;
			case 8:
				{
				setState(168);
				expr_prefix();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(172);
						expr_infix_mul();
						setState(173);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(176);
						expr_infix_add();
						setState(177);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(180);
						expr_infix_rel();
						setState(181);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184);
						expr_infix_and();
						setState(185);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						expr_infix_or();
						setState(189);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(192);
						expr_postfix();
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(194);
						expr_where();
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_constContext extends ParserRuleContext {
		public TerminalNode CONST_VOID() { return getToken(PrevParser.CONST_VOID, 0); }
		public TerminalNode CONST_BOOL() { return getToken(PrevParser.CONST_BOOL, 0); }
		public TerminalNode CONST_INT() { return getToken(PrevParser.CONST_INT, 0); }
		public TerminalNode CONST_CHAR() { return getToken(PrevParser.CONST_CHAR, 0); }
		public TerminalNode CONST_STR() { return getToken(PrevParser.CONST_STR, 0); }
		public Expr_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_constContext expr_const() throws RecognitionException {
		Expr_constContext _localctx = new Expr_constContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST_VOID) | (1L << CONST_BOOL) | (1L << CONST_INT) | (1L << CONST_CHAR) | (1L << CONST_STR))) != 0)) ) {
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

	public static class Expr_var_accessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PrevParser.IDENTIFIER, 0); }
		public Expr_var_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_var_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_var_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_var_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_var_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_var_accessContext expr_var_access() throws RecognitionException {
		Expr_var_accessContext _localctx = new Expr_var_accessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_var_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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

	public static class Expr_fun_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PrevParser.IDENTIFIER, 0); }
		public TerminalNode SYM_LEFT_BRACE() { return getToken(PrevParser.SYM_LEFT_BRACE, 0); }
		public TerminalNode SYM_RIGHT_BRACE() { return getToken(PrevParser.SYM_RIGHT_BRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SYM_COMMA() { return getTokens(PrevParser.SYM_COMMA); }
		public TerminalNode SYM_COMMA(int i) {
			return getToken(PrevParser.SYM_COMMA, i);
		}
		public Expr_fun_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_fun_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_fun_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_fun_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_fun_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_fun_callContext expr_fun_call() throws RecognitionException {
		Expr_fun_callContext _localctx = new Expr_fun_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_fun_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IDENTIFIER);
			setState(205);
			match(SYM_LEFT_BRACE);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KWORD_DEL) | (1L << KWORD_NEW) | (1L << SYM_LEFT_BRACE) | (1L << SYM_LEFT_CURLY_BRACE) | (1L << SYM_NOT) | (1L << SYM_PLUS) | (1L << SYM_MINUS) | (1L << SYM_POW) | (1L << CONST_VOID) | (1L << CONST_BOOL) | (1L << CONST_INT) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(206);
				expr(0);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(207);
					match(SYM_COMMA);
					setState(208);
					expr(0);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(216);
			match(SYM_RIGHT_BRACE);
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

	public static class Expr_allocContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KWORD_NEW() { return getToken(PrevParser.KWORD_NEW, 0); }
		public TerminalNode KWORD_DEL() { return getToken(PrevParser.KWORD_DEL, 0); }
		public Expr_allocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_alloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_alloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_alloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_alloc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_allocContext expr_alloc() throws RecognitionException {
		Expr_allocContext _localctx = new Expr_allocContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_alloc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==KWORD_DEL || _la==KWORD_NEW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(219);
			expr(0);
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

	public static class Expr_compoundContext extends ParserRuleContext {
		public TerminalNode SYM_LEFT_CURLY_BRACE() { return getToken(PrevParser.SYM_LEFT_CURLY_BRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SYM_SEMICOLON() { return getTokens(PrevParser.SYM_SEMICOLON); }
		public TerminalNode SYM_SEMICOLON(int i) {
			return getToken(PrevParser.SYM_SEMICOLON, i);
		}
		public TerminalNode SYM_RIGHT_CURLY_BRACE() { return getToken(PrevParser.SYM_RIGHT_CURLY_BRACE, 0); }
		public Expr_compoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_compound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_compound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_compound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_compound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_compoundContext expr_compound() throws RecognitionException {
		Expr_compoundContext _localctx = new Expr_compoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_compound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(SYM_LEFT_CURLY_BRACE);
			setState(222);
			stmt();
			setState(223);
			match(SYM_SEMICOLON);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KWORD_DEL) | (1L << KWORD_IF) | (1L << KWORD_NEW) | (1L << KWORD_WHILE) | (1L << SYM_LEFT_BRACE) | (1L << SYM_LEFT_CURLY_BRACE) | (1L << SYM_NOT) | (1L << SYM_PLUS) | (1L << SYM_MINUS) | (1L << SYM_POW) | (1L << CONST_VOID) | (1L << CONST_BOOL) | (1L << CONST_INT) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(224);
				stmt();
				setState(225);
				match(SYM_SEMICOLON);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(SYM_RIGHT_CURLY_BRACE);
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

	public static class Expr_typecastContext extends ParserRuleContext {
		public TerminalNode SYM_LEFT_BRACE() { return getToken(PrevParser.SYM_LEFT_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SYM_COLON() { return getToken(PrevParser.SYM_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SYM_RIGHT_BRACE() { return getToken(PrevParser.SYM_RIGHT_BRACE, 0); }
		public Expr_typecastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_typecast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_typecast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_typecast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_typecast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_typecastContext expr_typecast() throws RecognitionException {
		Expr_typecastContext _localctx = new Expr_typecastContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_typecast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(SYM_LEFT_BRACE);
			setState(235);
			expr(0);
			setState(236);
			match(SYM_COLON);
			setState(237);
			type();
			setState(238);
			match(SYM_RIGHT_BRACE);
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

	public static class Expr_enclosedContext extends ParserRuleContext {
		public TerminalNode SYM_LEFT_BRACE() { return getToken(PrevParser.SYM_LEFT_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SYM_RIGHT_BRACE() { return getToken(PrevParser.SYM_RIGHT_BRACE, 0); }
		public Expr_enclosedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_enclosed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_enclosed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_enclosed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_enclosed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_enclosedContext expr_enclosed() throws RecognitionException {
		Expr_enclosedContext _localctx = new Expr_enclosedContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_enclosed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(SYM_LEFT_BRACE);
			setState(241);
			expr(0);
			setState(242);
			match(SYM_RIGHT_BRACE);
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

	public static class Expr_infix_mulContext extends ParserRuleContext {
		public TerminalNode SYM_MUL() { return getToken(PrevParser.SYM_MUL, 0); }
		public TerminalNode SYM_DIV() { return getToken(PrevParser.SYM_DIV, 0); }
		public TerminalNode SYM_MOD() { return getToken(PrevParser.SYM_MOD, 0); }
		public Expr_infix_mulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_infix_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_infix_mul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_infix_mul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_infix_mul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_infix_mulContext expr_infix_mul() throws RecognitionException {
		Expr_infix_mulContext _localctx = new Expr_infix_mulContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_infix_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYM_MUL) | (1L << SYM_DIV) | (1L << SYM_MOD))) != 0)) ) {
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

	public static class Expr_infix_addContext extends ParserRuleContext {
		public TerminalNode SYM_PLUS() { return getToken(PrevParser.SYM_PLUS, 0); }
		public TerminalNode SYM_MINUS() { return getToken(PrevParser.SYM_MINUS, 0); }
		public TerminalNode SYM_EQU() { return getToken(PrevParser.SYM_EQU, 0); }
		public TerminalNode SYM_NEQ() { return getToken(PrevParser.SYM_NEQ, 0); }
		public TerminalNode SYM_LS() { return getToken(PrevParser.SYM_LS, 0); }
		public TerminalNode SYM_GT() { return getToken(PrevParser.SYM_GT, 0); }
		public TerminalNode SYM_LSE() { return getToken(PrevParser.SYM_LSE, 0); }
		public TerminalNode SYM_GTE() { return getToken(PrevParser.SYM_GTE, 0); }
		public TerminalNode SYM_AND() { return getToken(PrevParser.SYM_AND, 0); }
		public TerminalNode SYM_OR() { return getToken(PrevParser.SYM_OR, 0); }
		public Expr_infix_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_infix_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_infix_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_infix_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_infix_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_infix_addContext expr_infix_add() throws RecognitionException {
		Expr_infix_addContext _localctx = new Expr_infix_addContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_infix_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYM_AND) | (1L << SYM_OR) | (1L << SYM_EQU) | (1L << SYM_NEQ) | (1L << SYM_LS) | (1L << SYM_GT) | (1L << SYM_LSE) | (1L << SYM_GTE) | (1L << SYM_PLUS) | (1L << SYM_MINUS))) != 0)) ) {
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

	public static class Expr_infix_relContext extends ParserRuleContext {
		public TerminalNode SYM_EQU() { return getToken(PrevParser.SYM_EQU, 0); }
		public TerminalNode SYM_NEQ() { return getToken(PrevParser.SYM_NEQ, 0); }
		public TerminalNode SYM_LS() { return getToken(PrevParser.SYM_LS, 0); }
		public TerminalNode SYM_GT() { return getToken(PrevParser.SYM_GT, 0); }
		public TerminalNode SYM_LSE() { return getToken(PrevParser.SYM_LSE, 0); }
		public TerminalNode SYM_GTE() { return getToken(PrevParser.SYM_GTE, 0); }
		public Expr_infix_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_infix_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_infix_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_infix_rel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_infix_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_infix_relContext expr_infix_rel() throws RecognitionException {
		Expr_infix_relContext _localctx = new Expr_infix_relContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_infix_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYM_EQU) | (1L << SYM_NEQ) | (1L << SYM_LS) | (1L << SYM_GT) | (1L << SYM_LSE) | (1L << SYM_GTE))) != 0)) ) {
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

	public static class Expr_infix_andContext extends ParserRuleContext {
		public TerminalNode SYM_AND() { return getToken(PrevParser.SYM_AND, 0); }
		public Expr_infix_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_infix_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_infix_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_infix_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_infix_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_infix_andContext expr_infix_and() throws RecognitionException {
		Expr_infix_andContext _localctx = new Expr_infix_andContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_infix_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(SYM_AND);
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

	public static class Expr_infix_orContext extends ParserRuleContext {
		public TerminalNode SYM_OR() { return getToken(PrevParser.SYM_OR, 0); }
		public Expr_infix_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_infix_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_infix_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_infix_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_infix_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_infix_orContext expr_infix_or() throws RecognitionException {
		Expr_infix_orContext _localctx = new Expr_infix_orContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_infix_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(SYM_OR);
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

	public static class Expr_prefixContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SYM_NOT() { return getToken(PrevParser.SYM_NOT, 0); }
		public TerminalNode SYM_PLUS() { return getToken(PrevParser.SYM_PLUS, 0); }
		public TerminalNode SYM_MINUS() { return getToken(PrevParser.SYM_MINUS, 0); }
		public TerminalNode SYM_POW() { return getToken(PrevParser.SYM_POW, 0); }
		public Expr_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_prefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_prefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_prefixContext expr_prefix() throws RecognitionException {
		Expr_prefixContext _localctx = new Expr_prefixContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYM_NOT) | (1L << SYM_PLUS) | (1L << SYM_MINUS) | (1L << SYM_POW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(255);
			expr(0);
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

	public static class Expr_postfixContext extends ParserRuleContext {
		public TerminalNode SYM_LEFT_BRACKET() { return getToken(PrevParser.SYM_LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SYM_RIGHT_BRACKET() { return getToken(PrevParser.SYM_RIGHT_BRACKET, 0); }
		public TerminalNode SYM_POW() { return getToken(PrevParser.SYM_POW, 0); }
		public TerminalNode SYM_DOT() { return getToken(PrevParser.SYM_DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PrevParser.IDENTIFIER, 0); }
		public Expr_postfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_postfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_postfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_postfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_postfixContext expr_postfix() throws RecognitionException {
		Expr_postfixContext _localctx = new Expr_postfixContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr_postfix);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYM_LEFT_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(SYM_LEFT_BRACKET);
				setState(258);
				expr(0);
				setState(259);
				match(SYM_RIGHT_BRACKET);
				}
				break;
			case SYM_POW:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(SYM_POW);
				}
				break;
			case SYM_DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(SYM_DOT);
				setState(263);
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

	public static class Expr_whereContext extends ParserRuleContext {
		public TerminalNode KWORD_WHERE() { return getToken(PrevParser.KWORD_WHERE, 0); }
		public TerminalNode SYM_LEFT_CURLY_BRACE() { return getToken(PrevParser.SYM_LEFT_CURLY_BRACE, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public TerminalNode SYM_RIGHT_CURLY_BRACE() { return getToken(PrevParser.SYM_RIGHT_CURLY_BRACE, 0); }
		public Expr_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterExpr_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitExpr_where(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitExpr_where(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_whereContext expr_where() throws RecognitionException {
		Expr_whereContext _localctx = new Expr_whereContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(KWORD_WHERE);
			setState(267);
			match(SYM_LEFT_CURLY_BRACE);
			setState(268);
			decl();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KWORD_FUN) | (1L << KWORD_TYP) | (1L << KWORD_VAR))) != 0)) {
				{
				{
				setState(269);
				decl();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(SYM_RIGHT_CURLY_BRACE);
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

	public static class StmtContext extends ParserRuleContext {
		public Stmt_exprContext stmt_expr() {
			return getRuleContext(Stmt_exprContext.class,0);
		}
		public Stmt_assignContext stmt_assign() {
			return getRuleContext(Stmt_assignContext.class,0);
		}
		public Stmt_condContext stmt_cond() {
			return getRuleContext(Stmt_condContext.class,0);
		}
		public Stmt_loopContext stmt_loop() {
			return getRuleContext(Stmt_loopContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stmt);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				stmt_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				stmt_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				stmt_cond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				stmt_loop();
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

	public static class Stmt_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stmt_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterStmt_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitStmt_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitStmt_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_exprContext stmt_expr() throws RecognitionException {
		Stmt_exprContext _localctx = new Stmt_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_stmt_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			expr(0);
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

	public static class Stmt_assignContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SYM_SET() { return getToken(PrevParser.SYM_SET, 0); }
		public Stmt_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterStmt_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitStmt_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitStmt_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_assignContext stmt_assign() throws RecognitionException {
		Stmt_assignContext _localctx = new Stmt_assignContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stmt_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			expr(0);
			setState(286);
			match(SYM_SET);
			setState(287);
			expr(0);
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

	public static class Stmt_condContext extends ParserRuleContext {
		public TerminalNode KWORD_IF() { return getToken(PrevParser.KWORD_IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KWORD_THEN() { return getToken(PrevParser.KWORD_THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode KWORD_ELSE() { return getToken(PrevParser.KWORD_ELSE, 0); }
		public Stmt_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterStmt_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitStmt_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitStmt_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_condContext stmt_cond() throws RecognitionException {
		Stmt_condContext _localctx = new Stmt_condContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_stmt_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(KWORD_IF);
			setState(290);
			expr(0);
			setState(291);
			match(KWORD_THEN);
			setState(292);
			stmt();
			setState(293);
			match(KWORD_ELSE);
			setState(294);
			stmt();
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

	public static class Stmt_loopContext extends ParserRuleContext {
		public TerminalNode KWORD_WHILE() { return getToken(PrevParser.KWORD_WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KWORD_DO() { return getToken(PrevParser.KWORD_DO, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).enterStmt_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrevParserListener ) ((PrevParserListener)listener).exitStmt_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrevParserVisitor ) return ((PrevParserVisitor<? extends T>)visitor).visitStmt_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_loopContext stmt_loop() throws RecognitionException {
		Stmt_loopContext _localctx = new Stmt_loopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_stmt_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(KWORD_WHILE);
			setState(297);
			expr(0);
			setState(298);
			match(KWORD_DO);
			setState(299);
			stmt();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0130\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\7\7q\n\7\f\7\16\7t\13"+
		"\7\5\7v\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16"+
		"\u0094\n\16\f\16\16\16\u0097\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ac"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00c6\n\21"+
		"\f\21\16\21\u00c9\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u00d4\n\24\f\24\16\24\u00d7\13\24\5\24\u00d9\n\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00e6\n\26\f\26\16\26\u00e9"+
		"\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u010b\n\37\3 \3 \3 \3 \7 \u0111\n \f \16"+
		" \u0114\13 \3 \3 \3!\3!\3!\3!\5!\u011c\n!\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\2\3 &\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\t\5\2\3\4\n\n\17\17\3\2,\60\4\2"+
		"\5\5\13\13\3\2%\'\5\2\34\35\37$()\3\2\37$\4\2\36\36(*\2\u012e\2J\3\2\2"+
		"\2\4V\3\2\2\2\6X\3\2\2\2\b]\3\2\2\2\nb\3\2\2\2\fu\3\2\2\2\16w\3\2\2\2"+
		"\20\u0081\3\2\2\2\22\u0083\3\2\2\2\24\u0085\3\2\2\2\26\u0087\3\2\2\2\30"+
		"\u008c\3\2\2\2\32\u008f\3\2\2\2\34\u009a\3\2\2\2\36\u009e\3\2\2\2 \u00ab"+
		"\3\2\2\2\"\u00ca\3\2\2\2$\u00cc\3\2\2\2&\u00ce\3\2\2\2(\u00dc\3\2\2\2"+
		"*\u00df\3\2\2\2,\u00ec\3\2\2\2.\u00f2\3\2\2\2\60\u00f6\3\2\2\2\62\u00f8"+
		"\3\2\2\2\64\u00fa\3\2\2\2\66\u00fc\3\2\2\28\u00fe\3\2\2\2:\u0100\3\2\2"+
		"\2<\u010a\3\2\2\2>\u010c\3\2\2\2@\u011b\3\2\2\2B\u011d\3\2\2\2D\u011f"+
		"\3\2\2\2F\u0123\3\2\2\2H\u012a\3\2\2\2JN\5\4\3\2KM\5\4\3\2LK\3\2\2\2M"+
		"P\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\2\2\3R\3\3\2\2\2"+
		"SW\5\6\4\2TW\5\b\5\2UW\5\n\6\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\5\3\2\2"+
		"\2XY\7\r\2\2YZ\7\61\2\2Z[\7+\2\2[\\\5\20\t\2\\\7\3\2\2\2]^\7\16\2\2^_"+
		"\7\61\2\2_`\7\32\2\2`a\5\20\t\2a\t\3\2\2\2bc\7\b\2\2cd\7\61\2\2de\7\22"+
		"\2\2ef\5\f\7\2fg\7\23\2\2gh\7\32\2\2hk\5\20\t\2ij\7+\2\2jl\5 \21\2ki\3"+
		"\2\2\2kl\3\2\2\2l\13\3\2\2\2mr\5\16\b\2no\7\31\2\2oq\5\16\b\2pn\3\2\2"+
		"\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2um\3\2\2\2uv\3\2\2"+
		"\2v\r\3\2\2\2wx\7\61\2\2xy\7\32\2\2yz\5\20\t\2z\17\3\2\2\2{\u0082\5\22"+
		"\n\2|\u0082\5\24\13\2}\u0082\5\26\f\2~\u0082\5\30\r\2\177\u0082\5\32\16"+
		"\2\u0080\u0082\5\34\17\2\u0081{\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2"+
		"\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\21\3\2\2\2"+
		"\u0083\u0084\t\2\2\2\u0084\23\3\2\2\2\u0085\u0086\7\61\2\2\u0086\25\3"+
		"\2\2\2\u0087\u0088\7\26\2\2\u0088\u0089\5 \21\2\u0089\u008a\7\27\2\2\u008a"+
		"\u008b\5\20\t\2\u008b\27\3\2\2\2\u008c\u008d\7*\2\2\u008d\u008e\5\20\t"+
		"\2\u008e\31\3\2\2\2\u008f\u0090\7\24\2\2\u0090\u0095\5\36\20\2\u0091\u0092"+
		"\7\31\2\2\u0092\u0094\5\36\20\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\7\25\2\2\u0099\33\3\2\2\2\u009a\u009b\7\22\2\2\u009b"+
		"\u009c\5\20\t\2\u009c\u009d\7\23\2\2\u009d\35\3\2\2\2\u009e\u009f\7\61"+
		"\2\2\u009f\u00a0\7\32\2\2\u00a0\u00a1\5\20\t\2\u00a1\37\3\2\2\2\u00a2"+
		"\u00a3\b\21\1\2\u00a3\u00ac\5\"\22\2\u00a4\u00ac\5$\23\2\u00a5\u00ac\5"+
		"&\24\2\u00a6\u00ac\5(\25\2\u00a7\u00ac\5*\26\2\u00a8\u00ac\5,\27\2\u00a9"+
		"\u00ac\5.\30\2\u00aa\u00ac\5:\36\2\u00ab\u00a2\3\2\2\2\u00ab\u00a4\3\2"+
		"\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00c7\3\2"+
		"\2\2\u00ad\u00ae\f\b\2\2\u00ae\u00af\5\60\31\2\u00af\u00b0\5 \21\t\u00b0"+
		"\u00c6\3\2\2\2\u00b1\u00b2\f\7\2\2\u00b2\u00b3\5\62\32\2\u00b3\u00b4\5"+
		" \21\b\u00b4\u00c6\3\2\2\2\u00b5\u00b6\f\6\2\2\u00b6\u00b7\5\64\33\2\u00b7"+
		"\u00b8\5 \21\7\u00b8\u00c6\3\2\2\2\u00b9\u00ba\f\5\2\2\u00ba\u00bb\5\66"+
		"\34\2\u00bb\u00bc\5 \21\6\u00bc\u00c6\3\2\2\2\u00bd\u00be\f\4\2\2\u00be"+
		"\u00bf\58\35\2\u00bf\u00c0\5 \21\5\u00c0\u00c6\3\2\2\2\u00c1\u00c2\f\n"+
		"\2\2\u00c2\u00c6\5<\37\2\u00c3\u00c4\f\3\2\2\u00c4\u00c6\5> \2\u00c5\u00ad"+
		"\3\2\2\2\u00c5\u00b1\3\2\2\2\u00c5\u00b5\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5"+
		"\u00bd\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8!\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cb\t\3\2\2\u00cb#\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd"+
		"%\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00d8\7\22\2\2\u00d0\u00d5\5 \21"+
		"\2\u00d1\u00d2\7\31\2\2\u00d2\u00d4\5 \21\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\7\23\2\2\u00db\'\3\2\2\2\u00dc\u00dd\t\4\2"+
		"\2\u00dd\u00de\5 \21\2\u00de)\3\2\2\2\u00df\u00e0\7\24\2\2\u00e0\u00e1"+
		"\5@!\2\u00e1\u00e7\7\33\2\2\u00e2\u00e3\5@!\2\u00e3\u00e4\7\33\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\7\25\2\2\u00eb+\3\2\2\2\u00ec\u00ed\7\22\2\2\u00ed\u00ee\5 \21"+
		"\2\u00ee\u00ef\7\32\2\2\u00ef\u00f0\5\20\t\2\u00f0\u00f1\7\23\2\2\u00f1"+
		"-\3\2\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00f4\5 \21\2\u00f4\u00f5\7\23\2"+
		"\2\u00f5/\3\2\2\2\u00f6\u00f7\t\5\2\2\u00f7\61\3\2\2\2\u00f8\u00f9\t\6"+
		"\2\2\u00f9\63\3\2\2\2\u00fa\u00fb\t\7\2\2\u00fb\65\3\2\2\2\u00fc\u00fd"+
		"\7\34\2\2\u00fd\67\3\2\2\2\u00fe\u00ff\7\35\2\2\u00ff9\3\2\2\2\u0100\u0101"+
		"\t\b\2\2\u0101\u0102\5 \21\2\u0102;\3\2\2\2\u0103\u0104\7\26\2\2\u0104"+
		"\u0105\5 \21\2\u0105\u0106\7\27\2\2\u0106\u010b\3\2\2\2\u0107\u010b\7"+
		"*\2\2\u0108\u0109\7\30\2\2\u0109\u010b\7\61\2\2\u010a\u0103\3\2\2\2\u010a"+
		"\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010b=\3\2\2\2\u010c\u010d\7\20\2\2"+
		"\u010d\u010e\7\24\2\2\u010e\u0112\5\4\3\2\u010f\u0111\5\4\3\2\u0110\u010f"+
		"\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\25\2\2\u0116?\3\2\2\2"+
		"\u0117\u011c\5B\"\2\u0118\u011c\5D#\2\u0119\u011c\5F$\2\u011a\u011c\5"+
		"H%\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011cA\3\2\2\2\u011d\u011e\5 \21\2\u011eC\3\2\2\2\u011f"+
		"\u0120\5 \21\2\u0120\u0121\7+\2\2\u0121\u0122\5 \21\2\u0122E\3\2\2\2\u0123"+
		"\u0124\7\t\2\2\u0124\u0125\5 \21\2\u0125\u0126\7\f\2\2\u0126\u0127\5@"+
		"!\2\u0127\u0128\7\7\2\2\u0128\u0129\5@!\2\u0129G\3\2\2\2\u012a\u012b\7"+
		"\21\2\2\u012b\u012c\5 \21\2\u012c\u012d\7\6\2\2\u012d\u012e\5@!\2\u012e"+
		"I\3\2\2\2\22NVkru\u0081\u0095\u00ab\u00c5\u00c7\u00d5\u00d8\u00e7\u010a"+
		"\u0112\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}