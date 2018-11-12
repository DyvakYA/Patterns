package creational.builder.sample3;

class CarBuilder {
    private String m = "Default";
    private Transmission t = Transmission.MANUAL;
    private int s = 120;

    CarBuilder buildMake(String m) {
        this.m = m;
        return this;
    }

    CarBuilder buildTransmission(Transmission t) {
        this.t = t;
        return this;
    }

    CarBuilder buildMaxSpeed(int s) {
        this.s = s;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setMake(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;
    }
}
