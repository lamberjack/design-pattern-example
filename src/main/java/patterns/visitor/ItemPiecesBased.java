package patterns.visitor;

public class ItemPiecesBased extends Item implements Visitable <VisitorItemPiecesBased> {

  private Integer numberOfPieces;

  public ItemPiecesBased(String description, Double unitPrice, Integer numberOfPieces){
    super(description, unitPrice);
    this.numberOfPieces = numberOfPieces;
  }

  public Integer getNumberOfPieces() {
    return numberOfPieces;
  }

  public void setNumberOfPieces(Integer numberOfPieces) {
    this.numberOfPieces = numberOfPieces;
  }

  @Override
  public void accept(VisitorItemPiecesBased visitor) {
    Double total = visitor.visit(this);
    System.out.println("Il totale del costo dell'elemento "+this.getDescription()+ " è : "+total);
  }
}
