/* Generated By:JJTree: Do not edit this line. ASTHtmlScript.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package net.sourceforge.pmd.jsp.ast;

public class ASTHtmlScript extends SimpleNode {
  public ASTHtmlScript(int id) {
    super(id);
  }

  public ASTHtmlScript(JspParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JspParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8170f25fd45a522c3d56439f6d24e048 (do not edit this line) */
