package patterns.builder;

public class MainBuilder {

  public static void main(String[] args) {

    HouseBuilder houseBuilder = new HouseBuilder();

    House house1 = houseBuilder
      .setWalls(14)
      .setDoors(3)
      .setWindows(10)
      .build();

    House house2 = houseBuilder
      .setWalls(10)
      .setDoors(2)
      .setWindows(7)
      .build();

    System.out.println("HOUSE 1: "+house1.toString());

    System.out.println("HOUSE 2: "+house2.toString());
  }
}
