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
// todo: put "int" or not?!! the problem is this
main_function
    :
        'def' 'main' '()' ':' 'int' '{' '}'
    ;

function
    :
        'def' function_name = ID '{' '}'
    ;
// todo : what to do with "TYPE"?!
// todo : consider 2-d array
variable
    :
        'var' variable_name = ID ':' TYPE '[]'? ';' // ??? Class TYPE
    ;
// todo : construct for class
// todo : extend class
declaration
    :
        variable_name = ID '=' 'new' TYPE '();' ?  // ??? Class TYPE
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
