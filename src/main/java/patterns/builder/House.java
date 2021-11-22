package patterns.builder;

/**
 * Classe product del builder. Rappresenta l'oggetto prodotto dal builder
 */
public class House {
  private int walls;
  private int doors;
  private int windows;
  private boolean garage;
  private boolean swimmingPool;
  private boolean garden;

  public int getWalls() {
    return walls;
  }

  public void setWalls(int walls) {
    this.walls = walls;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public int getWindows() {
    return windows;
  }

  public void setWindows(int windows) {
    this.windows = windows;
  }

  public boolean isGarage() {
    return garage;
  }

  public void setGarage(boolean garage) {
    this.garage = garage;
  }

  public boolean isSwimmingPool() {
    return swimmingPool;
  }

  public void setSwimmingPool(boolean swimmingPool) {
    this.swimmingPool = swimmingPool;
  }

  public boolean isGarden() {
    return garden;
  }

  public void setGarden(boolean garden) {
    this.garden = garden;
  }

  @Override
  public String toString() {
    return "House{" +
      "walls=" + walls +
      ", doors=" + doors +
      ", windows=" + windows +
      ", garage=" + garage +
      ", swimmingPool=" + swimmingPool +
      ", garden=" + garden +
      '}';
  }
}
