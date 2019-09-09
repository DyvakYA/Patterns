package creational.factoryMethod.sample2;

public class ErrorLogger implements Logger {
    @Override
    public void logMessage(String msg) {
        System.out.println("Error logger: " + msg);
    }
}