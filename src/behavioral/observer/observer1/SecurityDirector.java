package behavioral.observer.observer1;

/**
 * Created by User on 5/20/2018.
 */
public class SecurityDirector implements SecurityMan {

    String name;

    public SecurityDirector(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String signal) {
        System.out.println("Dear" + name + "We have some security signal = " + signal +
                "\n==========================================================\n");
    }
}
