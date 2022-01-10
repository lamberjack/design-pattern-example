package patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Observer concreto che implementa l'interfaccia {@link Observer} di java.util.
 * Ha lo scopo di aggiornare una descrizione interna del risultato del match in lingua italiana.
 */
public class ItalianMatchSpeechObserver implements Observer {

  private StringBuilder sb;

  public ItalianMatchSpeechObserver(){
    this.sb = new StringBuilder();
    sb.append("Partita iniziata!\n");
  }

  /**
   *
   * @param o observable che ha lanciato l'aggiornamento dello stato
   * @param arg argomento dello stato che è stato aggiornato
   */
  @Override
  public void update(Observable o, Object arg) {
    /**
     * il risultato della partita è String e viene concatenato alla telecronaca
     */
    String update = "Aggiornamento risultato partita: "+ arg;
    sb.append(update);
    sb.append("\n");
  }

  public void completeSpeech(){
    System.out.println(sb.toString());
  }
}
