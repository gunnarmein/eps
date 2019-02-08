grammar LOLcode;

@header {
   package lol;
}

fragment OBTW: 'obtw'|'OBTW';
fragment BTW: 'btw' | 'BTW';
fragment TLDR: 'tldr' | 'TLDR';
MULTILINECOMMENT: OBTW .*? TLDR -> channel(HIDDEN);
SINGLELINECOMMENT: BTW ~[\r\n\u2028\u2029]* -> channel(HIDDEN);


fragment DIGIT_NO_ZERO: '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
fragment DIGIT: DIGIT_NO_ZERO | '0';
MINUS: '-';
DOT:'.';

fragment ID_START: [a-zA-Z_];
fragment ID_CHAR: [a-zA-Z0-9_];

fragment NATURAL_NUMBER: DIGIT_NO_ZERO DIGIT*;
fragment NATURAL_NUMBER_OR_ZERO: '0' | NATURAL_NUMBER;
NUMBER: MINUS? NATURAL_NUMBER_OR_ZERO (DOT NATURAL_NUMBER_OR_ZERO)?;

fragment QUOTE: '"';
YARN_LITERAL: QUOTE .*? QUOTE;

WIN: 'win' | 'WIN';
FAIL: 'fail' | 'FAIL';
NUMBR: 'numbr'|'NUMBR';
NUMBAR: 'numbar'|'NUMBAR';
YARN: 'yarn' |'YARN';
SUM: 'sum' | 'SUM';
DIFF: 'diff' | 'DIFF';
PRODUKT: 'produkt' | 'PRODUKT';
QUOSHUNT: 'quoshunt' | 'QUOSHUNT';
MOD: 'mod' | 'MOD';
BIGGR: 'biggr' | 'BIGGR';
SMALLR: 'smallr' | 'SMALLR';
IZ: 'iz'|'IZ';
MAEK: 'maek'|'MAEK';
THAN: 'than' | 'THAN';
AN: 'an' | 'AN';
OF: 'of' | 'OF';
IT: 'it' | 'IT';
MKAY: 'mkay' | 'MKAY';
SMOOSH: 'smoosh'|'SMOOSH';
TROOF: 'troof' | 'TROOF';
BOTH: 'both' | 'BOTH';
EITHER: 'either' | 'EITHER';
ANY: 'any' | 'ANY';
ALL: 'all' | 'ALL';
WON: 'won' | 'WON';
NOT: 'not' | 'NOT';
SAEM: 'saem' | 'SAEM';
DIFFRINT: 'diffrint' | 'DIFFRINT';
I: 'i' | 'I';
HAS: 'has' | 'HAS';
A: 'a' | 'A';
R: 'r' | 'R';
ITZ: 'itz' | 'ITZ';
HOW: 'how' | 'HOW';
DUZ: 'duz' | 'DUZ';
YR: 'yr' | 'YR';
IF: 'if' | 'IF';
U: 'u' | 'U';
SAY: 'say' | 'SAY';
SO: 'so' | 'SO';
IM: 'i\'m' | 'I\'M';
IN: 'in' | 'IN';
OUTTA: 'outta' | 'OUTTA';
TIL: 'til' | 'TIL';
WILE: 'wile' | 'WILE';
UPPIN: 'uppin' | 'UPPIN';
NERFIN: 'nerfin' | 'NERFIN';
WTF:'wtf' | 'WTF';
QUESTION: '?';
OIC: 'oic' | 'OIC';
OMG: 'omg' | 'OMG';
OMGWTF: 'omgwtf' | 'OMGWTF';
FOUND: 'found' | 'FOUND';
GTFO: 'gtfo' | 'GTFO';
O: 'o' | 'O';
RLY: 'rly' | 'RLY';
YA: 'ya' | 'YA';
NO: 'no' | 'NO';
WAI: 'wai' | 'WAI';
MEBBE: 'mebbe' | 'MEBBE';
GIMMEH: 'gimmeh'|'GIMMEH';
INVISIBLE: 'invisible'|'INVISIBLE';
VISIBLE: 'visible'|'VISIBLE';
EXCLAMATION: '!';
HAI: 'hai' | 'HAI';
KTHXBYE: 'kthxbye' | 'KTHXBYE';


