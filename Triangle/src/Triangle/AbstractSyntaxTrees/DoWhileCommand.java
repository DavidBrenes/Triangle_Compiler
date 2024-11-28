package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class DoWhileCommand extends Command {
    public Command C;
    public Expression E;

    public DoWhileCommand(Command commandAST, Expression expressionAST, SourcePosition thePosition) {
        super(thePosition);
        C = commandAST;
        E = expressionAST;
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitDoWhileCommand(this, o);
    }
}
