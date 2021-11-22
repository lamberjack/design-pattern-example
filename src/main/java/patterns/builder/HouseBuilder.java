package patterns.builder;

/**
 * Classe builder a cui è delegato il compito di fornire tutti i metodi per la creazione di oggetti di tipo House (prodotto)
 *
 */
public class HouseBuilder {

  /**
   * Field del Product da creare
   */
  private int walls;
  private int doors;
  private int windows;


  public HouseBuilder setWalls(int wallsNr){
    this.walls = wallsNr;
    return this;
  }

  public HouseBuilder setDoors(int doorsNr){
    this.doors = doorsNr;
    return this;
  }

  public HouseBuilder setWindows(int windowsNr){
    this.windows = windowsNr;
    return this;
  }

  /**
   *
   * @return l'istanza del prodotto creato con all'interno i valori impostati dai setter del builder.
   */
  public House build(){
    House product = new House();
    product.setWalls(this.walls);
    product.setDoors(this.doors);
    product.setWindows(this.windows);

    return product;

  }

}
