package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RecordDeclaration extends RecordTypeDeclaration {

    // Atributos
    public FieldTypeDenoter fields; // Representa los campos del registro
    public SourcePosition position; // Posición en el código fuente

    // Constructor
    public RecordDeclaration(FieldTypeDenoter fieldAST, SourcePosition thePosition) {
        super(thePosition);
        this.fields = fieldAST; // Inicializa los campos del registro
        this.position = thePosition; // Inicializa la posición
    }

    // Método para visitar esta clase con un visitor
    public Object visit(Visitor v, Object o) {
        return v.visitRecordDeclaration(this, o);
    }

    // Método equals para comparar dos declaraciones de tipo record
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof RecordDeclaration) {
            return this.fields.equals(((RecordDeclaration) obj).fields);
        }
        return false;
    }
}
