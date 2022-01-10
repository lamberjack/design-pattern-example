package patterns.observer;

import java.util.Observable;

/**
 * Subject Observable concreto che estende la classe {@link Observable} di java.util
 */
public class FootballMatchObservableSubject extends Observable {
  private String matchScore;

  public FootballMatchObservableSubject(){
    this.matchScore="0-0";
  }

  public void setMatchScore(String newScore){
    this.matchScore = newScore;

    /**
     * Notifica a tutti gli observer registrati a questo subject
     * l'aggiornamento dello stato.
     */
    //TODO capire perchè è necessario chiamare setChanged() prima della notify per forzare il cambiamento di stato dell'observable
    this.setChanged();
    notifyObservers(this.matchScore);
  }
}
