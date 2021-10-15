package patterns.visitor;

/**
 * Visitor concreto per il tipo di elementi concreto {@link ItemWeightBased}
 */
public class VisitorItemWeightBased implements Visitor <ItemWeightBased> {

  @Override
  public Double visit(ItemWeightBased itemWeightBased) {
    return itemWeightBased.getUnitPrice()*itemWeightBased.getWeight();
  }
}
