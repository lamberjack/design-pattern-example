package patterns.decorator;

public class MainDecorator {

  public static void main(String[] args) {
    System.out.println("***** TEST DECORATOR *****");

    // istanzia i due oggetti delegate
    ApplicationWeb delegateApplicationWeb = new ApplicationWeb();
    ApplicationLegacy delegateApplicationLegacy = new ApplicationLegacy();

    // istanzia i due oggetti decorati passandogli i rispettivi delegate
    Application appWebDecorated = new ApplicationWebDecorator(delegateApplicationWeb);
    Application appLegacyDecorated = new ApplicationLegacyDecorator(delegateApplicationLegacy);

    /*
     * viene richiamato il metodo a comune sugli oggetti decorati, che
     * quindi oltre ad il comportamento originale aggiunge quello
     * specializzato
     *
     */
    appWebDecorated.doSomething();

    appLegacyDecorated.doSomething();
  }
}
