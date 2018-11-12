package creational.abstractFactory.sample1;

public abstract class AbstractFactory {
    public abstract Message createMessage();

    public abstract Sender createSender();
}
