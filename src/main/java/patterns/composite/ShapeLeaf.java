package patterns.composite;

/**
 * Classe Leaf del composite; sovrascrive il metodo draw() per 'disegnare' la singola figura.
 */
public class ShapeLeaf implements ShapeComponent {


  private String name;

  public ShapeLeaf(String name){
    this.name = name;
  }

  @Override
  public void draw() {
    System.out.println("Disegno del - "+this.name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
