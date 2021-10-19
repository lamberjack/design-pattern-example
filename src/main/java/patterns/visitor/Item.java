package patterns.visitor;

/**
 * Classe astratta comune ai concreteItem, contiene gli attributi a comune tra essi.
 */
public abstract class Item {


  private Double unitPrice;

  private String description;

  public Item(String description, Double unitPrice){
    this.description = description;
    this.unitPrice = unitPrice;
  }

  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
