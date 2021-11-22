package patterns.strategy;

/**
 * Startegy concreta, implementa il metodo di costruzione della route con il trasport pubblico.
 */
public class PublicTransportStrategy implements RouteStrategy{
  
  @Override
  public void buildRoute(String departure, String arrival) {
    String randomWay = getRandomWay();
    System.out.println(departure +" "+ randomWay +" "+ arrival);
  }

  //randomizza la scelta della via con il trasporto pubblico.
  private String getRandomWay() {
    Double randomWayNumber = Math.random();
    String randomWay;
    if(randomWayNumber < 0.333){
      randomWay = "BUS";
    }else if(0.333 < randomWayNumber && randomWayNumber < 0.666){
      randomWay = "TRAIN";
    }else{
      randomWay = "METRO";
    }
    return randomWay;
  }
}
