package behavioral.observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dyvak on 13.12.2016.
 */
public class ObserverOne {
    public static void main(String[] args) {
        Meteostation station = new Meteostation();

        station.addObserver(new ConsoleObserver());
        station.addObserver(new FileObserver());

        station.setMessurements(25, 120);
    }
}

interface Observed{
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

class Meteostation implements Observed{
    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setMessurements(int t, int p){
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
        for(Observer o: observers){
            o.handleEvent(temperature, pressure);
        }
    }
}

interface Observer{
    void handleEvent(int temp, int presser);
}

class ConsoleObserver implements Observer{
    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("Weather is change. t="+temp+" p="+ presser+".");
    }
}

class FileObserver implements Observer{
    @Override
    public void handleEvent(int temp, int presser) {
        File f;
        try{
            f= File.createTempFile("TempPressure", "_txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print("Weather is change. t="+temp+" p="+presser+".");
            pw.println();
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
