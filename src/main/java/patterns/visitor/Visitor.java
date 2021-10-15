package patterns.visitor;

/**
 * Interfaccia del Visitor, verrà implementata ogni volta che si vuole definire un tipo di visit(Item i)
 * con un particolare ConcreteVisitor che riceverà una particolare implementazione di Item.
 * Il tipo parametrico della classe deve estendere {@link Item}
 */
public interface Visitor <I extends Item> {

  /**
   * Funzione di visita sull'elemento che gli viene passato.
   *
   * @param i - L'elemento di cui si vuole calcolare il totale (di tipo Item)
   * @return il totale del prezzo degli Item su cui viene applicato
   */
  public Double visit(I i);

}
