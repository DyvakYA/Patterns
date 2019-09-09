package creational.prototype.sample1;


/**
 * Created by Dyvak on 27.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        Human original = new Human(18, "Vasya");
        System.out.println(original);

        Human copy = (Human) original.copy();
        System.out.println(copy);
    }
}

