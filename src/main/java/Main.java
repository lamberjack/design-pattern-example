import patterns.adapter.GeometricShapeObjectAdapter;
import patterns.adapter.Rectangle;
import patterns.adapter.ShapeCalculator;
import patterns.adapter.Square;
import patterns.adapter.Triangle;
import patterns.decorator.Application;
import patterns.decorator.ApplicationLegacy;
import patterns.decorator.ApplicationLegacyDecorator;
import patterns.decorator.ApplicationWeb;
import patterns.decorator.ApplicationWebDecorator;
import patterns.factory.Auto;
import patterns.factory.AutoFactory;
import patterns.factory.Telefono;
import patterns.factory.TelefonoFactory;
import patterns.singleton.SingletonExample;

public class Main {

  public static  void main(String[] args){
    System.out.println("Test Design Patterns!");

    ////////////////////////////////
    //// TEST PATTERN SINGLETON ////
    ////////////////////////////////

    System.out.println("***** TEST SINGLETON *****");
    testSingletonPattern();

    //////////////////////////////
    //// TEST PATTERN FACTORY ////
    //////////////////////////////

    System.out.println("***** TEST FACTORY *****");
    testFactoryPattern();

    ///////////////////////////////
    //// TEST PATTERN DECORATOR////
    ///////////////////////////////

    System.out.println("***** TEST DECORATOR *****");
    testDecoratorPattern();

    ///////////////////////////////
    //// TEST PATTERN ADAPTER ////
    ///////////////////////////////

    System.out.println("***** TEST ADAPTER *****");
    testAdapterPattern();

  }

  private static void testAdapterPattern() {
    ShapeCalculator calculator = new ShapeCalculator();

    calculator.addShape(new Triangle());
    calculator.addShape(new Square());
    // viene sfruttato l'adapter che è comunque un tipo Shape
    calculator.addShape(new GeometricShapeObjectAdapter(new Rectangle()));

    calculator.perimeters();
    calculator.areas();
  }

  private static void testDecoratorPattern() {
    // istanzia i due oggetti decorati, passando nei costruttori i relativi delegate
    Application appWeb = new ApplicationWebDecorator(new ApplicationWeb());

    Application appLegacy = new ApplicationLegacyDecorator(new ApplicationLegacy());

    /*
     * viene richiamato il metodo a comune sugli oggetti decorati, che
     * quindi oltre ad il comportamento originale aggiunge quello
     * specializzato
     *
     */
    appWeb.doSomething();

    appLegacy.doSomething();
  }

  private static void testFactoryPattern() {
    // utilizza le factory concrete per istanziare i concrete product
    AutoFactory autoFactory = new AutoFactory();
    Auto car1 = autoFactory.createProduct("BMW", 30000);

    TelefonoFactory telefonoFactory = new TelefonoFactory();
    Telefono tel1 = telefonoFactory.createProduct("Nokia", 250);
  }

  private static void testSingletonPattern() {
    // Si ottiene sempre la stessa istanza dell'oggeto
    SingletonExample singleton1 = SingletonExample.getSingletonExampleInstance();

    SingletonExample singleton2 = SingletonExample.getSingletonExampleInstance();

    singleton1.getInformation();

    singleton2.getInformation();
  }

}
