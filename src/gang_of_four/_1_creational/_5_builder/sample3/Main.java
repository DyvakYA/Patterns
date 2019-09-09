package creational.builder.sample3;

/**
 * Created by Dyvak on 15.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(250)
                .build();
        System.out.println(car);
    }
}

