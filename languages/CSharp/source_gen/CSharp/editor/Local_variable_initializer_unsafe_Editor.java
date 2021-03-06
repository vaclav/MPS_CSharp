package CSharp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.OldNewCompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Local_variable_initializer_unsafe_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_r4uvf1_a(editorContext, node);
  }
  private EditorCell createCollection_r4uvf1_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_r4uvf1_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_r4uvf1_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_r4uvf1_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_r4uvf1_c0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_r4uvf1_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_r4uvf1_e0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_r4uvf1_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "stackalloc");
    editorCell.setCellId("Constant_r4uvf1_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_r4uvf1_b0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Local_variable_initializer_unsafe_Editor.Type_1SingleRoleHandler_r4uvf1_b0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f725eL, 0x70aadf795f750cL, "Type_1"), editorContext);
    return provider.createCell();
  }
  private class Type_1SingleRoleHandler_r4uvf1_b0 extends SingleRoleCellProvider {
    public Type_1SingleRoleHandler_r4uvf1_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f725eL, 0x70aadf795f750cL, "Type_1"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Type_1");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_r4uvf1_a1a(editorContext, node);
    }
    private EditorCell createConstant_r4uvf1_a1a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_r4uvf1_a1a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_r4uvf1_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "[");
    editorCell.setCellId("Constant_r4uvf1_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_r4uvf1_d0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Local_variable_initializer_unsafe_Editor.Expression_2SingleRoleHandler_r4uvf1_d0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f725eL, 0x70aadf795f750dL, "Expression_2"), editorContext);
    return provider.createCell();
  }
  private class Expression_2SingleRoleHandler_r4uvf1_d0 extends SingleRoleCellProvider {
    public Expression_2SingleRoleHandler_r4uvf1_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f725eL, 0x70aadf795f750dL, "Expression_2"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Expression_2");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_r4uvf1_a3a(editorContext, node);
    }
    private EditorCell createConstant_r4uvf1_a3a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_r4uvf1_a3a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_r4uvf1_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "]");
    editorCell.setCellId("Constant_r4uvf1_e0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
