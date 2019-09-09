package behavioral.state.sample2;

/**
 * Created by Dyvak on 26.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        human.setState(new Work());
        for (int i = 0; i < 10; i++) {
            human.doSomething();
        }
    }
}



