package patterns.adapter;

public class MainAdapter {
  public static void main(String[] args) {
    System.out.println("***** TEST ADAPTER *****");

    ShapeCalculator calculator = new ShapeCalculator();

    calculator.addShape(new Triangle());
    calculator.addShape(new Square());

    // viene sfruttato l'adapter che è comunque un tipo Shape
    calculator.addShape(new GeometricShapeObjectAdapter(new Rectangle()));

    calculator.perimeters();
    calculator.areas();
  }
}
