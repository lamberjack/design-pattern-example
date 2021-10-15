package patterns.visitor;

/**
 * Classe astratta comune ai concreteItem, implementa l'interfaccia Visitable che la
 * vincola ad implementare accept(Visitor v); in questo caso essendo una classe astratta l'implementazione
 * di accept(Visitor v) viene demandata alle sottoclassi concrete.
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
