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
        'var' variable_name = ID ':' TYPE
    ;

array_variable
    :
        'var'
    ;

loop
    :
        'while'
    ;
if
    :
        'if'
    ;

write
    :
        'writeln'
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
