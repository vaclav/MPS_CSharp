package CSharp.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class Simple_embedded_statement_4_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("switch");
    tgs.append("(");
    if (SLinkOperations.getTarget(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f709cL, 0x70aadf795f73b3L, "Expression_1")) != null) {
      tgs.appendNode(SLinkOperations.getTarget(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f709cL, 0x70aadf795f73b3L, "Expression_1")));
    }
    tgs.append(")");
    tgs.append("{");
    if (ListSequence.fromList(SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f709cL, 0x70aadf795f73b4L, "Switch_section_2"))).count() > 0) {
      {
        Iterable<SNode> collection = SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f709cL, 0x70aadf795f73b4L, "Switch_section_2"));
        final SNode lastItem = Sequence.fromIterable(collection).last();
        for (SNode item : collection) {
          tgs.appendNode(item);
          if (item != lastItem) {
            tgs.append(" ");
          }
        }
      }
    }
    tgs.append("}");
  }
}
