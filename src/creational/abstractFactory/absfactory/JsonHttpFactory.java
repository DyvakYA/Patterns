package creational.abstractFactory.absfactory;

public class JsonHttpFactory extends AbstractFactory {
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }

    @Override
    public Sender createSender() {
        return new HttpSender();
    }
}
