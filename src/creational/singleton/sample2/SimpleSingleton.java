package creational.singleton.sample2;

public class SimpleSingleton {
    private static final SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        return instance;
    }

    public void check() {
        System.out.println("Simple Hello!");
    }
}
