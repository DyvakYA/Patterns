package creational.abstractFactory.sample1;

public class HttpSender implements Sender {
    @Override
    public void send(Message msg) {
        System.out.println("Sending " + msg + " via HTTP protocol");
    }
}
