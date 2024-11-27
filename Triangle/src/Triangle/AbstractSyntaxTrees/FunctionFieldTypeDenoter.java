package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class FunctionFieldTypeDenoter extends FieldTypeDenoter {

    public FunctionFieldTypeDenoter(Identifier iAST, FormalParameterSequence fpsAST, TypeDenoter tdAST, Expression eAST, SourcePosition thePosition) {
        super(thePosition);
        I = iAST;
        FPS = fpsAST;
        TD = tdAST;
        E = eAST;
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitFunctionFieldTypeDenoter(this, o);
    }

    public Identifier I;
    public FormalParameterSequence FPS;
    public TypeDenoter TD;
    public Expression E;

}