package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

import java.util.LinkedHashMap;

public class CaseExpression extends Expression {

    public LinkedHashMap<Terminal, Expression> MAP;
    public Vname V;

    public CaseExpression(Vname vAST, LinkedHashMap<Terminal, Expression> map,
                          SourcePosition thePosition) {
        super(thePosition);
        V = vAST;
        MAP = map;
    }


    public Object visit(Visitor v, Object o) {
      return v.visitCaseExpression(this, o);
    }


//    public CaseCommand(Expression eAST, LinkedHashMap<IntegerLiteral, Command> map,
//                       Command cAST, SourcePosition thePosition) {
//      super(thePosition);
//      E = eAST;
//      MAP = map;
//      C = cAST;
//    }
//
//    public LinkedHashMap<IntegerLiteral, Command> MAP;
//    public Command C;
//    public Expression E;
}