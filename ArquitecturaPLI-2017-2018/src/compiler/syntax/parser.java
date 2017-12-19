
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Dec 19 12:58:22 CET 2017
//----------------------------------------------------

package compiler.syntax;

import java_cup.runtime.Symbol;
import java.util.*;
import es.uned.lsi.compiler.lexical.*;
import es.uned.lsi.compiler.code.*;
import es.uned.lsi.compiler.intermediate.*;
import es.uned.lsi.compiler.semantic.*;
import es.uned.lsi.compiler.semantic.symbol.*;
import es.uned.lsi.compiler.semantic.type.*;
import es.uned.lsi.compiler.syntax.*;
import compiler.CompilerContext;
import compiler.lexical.*;
import compiler.syntax.nonTerminal.*;
import compiler.semantic.*;
import compiler.semantic.symbol.*;
import compiler.semantic.type.*;
import compiler.intermediate.*;
import compiler.code.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Dec 19 12:58:22 CET 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\040\000\002\002\004\000\002\023\002\000\002\002" +
    "\004\000\002\003\004\000\002\004\005\000\002\005\003" +
    "\000\002\005\003\000\002\005\004\000\002\005\003\000" +
    "\002\005\004\000\002\005\004\000\002\005\005\000\002" +
    "\007\004\000\002\012\003\000\002\012\004\000\002\013" +
    "\006\000\002\020\003\000\002\020\003\000\002\020\003" +
    "\000\002\010\004\000\002\014\003\000\002\014\004\000" +
    "\002\015\015\000\002\021\003\000\002\021\003\000\002" +
    "\011\004\000\002\017\003\000\002\017\004\000\002\016" +
    "\006\000\002\016\006\000\002\022\003\000\002\022\005" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\004\024\000\001\002\000\004\002\074\001" +
    "\002\000\004\024\007\001\002\000\004\002\uffff\001\002" +
    "\000\004\044\072\001\002\000\010\014\011\036\017\037" +
    "\013\001\002\000\004\044\060\001\002\000\006\002\ufffb" +
    "\037\013\001\002\000\004\044\044\001\002\000\004\002" +
    "\ufffe\001\002\000\010\002\ufffc\036\017\037\013\001\002" +
    "\000\004\002\ufff9\001\002\000\004\044\020\001\002\000" +
    "\004\007\024\001\002\000\006\002\uffee\037\uffee\001\002" +
    "\000\010\002\uffed\037\uffed\044\020\001\002\000\006\002" +
    "\uffec\037\uffec\001\002\000\004\011\025\001\002\000\004" +
    "\051\026\001\002\000\004\045\027\001\002\000\004\056" +
    "\030\001\002\000\004\045\031\001\002\000\004\052\032" +
    "\001\002\000\004\026\033\001\002\000\006\013\036\023" +
    "\034\001\002\000\004\054\uffea\001\002\000\004\054\037" +
    "\001\002\000\004\054\uffe9\001\002\000\010\002\uffeb\037" +
    "\uffeb\044\uffeb\001\002\000\006\002\ufffa\037\013\001\002" +
    "\000\004\002\ufff8\001\002\000\004\002\ufff6\001\002\000" +
    "\006\002\uffe7\044\044\001\002\000\006\053\054\055\uffe3" +
    "\001\002\000\004\055\047\001\002\000\004\002\uffe8\001" +
    "\002\000\010\013\036\023\034\044\050\001\002\000\004" +
    "\054\053\001\002\000\004\054\052\001\002\000\006\002" +
    "\uffe5\044\uffe5\001\002\000\006\002\uffe4\044\uffe4\001\002" +
    "\000\004\044\044\001\002\000\004\055\uffe2\001\002\000" +
    "\004\002\uffe6\001\002\000\004\002\ufff7\001\002\000\004" +
    "\007\064\001\002\000\010\002\ufff5\036\ufff5\037\ufff5\001" +
    "\002\000\012\002\ufff4\036\ufff4\037\ufff4\044\060\001\002" +
    "\000\010\002\ufff3\036\ufff3\037\ufff3\001\002\000\010\020" +
    "\067\035\066\045\065\001\002\000\004\054\uffef\001\002" +
    "\000\004\054\ufff1\001\002\000\004\054\ufff0\001\002\000" +
    "\004\054\071\001\002\000\012\002\ufff2\036\ufff2\037\ufff2" +
    "\044\ufff2\001\002\000\004\054\073\001\002\000\010\014" +
    "\ufffd\036\ufffd\037\ufffd\001\002\000\004\002\001\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\006\002\003\023\004\001\001\000\002\001" +
    "\001\000\006\003\005\004\007\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\005\013\007\014\010\011\011" +
    "\015\001\001\000\006\012\060\013\061\001\001\000\004" +
    "\011\056\001\001\000\010\016\042\017\045\022\044\001" +
    "\001\000\002\001\001\000\006\010\037\011\040\001\001" +
    "\000\002\001\001\000\006\014\020\015\021\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\014\022\015\021" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\021\034\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\011\041\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\016\042\017\055\022\044" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\021\050\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\022" +
    "\054\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\012" +
    "\062\013\061\001\001\000\002\001\001\000\004\020\067" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	SyntaxErrorManager syntaxErrorManager = CompilerContext.getSyntaxErrorManager();
	
	public void syntax_error(Symbol symbol)
	{ 
	    Token token = (Token) symbol.value;
	    syntaxErrorManager.syntaxError ("Error sintactico", token);	    
	}
		
	public void unrecovered_syntax_error(java_cup.runtime.Symbol symbol)
	{	
	    Token token = (Token) symbol.value;
	    syntaxErrorManager.syntaxFatalError ("Error fatal", token);
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {


	
	SyntaxErrorManager   syntaxErrorManager   = CompilerContext.getSyntaxErrorManager();
	SemanticErrorManager semanticErrorManager = CompilerContext.getSemanticErrorManager ();
	ScopeManagerIF       scopeManager         = CompilerContext.getScopeManager ();
	FinalCodeFactoryIF   finalCodeFactory     = CompilerContext.getFinalCodeFactory ();


  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // listaId ::= ID COMA listaId 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaId",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // listaId ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaId",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // declaracionVariable ::= listaId DOSPUNTOS ID PCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracionVariable",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // declaracionVariable ::= listaId DOSPUNTOS tipoPrimitivo PCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracionVariable",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // declaracionVariables ::= declaracionVariable declaracionVariables 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracionVariables",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // declaracionVariables ::= declaracionVariable 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracionVariables",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // seccionVariables ::= VAR declaracionVariables 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("seccionVariables",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // tipoPrimitivo ::= BOOLEAN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipoPrimitivo",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // tipoPrimitivo ::= INTEGER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipoPrimitivo",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // declaracionTipo ::= ID IGUAL ARRAY ACOR CDIGITO PUNTOS CDIGITO CCOR OF tipoPrimitivo PCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracionTipo",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // declaracionTipos ::= declaracionTipo declaracionTipos 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracionTipos",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // declaracionTipos ::= declaracionTipo 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracionTipos",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // seccionTipos ::= TYPE declaracionTipos 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("seccionTipos",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // valorLiteral ::= CDIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("valorLiteral",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // valorLiteral ::= FALSE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("valorLiteral",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // valorLiteral ::= TRUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("valorLiteral",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // declaracionConstante ::= ID IGUAL valorLiteral PCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracionConstante",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // declaracionConstantes ::= declaracionConstante declaracionConstantes 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracionConstantes",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // declaracionConstantes ::= declaracionConstante 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracionConstantes",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // seccionConstantes ::= CONST declaracionConstantes 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("seccionConstantes",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // medio ::= seccionConstantes seccionTipos seccionVariables 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("medio",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // medio ::= seccionTipos seccionVariables 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("medio",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // medio ::= seccionConstantes seccionVariables 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("medio",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // medio ::= seccionVariables 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("medio",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // medio ::= seccionConstantes seccionTipos 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("medio",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // medio ::= seccionTipos 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("medio",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // medio ::= seccionConstantes 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("medio",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // principio ::= MODULE ID PCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("principio",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // axiom ::= principio medio 
            {
              Axiom RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("axiom",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= NT$0 axiom 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int axleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int axright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Axiom ax = (Axiom)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
  		// No modificar esta estructura, aunque se pueden a�adir m�s acciones sem�nticas
  		// Para la entrega de febrero pueden comentarse las dos sentencias siguientes:
  		//List intermediateCode = ax.getIntermediateCode ();
  		//finalCodeFactory.create (intermediateCode);
  		// En caso de no comentarse las sentencias anteriores puede generar una excepcion
  		// en las llamadas a cupTest en la entrega de Febrero. Esto es debido a que 
  		// a�n no se tendr� implementada la generaci�n de c�digo intermedio ni final.
  		// Para la entrega de Junio deber�n descomentarse y usarse.
  		
  		syntaxErrorManager.syntaxInfo ("Parsing process ended.");
   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              Object RESULT =null;
 
        syntaxErrorManager.syntaxInfo ("Starting parsing..."); 
   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

