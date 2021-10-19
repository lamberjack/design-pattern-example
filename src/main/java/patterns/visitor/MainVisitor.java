package patterns.visitor;

public class MainVisitor {

  public static void main(String[] args) {
    System.out.println("***** TEST VISITOR *****");

    // istanzia i concreteElement
    ItemPiecesBased gommeAuto = new ItemPiecesBased("Gomme Continental", 100.50, 4);
    ItemWeightBased patate = new ItemWeightBased("Patate del casentino", 5.10, 10.0);
    ItemWorkedHourBased softwareDeveloping=new ItemWorkedHourBased("javaDeveloper", 31.25, 8.0 );

    // istanzia i relativi concreteVisitor
    VisitorItemWeightBased visitorItemWeightBased = new VisitorItemWeightBased();
    VisitorItemPiecesBased visitorItemPiecesBased = new VisitorItemPiecesBased();
    VisitorItemWorkedHoursBased visitorItemWorkedHoursBased=new VisitorItemWorkedHoursBased();

    // invoca la accept sui concreteElement che richiama il rispettivo algoritmo di visita.
    gommeAuto.accept(visitorItemPiecesBased);
    patate.accept(visitorItemWeightBased);
    softwareDeveloping.accept(visitorItemWorkedHoursBased);
  }
}
