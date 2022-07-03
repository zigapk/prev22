// Generated from /Users/zigapk/University/prev/naloga3/prev22/src/prev/phase/lexan/PrevLexer.g4 by ANTLR 4.9.2

	package prev.phase.lexan;
	import prev.common.report.*;
	import prev.data.sym.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrevLexer extends Lexer {
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
		CONST_STR=48, STR_ERROR_ODD=49, IDENTIFIER=50, IDENTIFIER_ERR=51, COMMENT=52, 
		TAB=53, WHITE_SPACE=54, ERROR=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KWORD_BOOL", "KWORD_CHAR", "KWORD_DEL", "KWORD_DO", "KWORD_ELSE", "KWORD_FUN", 
			"KWORD_IF", "KWORD_INT", "KWORD_NEW", "KWORD_THEN", "KWORD_TYP", "KWORD_VAR", 
			"KWORD_VOID", "KWORD_WHERE", "KWORD_WHILE", "SYM_LEFT_BRACE", "SYM_RIGHT_BRACE", 
			"SYM_LEFT_CURLY_BRACE", "SYM_RIGHT_CURLY_BRACE", "SYM_LEFT_BRACKET", 
			"SYM_RIGHT_BRACKET", "SYM_DOT", "SYM_COMMA", "SYM_COLON", "SYM_SEMICOLON", 
			"SYM_AND", "SYM_OR", "SYM_NOT", "SYM_EQU", "SYM_NEQ", "SYM_LS", "SYM_GT", 
			"SYM_LSE", "SYM_GTE", "SYM_MUL", "SYM_DIV", "SYM_MOD", "SYM_PLUS", "SYM_MINUS", 
			"SYM_POW", "SYM_SET", "CONST_VOID", "CONST_BOOL", "CONST_INT", "INT_ZERO_PADDING_ERR", 
			"CONST_CHAR", "CHAR_ERROR_ODD", "CONST_STR", "STR_ERROR_ODD", "IDENTIFIER", 
			"IDENTIFIER_ERR", "COMMENT", "TAB", "WHITE_SPACE", "ERROR"
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
			"SYM_POW", "SYM_SET", "CONST_VOID", "CONST_BOOL", "CONST_INT", "INT_ZERO_PADDING_ERR", 
			"CONST_CHAR", "CHAR_ERROR_ODD", "CONST_STR", "STR_ERROR_ODD", "IDENTIFIER", 
			"IDENTIFIER_ERR", "COMMENT", "TAB", "WHITE_SPACE", "ERROR"
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
		public Token nextToken() {
			return (Token) super.nextToken();
		}


	public PrevLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PrevLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 44:
			INT_ZERO_PADDING_ERR_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			CHAR_ERROR_ODD_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			STR_ERROR_ODD_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			IDENTIFIER_ERR_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			TAB_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void INT_ZERO_PADDING_ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			if(true) throw new Report.Error("Error at " + this.getLine() + ":" + this.getCharPositionInLine() + " - integers should not be left padded with zeros.");
			break;
		}
	}
	private void CHAR_ERROR_ODD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			if(true) throw new Report.Error("Error at " + this.getLine() + ":" + this.getCharPositionInLine() + " - odd number of quote characters. Maybe try escaping them?");
			break;
		}
	}
	private void STR_ERROR_ODD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			if(true) throw new Report.Error("Error at " + this.getLine() + ":" + this.getCharPositionInLine() + " - odd number of apostrophes. Maybe try escaping them?");
			break;
		}
	}
	private void IDENTIFIER_ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			if(true) throw new Report.Error("Error at " + this.getLine() + ":" + this.getCharPositionInLine() + " - identifiers cannot start with a digit.");
			break;
		}
	}
	private void TAB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			if (true) { setCharPositionInLine(this.getCharPositionInLine()+7-((this.getCharPositionInLine()-1)%8)); }
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			if (true) throw new Report.Error("Unknown error at " + this.getLine() + ":" + this.getCharPositionInLine() + ".");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0161\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u00fb\n,\3-\3-\7"+
		"-\u00ff\n-\f-\16-\u0102\13-\3-\5-\u0105\n-\3.\6.\u0108\n.\r.\16.\u0109"+
		"\3.\7.\u010d\n.\f.\16.\u0110\13.\3.\3.\3/\3/\3/\3/\5/\u0118\n/\3/\3/\3"+
		"\60\3\60\5\60\u011e\n\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0127"+
		"\n\61\f\61\16\61\u012a\13\61\3\61\3\61\3\62\3\62\7\62\u0130\n\62\f\62"+
		"\16\62\u0133\13\62\3\62\3\62\3\62\3\63\3\63\7\63\u013a\n\63\f\63\16\63"+
		"\u013d\13\63\3\64\3\64\7\64\u0141\n\64\f\64\16\64\u0144\13\64\3\64\3\64"+
		"\3\65\3\65\7\65\u014a\n\65\f\65\16\65\u014d\13\65\3\65\5\65\u0150\n\65"+
		"\3\65\5\65\u0153\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\38\38\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9\3\2\13\3\2\63;\3\2\62;\4\2\"(*\u0080\4\2\"#%\u0080\5"+
		"\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\3\3\f\f\f\2\13\17\"\"\u0087\u0087"+
		"\u00a2\u00a2\u1682\u1682\u2002\u200c\u202a\u202b\u2031\u2031\u2061\u2061"+
		"\u3002\u3002\2\u016d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5v\3\2\2\2\7{\3\2\2\2\t\177"+
		"\3\2\2\2\13\u0082\3\2\2\2\r\u0087\3\2\2\2\17\u008b\3\2\2\2\21\u008e\3"+
		"\2\2\2\23\u0092\3\2\2\2\25\u0096\3\2\2\2\27\u009b\3\2\2\2\31\u009f\3\2"+
		"\2\2\33\u00a3\3\2\2\2\35\u00a8\3\2\2\2\37\u00ae\3\2\2\2!\u00b4\3\2\2\2"+
		"#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bc\3\2\2\2+\u00be\3"+
		"\2\2\2-\u00c0\3\2\2\2/\u00c2\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2\2"+
		"\65\u00c8\3\2\2\2\67\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce\3\2\2\2=\u00d1"+
		"\3\2\2\2?\u00d4\3\2\2\2A\u00d6\3\2\2\2C\u00d8\3\2\2\2E\u00db\3\2\2\2G"+
		"\u00de\3\2\2\2I\u00e0\3\2\2\2K\u00e2\3\2\2\2M\u00e4\3\2\2\2O\u00e6\3\2"+
		"\2\2Q\u00e8\3\2\2\2S\u00ea\3\2\2\2U\u00ec\3\2\2\2W\u00fa\3\2\2\2Y\u0104"+
		"\3\2\2\2[\u0107\3\2\2\2]\u0113\3\2\2\2_\u011b\3\2\2\2a\u0122\3\2\2\2c"+
		"\u012d\3\2\2\2e\u0137\3\2\2\2g\u013e\3\2\2\2i\u0147\3\2\2\2k\u0156\3\2"+
		"\2\2m\u015b\3\2\2\2o\u015f\3\2\2\2qr\7d\2\2rs\7q\2\2st\7q\2\2tu\7n\2\2"+
		"u\4\3\2\2\2vw\7e\2\2wx\7j\2\2xy\7c\2\2yz\7t\2\2z\6\3\2\2\2{|\7f\2\2|}"+
		"\7g\2\2}~\7n\2\2~\b\3\2\2\2\177\u0080\7f\2\2\u0080\u0081\7q\2\2\u0081"+
		"\n\3\2\2\2\u0082\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084\u0085\7u\2\2\u0085"+
		"\u0086\7g\2\2\u0086\f\3\2\2\2\u0087\u0088\7h\2\2\u0088\u0089\7w\2\2\u0089"+
		"\u008a\7p\2\2\u008a\16\3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d\7h\2\2\u008d"+
		"\20\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091\7v\2\2\u0091"+
		"\22\3\2\2\2\u0092\u0093\7p\2\2\u0093\u0094\7g\2\2\u0094\u0095\7y\2\2\u0095"+
		"\24\3\2\2\2\u0096\u0097\7v\2\2\u0097\u0098\7j\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009a\7p\2\2\u009a\26\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7{\2\2\u009d"+
		"\u009e\7r\2\2\u009e\30\3\2\2\2\u009f\u00a0\7x\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\7t\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7x\2\2\u00a4\u00a5\7q\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00a7\7f\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7y\2\2\u00a9"+
		"\u00aa\7j\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g\2\2"+
		"\u00ad\36\3\2\2\2\u00ae\u00af\7y\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7"+
		"k\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7g\2\2\u00b3 \3\2\2\2\u00b4\u00b5"+
		"\7*\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7$\3\2\2\2\u00b8\u00b9"+
		"\7}\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7\177\2\2\u00bb(\3\2\2\2\u00bc\u00bd"+
		"\7]\2\2\u00bd*\3\2\2\2\u00be\u00bf\7_\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7"+
		"\60\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7.\2\2\u00c3\60\3\2\2\2\u00c4\u00c5"+
		"\7<\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7=\2\2\u00c7\64\3\2\2\2\u00c8\u00c9"+
		"\7(\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7~\2\2\u00cb8\3\2\2\2\u00cc\u00cd"+
		"\7#\2\2\u00cd:\3\2\2\2\u00ce\u00cf\7?\2\2\u00cf\u00d0\7?\2\2\u00d0<\3"+
		"\2\2\2\u00d1\u00d2\7#\2\2\u00d2\u00d3\7?\2\2\u00d3>\3\2\2\2\u00d4\u00d5"+
		"\7>\2\2\u00d5@\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7B\3\2\2\2\u00d8\u00d9\7"+
		">\2\2\u00d9\u00da\7?\2\2\u00daD\3\2\2\2\u00db\u00dc\7@\2\2\u00dc\u00dd"+
		"\7?\2\2\u00ddF\3\2\2\2\u00de\u00df\7,\2\2\u00dfH\3\2\2\2\u00e0\u00e1\7"+
		"\61\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7\'\2\2\u00e3L\3\2\2\2\u00e4\u00e5"+
		"\7-\2\2\u00e5N\3\2\2\2\u00e6\u00e7\7/\2\2\u00e7P\3\2\2\2\u00e8\u00e9\7"+
		"`\2\2\u00e9R\3\2\2\2\u00ea\u00eb\7?\2\2\u00ebT\3\2\2\2\u00ec\u00ed\7p"+
		"\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7g\2\2\u00f0V\3"+
		"\2\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7w\2\2\u00f4"+
		"\u00fb\7g\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7n\2\2"+
		"\u00f8\u00f9\7u\2\2\u00f9\u00fb\7g\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f5"+
		"\3\2\2\2\u00fbX\3\2\2\2\u00fc\u0100\t\2\2\2\u00fd\u00ff\t\3\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0105\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7\62\2\2\u0104"+
		"\u00fc\3\2\2\2\u0104\u0103\3\2\2\2\u0105Z\3\2\2\2\u0106\u0108\7\62\2\2"+
		"\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010e\3\2\2\2\u010b\u010d\t\3\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0112\b.\2\2\u0112\\\3\2\2\2\u0113\u0117"+
		"\7)\2\2\u0114\u0118\t\4\2\2\u0115\u0116\7^\2\2\u0116\u0118\7)\2\2\u0117"+
		"\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7)"+
		"\2\2\u011a^\3\2\2\2\u011b\u011d\7)\2\2\u011c\u011e\4\"\u0080\2\u011d\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7)\2\2\u0120\u0121\b\60\3\2\u0121"+
		"`\3\2\2\2\u0122\u0128\7$\2\2\u0123\u0127\t\5\2\2\u0124\u0125\7^\2\2\u0125"+
		"\u0127\7$\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012c\7$\2\2\u012cb\3\2\2\2\u012d\u0131\7$\2\2\u012e"+
		"\u0130\4\"\u0080\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0135\7$\2\2\u0135\u0136\b\62\4\2\u0136d\3\2\2\2\u0137\u013b\t\6\2\2"+
		"\u0138\u013a\t\7\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013cf\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0142\t\3\2\2\u013f\u0141\t\7\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\b\64\5\2\u0146h\3\2\2\2\u0147\u014b\7%\2\2"+
		"\u0148\u014a\n\b\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u0150\7\17\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3"+
		"\2\2\2\u0151\u0153\t\t\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\b\65\6\2\u0155j\3\2\2\2\u0156\u0157\7\13\2\2\u0157\u0158\b\66\7"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015a\b\66\6\2\u015al\3\2\2\2\u015b\u015c"+
		"\t\n\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b\67\6\2\u015en\3\2\2\2\u015f"+
		"\u0160\b8\b\2\u0160p\3\2\2\2\22\2\u00fa\u0100\u0104\u0109\u010e\u0117"+
		"\u011d\u0126\u0128\u0131\u013b\u0142\u014b\u014f\u0152\t\3.\2\3\60\3\3"+
		"\62\4\3\64\5\b\2\2\3\66\6\38\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}