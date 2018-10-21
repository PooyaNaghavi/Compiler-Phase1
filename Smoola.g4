grammar Smoola;

@members{
   void print(Object obj){
        System.out.println(obj);
   }
}

program
    :
        (class | NEW_LINE)*
    ;

class
    :
        'class' class_name = ID '{' '}'
    ;

main_function
    :
        'def' 'main' '()' ':' 'int' '{' '}'
    ;

function
    :
        'def' function_name = ID '{' '}'
    ;

variable
    :
        'var' variable_name = ID ':' TYPE '[]'? ';' // ??? Class TYPE
    ;

declaration
    :
        variable_name = ID '=' 'new' TYPE '();' // ??? Class TYPE
    ;

loop
    :
        'while' '(' statement ')' '{' statement* '}'
    ;

if
    :
        'if' statement 'then' expression ('else' expression)?
    ;

statement
    :

    ;

expression
    :

    ;

write
    :
        'writeln' '(' expression ')'
    ;

TYPE
    :
        ('int' | 'string' | 'boolean')
    ;

NUMBER
    :
		('-') ? [0-9]+
	;

STRING
    :
        '"' (~('"'))* '"'
    ;

WHITE_SPACE
    :
        (' '|'\t'|'\r') -> skip
    ;

NEW_LINE
    :
		'\r'? '\n'+
	;

ID
    :
        [a-zA-Z_][a-zA-Z0-9_]*
    ;

COMMENT
    :
        '#'(~[\r\n])* -> skip
   	;
