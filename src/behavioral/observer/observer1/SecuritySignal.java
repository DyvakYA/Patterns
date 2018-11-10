package behavioral.observer.observer1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 5/20/2018.
 */
public class SecuritySignal implements Signaling {

    String signal;

    public List<SecurityMan> subscribers  = new ArrayList<>();

    @Override
    public void signalAction(String signal) {
        this.signal = signal;
        notifySecurity();
    }

    @Override
    public void addSubscriber(SecurityMan securityMan){
        this.subscribers.add(securityMan);
    }

    @Override
    public void removeSubscriber(SecurityMan securityMan){
        this.subscribers.remove(securityMan);

    }

    @Override
    public void notifySecurity() {
        for(SecurityMan subscriber : subscribers )
            subscriber.handleEvent(this.signal);
    }
}
