grammar Gramatica;
star: main '{'


             (arit)?
             (imp)?
             (para)?
             (declarationVar (si)*)*
             (imp)?
             (para)?
        '}';
//declaracion de variables
declarationVar: (TIPODATOS)? (ID PUNCOM| ID '=' (LITERAL|NUMERO|ID|ARIMETICOS)* PUNCOM);
//impresion en consola
imp: 'imp (' (ID|NUMERO|LITERAL|COMA|ARIMETICOS)+ ')' PUNCOM;
arit: 'ARIT (' NUMERO ARIMETICOS NUMERO(ARIMETICOS NUMERO)?(MULTIOPER)? ')'PUNCOM;
main: 'main';
//Estructura para si
si: 'SI (' ID OPER_COND (ID|NUMERO) ((yy|oo)ID OPER_COND ID)* ') {'
                         (declarationVar)*
                         (arit)?
                         (si)?
                         (imp)?
                         (para)?
                         (return)?
                         (declarationVar)?
                         (arit)?
                       '}' PUNCOM;
//Operadores de condiciones verdaderos o falsos
no: 'NO';
sino: 'SINO';
yy: 'yy';
oo: 'oo';
//return
return: 'Return' (ID|NUMERO|LITERAL|COMA)* ;
//Funcion para y caracteristicas que permite, conjunto con sus estructura para utlizarla
para: 'PARA ('TIPODATOS ID '=' NUMERO ':' ID OPER_COND (NUMERO|ID) ':' ID (ARIMETICOS)+ '){'
                  (declarationVar)*
                   (arit)?
                   (si)?
                   (imp)?
                   (para)?
                   (return)?
                   (declarationVar)?
                 '}' PUNCOM;
//Declaracion de componenentes del lenaguaje
TIPODATOS: String|Boolean|Int|Double;
LITERAL: '"' (ID(NEWLINE)?)*'"';
ARIMETICOS: SUM|REST|DIV|MUL;
NUMERO: DIGIT+;
PUNCOM: ';';
SIGNOS: COMA|PUNCOM|PUNTO;
MULTIOPER: ('(' NUMERO ARIMETICOS NUMERO (ARIMETICOS NUMERO)? ')')+;
ID: ([a-zA-Z]|UNDERSCORE)(LETTER|UNDERSCORE|DIGIT|SIGNOS)* ;
OPER_COND: Lt|Gt|Disc|Equal|LtEqual|GtEqual;
LETTER:[a-zA-Záéíóú];
fragment DIGIT: [0-9];
fragment UNDERSCORE: '_';
//Tipos de datos
fragment String: 'Txt';
fragment Int: 'Nu';
fragment Double: 'Db';
fragment Boolean: 'bool';
//Operadores logicos
fragment Disc: '!=';
fragment Lt         : '<';
fragment LtEqual    : '<=';
fragment GtEqual   : '>=';
fragment Gt         : '>';
fragment Equal      : '==';
//Operadores matematicos
fragment SUM: '+';
fragment REST: '-';
fragment MUL: '*';
fragment DIV: '/';
//Caracteres especiales
COMA: ',';
fragment PUNTO: '.';
NEWLINE : [ \r\n\t]+ -> skip;
