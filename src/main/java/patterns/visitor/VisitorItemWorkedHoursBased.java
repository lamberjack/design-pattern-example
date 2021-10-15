package patterns.visitor;

public class VisitorItemWorkedHoursBased implements Visitor<ItemWorkedHourBased>{

  @Override
  public Double visit(ItemWorkedHourBased itemWorkedHourBased) {

    return itemWorkedHourBased.getWorkedHours()*itemWorkedHourBased.getUnitPrice();
  }
}
