package behavioral.state.sample3;

/**
 * Created by Dyvak on 26.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Station dfm = new RadioDJFM();
        Radio radio = new Radio();
        radio.setStation(dfm);

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }

    }
}

