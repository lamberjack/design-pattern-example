package patterns.strategy;

/**
 * Classe Context dello Strategy pattern. Al suo interno vi è il contesto dell'applicazione dello strategy,
 * oltre che ad un istanza di quest'ultimo. La Context class delega del lavoro all'oggetto Strategy, invece che
 * eseguirlo lei.
 * In questo esempio vi è una classe Navigator che deve selezionare una Strategy per eseguire la navigazione.
 */
public class Navigator {

  // istanza della Strategy astratta presente nella Context class
  private RouteStrategy routeStrategy;

  public Navigator(RouteStrategy routeStrategy) {
    this.routeStrategy = routeStrategy;
  }

  public RouteStrategy getRouteStrategy() {
    return routeStrategy;
  }

  public void setRouteStrategy(RouteStrategy routeStrategy) {
    this.routeStrategy = routeStrategy;
  }


  /**
   * Nel metodo navigate richiama la Strategy per decidere in che modo viaggiare. La particolare
   * implementazione è demandata alle sottoclassi, e sarà invocata soltanto a Runtime.
   * @param departure
   * @param arrival
   */
  public void navigate(String departure, String arrival){
    this.routeStrategy.buildRoute(departure, arrival);
  }
}
