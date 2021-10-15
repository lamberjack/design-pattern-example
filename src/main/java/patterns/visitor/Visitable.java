package patterns.visitor;

/**
 * Interfaccia comune a tutti gli elementi che devono poter essere 'visitabili' dal visitor.
 * Ogni elemento visitabile dovrà implementare un metodo accept(Visitor v) che riceve un {@link Visitor}
 * e richiama il relativo visit(Item).
 */
public interface Visitable<V extends Visitor> {

  void accept(V visitor);

}
