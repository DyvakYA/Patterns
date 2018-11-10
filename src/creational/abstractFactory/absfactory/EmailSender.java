package creational.abstractFactory.absfactory;

public class EmailSender implements Sender {
    @Override
    public void send(Message msg) {
        System.out.println("Sending " + msg + " via E-mail");
    }
}
