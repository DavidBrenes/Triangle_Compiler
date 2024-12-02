package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ProcedureFieldTypeDenoter extends FieldTypeDenoter {

    public ProcedureFieldTypeDenoter(Identifier iAST, FormalParameterSequence fpsAST, Command cAST, SourcePosition thePosition) {
        super(thePosition);
        I = iAST;
        FPS = fpsAST;
        C = cAST;
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitProcedureFieldTypeDenoter(this, o);
    }

    public Identifier I;
    public FormalParameterSequence FPS;
    public Command C;
    
}