package patterns.factory;

public class MainFactory {

  public static void main(String[] args) {
    System.out.println("***** TEST FACTORY *****");

    // utilizza le factory concrete per istanziare i concrete product
    AutoFactory autoFactory = new AutoFactory();
    Auto car1 = autoFactory.createProduct("BMW", 30000);

    TelefonoFactory telefonoFactory = new TelefonoFactory();
    Telefono tel1 = telefonoFactory.createProduct("Nokia", 250);
  }
}
