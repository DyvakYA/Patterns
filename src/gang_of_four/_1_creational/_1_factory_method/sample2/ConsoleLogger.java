package creational.factoryMethod.sample2;

public class ConsoleLogger implements Logger {
    @Override
    public void logMessage(String msg) {
        System.out.println("Console logger: " + msg);
    }
}
