package creational.builder.sample4;

abstract class CarBuilder {

    Car car;

    public void createCar() {
        car = new Car();
    }

    abstract void buildMake();

    abstract void buildTransmission();

    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }

    class FordMondeoBuilder extends CarBuilder {
        void buildMake() {
            car.setMake("Ford Mondeo");
        }

        void buildTransmission() {
            car.setTransmission(Transmission.AUTO);
        }

        void buildMaxSpeed() {
            car.setMaxSpeed(250);
        }
    }
}
