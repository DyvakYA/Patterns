package creational.factoryMethod.sample1;

/**
 * Created by User on 5/15/2018.
 */
public class Main {

    public static void main(String[] args) {

        DeveloperFactory factory = createDeveloperBySpec("dfg");
        Developer developer = factory.createDeveloper();
        developer.writeCode();
    }


    static DeveloperFactory createDeveloperBySpec(String spec) {
        if (spec.equalsIgnoreCase("Java")) {
            return new JavaDeveloperFactory();
        } else if (spec.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(spec + "do not understand you");
        }

    }
}
