package patterns.visitor;

/**
 * Concrete visitor per il tipo di Elementi concreto {@link ItemPiecesBased}.
 *
 */
public class VisitorItemPiecesBased implements Visitor <ItemPiecesBased> {

  @Override
  public Double visit(ItemPiecesBased itemPiecesBased) {
    return itemPiecesBased.getUnitPrice()*itemPiecesBased.getNumberOfPieces();
  }
}
