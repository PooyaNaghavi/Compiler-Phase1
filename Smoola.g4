grammar Smoola;

@members{
   void print(Object obj){
        System.out.println(obj);
   }
}

    //todo main class should be first and doesn't have child
program
    :
//        (main_class)
//        (classes | NEW_LINE)*
        var_def
    ;

    //todo class name, function name, variable name should be unique
    //todo extends

//return_main
//    :
////        'return' return_value | class_call | method_call
//    ;



returnExpression
    :
        NUMBER| ID
    ;
//main_class
//    :
//        'class' class_name = ID '{' main_function '}'
//    ;

//main_function
//    :
//        'def' 'main' '()' ':' 'int' '{'
//            statement
//            main_return | returning
//        '}'
//    ;
main_return
    :
        'return' newObj '.' method ';'
    ;
newObj
    :
        'new' ID '()' | '(' arguments ')'
    ;
returning
    :
        'return' returnExpression ';'
//        'return' Number ';'
    ;
method
    :
        ID '()' | '(' arguments ')'
    ;
arguments
    :
         argument + (',' argument)*
    ;
argument
    :
        ID | NUMBER
    ;
classes
    :
//        'class' class_name1 = ID 'extends' class_name2 = ID '{' (variable)* (function)* '}'
    ;
//    // todo variables before statements
//    // todo funtions should have return
//function
//    :
//        'def' function_name = ID '(' (ID ':' (TYPE | ID) (',' ID ':' (TYPE | ID))*)? ')' ':' (TYPE | ID) '{' '}'
//    ;
//
//variable
//    :
//        'var' variable_name = ID ':' (TYPE | ID) '[]'? ';'
//    ;
//    // todo : psitive numbers
//
//declration
//    :
//        variable_name = ID '=' 'new' (TYPE '[' POSITIVE_NUMBER ']' | ID '()' ) ';'
//    ;
//
//function_declration
//    :
//        ID '.' ID '(' (function_input(',' function_input)*)? ');'
//    ;
//
//function_input
//    :
//        NUMBER // | ???
//    ;
//
loop
    :
        'while' '(' expression ')' '{' statement* '}'
    ;
    //todo : can we have if in else ?
if_then
    :
        'if' expression 'then' statement ('else' statement*)?
    ;
    // todo : implement operator
statement
    :
        ('{' statement* '}' | if_then | loop | ID '=' expression ';')
    ;
//
expression
    :
//        ID ( COMPARE_SIGN | LOGIC_SIGN ) (ID | NUMBER)
         (leftMostEXP (SIGN| COMPARE_SIGN| LOGIC_SIGN) expression) |leftMostEXP | '(' expression ')'
    ;
leftMostEXP
    :
        Negative_SIGN? (ID | NUMBER)
    ;
//    // todo : int , string , array
//write
//    :
//        'writeln' '(' expression ');'
//    ;
//    // todo : length for array
//    :
//        NUMBER | ID // | 2 + 3
//    ;
//
//method_call
//    :
//        ID '.' ID '(' (function_input (',' function_input)*)? ');'
//    ;
//
//class_call
//    :
//        'new' ID '().' ID '(' (function_input (',' function_input)*)? ');'
//    ;
//
//length
//    :
//        ID '.' 'length'
//    ;
//
//    //todo : expression in Rvalue !?
//assignment
//    :
//        ID ('[' (ID | POSITIVE_NUMBER) ']')? '=' ID | NUMBER | expression ';'
//    ;
//
var_def
    :
        'var' ID':' TYPE ';'
    ;
TYPE
    :
        'int' | 'string' | 'boolean' | 'int[' ']' | 'Class'
    ;
Negative_SIGN:
        '-'
    ;
SIGN
    :
        '+' | '-' | '*' | '/'
    ;

COMPARE_SIGN
    :
        '<>' | '==' | '<' | '>'
    ;
//
LOGIC_SIGN
    :
        '!' | '||' | '&&'
    ;
//

NUMBER
    :
		(('-' | '+')[1-9]+[0-9]*) | [0-9]+
	;

POSITIVE_NUMBER
    :
        [1-9][0-9]*
    ;

STRING
    :
        '"' (~('"'))* '"'
    ;

WHITE_SPACE
    :
        (' ' | '\t' | '\r' | '\n') -> skip
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