package patterns.strategy;

/**
 * Interfaccia dello Strategy, contiene il metodo comune a tutte le Strategy Concrete.
 */
public interface RouteStrategy {

  void buildRoute(String departure, String arrival);

}
