package CSharp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.OldNewCompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class Member_declarator_2_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_jmr2kh_a(editorContext, node);
  }
  private EditorCell createCollection_jmr2kh_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_jmr2kh_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createRefNode_jmr2kh_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_jmr2kh_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_jmr2kh_c0(editorContext, node));
    return editorCell;
  }
  private EditorCell createRefNode_jmr2kh_a0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Member_declarator_2_Editor.Identifier_1SingleRoleHandler_jmr2kh_a0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f6fd4L, 0x70aadf795f72ebL, "Identifier_1"), editorContext);
    return provider.createCell();
  }
  private class Identifier_1SingleRoleHandler_jmr2kh_a0 extends SingleRoleCellProvider {
    public Identifier_1SingleRoleHandler_jmr2kh_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f6fd4L, 0x70aadf795f72ebL, "Identifier_1"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Identifier_1");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_jmr2kh_a0a(editorContext, node);
    }
    private EditorCell createConstant_jmr2kh_a0a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_jmr2kh_a0a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_jmr2kh_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "=");
    editorCell.setCellId("Constant_jmr2kh_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_jmr2kh_c0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Member_declarator_2_Editor.Expression_2SingleRoleHandler_jmr2kh_c0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f6fd4L, 0x70aadf795f72ecL, "Expression_2"), editorContext);
    return provider.createCell();
  }
  private class Expression_2SingleRoleHandler_jmr2kh_c0 extends SingleRoleCellProvider {
    public Expression_2SingleRoleHandler_jmr2kh_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f6fd4L, 0x70aadf795f72ecL, "Expression_2"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
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
      return this.createConstant_jmr2kh_a2a(editorContext, node);
    }
    private EditorCell createConstant_jmr2kh_a2a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_jmr2kh_a2a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
}