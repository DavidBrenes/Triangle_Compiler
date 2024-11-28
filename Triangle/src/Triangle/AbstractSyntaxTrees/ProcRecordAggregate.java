package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ProcRecordAggregate extends RecordAggregate {
    public Identifier I;
    public FormalParameterSequence FPS;
    public Command C;

    public ProcRecordAggregate(Identifier iAST, FormalParameterSequence fpsAST, Command cAST, SourcePosition thePosition) {
        super(thePosition);
        I = iAST;
        FPS = fpsAST;
        C = cAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitProcRecordAggregate(this, o);
    }
}
