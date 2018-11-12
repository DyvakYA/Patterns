package behavioral.observer.sample1;

public class AdminClientObserver extends ClientObserver {

    public AdminClientObserver(ChatSubject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Admin received new sample1: " + subject.getState());
    }
}