COMMA: ',';
NEWLINE: '\n';
IDENTIFIER: ID_START ID_CHAR*;
ELLIPSIS: '...\n' -> skip;
WS   : [ \r\t] -> skip;
   



literal_value: NUMBER|YARN_LITERAL|WIN|FAIL;
atom: literal_value | IT | IDENTIFIER;
vartype: NUMBR | NUMBAR | YARN | TROOF;



// expressions

sum: SUM OF expr AN expr;
diff:  DIFF OF expr AN expr ;
product:   PRODUKT OF expr AN expr ;
quotient:   QUOSHUNT OF expr AN expr ;
bigger: IZ BIGGR expr THAN expr;
smallr: IZ SMALLR expr THAN expr;
min: SMALLR OF expr AN expr;
max: BIGGR OF expr AN expr;
mod:   MOD OF expr AN expr ;
not:   NOT expr ;
same:    BOTH (SAEM | DIFFRINT) expr AN expr ;
and:   BOTH OF expr AN expr ;
either:   EITHER OF expr AN expr ;
one:   WON OF expr AN expr ;
all:   ALL OF expr (AN expr)* MKAY;
any:   ANY expr (AN expr)* MKAY;
concat: SMOOSH expr ((AN|COMMA) expr)* MKAY;
cast: MAEK expr A vartype;
var_ref: IDENTIFIER;


expr: sum |
   diff |
   product |
   quotient |
   mod |
   not |
   same |
   and |
   either |
   one |
   all |
   any |
   concat |
   cast |
   var_ref |
   atom;



// variables and assignment
var_decl: I HAS A IDENTIFIER (ITZ expr)?;
var_assignment: IDENTIFIER R expr;


// function declaration
arg_decl: YR IDENTIFIER;
more_args_decl: (AN arg_decl)* MKAY;
args_decl: arg_decl more_args_decl?;
func_decl: HOW (IZ|DUZ) I IDENTIFIER args_decl? separator+ (block separator+)? IF U SAY SO;

// function return
return_statement: (FOUND YR expr) | GTFO;

//function call
arg: YR expr;
more_args: (AN arg_decl)* MKAY;
args: arg more_args?;
func_call: I (DUZ|IZ) IDENTIFIER args;

// loops


verb: UPPIN | NERFIN;
loop_action: verb YR IDENTIFIER;
loop: IM IN YR IDENTIFIER loop_action (TIL|WILE) expr separator+ block separator+ IM OUTTA YR IDENTIFIER;

// switch / case

aswitch: WTF QUESTION separator+ (acase separator+)+ (adefault separator+)? OIC;
acase: OMG literal_value separator+ block;
adefault: OMGWTF separator+ block;


// if / then / else


anif: O RLY QUESTION separator;
then: YA RLY separator block;
elseif: MEBBE expr separator block;
anelse: NO WAI separator block;
ifthenelseifelse: anif then (separator elseif)* (separator anelse)? separator  OIC;

// input / output

input: GIMMEH IDENTIFIER;
output_args: expr? ((COMMA expr)* MKAY)?;
output: VISIBLE output_args EXCLAMATION?;




// statments and blocks

core_statement:
   var_decl |
   var_assignment | 
   loop |
   ifthenelseifelse |
   aswitch |
   input |
   output |
   func_call |
   expr 
;

inner_statement: 
   core_statement |
   return_statement |
   GTFO;

top_level_statement: 
   core_statement |
   func_decl
;

separator: COMMA | NEWLINE;

block: (inner_statement (separator+ inner_statement )*)?;
top_level_block: (top_level_statement (separator+ top_level_statement)*)?;

// program block
program: HAI separator+ top_level_block separator+ KTHXBYE;


