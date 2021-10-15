package patterns.visitor;

public class ItemWorkedHourBased extends Item implements Visitable<VisitorItemWorkedHoursBased>{
  private Double workedHours;

  public ItemWorkedHourBased(String description, Double unitPrice, Double workedHours) {
    super(description, unitPrice);
    this.workedHours = workedHours;

  }

  public Double getWorkedHours() {
    return workedHours;
  }

  public void setWorkedHours(Double workedHours) {
    this.workedHours = workedHours;
  }

  @Override
  public void accept(VisitorItemWorkedHoursBased visitor) {
    Double total = visitor.visit(this);
    System.out.println("il prezzo dell'oggetto: "+this.getDescription()+" per ore lavorate è: "+total);
  }
}
