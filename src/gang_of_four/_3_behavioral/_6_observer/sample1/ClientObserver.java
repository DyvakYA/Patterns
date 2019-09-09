package behavioral.observer.sample1;

public abstract class ClientObserver {

    protected ChatSubject subject;

    public abstract void update();
}
