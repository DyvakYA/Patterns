package behavioral.observer.observer1;

/**
 * Created by User on 5/20/2018.
 */
public interface Signaling {

    void signalAction(String signal);

    void notifySecurity();

    void addSubscriber(SecurityMan securityMan);

    void removeSubscriber(SecurityMan securityMan);
}
