package behavioral.observer.sample3;

import java.util.ArrayList;
import java.util.List;

class Meteostation implements Observed {

    private int temperature;
    private int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setMessurements(int t, int p) {
        temperature = t;
        pressure = p;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.handleEvent(temperature, pressure);
        }
    }
}
