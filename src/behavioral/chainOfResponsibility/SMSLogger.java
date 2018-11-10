package behavioral.chainOfResponsibility;

public class SMSLogger extends Logger {

    public SMSLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Send SMS: " + message);
    }
}
