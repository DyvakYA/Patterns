package creational.builder.sample4;

class SubaruBuilder extends CarBuilder {

    void buildMake() {
        car.setMake("Subaru Forester");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(270);
    }
}
