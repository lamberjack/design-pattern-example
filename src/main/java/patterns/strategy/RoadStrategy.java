package patterns.strategy;

/**
 * Startegy concreta, implementa il metodo di costruzione della route via stradale.
 */
public class RoadStrategy implements RouteStrategy {

  @Override
  public void buildRoute(String departure, String arrival) {
    System.out.println(departure + " via AUTO " + arrival);
  }
}
