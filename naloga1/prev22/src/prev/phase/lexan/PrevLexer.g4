lexer grammar PrevLexer;

@header {
	package prev.phase.lexan;
	import prev.common.report.*;
	import prev.data.sym.*;
}

@members {
    @Override
	public Token nextToken() {
		return (Token) super.nextToken();
	}
}

KWORD_BOOL: 'bool';
KWORD_CHAR: 'char';
KWORD_DEL: 'del';
KWORD_DO: 'do';
KWORD_ELSE: 'else';
KWORD_FUN: 'fun';
KWORD_IF: 'if';
KWORD_INT: 'int';
KWORD_NEW: 'new';
KWORD_THEN: 'then';
KWORD_TYP: 'typ';
KWORD_VAR: 'var';
KWORD_VOID: 'void';
KWORD_WHERE: 'where';
KWORD_WHILE: 'while';

SYM_LEFT_BRACE: '(';
SYM_RIGHT_BRACE: ')';
SYM_LEFT_CURLY_BRACE: '{';
SYM_RIGHT_CURLY_BRACE: '}';
SYM_LEFT_BRACKET: '[';
SYM_RIGHT_BRACKET: ']';
SYM_DOT: '.';
SYM_COMMA: ',';
SYM_COLON: ':';
SYM_SEMICOLON: ';';
SYM_AND: '&';
SYM_OR: '|';
SYM_NOT: '!';
SYM_EQU: '==';
SYM_NEQ: '!=';
SYM_LS: '<';
SYM_GT: '>';
SYM_LSE: '<=';
SYM_GTE: '>=';
SYM_MUL: '*';
SYM_DIV: '/';
SYM_MOD: '%';
SYM_PLUS: '+';
SYM_MINUS: '-';
SYM_POW: '^';
SYM_SET: '=';

CONST_VOID: 'none';
CONST_BOOL: 'true' | 'false';
CONST_INT: [1-9][0-9]* | '0';
CONST_CHAR: '\''(' '..'&' | ('('..'~') | ('\\\''))'\'';
CONST_STR: '"'(' '..'!' | '#'..'~' | '\\"')*'"';

IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9]*;
COMMENT: '#' ~[\r\n]* '\r'? ('\n' | EOF) -> skip;
WHITE_SPACE: [\p{White_Space}] -> skip;

ERROR: {if (true) throw new Report.Error("Token error at line " + this.getLine() + " char " + this.getCharPositionInLine() + ".");} ;