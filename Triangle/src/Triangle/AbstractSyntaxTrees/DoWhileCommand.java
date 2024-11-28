package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class DoWhileCommand extends Command {
  public Command C; // El cuerpo del bucle
  public Expression E; // La condición del bucle

  public DoWhileCommand(Command cAST, Expression eAST, SourcePosition thePosition) {
    super(thePosition);
    C = cAST;
    E = eAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitDoWhileCommand(this, o);
  }
}
