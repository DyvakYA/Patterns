package structural.facade.sample1;

public class Main {
    public static void main(String[] args) {
        LoggerFacade logger = new LoggerFacade();
        logger.logConsole("Test");
        logger.logFile("Test");
    }
}
