package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones

%%
 
%public
%class Scanner
%char
%line
%column
%cup


%implements ScannerIF
%scanerror LexicalError
%ignorecase
%state COMMENT

%eof{
	if (commentCount!=0) {
    			lexicalErrorManager.lexicalError("Comentarios no balanceados. Compruebe la l�nea " + commentLinea );
    		}

%eof}

// incluir aqui, si es necesario otras directivas

%{
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  private int commentCount = 0;
  private int commentLinea=0;
%}  
  

ESPACIO_BLANCO=[ \t\r\n\f]
fin = "fin"{ESPACIO_BLANCO}
ALFA=[A-Za-z]
DIGITO=[0-9]



%%

<YYINITIAL> 
{
           			       
    "-"                {  
                           Token token = new Token (sym.MENOS);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
                        
    "*"                {  
                           Token token = new Token (sym.POR);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    ">"                {  
                           Token token = new Token (sym.MAYOR);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    "="                {  
                           Token token = new Token (sym.IGUAL);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                   
      ".."                {  
                           Token token = new Token (sym.PUNTOS);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
      "."                {  
                           Token token = new Token (sym.PUNTO);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                                         
      
                        
 
     AND               {  
                           Token token = new Token (sym.AND);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
    ARRAY                {  
                           Token token = new Token (sym.ARRAY);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    BEGIN                {  
                           Token token = new Token (sym.BEGIN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    BOOLEAN               {  
                           Token token = new Token (sym.BOOLEAN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    CONST                {  
                           Token token = new Token (sym.CONST);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    DO                {  
                           Token token = new Token (sym.DO);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    ELSE               {  
                           Token token = new Token (sym.ELSE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    END               {  
                           Token token = new Token (sym.END);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    FALSE               {  
                           Token token = new Token (sym.FALSE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    FOR                {  
                           Token token = new Token (sym.FOR);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    IF                {  
                           Token token = new Token (sym.IF);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    INTEGER                {  
                           Token token = new Token (sym.INTEGER);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    MODULE               {  
                           Token token = new Token (sym.MODULE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    NOT                {  
                           Token token = new Token (sym.NOT);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    OF                {  
                           Token token = new Token (sym.OF);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
    PROCEDURE	{
			   Token token = new Token(sym.PROCEDURE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
			}
			
                        
    OR                {  
                           Token token = new Token (sym.OR);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
                        
    RECORD               {  
                           Token token = new Token (sym.RECORD);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    RETURN              {  
                           Token token = new Token (sym.RETURN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    THEN               {  
                           Token token = new Token (sym.THEN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    TO                {  
                           Token token = new Token (sym.TO);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    TRUE                {  
                           Token token = new Token (sym.TRUE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    TYPE                {  
                           Token token = new Token (sym.TYPE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    VAR               {  
                           Token token = new Token (sym.VAR);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    WHILE               {  
                           Token token = new Token (sym.WHILE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    WRITESTRING               {  
                           Token token = new Token (sym.WRITESTRING);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    WRITEINT                {  
                           Token token = new Token (sym.WRITEINT);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
    WRITELN                {  
                           Token token = new Token (sym.WRITELN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
 {ALFA} ({ALFA} | {DIGITO})*
                 {  
                           Token token = new Token (sym.ID);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
 {DIGITO}+         {  
                           Token token = new Token (sym.CDIGITO);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
"\x22" ({ALFA} | {DIGITO})* "\x22"
{  
                           Token token = new Token (sym.CCADENA);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }

 "("        {  
                           Token token = new Token (sym.APAREN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
 ")"        {  
                           Token token = new Token (sym.CPAREN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
  "["        {  
                           Token token = new Token (sym.ACOR);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
 "]"        {  
                           Token token = new Token (sym.CCOR);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
                        
  ","        {  
                           Token token = new Token (sym.COMA);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
 ";"        {  
                           Token token = new Token (sym.PCOMA);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
 ":"        {  
                           Token token = new Token (sym.DOSPUNTOS);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
                        }
 "(*"        {  
                           commentCount=commentCount+1;
                           commentLinea = yyline;
                           yybegin (COMMENT);
                        }
 "*)"        {  
                           commentCount=commentCount-1;
                           commentLinea= yyline;
                           yybegin (COMMENT);
                        }
                        

    
    // incluir aqui el resto de las reglas patron - accion
  
			

   {ESPACIO_BLANCO}	{}

{fin} {}
    
    // error en caso de coincidir con ning�n patr�n
	[^]     
                        {                                               
                           LexicalError error = new LexicalError ();
                           error.setLine (yyline + 1);
                           error.setColumn (yycolumn + 1);
                           error.setLexema (yytext ());
                           lexicalErrorManager.lexicalError (error);
                        }
    
}

<COMMENT>  {

	"(*" { commentCount = commentCount+1;
			commentLinea = yyline;
		
		
		}
		
    "*)" {
    		  commentCount = commentCount-1;
    		  if (commentCount==0)
    		  	yybegin (YYINITIAL);
    		  else
    		  	commentLinea=yyline;
    }
    		
    	[^] {}
    	
    }




                         


