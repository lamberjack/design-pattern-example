package patterns.strategy;

/**
 * Startegy concreta, implementa il metodo di costruzione della route a piedi.
 */
public class WalkingStrategy implements RouteStrategy {

  @Override
  public void buildRoute(String departure, String arrival) {
    System.out.println(departure + " CAMMINARE " + arrival);

  }
}
