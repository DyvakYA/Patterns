package behavioral.strategy.sample1;

/**
 * Created by User on 5/18/2018.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setDeveloper(new PhpDeveloper());
        director.execute();

        director.setDeveloper(new JavaDeveloper());
        director.execute();
    }
}
