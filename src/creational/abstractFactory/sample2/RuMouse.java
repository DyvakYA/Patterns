package creational.abstractFactory.sample2;

class RuMouse implements Mouse {
    public void click() {
        System.out.println("Клик мышки");
    }

    public void dbclick() {
        System.out.println("Двойной клик");
    }

    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("скрол вверх");
        else if (direction < 0)
            System.out.println("скрол вниз");
        else
            System.out.println("нет скрола");
    }
}
