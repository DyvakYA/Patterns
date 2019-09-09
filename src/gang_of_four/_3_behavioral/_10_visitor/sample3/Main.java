package behavioral.visitor.sample3;

/**
 * Created by Dyvak on 18.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        ElementTwo car = new CarElement();
        car.accept(new HooliganVisitorTwo());
        System.out.println();
        car.accept(new MechanicVisitorTwo());
    }
}

