grammar MiniPascalGrammar;

@header{
    package antlr;
}

program : 'program' IDENTIFIER ';' block;
block : var_declaration* function_declaration* compound_statement* program_end_marker;
//(var_declaration function_declaration compound_statement)* program_end_marker;
program_end_marker : '.';
var_declaration : 'var' (variable_declaration ';')*;
variable_declaration : IDENTIFIER ':' type (array_specifier)?;
array_specifier : 'array' '[' index_range ']' 'of';
index_range : NUMBER '..' NUMBER;
index : NUMBER; //REMOVE?
type : 'integer' | 'real' | 'boolean' | 'char' | 'string' | 'array' '[' index_range ']' 'of' type;
//array_type: 'array'
compound_statement : 'begin' statement_list end_statement*;
statement_list : statement (';'statement?)*;
statement : compound_statement | assignment_statement | if_statement | while_statement | for_statement | repeat_statement | write_statement | read_statement | function_call;
assignment_statement : variable ':=' (expression|function_call) ;
if_statement : 'if' expression 'then' statement ('else' statement)?;
while_statement : 'while' expression 'do' statement;
for_statement : 'for' IDENTIFIER ':=' expression 'to' expression 'do' statement;
repeat_statement : 'repeat' statement_list 'until' expression;
write_statement : 'write' '(' expression ')';
read_statement : 'read' '(' variable (',' variable)* ')';
function_declaration: 'function' IDENTIFIER '(' parameter_list ')' ':' type ';' function_block;
function_block: var_declaration* compound_statement function_end_statement;
function_end_statement: 'end;';
parameter_list: (parameter_declaration (',' parameter_declaration)*)?;
parameter_declaration: IDENTIFIER ':' type;
function_call : IDENTIFIER '(' argument_list? ')';
argument_list : (expression (',' expression)*) ;
end_statement: 'end';
expression : simple_expression ((relop | 'and' | 'or') simple_expression)* ';'*;
simple_expression : term ((addop | 'or') term)*;
term : factor (mulop factor)*;
factor : IDENTIFIER (index_access | function_call | '(' expression ')' | ('not' factor))?
        | NUMBER
        | STRING
        | CHAR
        | '(' expression ')'
        | 'not' factor
        | 'true'
        | 'false';
variable : IDENTIFIER (index_access)?;
index_access : '[' expression (',' expression)* ']';
IDENTIFIER : [a-zA-Z][a-zA-Z0-9_]*;
NUMBER : [0-9]+ ('.' [0-9]+)?;
STRING : '\'' (~["\r\n] | '""')* '\'';
CHAR: '\'' (~["\r\n] | '\\' . )* '\'';
relop : '=' | '<>' | '<' | '>' | '<=' | '>=';
addop : '+' | '-';
mulop : '*' | '/' | 'div' | 'mod';
COMMENT : '{' ~('{' | '}')* '}';
WS : [ \t\r\n]+ -> skip;