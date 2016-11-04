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

public class Primary_expression_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    if (SLinkOperations.getTarget(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70efL, 0x70aadf795f7411L, "Primary_expression_start_1")) != null) {
      tgs.appendNode(SLinkOperations.getTarget(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70efL, 0x70aadf795f7411L, "Primary_expression_start_1")));
    }
    if (ListSequence.fromList(SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70efL, 0x70aadf795f7412L, "Bracket_expression_2"))).count() > 0) {
      tgs.append(" ");
      {
        Iterable<SNode> collection = SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70efL, 0x70aadf795f7412L, "Bracket_expression_2"));
        final SNode lastItem = Sequence.fromIterable(collection).last();
        for (SNode item : collection) {
          tgs.appendNode(item);
          if (item != lastItem) {
            tgs.append(" ");
          }
        }
      }
    }
    if (ListSequence.fromList(SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70efL, 0x70aadf795f7413L, "Primary_expression_block_1_1_3"))).count() > 0) {
      tgs.append(" ");
      {
        Iterable<SNode> collection = SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70efL, 0x70aadf795f7413L, "Primary_expression_block_1_1_3"));
        final SNode lastItem = Sequence.fromIterable(collection).last();
        for (SNode item : collection) {
          tgs.appendNode(item);
          if (item != lastItem) {
            tgs.append(" ");
          }
        }
      }
    }
  }
}