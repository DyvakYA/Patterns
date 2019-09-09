package creational.abstractFactory.sample2;

class EngMouse implements Mouse {
    public void click() {
        System.out.println("click mouse");
    }

    public void dbclick() {
        System.out.println("double kick");
    }

    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("scroll up");
        else if (direction < 0)
            System.out.println("scroll down");
        else
            System.out.println("don't touch");
    }
}
