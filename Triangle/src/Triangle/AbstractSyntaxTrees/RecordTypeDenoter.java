/*
 * @(#)RecordTypeDenoter.java                2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RecordTypeDenoter extends TypeDenoter {

  public RecordTypeDenoter(FieldTypeDenoter ftAST, SourcePosition thePosition) {
    super(thePosition);
    FT = ftAST;
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return v.visitRecordTypeDenoter(this, o);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ErrorTypeDenoter) {
      return true;
    } else if (obj instanceof RecordTypeDenoter) {
      return this.FT.equals(((RecordTypeDenoter) obj).FT);
    } else {
      return false;
    }
  }

  @Override
  public void display(int indent) {
    super.display(indent);
    if (FT != null) {
      FT.display(indent + 1);
    }
  }

  // Campo que representa los tipos en el registro
  public FieldTypeDenoter FT;
}
