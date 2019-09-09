package creational.builder.sample4;

/**
 * Created by Dyvak on 15.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SubaruBuilder());
        Car car = director.BuildCar();
        System.out.println(car);
    }
}

