package patterns.composite;

public class MainComposite {

  public static void main(String[] args) {
    System.out.println("***** TEST COMPOSITE *****");

    // istanzia le Leaf
    ShapeLeaf square1 = new ShapeLeaf("Quadrato1");
    ShapeLeaf rectangle1 = new ShapeLeaf("Rettangolo1");
    ShapeLeaf triangle1 = new ShapeLeaf("Triangolo1");
    ShapeLeaf square2 = new ShapeLeaf("Quadrato2");
    ShapeLeaf rectangle2 = new ShapeLeaf("Rettangolo2");
    ShapeLeaf triangle2 = new ShapeLeaf("Triangolo2");
    ShapeLeaf triangle3 = new ShapeLeaf("Triangolo3");
    ShapeLeaf triangle4 = new ShapeLeaf("Triangolo4");

    // istanzia i Composite aggiungendoci alcune Leaf
    ShapeGroupComposite composite1 = new ShapeGroupComposite();
    composite1.addGeometricPicture(square1);
    composite1.addGeometricPicture(rectangle1);
    composite1.addGeometricPicture(triangle1);

    ShapeGroupComposite composite2 = new ShapeGroupComposite();
    composite2.addGeometricPicture(square2);
    composite2.addGeometricPicture(rectangle2);

    ShapeGroupComposite composite3 = new ShapeGroupComposite();
    composite3.addGeometricPicture(triangle2);
    composite3.addGeometricPicture(triangle3);
    composite3.addGeometricPicture(triangle4);

    // aggiunge dei Composite ad altri Composite
    composite1.addGeometricPicture(composite2);
    composite2.addGeometricPicture(composite3);

    // prova di rimozioni
    composite1.removeGeometricPicture("Triangolo2");
    composite1.removeGeometricPicture("Quadrato1");
    composite1.draw();

  }
}
