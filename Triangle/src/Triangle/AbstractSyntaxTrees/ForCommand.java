package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends Command {
    public Vname V;                  // Variable de control
    public Expression E1;            // Expresión inicial
    public Expression E2;            // Expresión final
    public IntegerLiteral step;      // Paso (opcional)
    public Command body;             // Comando dentro del for

    public ForCommand(Vname vname, Expression startExpression, Expression endExpression, 
                      IntegerLiteral stepLiteral, Command bodyCommand, SourcePosition pos) {
        super(pos);
        this.V = vname;
        this.E1 = startExpression;
        this.E2 = endExpression;
        this.step = stepLiteral;
        this.body = bodyCommand;
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitForCommand(this, o);
    }
}
