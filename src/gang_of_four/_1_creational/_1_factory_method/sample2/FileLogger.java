package creational.factoryMethod.sample2;

public class FileLogger implements Logger {
    @Override
    public void logMessage(String msg) {
        System.out.println("File logger: " + msg);
    }
}