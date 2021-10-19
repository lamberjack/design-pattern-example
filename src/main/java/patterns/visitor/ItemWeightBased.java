package patterns.visitor;

/**
 * Oggetto concreto che estende la classe {@link Item} ed implementa l'interfaccia {@link Visitable}
 * con il relativo {@link VisitorItemWeightBased} concreto.
 */
public class ItemWeightBased extends Item implements Visitable<VisitorItemWeightBased>{

  private Double weight;

  public ItemWeightBased(String description, Double unitPrice, Double weight){
    super(description, unitPrice);
    this.weight = weight;
  }
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  @Override
  public void accept(VisitorItemWeightBased visitor) {
    Double total = visitor.visit(this);
    System.out.println("Il totale del costo dell'elemento "+this.getDescription()+ " è : "+total);
  }

}
