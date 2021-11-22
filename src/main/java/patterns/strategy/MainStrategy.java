package patterns.strategy;

public class MainStrategy {

  public static void main(String[] args) {
    // istanzia la strategy concreta
    PublicTransportStrategy publicTransportStrategy = new PublicTransportStrategy();

    // istanzia il Context a cui passa la strategy concreta
    Navigator navigator = new Navigator(publicTransportStrategy);

    navigator.navigate("Firenze", "Stoccolma");

    //istanzia un altra strategy concreta che poi va a passare al Context tramite il setter
    WalkingStrategy walkingStrategy = new WalkingStrategy();
    navigator.setRouteStrategy(walkingStrategy);

    navigator.navigate("Roma", "Parigi");

  }
}
