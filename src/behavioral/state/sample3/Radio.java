package behavioral.state.sample3;

//Context
class Radio {
    private Station station;

    void setStation(Station st) {
        station = st;
    }

    void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDJFM());
        } else if (station instanceof RadioDJFM) {
            setStation(new RecordFM());
        } else if (station instanceof RecordFM) {
            setStation(new Radio7());
        }
    }

    void play() {
        station.play();
    }
}
