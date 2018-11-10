package functionalInterface;

/**
 * Created by User on 5/20/2018.
 */
public class Main {

    public static void main(String[] args) {
        Function func;
        func = () -> 1;
        System.out.println(func.execute());
    }
}
