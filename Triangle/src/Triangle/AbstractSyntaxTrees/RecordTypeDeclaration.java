package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RecordTypeDeclaration extends Declaration {
    public FieldTypeDenoter fields;

    public RecordTypeDeclaration(FieldTypeDenoter fields, SourcePosition pos) {
        super(pos);
        this.fields = fields;
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitRecordDeclaration(this, o);  // Aquí se pasa "this" como ast
    }
}
