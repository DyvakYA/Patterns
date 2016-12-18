package behavioral.chainOfResponsibility;

/**
 * Created by Dyvak on 27.11.2016.
 */
public class chainOfResponsibilityOne {
    public static void main(String[] args) {
        Logger logger1 = new SMSLogger(Level.ERROR);
        Logger logger2 = new FileLogger(Level.DEBUG);
        Logger logger3 = new MailLogger(Level.INFO);
        logger1.setNext(logger2);
        logger2.setNext(logger3);

        logger1.writerMessage("Good", Level.ERROR);
        logger1.writerMessage("Good", Level.INFO);
        logger1.writerMessage("Good", Level.DEBUG);
        logger1.writerMessage("System fail", Level.ERROR);
    }
}

class Level{
    public static final int ERROR = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
}

abstract class Logger{
    int priority;
    public Logger(int priority) {
        this.priority = priority;
    }
    Logger next;
    public void setNext(Logger next) {
        this.next = next;
    }

    public void writerMessage(String message, int level) {
        if(level <= priority){
            write(message);
        }
        if(next != null){
            next.writerMessage(message, level);
        }
    }
    abstract void write(String message);
}

class SMSLogger extends Logger {
    public SMSLogger(int priority) {
        super(priority);
    }
    public void write(String message){
        System.out.println("SMS: " + message);
    }
}

class FileLogger extends Logger {
    public FileLogger(int priority) {
            super(priority);
        }
    public void write(String message){
            System.out.println("Write to the file: " + message);
        }
}

class MailLogger extends Logger{
    public MailLogger(int priority){
            super(priority);
        }
    public void write(String message){
            System.out.println("Write into the mail: " + message);
        }
}