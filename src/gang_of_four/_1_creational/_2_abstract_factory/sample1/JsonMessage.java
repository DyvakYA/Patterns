package creational.abstractFactory.sample1;

public class JsonMessage implements Message {
    @Override
    public String toString() {
        return "{\"msg\":\"Hello\"}";
    }
}
