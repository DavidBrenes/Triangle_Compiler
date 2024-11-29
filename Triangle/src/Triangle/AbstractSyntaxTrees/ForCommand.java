package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends Command {
    public Vname controlVar; // Variable de control
    public Expression startExp; // Expresión inicial
    public Expression endExp; // Expresión final
    public IntegerLiteral step; // Paso (opcional, puede ser nulo)
    public Command command; // Comando a ejecutar en el bucle

    public ForCommand(Vname controlVar, Expression startExp, Expression endExp, 
                      IntegerLiteral step, Command command, SourcePosition thePosition) {
        super(thePosition);
        this.controlVar = controlVar;
        this.startExp = startExp;
        this.endExp = endExp;
        this.step = step;
        this.command = command;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitForCommand(this, o);
    }
}

