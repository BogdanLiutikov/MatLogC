grammar Gram;

//@header{
//import src.*;
//}

expression returns [Node expr]: exp1=expression AND exp2=expression {$expr = new BinOp($exp1.expr, $exp2.expr, $AND.text);}
            | exp1=expression OR exp2=expression {$expr = new BinOp($exp1.expr, $exp2.expr, $OR.text);}
            | NOT exp1=expression {$expr = new Not($exp1.expr);}
            | <assoc=right> exp1=expression IMPL exp2=expression {$expr = new BinOp($exp1.expr, $exp2.expr, $IMPL.text);}
            | LB exp1=expression RB {$expr = $exp1.expr;}
            | VAR {$expr = new Variable($VAR.text);};

NOT: '!';
AND: '&';
OR: '|';
IMPL: '->';
LB : '(';
RB : ')';
VAR: [A-Z]('A'..'Z'|'0'..'9'| '\'')*;
WS: [' '\t\r]+ -> skip;