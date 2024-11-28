package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class FuncRecordAggregate extends RecordAggregate {
    public Identifier I;
    public FormalParameterSequence FPS;
    public TypeDenoter T;
    public Expression E;

    public FuncRecordAggregate(Identifier iAST, FormalParameterSequence fpsAST, TypeDenoter tAST, Expression eAST, SourcePosition thePosition) {
        super(thePosition);
        I = iAST;
        FPS = fpsAST;
        T = tAST;
        E = eAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitFuncRecordAggregate(this, o);
    }
}
