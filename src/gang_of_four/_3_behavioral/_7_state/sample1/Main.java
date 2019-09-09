package behavioral.state.sample1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.switchTransmission();
        car.requestState();

        car.switchTransmission();
        car.requestState();
    }
}
