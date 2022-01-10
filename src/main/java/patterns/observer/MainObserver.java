package patterns.observer;

public class MainObserver {

  public static void main(String[] args) {
    FootballMatchObservableSubject footballMatchObservableSubject = new FootballMatchObservableSubject();
    EnglishMatchSpeechObserver englishMatchSpeechObserver = new EnglishMatchSpeechObserver();
    ItalianMatchSpeechObserver italianMatchSpeechObserver = new ItalianMatchSpeechObserver();

    /**
     * Observer aggiunti in ascolto sul subject relativo
     */
    footballMatchObservableSubject.addObserver(englishMatchSpeechObserver);
    footballMatchObservableSubject.addObserver(italianMatchSpeechObserver);

    footballMatchObservableSubject.setMatchScore("1-0");
    footballMatchObservableSubject.setMatchScore("1-1");
    footballMatchObservableSubject.setMatchScore("1-2");
    footballMatchObservableSubject.setMatchScore("1-3");
    footballMatchObservableSubject.setMatchScore("2-3");
    englishMatchSpeechObserver.completeSpeech();
    italianMatchSpeechObserver.completeSpeech();


  }
}
