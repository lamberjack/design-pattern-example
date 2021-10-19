package patterns.adapter;

/**
 * Interfaccia (target) a cui deve adattarsi {@link GeometricShape}
 * grazie all' {@link GeometricShapeObjectAdapter}.
 */
public interface Shape {

    public double perimeter();

    public double area();

}
