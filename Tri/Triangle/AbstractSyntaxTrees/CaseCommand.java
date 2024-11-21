package Triangle.AbstractSyntaxTrees;

import java.util.LinkedHashMap;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class CaseCommand extends Command {

	public LinkedHashMap<Terminal, Command> MAP;
	public Vname V;

	public CaseCommand(Vname vAST, LinkedHashMap<Terminal, Command> map,
			SourcePosition thePosition) {
		super(thePosition);
		V = vAST;
		MAP = map;
	}

	public Object visit(Visitor v, Object o) {
		  return v.visitCaseCommand(this, o);
	  }
	  
	  public void display(int indent) {
		  super.display(indent);
		  V.display(indent + 1);
		  for(Terminal T : MAP.keySet()){
			  T.display(indent+1);
			  MAP.get(T).display(indent+1);
		  }
	  }
}
