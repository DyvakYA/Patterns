package creational.abstractFactory.sample2;

class RuKeyboard implements Keyboard {
    public void print() {
        System.out.print("Печатаем строку");
    }

    public void println() {
        System.out.println("печатаем строку с переносом");
    }
}
