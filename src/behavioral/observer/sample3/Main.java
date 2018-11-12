package behavioral.observer.sample3;

/**
 * Created by Dyvak on 13.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Meteostation station = new Meteostation();

        station.addObserver(new ConsoleObserver());
        station.addObserver(new FileObserver());

        station.setMessurements(25, 120);
    }
}








