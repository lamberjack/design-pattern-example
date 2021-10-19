package patterns.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe Composite(composto) del composite. Gestisce un insieme di {@link ShapeComponent}.
 */
public class ShapeGroupComposite implements ShapeComponent {

  private final List<ShapeComponent> pictures;

  public ShapeGroupComposite() {
    this.pictures = new LinkedList<>();
  }

  /**
   * Funzione di aggiunta di un {@link ShapeComponent}.
   *
   * @param shapeComponent
   */
  public void addGeometricPicture(ShapeComponent shapeComponent) {
    this.pictures.add(shapeComponent);
  }

  /**
   * Funzione di rimozione di una Shape dal nome passato. Avendo il nome solo le foglie
   * viene scansionata ricorsivamente tutta la struttura annidata del Composite.
   *
   * @param name
   */
  public void removeGeometricPicture(String name) {
    List<ShapeComponent> shapeComponentsToRemove = new LinkedList<>();
    pictures.forEach(shapeComponent -> {
      if (shapeComponent instanceof ShapeLeaf) {
        ShapeLeaf leaf = (ShapeLeaf) shapeComponent;
        if (leaf.getName().equals(name)) {
          shapeComponentsToRemove.add(shapeComponent);
        }
      } else {
        ShapeGroupComposite composite = (ShapeGroupComposite) shapeComponent;
        composite.removeGeometricPicture(name);
      }
    });
    this.pictures.removeAll(shapeComponentsToRemove);
  }


  /**
   * Implementazione del composite del metodo di draw().
   */
  @Override
  public void draw() {
    pictures.forEach(geometricPicture -> geometricPicture.draw());
  }
}
