package creational.abstractFactory.sample2;

class EngKeyboard implements Keyboard {
    public void print() {
        System.out.print("Print string");
    }

    public void println() {
        System.out.println("Print string with (println)");
    }
}
