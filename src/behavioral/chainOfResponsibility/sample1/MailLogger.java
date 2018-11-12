package behavioral.chainOfResponsibility.sample1;

public class MailLogger extends Logger {

    public MailLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Write into the mail: " + message);
    }
}
