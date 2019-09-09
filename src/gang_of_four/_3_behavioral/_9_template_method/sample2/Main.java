package behavioral.templateMethod.sample2;

/**
 * Created by Dyvak on 18.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        C a = new A();
        a.templateMethod();

        System.out.println();

        C b = new B();
        b.templateMethod();
    }
}

