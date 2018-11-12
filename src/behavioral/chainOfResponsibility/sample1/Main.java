package behavioral.chainOfResponsibility.sample1;

/**
 * Created by Dyvak on 27.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        Logger logger1 = new SMSLogger(Level.ERROR);
        Logger logger2 = new FileLogger(Level.DEBUG);
        Logger logger3 = new MailLogger(Level.INFO);
        logger1.setNext(logger2);
        logger2.setNext(logger3);

        logger1.writerMessage("Good", Level.ERROR);
        System.out.println("********");
        logger1.writerMessage("Good", Level.INFO);
        System.out.println("********");
        logger1.writerMessage("Good", Level.DEBUG);
        System.out.println("********");
        logger1.writerMessage("System fail", Level.ERROR);
    }
}

