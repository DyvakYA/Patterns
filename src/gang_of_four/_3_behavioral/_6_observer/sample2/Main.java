package behavioral.observer.sample2;

/**
 * Created by User on 5/20/2018.
 */
public class Main {
    public static void main(String[] args) {

        SecurityMan security = new SecurityDirector("Nickolas Cage");

        Signaling signaling = new SecuritySignal();
        signaling.addSubscriber(security);
        signaling.signalAction("Alert!!!!!!");
        signaling.signalAction("Some not bed signal");
    }
}
