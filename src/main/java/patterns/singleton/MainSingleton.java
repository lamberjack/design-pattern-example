package patterns.singleton;

public class MainSingleton {

  public static void main(String[] args) {
    System.out.println("***** TEST SINGLETON *****");

    // Si ottiene sempre la stessa istanza dell'oggeto
    SingletonExample singleton1 = SingletonExample.getSingletonExampleInstance();

    SingletonExample singleton2 = SingletonExample.getSingletonExampleInstance();

    singleton1.getInformation();

    singleton2.getInformation();

  }
}
