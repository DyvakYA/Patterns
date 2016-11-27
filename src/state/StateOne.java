package state;

/**
 * Created by Dyvak on 26.11.2016.
 */
public class StateOne {
    public static void main(String[] args) {

        Station dfm = new RadioDJFM();
        Radio radio = new Radio();
        radio.setStation(dfm);

        for(int i=0; i<10; i++){
            radio.play();
            radio.nextStation();
        }

    }
}

//State
interface Station{
    void play();
}

class Radio7 implements Station{

    @Override
    public void play() {
        System.out.println("Radio 7 ...");
    }
}

class RadioDJFM implements Station{

    @Override
    public void play() {
        System.out.println("RadioDJFM ...");
    }
}

class RecordFM implements Station{
    @Override
    public void play() {
        System.out.println("Radio record FM ...");
    }
}

//Context
class Radio{
    Station station;
    void setStation(Station st){
        station = st;
    }
    void nextStation(){
        if(station instanceof Radio7){
            setStation(new RadioDJFM());
        }
        else if(station instanceof RadioDJFM){
            setStation(new RecordFM());
        }
        else if(station instanceof RecordFM){
            setStation(new Radio7());
        }
    }
    void play(){
        station.play();
    }
}
