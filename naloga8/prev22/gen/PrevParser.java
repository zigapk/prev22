// Generated from /Users/zigapk/Desktop/prev22 2/src/prev/phase/synan/PrevParser.g4 by ANTLR 4.9.2


	package prev.phase.synan;
	
	import java.util.*;
	
	import prev.common.report.*;
	import prev.data.ast.tree.*;
	import prev.data.ast.tree.decl.*;
	import prev.data.ast.tree.expr.*;
	import prev.data.ast.tree.stmt.*;
	import prev.data.ast.tree.type.*;
	

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
		CONST_INT=44, INT_ZERO_PADDING_ERR=45, CONST_CHAR=46, CHAR_ERROR_ODD=47, 
		CONST_STR=48, IDENTIFIER=49, IDENTIFIER_ERR=50, COMMENT=51, TAB=52, WHITE_SPACE=53, 
		ERROR=54;
	public static final int
		RULE_source = 0, RULE_decl = 1, RULE_decl_type = 2, RULE_decl_var = 3, 
		RULE_decl_fun = 4, RULE_type = 5, RULE_type_atomic = 6, RULE_type_named = 7, 
		RULE_type_array = 8, RULE_type_pointer = 9, RULE_type_record = 10, RULE_type_enclosed = 11, 
		RULE_expr = 12, RULE_expr_const = 13, RULE_expr_var_access = 14, RULE_expr_fun_call = 15, 
		RULE_expr_alloc = 16, RULE_expr_compound = 17, RULE_expr_typecast = 18, 
		RULE_expr_enclosed = 19, RULE_expr_infix_mul = 20, RULE_expr_infix_add = 21, 
		RULE_expr_infix_rel = 22, RULE_expr_infix_and = 23, RULE_expr_infix_or = 24, 
		RULE_expr_prefix = 25, RULE_stmt = 26, RULE_stmt_expr = 27, RULE_stmt_assign = 28, 
		RULE_stmt_cond = 29, RULE_stmt_loop = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "decl", "decl_type", "decl_var", "decl_fun", "type", "type_atomic", 
			"type_named", "type_array", "type_pointer", "type_record", "type_enclosed", 
			"expr", "expr_const", "expr_var_access", "expr_fun_call", "expr_alloc", 
			"expr_compound", "expr_typecast", "expr_enclosed", "expr_infix_mul", 
			"expr_infix_add", "expr_infix_rel", "expr_infix_and", "expr_infix_or", 
			"expr_prefix", "stmt", "stmt_expr", "stmt_assign", "stmt_cond", "stmt_loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'char'", "'del'", "'do'", "'else'", "'fun'", "'if'", 
			"'int'", "'new'", "'then'", "'typ'", "'var'", "'void'", "'where'", "'while'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "','", "':'", "';'", 
			"'&'", "'|'", "'!'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'^'", "'='"
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
			"SYM_POW", "SYM_SET", "CONST_VOID", "CONST_BOOL", "CONST_INT", "INT_ZERO_PADDING_ERR", 
			"CONST_CHAR", "CHAR_ERROR_ODD", "CONST_STR", "IDENTIFIER", "IDENTIFIER_ERR", 
			"COMMENT", "TAB", "WHITE_SPACE", "ERROR"
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



		private Location loc(Token tok) { return new Location((prev.data.sym.Token) tok); }
	    private Location loc(Locatable loc) { return new Location(loc); }
	    private Location loc(Token tok1, Token tok2) { return new Location((prev.data.sym.Token) tok1, (prev.data.sym.Token) tok2); }
	    private Location loc(Token tok1, Locatable loc2) { return new Location((prev.data.sym.Token) tok1, loc2); }
	    private Location loc(Locatable loc1, Token tok2) { return new Location(loc1, (prev.data.sym.Token) tok2); }
	    private Location loc(Locatable loc1, Locatable loc2) { return new Location(loc1, loc2); }


	public PrevParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceContext extends ParserRuleContext {
		public AstTrees<AstDecl> ast;
		public DeclContext decl;
		public TerminalNode EOF() { return getToken(PrevParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
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
			 Vector<AstDecl> res = new Vector<AstDecl>(); 
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				((SourceContext)_localctx).decl = decl();
				 res.add(((SourceContext)_localctx).decl.ast); 
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KWORD_FUN) | (1L << KWORD_TYP) | (1L << KWORD_VAR))) != 0) );
			 ((SourceContext)_localctx).ast =  new AstTrees<AstDecl>(res);
			setState(71);
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
		public AstDecl ast;
		public Decl_typeContext decl_type;
		public Decl_varContext decl_var;
		public Decl_funContext decl_fun;
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KWORD_TYP:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((DeclContext)_localctx).decl_type = decl_type();
				 ((DeclContext)_localctx).ast =  ((DeclContext)_localctx).decl_type.ast; 
				}
				break;
			case KWORD_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				((DeclContext)_localctx).decl_var = decl_var();
				 ((DeclContext)_localctx).ast =  ((DeclContext)_localctx).decl_var.ast; 
				}
				break;
			case KWORD_FUN:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				((DeclContext)_localctx).decl_fun = decl_fun();
				 ((DeclContext)_localctx).ast =  ((DeclContext)_localctx).decl_fun.ast; 
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
		public AstDecl ast;
		public Token KWORD_TYP;
		public Token IDENTIFIER;
		public TypeContext type;
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
			setState(84);
			((Decl_typeContext)_localctx).KWORD_TYP = match(KWORD_TYP);
			setState(85);
			((Decl_typeContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(86);
			match(SYM_SET);
			setState(87);
			((Decl_typeContext)_localctx).type = type();
			 ((Decl_typeContext)_localctx).ast =  new AstTypeDecl(loc(((Decl_typeContext)_localctx).KWORD_TYP, ((Decl_typeContext)_localctx).type.ast), (((Decl_typeContext)_localctx).IDENTIFIER!=null?((Decl_typeContext)_localctx).IDENTIFIER.getText():null), ((Decl_typeContext)_localctx).type.ast); 
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
		public AstDecl ast;
		public Token KWORD_VAR;
		public Token IDENTIFIER;
		public TypeContext type;
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
			setState(90);
			((Decl_varContext)_localctx).KWORD_VAR = match(KWORD_VAR);
			setState(91);
			((Decl_varContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(92);
			match(SYM_COLON);
			setState(93);
			((Decl_varContext)_localctx).type = type();
			 ((Decl_varContext)_localctx).ast =  new AstVarDecl(loc(((Decl_varContext)_localctx).KWORD_VAR, ((Decl_varContext)_localctx).type.ast), (((Decl_varContext)_localctx).IDENTIFIER!=null?((Decl_varContext)_localctx).IDENTIFIER.getText():null), ((Decl_varContext)_localctx).type.ast); 
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
		public AstDecl ast;
		public Token KWORD_FUN;
		public Token IDENTIFIER;
		public TypeContext type;
		public ExprContext expr;
		public TerminalNode KWORD_FUN() { return getToken(PrevParser.KWORD_FUN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PrevParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PrevParser.IDENTIFIER, i);
		}
		public TerminalNode SYM_LEFT_BRACE() { return getToken(PrevParser.SYM_LEFT_BRACE, 0); }
		public TerminalNode SYM_RIGHT_BRACE() { return getToken(PrevParser.SYM_RIGHT_BRACE, 0); }
		public List<TerminalNode> SYM_COLON() { return getTokens(PrevParser.SYM_COLON); }
		public TerminalNode SYM_COLON(int i) {
			return getToken(PrevParser.SYM_COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode SYM_SET() { return getToken(PrevParser.SYM_SET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SYM_COMMA() { return getTokens(PrevParser.SYM_COMMA); }
		public TerminalNode SYM_COMMA(int i) {
			return getToken(PrevParser.SYM_COMMA, i);
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
			((Decl_funContext)_localctx).KWORD_FUN = match(KWORD_FUN);
			setState(97);
			((Decl_funContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 Vector<AstParDecl> args = new Vector<AstParDecl>(); 
			 String name = (((Decl_funContext)_localctx).IDENTIFIER!=null?((Decl_funContext)_localctx).IDENTIFIER.getText():null); 
			setState(100);
			match(SYM_LEFT_BRACE);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				{
				setState(101);
				((Decl_funContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(102);
				match(SYM_COLON);
				setState(103);
				((Decl_funContext)_localctx).type = type();
				}
				 args.add(new AstParDecl(loc(((Decl_funContext)_localctx).IDENTIFIER, ((Decl_funContext)_localctx).type.ast), (((Decl_funContext)_localctx).IDENTIFIER!=null?((Decl_funContext)_localctx).IDENTIFIER.getText():null), ((Decl_funContext)_localctx).type.ast)); 
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(106);
					match(SYM_COMMA);
					{
					setState(107);
					((Decl_funContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					setState(108);
					match(SYM_COLON);
					setState(109);
					((Decl_funContext)_localctx).type = type();
					}
					 args.add(new AstParDecl(loc(((Decl_funContext)_localctx).IDENTIFIER, ((Decl_funContext)_localctx).type.ast), (((Decl_funContext)_localctx).IDENTIFIER!=null?((Decl_funContext)_localctx).IDENTIFIER.getText():null), ((Decl_funContext)_localctx).type.ast)); 
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(120);
			match(SYM_RIGHT_BRACE);
			setState(121);
			match(SYM_COLON);
			setState(122);
			((Decl_funContext)_localctx).type = type();
			 Location l = loc(((Decl_funContext)_localctx).KWORD_FUN, ((Decl_funContext)_localctx).type.ast); AstExpr astExpr = null; 
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_SET) {
				{
				setState(124);
				match(SYM_SET);
				setState(125);
				((Decl_funContext)_localctx).expr = expr(0);
				 l = loc(((Decl_funContext)_localctx).KWORD_FUN, ((Decl_funContext)_localctx).expr.ast); 
				 astExpr = ((Decl_funContext)_localctx).expr.ast; 
				}
			}

			 ((Decl_funContext)_localctx).ast =  new AstFunDecl(l, name, new AstTrees<AstParDecl>(args), ((Decl_funContext)_localctx).type.ast, astExpr); 
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
		public AstType ast;
		public Type_atomicContext type_atomic;
		public Type_namedContext type_named;
		public Type_arrayContext type_array;
		public Type_pointerContext type_pointer;
		public Type_recordContext type_record;
		public Type_enclosedContext type_enclosed;
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
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KWORD_BOOL:
			case KWORD_CHAR:
			case KWORD_INT:
			case KWORD_VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((TypeContext)_localctx).type_atomic = type_atomic();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).type_atomic.ast; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((TypeContext)_localctx).type_named = type_named();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).type_named.ast; 
				}
				break;
			case SYM_LEFT_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				((TypeContext)_localctx).type_array = type_array();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).type_array.ast; 
				}
				break;
			case SYM_POW:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				((TypeContext)_localctx).type_pointer = type_pointer();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).type_pointer.ast; 
				}
				break;
			case SYM_LEFT_CURLY_BRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				((TypeContext)_localctx).type_record = type_record();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).type_record.ast; 
				}
				break;
			case SYM_LEFT_BRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				((TypeContext)_localctx).type_enclosed = type_enclosed();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).type_enclosed.ast; 
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
		public AstType ast;
		public Token KWORD_VOID;
		public Token KWORD_CHAR;
		public Token KWORD_INT;
		public Token KWORD_BOOL;
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
		enterRule(_localctx, 12, RULE_type_atomic);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KWORD_VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((Type_atomicContext)_localctx).KWORD_VOID = match(KWORD_VOID);
				 ((Type_atomicContext)_localctx).ast =  new AstAtomType(loc(((Type_atomicContext)_localctx).KWORD_VOID), AstAtomType.Type.VOID); 
				}
				break;
			case KWORD_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((Type_atomicContext)_localctx).KWORD_CHAR = match(KWORD_CHAR);
				 ((Type_atomicContext)_localctx).ast =  new AstAtomType(loc(((Type_atomicContext)_localctx).KWORD_CHAR), AstAtomType.Type.CHAR); 
				}
				break;
			case KWORD_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				((Type_atomicContext)_localctx).KWORD_INT = match(KWORD_INT);
				 ((Type_atomicContext)_localctx).ast =  new AstAtomType(loc(((Type_atomicContext)_localctx).KWORD_INT), AstAtomType.Type.INT); 
				}
				break;
			case KWORD_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				((Type_atomicContext)_localctx).KWORD_BOOL = match(KWORD_BOOL);
				 ((Type_atomicContext)_localctx).ast =  new AstAtomType(loc(((Type_atomicContext)_localctx).KWORD_BOOL), AstAtomType.Type.BOOL); 
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

	public static class Type_namedContext extends ParserRuleContext {
		public AstType ast;
		public Token IDENTIFIER;
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
		enterRule(_localctx, 14, RULE_type_named);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((Type_namedContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 ((Type_namedContext)_localctx).ast =  new AstNameType(loc(((Type_namedContext)_localctx).IDENTIFIER), (((Type_namedContext)_localctx).IDENTIFIER!=null?((Type_namedContext)_localctx).IDENTIFIER.getText():null)); 
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
		public AstType ast;
		public Token SYM_LEFT_BRACKET;
		public ExprContext expr;
		public TypeContext type;
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
		enterRule(_localctx, 16, RULE_type_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((Type_arrayContext)_localctx).SYM_LEFT_BRACKET = match(SYM_LEFT_BRACKET);
			setState(167);
			((Type_arrayContext)_localctx).expr = expr(0);
			setState(168);
			match(SYM_RIGHT_BRACKET);
			setState(169);
			((Type_arrayContext)_localctx).type = type();
			 ((Type_arrayContext)_localctx).ast =  new AstArrType(loc(((Type_arrayContext)_localctx).SYM_LEFT_BRACKET, ((Type_arrayContext)_localctx).type.ast), ((Type_arrayContext)_localctx).type.ast, ((Type_arrayContext)_localctx).expr.ast); 
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
		public AstType ast;
		public Token SYM_POW;
		public TypeContext type;
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
		enterRule(_localctx, 18, RULE_type_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((Type_pointerContext)_localctx).SYM_POW = match(SYM_POW);
			setState(173);
			((Type_pointerContext)_localctx).type = type();
			 ((Type_pointerContext)_localctx).ast =  new AstPtrType(loc(((Type_pointerContext)_localctx).SYM_POW, ((Type_pointerContext)_localctx).type.ast), ((Type_pointerContext)_localctx).type.ast); 
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
		public AstType ast;
		public Token SYM_LEFT_CURLY_BRACE;
		public Token IDENTIFIER;
		public TypeContext type;
		public Token SYM_RIGHT_CURLY_BRACE;
		public TerminalNode SYM_LEFT_CURLY_BRACE() { return getToken(PrevParser.SYM_LEFT_CURLY_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PrevParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PrevParser.IDENTIFIER, i);
		}
		public List<TerminalNode> SYM_COLON() { return getTokens(PrevParser.SYM_COLON); }
		public TerminalNode SYM_COLON(int i) {
			return getToken(PrevParser.SYM_COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
		enterRule(_localctx, 20, RULE_type_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((Type_recordContext)_localctx).SYM_LEFT_CURLY_BRACE = match(SYM_LEFT_CURLY_BRACE);
			 Vector<AstCompDecl> d = new Vector<AstCompDecl>(); 
			setState(178);
			((Type_recordContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(179);
			match(SYM_COLON);
			setState(180);
			((Type_recordContext)_localctx).type = type();

			 d.add(new AstCompDecl(loc(((Type_recordContext)_localctx).IDENTIFIER, ((Type_recordContext)_localctx).type.ast), (((Type_recordContext)_localctx).IDENTIFIER!=null?((Type_recordContext)_localctx).IDENTIFIER.getText():null), ((Type_recordContext)_localctx).type.ast)); 
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_COMMA) {
				{
				{
				setState(183);
				match(SYM_COMMA);
				setState(184);
				((Type_recordContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(185);
				match(SYM_COLON);
				setState(186);
				((Type_recordContext)_localctx).type = type();
				d.add(new AstCompDecl(loc(((Type_recordContext)_localctx).IDENTIFIER, ((Type_recordContext)_localctx).type.ast), (((Type_recordContext)_localctx).IDENTIFIER!=null?((Type_recordContext)_localctx).IDENTIFIER.getText():null), ((Type_recordContext)_localctx).type.ast)); 
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			((Type_recordContext)_localctx).SYM_RIGHT_CURLY_BRACE = match(SYM_RIGHT_CURLY_BRACE);
			 ((Type_recordContext)_localctx).ast =  new AstRecType(loc(((Type_recordContext)_localctx).SYM_LEFT_CURLY_BRACE, ((Type_recordContext)_localctx).SYM_RIGHT_CURLY_BRACE), new AstTrees<AstCompDecl>(d)); 
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
		public AstType ast;
		public Token SYM_LEFT_BRACE;
		public TypeContext type;
		public Token SYM_RIGHT_BRACE;
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
		enterRule(_localctx, 22, RULE_type_enclosed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			((Type_enclosedContext)_localctx).SYM_LEFT_BRACE = match(SYM_LEFT_BRACE);
			setState(198);
			((Type_enclosedContext)_localctx).type = type();
			setState(199);
			((Type_enclosedContext)_localctx).SYM_RIGHT_BRACE = match(SYM_RIGHT_BRACE);
			 ((Type_enclosedContext)_localctx).ast =  ((Type_enclosedContext)_localctx).type.ast; 
			 _localctx.ast.relocate(loc(((Type_enclosedContext)_localctx).SYM_LEFT_BRACE, ((Type_enclosedContext)_localctx).SYM_RIGHT_BRACE)); 
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
		public AstExpr ast;
		public ExprContext ex1;
		public ExprContext e;
		public ExprContext e1;
		public Expr_constContext expr_const;
		public Expr_var_accessContext expr_var_access;
		public Expr_fun_callContext expr_fun_call;
		public Expr_allocContext expr_alloc;
		public Expr_compoundContext expr_compound;
		public Expr_typecastContext expr_typecast;
		public Expr_enclosedContext expr_enclosed;
		public Expr_prefixContext expr_prefix;
		public Expr_infix_mulContext expr_infix_mul;
		public ExprContext ex2;
		public Expr_infix_addContext expr_infix_add;
		public Expr_infix_relContext expr_infix_rel;
		public ExprContext e2;
		public Token SYM_RIGHT_BRACKET;
		public Token SYM_POW;
		public Token IDENTIFIER;
		public DeclContext decl;
		public Token SYM_RIGHT_CURLY_BRACE;
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
		public Expr_infix_mulContext expr_infix_mul() {
			return getRuleContext(Expr_infix_mulContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public TerminalNode SYM_LEFT_BRACKET() { return getToken(PrevParser.SYM_LEFT_BRACKET, 0); }
		public TerminalNode SYM_RIGHT_BRACKET() { return getToken(PrevParser.SYM_RIGHT_BRACKET, 0); }
		public TerminalNode SYM_POW() { return getToken(PrevParser.SYM_POW, 0); }
		public TerminalNode SYM_DOT() { return getToken(PrevParser.SYM_DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PrevParser.IDENTIFIER, 0); }
		public TerminalNode KWORD_WHERE() { return getToken(PrevParser.KWORD_WHERE, 0); }
		public TerminalNode SYM_LEFT_CURLY_BRACE() { return getToken(PrevParser.SYM_LEFT_CURLY_BRACE, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public TerminalNode SYM_RIGHT_CURLY_BRACE() { return getToken(PrevParser.SYM_RIGHT_CURLY_BRACE, 0); }
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(204);
				((ExprContext)_localctx).expr_const = expr_const();
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr_const.ast; 
				}
				break;
			case 2:
				{
				setState(207);
				((ExprContext)_localctx).expr_var_access = expr_var_access();
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr_var_access.ast; 
				}
				break;
			case 3:
				{
				setState(210);
				((ExprContext)_localctx).expr_fun_call = expr_fun_call();
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr_fun_call.ast; 
				}
				break;
			case 4:
				{
				setState(213);
				((ExprContext)_localctx).expr_alloc = expr_alloc();
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr_alloc.ast; 
				}
				break;
			case 5:
				{
				setState(216);
				((ExprContext)_localctx).expr_compound = expr_compound();
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr_compound.ast; 
				}
				break;
			case 6:
				{
				setState(219);
				((ExprContext)_localctx).expr_typecast = expr_typecast();
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr_typecast.ast; 
				}
				break;
			case 7:
				{
				setState(222);
				((ExprContext)_localctx).expr_enclosed = expr_enclosed();
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr_enclosed.ast; 
				}
				break;
			case 8:
				{
				setState(225);
				((ExprContext)_localctx).expr_prefix = expr_prefix();
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr_prefix.ast; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(231);
						((ExprContext)_localctx).expr_infix_mul = expr_infix_mul();
						setState(232);
						((ExprContext)_localctx).ex2 = expr(7);
						 ((ExprContext)_localctx).ast =  new AstBinExpr(loc(((ExprContext)_localctx).ex1.ast, ((ExprContext)_localctx).ex2.ast), ((ExprContext)_localctx).expr_infix_mul.o, ((ExprContext)_localctx).ex1.ast, ((ExprContext)_localctx).ex2.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(236);
						((ExprContext)_localctx).expr_infix_add = expr_infix_add();
						setState(237);
						((ExprContext)_localctx).ex2 = expr(6);
						 ((ExprContext)_localctx).ast =  new AstBinExpr(loc(((ExprContext)_localctx).ex1.ast, ((ExprContext)_localctx).ex2.ast), ((ExprContext)_localctx).expr_infix_add.o, ((ExprContext)_localctx).ex1.ast, ((ExprContext)_localctx).ex2.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(241);
						((ExprContext)_localctx).expr_infix_rel = expr_infix_rel();
						setState(242);
						((ExprContext)_localctx).ex2 = expr(5);
						 ((ExprContext)_localctx).ast =  new AstBinExpr(loc(((ExprContext)_localctx).ex1.ast, ((ExprContext)_localctx).ex2.ast), ((ExprContext)_localctx).expr_infix_rel.o, ((ExprContext)_localctx).ex1.ast, ((ExprContext)_localctx).ex2.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(246);
						expr_infix_and();
						setState(247);
						((ExprContext)_localctx).e2 = expr(4);
						 ((ExprContext)_localctx).ast =  new AstBinExpr(loc(((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast), AstBinExpr.Oper.AND, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(251);
						expr_infix_or();
						setState(252);
						((ExprContext)_localctx).e2 = expr(3);
						 ((ExprContext)_localctx).ast =  new AstBinExpr(loc(((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast), AstBinExpr.Oper.OR, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(256);
						match(SYM_LEFT_BRACKET);
						setState(257);
						((ExprContext)_localctx).ex2 = expr(0);
						setState(258);
						((ExprContext)_localctx).SYM_RIGHT_BRACKET = match(SYM_RIGHT_BRACKET);
						 ((ExprContext)_localctx).ast =  new AstArrExpr(loc(((ExprContext)_localctx).ex1.ast, ((ExprContext)_localctx).SYM_RIGHT_BRACKET), ((ExprContext)_localctx).ex1.ast, ((ExprContext)_localctx).ex2.ast); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(262);
						((ExprContext)_localctx).SYM_POW = match(SYM_POW);
						 ((ExprContext)_localctx).ast =  new AstSfxExpr(loc(((ExprContext)_localctx).e.ast, ((ExprContext)_localctx).SYM_POW), AstSfxExpr.Oper.PTR, ((ExprContext)_localctx).e.ast); 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(265);
						match(SYM_DOT);
						setState(266);
						((ExprContext)_localctx).IDENTIFIER = match(IDENTIFIER);
						 ((ExprContext)_localctx).ast =  new AstRecExpr(loc(((ExprContext)_localctx).e.ast, ((ExprContext)_localctx).IDENTIFIER), ((ExprContext)_localctx).e.ast, new AstNameExpr(loc(((ExprContext)_localctx).IDENTIFIER), (((ExprContext)_localctx).IDENTIFIER!=null?((ExprContext)_localctx).IDENTIFIER.getText():null))); 
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(269);
						match(KWORD_WHERE);
						setState(270);
						match(SYM_LEFT_CURLY_BRACE);
						 Vector<AstDecl> d = new Vector<AstDecl>(); 
						setState(272);
						((ExprContext)_localctx).decl = decl();
						 d.add(((ExprContext)_localctx).decl.ast); 
						setState(279);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KWORD_FUN) | (1L << KWORD_TYP) | (1L << KWORD_VAR))) != 0)) {
							{
							{
							setState(274);
							((ExprContext)_localctx).decl = decl();
							 d.add(((ExprContext)_localctx).decl.ast); 
							}
							}
							setState(281);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(282);
						((ExprContext)_localctx).SYM_RIGHT_CURLY_BRACE = match(SYM_RIGHT_CURLY_BRACE);
						 ((ExprContext)_localctx).ast =  new AstWhereExpr(loc(((ExprContext)_localctx).e.ast, ((ExprContext)_localctx).SYM_RIGHT_CURLY_BRACE), ((ExprContext)_localctx).e.ast, new AstTrees<AstDecl>(d)); 
						}
						break;
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public AstExpr ast;
		public Token c;
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
		enterRule(_localctx, 26, RULE_expr_const);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				((Expr_constContext)_localctx).c = match(CONST_VOID);
				 ((Expr_constContext)_localctx).ast =  new AstAtomExpr(loc(((Expr_constContext)_localctx).c), AstAtomExpr.Type.POINTER, ((Expr_constContext)_localctx).c.getText()); 
				}
				break;
			case CONST_BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				((Expr_constContext)_localctx).c = match(CONST_BOOL);
				 ((Expr_constContext)_localctx).ast =  new AstAtomExpr(loc(((Expr_constContext)_localctx).c), AstAtomExpr.Type.BOOL, ((Expr_constContext)_localctx).c.getText()); 
				}
				break;
			case CONST_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				((Expr_constContext)_localctx).c = match(CONST_INT);
				 ((Expr_constContext)_localctx).ast =  new AstAtomExpr(loc(((Expr_constContext)_localctx).c), AstAtomExpr.Type.INT, ((Expr_constContext)_localctx).c.getText()); 
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				((Expr_constContext)_localctx).c = match(CONST_CHAR);
				 ((Expr_constContext)_localctx).ast =  new AstAtomExpr(loc(((Expr_constContext)_localctx).c), AstAtomExpr.Type.CHAR, ((Expr_constContext)_localctx).c.getText()); 
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				((Expr_constContext)_localctx).c = match(CONST_STR);
				 ((Expr_constContext)_localctx).ast =  new AstAtomExpr(loc(((Expr_constContext)_localctx).c), AstAtomExpr.Type.STRING, ((Expr_constContext)_localctx).c.getText()); 
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

	public static class Expr_var_accessContext extends ParserRuleContext {
		public AstNameExpr ast;
		public Token IDENTIFIER;
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
		enterRule(_localctx, 28, RULE_expr_var_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			((Expr_var_accessContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 ((Expr_var_accessContext)_localctx).ast =  new AstNameExpr(loc(((Expr_var_accessContext)_localctx).IDENTIFIER), (((Expr_var_accessContext)_localctx).IDENTIFIER!=null?((Expr_var_accessContext)_localctx).IDENTIFIER.getText():null)); 
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
		public AstExpr ast;
		public Token IDENTIFIER;
		public ExprContext expr;
		public Token SYM_RIGHT_BRACE;
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
		enterRule(_localctx, 30, RULE_expr_fun_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			((Expr_fun_callContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(306);
			match(SYM_LEFT_BRACE);
			 Vector<AstExpr> e = new Vector<AstExpr>(); 
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KWORD_DEL) | (1L << KWORD_NEW) | (1L << SYM_LEFT_BRACE) | (1L << SYM_LEFT_CURLY_BRACE) | (1L << SYM_NOT) | (1L << SYM_PLUS) | (1L << SYM_MINUS) | (1L << SYM_POW) | (1L << CONST_VOID) | (1L << CONST_BOOL) | (1L << CONST_INT) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(308);
				((Expr_fun_callContext)_localctx).expr = expr(0);
				 e.add(((Expr_fun_callContext)_localctx).expr.ast); 
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(310);
					match(SYM_COMMA);
					setState(311);
					((Expr_fun_callContext)_localctx).expr = expr(0);
					 e.add(((Expr_fun_callContext)_localctx).expr.ast); 
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(321);
			((Expr_fun_callContext)_localctx).SYM_RIGHT_BRACE = match(SYM_RIGHT_BRACE);
			 ((Expr_fun_callContext)_localctx).ast =  new AstCallExpr(loc(((Expr_fun_callContext)_localctx).IDENTIFIER, ((Expr_fun_callContext)_localctx).SYM_RIGHT_BRACE), (((Expr_fun_callContext)_localctx).IDENTIFIER!=null?((Expr_fun_callContext)_localctx).IDENTIFIER.getText():null), new AstTrees<AstExpr>(e));
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
		public AstExpr ast;
		public Token KWORD_NEW;
		public Token KWORD_DEL;
		public ExprContext expr;
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
		enterRule(_localctx, 32, RULE_expr_alloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 AstPfxExpr.Oper o = null; Location l = null;
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KWORD_NEW:
				{
				setState(325);
				((Expr_allocContext)_localctx).KWORD_NEW = match(KWORD_NEW);
				 o = AstPfxExpr.Oper.NEW; l = loc(((Expr_allocContext)_localctx).KWORD_NEW); 
				}
				break;
			case KWORD_DEL:
				{
				setState(327);
				((Expr_allocContext)_localctx).KWORD_DEL = match(KWORD_DEL);
				 o = AstPfxExpr.Oper.DEL; l = loc(((Expr_allocContext)_localctx).KWORD_DEL); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(331);
			((Expr_allocContext)_localctx).expr = expr(0);
			 ((Expr_allocContext)_localctx).ast =  new AstPfxExpr(loc(l, ((Expr_allocContext)_localctx).expr.ast.location()), o, ((Expr_allocContext)_localctx).expr.ast); 
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
		public AstExpr ast;
		public Token SYM_LEFT_CURLY_BRACE;
		public StmtContext stmt;
		public Token SYM_RIGHT_CURLY_BRACE;
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
		enterRule(_localctx, 34, RULE_expr_compound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			((Expr_compoundContext)_localctx).SYM_LEFT_CURLY_BRACE = match(SYM_LEFT_CURLY_BRACE);
			 Vector<AstStmt> statements = new Vector<AstStmt>();
			setState(336);
			((Expr_compoundContext)_localctx).stmt = stmt();
			 statements.add(((Expr_compoundContext)_localctx).stmt.ast); 
			setState(338);
			match(SYM_SEMICOLON);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KWORD_DEL) | (1L << KWORD_IF) | (1L << KWORD_NEW) | (1L << KWORD_WHILE) | (1L << SYM_LEFT_BRACE) | (1L << SYM_LEFT_CURLY_BRACE) | (1L << SYM_NOT) | (1L << SYM_PLUS) | (1L << SYM_MINUS) | (1L << SYM_POW) | (1L << CONST_VOID) | (1L << CONST_BOOL) | (1L << CONST_INT) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(339);
				((Expr_compoundContext)_localctx).stmt = stmt();
				setState(340);
				match(SYM_SEMICOLON);
				 statements.add(((Expr_compoundContext)_localctx).stmt.ast); 
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			((Expr_compoundContext)_localctx).SYM_RIGHT_CURLY_BRACE = match(SYM_RIGHT_CURLY_BRACE);
			 ((Expr_compoundContext)_localctx).ast =  new AstStmtExpr(loc(((Expr_compoundContext)_localctx).SYM_LEFT_CURLY_BRACE, ((Expr_compoundContext)_localctx).SYM_RIGHT_CURLY_BRACE), new AstTrees<AstStmt>(statements)); 
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
		public AstExpr ast;
		public Token SYM_LEFT_BRACE;
		public ExprContext expr;
		public TypeContext type;
		public Token SYM_RIGHT_BRACE;
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
		enterRule(_localctx, 36, RULE_expr_typecast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			((Expr_typecastContext)_localctx).SYM_LEFT_BRACE = match(SYM_LEFT_BRACE);
			setState(352);
			((Expr_typecastContext)_localctx).expr = expr(0);
			setState(353);
			match(SYM_COLON);
			setState(354);
			((Expr_typecastContext)_localctx).type = type();
			setState(355);
			((Expr_typecastContext)_localctx).SYM_RIGHT_BRACE = match(SYM_RIGHT_BRACE);
			 ((Expr_typecastContext)_localctx).ast =  new AstCastExpr(loc(((Expr_typecastContext)_localctx).SYM_LEFT_BRACE, ((Expr_typecastContext)_localctx).SYM_RIGHT_BRACE), ((Expr_typecastContext)_localctx).expr.ast, ((Expr_typecastContext)_localctx).type.ast) ; 
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
		public AstExpr ast;
		public Token SYM_LEFT_BRACE;
		public ExprContext expr;
		public Token SYM_RIGHT_BRACE;
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
		enterRule(_localctx, 38, RULE_expr_enclosed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((Expr_enclosedContext)_localctx).SYM_LEFT_BRACE = match(SYM_LEFT_BRACE);
			setState(359);
			((Expr_enclosedContext)_localctx).expr = expr(0);
			setState(360);
			((Expr_enclosedContext)_localctx).SYM_RIGHT_BRACE = match(SYM_RIGHT_BRACE);
			 ((Expr_enclosedContext)_localctx).ast =  ((Expr_enclosedContext)_localctx).expr.ast; _localctx.ast.relocate(loc(((Expr_enclosedContext)_localctx).SYM_LEFT_BRACE, ((Expr_enclosedContext)_localctx).SYM_RIGHT_BRACE)); 
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
		public AstBinExpr.Oper o;
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
		enterRule(_localctx, 40, RULE_expr_infix_mul);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYM_MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(SYM_MUL);
				 ((Expr_infix_mulContext)_localctx).o =  AstBinExpr.Oper.MUL; 
				}
				break;
			case SYM_DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(SYM_DIV);
				 ((Expr_infix_mulContext)_localctx).o =  AstBinExpr.Oper.DIV; 
				}
				break;
			case SYM_MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(SYM_MOD);
				 ((Expr_infix_mulContext)_localctx).o =  AstBinExpr.Oper.MOD; 
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

	public static class Expr_infix_addContext extends ParserRuleContext {
		public AstBinExpr.Oper o;
		public TerminalNode SYM_PLUS() { return getToken(PrevParser.SYM_PLUS, 0); }
		public TerminalNode SYM_MINUS() { return getToken(PrevParser.SYM_MINUS, 0); }
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
		enterRule(_localctx, 42, RULE_expr_infix_add);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYM_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(SYM_PLUS);
				 ((Expr_infix_addContext)_localctx).o =  AstBinExpr.Oper.ADD; 
				}
				break;
			case SYM_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(SYM_MINUS);
				 ((Expr_infix_addContext)_localctx).o =  AstBinExpr.Oper.SUB; 
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

	public static class Expr_infix_relContext extends ParserRuleContext {
		public AstBinExpr.Oper o;
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
		enterRule(_localctx, 44, RULE_expr_infix_rel);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYM_EQU:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(SYM_EQU);
				 ((Expr_infix_relContext)_localctx).o =  AstBinExpr.Oper.EQU; 
				}
				break;
			case SYM_NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(SYM_NEQ);
				 ((Expr_infix_relContext)_localctx).o =  AstBinExpr.Oper.NEQ; 
				}
				break;
			case SYM_LS:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(SYM_LS);
				 ((Expr_infix_relContext)_localctx).o =  AstBinExpr.Oper.LTH; 
				}
				break;
			case SYM_GT:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				match(SYM_GT);
				 ((Expr_infix_relContext)_localctx).o =  AstBinExpr.Oper.GTH; 
				}
				break;
			case SYM_LSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				match(SYM_LSE);
				 ((Expr_infix_relContext)_localctx).o =  AstBinExpr.Oper.LEQ; 
				}
				break;
			case SYM_GTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				match(SYM_GTE);
				 ((Expr_infix_relContext)_localctx).o =  AstBinExpr.Oper.GEQ; 
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
		enterRule(_localctx, 46, RULE_expr_infix_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
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
		enterRule(_localctx, 48, RULE_expr_infix_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		public AstExpr ast;
		public Token SYM_NOT;
		public Token SYM_PLUS;
		public Token SYM_MINUS;
		public Token SYM_POW;
		public ExprContext expr;
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
		enterRule(_localctx, 50, RULE_expr_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 AstPfxExpr.Oper o = null; Location l = null; 
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYM_NOT:
				{
				setState(396);
				((Expr_prefixContext)_localctx).SYM_NOT = match(SYM_NOT);
				 o = AstPfxExpr.Oper.NOT; l = loc(((Expr_prefixContext)_localctx).SYM_NOT); 
				}
				break;
			case SYM_PLUS:
				{
				setState(398);
				((Expr_prefixContext)_localctx).SYM_PLUS = match(SYM_PLUS);
				 o = AstPfxExpr.Oper.ADD; l = loc(((Expr_prefixContext)_localctx).SYM_PLUS); 
				}
				break;
			case SYM_MINUS:
				{
				setState(400);
				((Expr_prefixContext)_localctx).SYM_MINUS = match(SYM_MINUS);
				 o = AstPfxExpr.Oper.SUB; l = loc(((Expr_prefixContext)_localctx).SYM_MINUS); 
				}
				break;
			case SYM_POW:
				{
				setState(402);
				((Expr_prefixContext)_localctx).SYM_POW = match(SYM_POW);
				 o = AstPfxExpr.Oper.PTR; l = loc(((Expr_prefixContext)_localctx).SYM_POW); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(406);
			((Expr_prefixContext)_localctx).expr = expr(0);
			 ((Expr_prefixContext)_localctx).ast =  new AstPfxExpr(loc(l, ((Expr_prefixContext)_localctx).expr.ast.location()), o, ((Expr_prefixContext)_localctx).expr.ast) ;
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
		public AstStmt ast;
		public Stmt_exprContext stmt_expr;
		public Stmt_assignContext stmt_assign;
		public Stmt_condContext stmt_cond;
		public Stmt_loopContext stmt_loop;
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
		enterRule(_localctx, 52, RULE_stmt);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				((StmtContext)_localctx).stmt_expr = stmt_expr();
				 ((StmtContext)_localctx).ast =  ((StmtContext)_localctx).stmt_expr.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				((StmtContext)_localctx).stmt_assign = stmt_assign();
				 ((StmtContext)_localctx).ast =  ((StmtContext)_localctx).stmt_assign.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				((StmtContext)_localctx).stmt_cond = stmt_cond();
				 ((StmtContext)_localctx).ast =  ((StmtContext)_localctx).stmt_cond.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				((StmtContext)_localctx).stmt_loop = stmt_loop();
				 ((StmtContext)_localctx).ast =  ((StmtContext)_localctx).stmt_loop.ast; 
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
		public AstStmt ast;
		public ExprContext expr;
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
		enterRule(_localctx, 54, RULE_stmt_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			((Stmt_exprContext)_localctx).expr = expr(0);

											((Stmt_exprContext)_localctx).ast =  new AstExprStmt(loc(((Stmt_exprContext)_localctx).expr.ast), ((Stmt_exprContext)_localctx).expr.ast);
										
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
		public AstStmt ast;
		public ExprContext ex1;
		public ExprContext ex2;
		public TerminalNode SYM_SET() { return getToken(PrevParser.SYM_SET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 56, RULE_stmt_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			((Stmt_assignContext)_localctx).ex1 = expr(0);
			setState(427);
			match(SYM_SET);
			setState(428);
			((Stmt_assignContext)_localctx).ex2 = expr(0);
			 ((Stmt_assignContext)_localctx).ast =  new AstAssignStmt(loc(((Stmt_assignContext)_localctx).ex1.ast, ((Stmt_assignContext)_localctx).ex2.ast), ((Stmt_assignContext)_localctx).ex1.ast, ((Stmt_assignContext)_localctx).ex2.ast); 
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
		public AstStmt ast;
		public Token ifE;
		public ExprContext expr;
		public StmtContext thenSt;
		public StmtContext elseSt;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KWORD_THEN() { return getToken(PrevParser.KWORD_THEN, 0); }
		public TerminalNode KWORD_ELSE() { return getToken(PrevParser.KWORD_ELSE, 0); }
		public TerminalNode KWORD_IF() { return getToken(PrevParser.KWORD_IF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
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
		enterRule(_localctx, 58, RULE_stmt_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			((Stmt_condContext)_localctx).ifE = match(KWORD_IF);
			setState(432);
			((Stmt_condContext)_localctx).expr = expr(0);
			setState(433);
			match(KWORD_THEN);
			setState(434);
			((Stmt_condContext)_localctx).thenSt = stmt();
			setState(435);
			match(KWORD_ELSE);
			setState(436);
			((Stmt_condContext)_localctx).elseSt = stmt();

											Location loc = loc(loc(((Stmt_condContext)_localctx).ifE), ((Stmt_condContext)_localctx).elseSt.ast);
											((Stmt_condContext)_localctx).ast =  new AstIfStmt(loc, ((Stmt_condContext)_localctx).expr.ast, ((Stmt_condContext)_localctx).thenSt.ast, ((Stmt_condContext)_localctx).elseSt.ast);
										
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
		public AstStmt ast;
		public Token whileE;
		public ExprContext expr;
		public StmtContext stmt;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KWORD_DO() { return getToken(PrevParser.KWORD_DO, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode KWORD_WHILE() { return getToken(PrevParser.KWORD_WHILE, 0); }
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
		enterRule(_localctx, 60, RULE_stmt_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			((Stmt_loopContext)_localctx).whileE = match(KWORD_WHILE);
			setState(440);
			((Stmt_loopContext)_localctx).expr = expr(0);
			setState(441);
			match(KWORD_DO);
			setState(442);
			((Stmt_loopContext)_localctx).stmt = stmt();

											Location loc = loc(loc(((Stmt_loopContext)_localctx).whileE), ((Stmt_loopContext)_localctx).stmt.ast);
											((Stmt_loopContext)_localctx).ast =  new AstWhileStmt(loc, ((Stmt_loopContext)_localctx).expr.ast, ((Stmt_loopContext)_localctx).stmt.ast);
										
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
		case 12:
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
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\6\2E\n\2\r\2\16\2F\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"t\n\6\f\6\16\6w\13\6\5\6y\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0084\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00a4\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c0\n\f\f\f\16"+
		"\f\u00c3\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e7\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u0118\n\16\f\16\16\16\u011b\13\16\3\16\3\16\3\16\7\16\u0120"+
		"\n\16\f\16\16\16\u0123\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u012f\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u013d\n\21\f\21\16\21\u0140\13\21\5\21\u0142\n\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u014c\n\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u015a\n\23\f\23\16"+
		"\23\u015d\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0174\n\26\3\27"+
		"\3\27\3\27\3\27\5\27\u017a\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u0188\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0197\n\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01a8\n\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \2\3\32!\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>\2\2\2\u01d6\2@\3\2\2\2\4T\3\2\2\2\6V\3\2"+
		"\2\2\b\\\3\2\2\2\nb\3\2\2\2\f\u0099\3\2\2\2\16\u00a3\3\2\2\2\20\u00a5"+
		"\3\2\2\2\22\u00a8\3\2\2\2\24\u00ae\3\2\2\2\26\u00b2\3\2\2\2\30\u00c7\3"+
		"\2\2\2\32\u00e6\3\2\2\2\34\u012e\3\2\2\2\36\u0130\3\2\2\2 \u0133\3\2\2"+
		"\2\"\u0146\3\2\2\2$\u0150\3\2\2\2&\u0161\3\2\2\2(\u0168\3\2\2\2*\u0173"+
		"\3\2\2\2,\u0179\3\2\2\2.\u0187\3\2\2\2\60\u0189\3\2\2\2\62\u018b\3\2\2"+
		"\2\64\u018d\3\2\2\2\66\u01a7\3\2\2\28\u01a9\3\2\2\2:\u01ac\3\2\2\2<\u01b1"+
		"\3\2\2\2>\u01b9\3\2\2\2@D\b\2\1\2AB\5\4\3\2BC\b\2\1\2CE\3\2\2\2DA\3\2"+
		"\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\2\1\2IJ\7\2\2\3J\3\3"+
		"\2\2\2KL\5\6\4\2LM\b\3\1\2MU\3\2\2\2NO\5\b\5\2OP\b\3\1\2PU\3\2\2\2QR\5"+
		"\n\6\2RS\b\3\1\2SU\3\2\2\2TK\3\2\2\2TN\3\2\2\2TQ\3\2\2\2U\5\3\2\2\2VW"+
		"\7\r\2\2WX\7\63\2\2XY\7+\2\2YZ\5\f\7\2Z[\b\4\1\2[\7\3\2\2\2\\]\7\16\2"+
		"\2]^\7\63\2\2^_\7\32\2\2_`\5\f\7\2`a\b\5\1\2a\t\3\2\2\2bc\7\b\2\2cd\7"+
		"\63\2\2de\b\6\1\2ef\b\6\1\2fx\7\22\2\2gh\7\63\2\2hi\7\32\2\2ij\5\f\7\2"+
		"jk\3\2\2\2ku\b\6\1\2lm\7\31\2\2mn\7\63\2\2no\7\32\2\2op\5\f\7\2pq\3\2"+
		"\2\2qr\b\6\1\2rt\3\2\2\2sl\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2"+
		"\2\2wu\3\2\2\2xg\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\23\2\2{|\7\32\2\2|}\5"+
		"\f\7\2}\u0083\b\6\1\2~\177\7+\2\2\177\u0080\5\32\16\2\u0080\u0081\b\6"+
		"\1\2\u0081\u0082\b\6\1\2\u0082\u0084\3\2\2\2\u0083~\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\6\1\2\u0086\13\3\2\2\2\u0087"+
		"\u0088\5\16\b\2\u0088\u0089\b\7\1\2\u0089\u009a\3\2\2\2\u008a\u008b\5"+
		"\20\t\2\u008b\u008c\b\7\1\2\u008c\u009a\3\2\2\2\u008d\u008e\5\22\n\2\u008e"+
		"\u008f\b\7\1\2\u008f\u009a\3\2\2\2\u0090\u0091\5\24\13\2\u0091\u0092\b"+
		"\7\1\2\u0092\u009a\3\2\2\2\u0093\u0094\5\26\f\2\u0094\u0095\b\7\1\2\u0095"+
		"\u009a\3\2\2\2\u0096\u0097\5\30\r\2\u0097\u0098\b\7\1\2\u0098\u009a\3"+
		"\2\2\2\u0099\u0087\3\2\2\2\u0099\u008a\3\2\2\2\u0099\u008d\3\2\2\2\u0099"+
		"\u0090\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u009a\r\3\2\2\2"+
		"\u009b\u009c\7\17\2\2\u009c\u00a4\b\b\1\2\u009d\u009e\7\4\2\2\u009e\u00a4"+
		"\b\b\1\2\u009f\u00a0\7\n\2\2\u00a0\u00a4\b\b\1\2\u00a1\u00a2\7\3\2\2\u00a2"+
		"\u00a4\b\b\1\2\u00a3\u009b\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u009f\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\17\3\2\2\2\u00a5\u00a6\7\63\2\2\u00a6\u00a7"+
		"\b\t\1\2\u00a7\21\3\2\2\2\u00a8\u00a9\7\26\2\2\u00a9\u00aa\5\32\16\2\u00aa"+
		"\u00ab\7\27\2\2\u00ab\u00ac\5\f\7\2\u00ac\u00ad\b\n\1\2\u00ad\23\3\2\2"+
		"\2\u00ae\u00af\7*\2\2\u00af\u00b0\5\f\7\2\u00b0\u00b1\b\13\1\2\u00b1\25"+
		"\3\2\2\2\u00b2\u00b3\7\24\2\2\u00b3\u00b4\b\f\1\2\u00b4\u00b5\7\63\2\2"+
		"\u00b5\u00b6\7\32\2\2\u00b6\u00b7\5\f\7\2\u00b7\u00b8\b\f\1\2\u00b8\u00c1"+
		"\b\f\1\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb\7\63\2\2\u00bb\u00bc\7\32\2"+
		"\2\u00bc\u00bd\5\f\7\2\u00bd\u00be\b\f\1\2\u00be\u00c0\3\2\2\2\u00bf\u00b9"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6\b"+
		"\f\1\2\u00c6\27\3\2\2\2\u00c7\u00c8\7\22\2\2\u00c8\u00c9\5\f\7\2\u00c9"+
		"\u00ca\7\23\2\2\u00ca\u00cb\b\r\1\2\u00cb\u00cc\b\r\1\2\u00cc\31\3\2\2"+
		"\2\u00cd\u00ce\b\16\1\2\u00ce\u00cf\5\34\17\2\u00cf\u00d0\b\16\1\2\u00d0"+
		"\u00e7\3\2\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\b\16\1\2\u00d3\u00e7"+
		"\3\2\2\2\u00d4\u00d5\5 \21\2\u00d5\u00d6\b\16\1\2\u00d6\u00e7\3\2\2\2"+
		"\u00d7\u00d8\5\"\22\2\u00d8\u00d9\b\16\1\2\u00d9\u00e7\3\2\2\2\u00da\u00db"+
		"\5$\23\2\u00db\u00dc\b\16\1\2\u00dc\u00e7\3\2\2\2\u00dd\u00de\5&\24\2"+
		"\u00de\u00df\b\16\1\2\u00df\u00e7\3\2\2\2\u00e0\u00e1\5(\25\2\u00e1\u00e2"+
		"\b\16\1\2\u00e2\u00e7\3\2\2\2\u00e3\u00e4\5\64\33\2\u00e4\u00e5\b\16\1"+
		"\2\u00e5\u00e7\3\2\2\2\u00e6\u00cd\3\2\2\2\u00e6\u00d1\3\2\2\2\u00e6\u00d4"+
		"\3\2\2\2\u00e6\u00d7\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6"+
		"\u00e0\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u0121\3\2\2\2\u00e8\u00e9\f\b"+
		"\2\2\u00e9\u00ea\5*\26\2\u00ea\u00eb\5\32\16\t\u00eb\u00ec\b\16\1\2\u00ec"+
		"\u0120\3\2\2\2\u00ed\u00ee\f\7\2\2\u00ee\u00ef\5,\27\2\u00ef\u00f0\5\32"+
		"\16\b\u00f0\u00f1\b\16\1\2\u00f1\u0120\3\2\2\2\u00f2\u00f3\f\6\2\2\u00f3"+
		"\u00f4\5.\30\2\u00f4\u00f5\5\32\16\7\u00f5\u00f6\b\16\1\2\u00f6\u0120"+
		"\3\2\2\2\u00f7\u00f8\f\5\2\2\u00f8\u00f9\5\60\31\2\u00f9\u00fa\5\32\16"+
		"\6\u00fa\u00fb\b\16\1\2\u00fb\u0120\3\2\2\2\u00fc\u00fd\f\4\2\2\u00fd"+
		"\u00fe\5\62\32\2\u00fe\u00ff\5\32\16\5\u00ff\u0100\b\16\1\2\u0100\u0120"+
		"\3\2\2\2\u0101\u0102\f\f\2\2\u0102\u0103\7\26\2\2\u0103\u0104\5\32\16"+
		"\2\u0104\u0105\7\27\2\2\u0105\u0106\b\16\1\2\u0106\u0120\3\2\2\2\u0107"+
		"\u0108\f\13\2\2\u0108\u0109\7*\2\2\u0109\u0120\b\16\1\2\u010a\u010b\f"+
		"\n\2\2\u010b\u010c\7\30\2\2\u010c\u010d\7\63\2\2\u010d\u0120\b\16\1\2"+
		"\u010e\u010f\f\3\2\2\u010f\u0110\7\20\2\2\u0110\u0111\7\24\2\2\u0111\u0112"+
		"\b\16\1\2\u0112\u0113\5\4\3\2\u0113\u0119\b\16\1\2\u0114\u0115\5\4\3\2"+
		"\u0115\u0116\b\16\1\2\u0116\u0118\3\2\2\2\u0117\u0114\3\2\2\2\u0118\u011b"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011c\u011d\7\25\2\2\u011d\u011e\b\16\1\2\u011e\u0120\3"+
		"\2\2\2\u011f\u00e8\3\2\2\2\u011f\u00ed\3\2\2\2\u011f\u00f2\3\2\2\2\u011f"+
		"\u00f7\3\2\2\2\u011f\u00fc\3\2\2\2\u011f\u0101\3\2\2\2\u011f\u0107\3\2"+
		"\2\2\u011f\u010a\3\2\2\2\u011f\u010e\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\33\3\2\2\2\u0123\u0121\3\2\2"+
		"\2\u0124\u0125\7,\2\2\u0125\u012f\b\17\1\2\u0126\u0127\7-\2\2\u0127\u012f"+
		"\b\17\1\2\u0128\u0129\7.\2\2\u0129\u012f\b\17\1\2\u012a\u012b\7\60\2\2"+
		"\u012b\u012f\b\17\1\2\u012c\u012d\7\62\2\2\u012d\u012f\b\17\1\2\u012e"+
		"\u0124\3\2\2\2\u012e\u0126\3\2\2\2\u012e\u0128\3\2\2\2\u012e\u012a\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\35\3\2\2\2\u0130\u0131\7\63\2\2\u0131\u0132"+
		"\b\20\1\2\u0132\37\3\2\2\2\u0133\u0134\7\63\2\2\u0134\u0135\7\22\2\2\u0135"+
		"\u0141\b\21\1\2\u0136\u0137\5\32\16\2\u0137\u013e\b\21\1\2\u0138\u0139"+
		"\7\31\2\2\u0139\u013a\5\32\16\2\u013a\u013b\b\21\1\2\u013b\u013d\3\2\2"+
		"\2\u013c\u0138\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0136\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\23\2\2\u0144\u0145\b"+
		"\21\1\2\u0145!\3\2\2\2\u0146\u014b\b\22\1\2\u0147\u0148\7\13\2\2\u0148"+
		"\u014c\b\22\1\2\u0149\u014a\7\5\2\2\u014a\u014c\b\22\1\2\u014b\u0147\3"+
		"\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\5\32\16\2\u014e"+
		"\u014f\b\22\1\2\u014f#\3\2\2\2\u0150\u0151\7\24\2\2\u0151\u0152\b\23\1"+
		"\2\u0152\u0153\5\66\34\2\u0153\u0154\b\23\1\2\u0154\u015b\7\33\2\2\u0155"+
		"\u0156\5\66\34\2\u0156\u0157\7\33\2\2\u0157\u0158\b\23\1\2\u0158\u015a"+
		"\3\2\2\2\u0159\u0155\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7\25"+
		"\2\2\u015f\u0160\b\23\1\2\u0160%\3\2\2\2\u0161\u0162\7\22\2\2\u0162\u0163"+
		"\5\32\16\2\u0163\u0164\7\32\2\2\u0164\u0165\5\f\7\2\u0165\u0166\7\23\2"+
		"\2\u0166\u0167\b\24\1\2\u0167\'\3\2\2\2\u0168\u0169\7\22\2\2\u0169\u016a"+
		"\5\32\16\2\u016a\u016b\7\23\2\2\u016b\u016c\b\25\1\2\u016c)\3\2\2\2\u016d"+
		"\u016e\7%\2\2\u016e\u0174\b\26\1\2\u016f\u0170\7&\2\2\u0170\u0174\b\26"+
		"\1\2\u0171\u0172\7\'\2\2\u0172\u0174\b\26\1\2\u0173\u016d\3\2\2\2\u0173"+
		"\u016f\3\2\2\2\u0173\u0171\3\2\2\2\u0174+\3\2\2\2\u0175\u0176\7(\2\2\u0176"+
		"\u017a\b\27\1\2\u0177\u0178\7)\2\2\u0178\u017a\b\27\1\2\u0179\u0175\3"+
		"\2\2\2\u0179\u0177\3\2\2\2\u017a-\3\2\2\2\u017b\u017c\7\37\2\2\u017c\u0188"+
		"\b\30\1\2\u017d\u017e\7 \2\2\u017e\u0188\b\30\1\2\u017f\u0180\7!\2\2\u0180"+
		"\u0188\b\30\1\2\u0181\u0182\7\"\2\2\u0182\u0188\b\30\1\2\u0183\u0184\7"+
		"#\2\2\u0184\u0188\b\30\1\2\u0185\u0186\7$\2\2\u0186\u0188\b\30\1\2\u0187"+
		"\u017b\3\2\2\2\u0187\u017d\3\2\2\2\u0187\u017f\3\2\2\2\u0187\u0181\3\2"+
		"\2\2\u0187\u0183\3\2\2\2\u0187\u0185\3\2\2\2\u0188/\3\2\2\2\u0189\u018a"+
		"\7\34\2\2\u018a\61\3\2\2\2\u018b\u018c\7\35\2\2\u018c\63\3\2\2\2\u018d"+
		"\u0196\b\33\1\2\u018e\u018f\7\36\2\2\u018f\u0197\b\33\1\2\u0190\u0191"+
		"\7(\2\2\u0191\u0197\b\33\1\2\u0192\u0193\7)\2\2\u0193\u0197\b\33\1\2\u0194"+
		"\u0195\7*\2\2\u0195\u0197\b\33\1\2\u0196\u018e\3\2\2\2\u0196\u0190\3\2"+
		"\2\2\u0196\u0192\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\5\32\16\2\u0199\u019a\b\33\1\2\u019a\65\3\2\2\2\u019b\u019c\58"+
		"\35\2\u019c\u019d\b\34\1\2\u019d\u01a8\3\2\2\2\u019e\u019f\5:\36\2\u019f"+
		"\u01a0\b\34\1\2\u01a0\u01a8\3\2\2\2\u01a1\u01a2\5<\37\2\u01a2\u01a3\b"+
		"\34\1\2\u01a3\u01a8\3\2\2\2\u01a4\u01a5\5> \2\u01a5\u01a6\b\34\1\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u019b\3\2\2\2\u01a7\u019e\3\2\2\2\u01a7\u01a1\3\2"+
		"\2\2\u01a7\u01a4\3\2\2\2\u01a8\67\3\2\2\2\u01a9\u01aa\5\32\16\2\u01aa"+
		"\u01ab\b\35\1\2\u01ab9\3\2\2\2\u01ac\u01ad\5\32\16\2\u01ad\u01ae\7+\2"+
		"\2\u01ae\u01af\5\32\16\2\u01af\u01b0\b\36\1\2\u01b0;\3\2\2\2\u01b1\u01b2"+
		"\7\t\2\2\u01b2\u01b3\5\32\16\2\u01b3\u01b4\7\f\2\2\u01b4\u01b5\5\66\34"+
		"\2\u01b5\u01b6\7\7\2\2\u01b6\u01b7\5\66\34\2\u01b7\u01b8\b\37\1\2\u01b8"+
		"=\3\2\2\2\u01b9\u01ba\7\21\2\2\u01ba\u01bb\5\32\16\2\u01bb\u01bc\7\6\2"+
		"\2\u01bc\u01bd\5\66\34\2\u01bd\u01be\b \1\2\u01be?\3\2\2\2\30FTux\u0083"+
		"\u0099\u00a3\u00c1\u00e6\u0119\u011f\u0121\u012e\u013e\u0141\u014b\u015b"+
		"\u0173\u0179\u0187\u0196\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}