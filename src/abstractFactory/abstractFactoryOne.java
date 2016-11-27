package abstractFactory;

/**
 * Created by Dyvak on 19.11.2016.
 */

public class AbstractFactoryOne {

    public static void main(String[] args) {

        DeviceFactory factory = getFactoryByCountryCode("RU");
        Mouse    m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        Touchpad t = factory.getTochpad();

        m.click();
        k.print();
        k.println();
        t.track(10, 35);
    }

    private static DeviceFactory getFactoryByCountryCode(String lang){
        switch(lang){
            case "RU":
                return new RuDeviceFactory();
            case "ENG":
                return new EngDeviceFactory();
            default:
                throw new RuntimeException("Unsupported country Code; " + lang);
        }
    }
}

interface Mouse{
    void click();
    void dbclick();
    void scroll(int direction);
}

interface Keyboard{
    void print();
    void println();
}

interface Touchpad{
    void track(int deltaX, int deltaY);
}

interface DeviceFactory{
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTochpad();
}

class RuMouse implements Mouse {
    public void click() {
        System.out.println("Клик мышки");
    }

    public void dbclick() {
        System.out.println("Двойной клик");
    }

    public void scroll(int direction){
        if (direction>0)
            System.out.println("скрол вверх");
        else if (direction<0)
            System.out.println("скрол вниз");
        else
            System.out.println("нет скрола");
    }
}

class RuKeyboard implements Keyboard{
    public void print(){
        System.out.print("Печатаем строку");
    }

    public void println(){
        System.out.println("печатаем строку с переносом");
    }
}

class RuTouchpad implements Touchpad{
    public void track(int deltaX, int deltaY){
        int s = (int) Math.sqrt(Math.pow(deltaX, 2)+ Math.pow(deltaY, 2));
        System.out.println("Идём "+s+" пыксэлив");
    }
}

class EngMouse implements Mouse {
    public void click() {
        System.out.println("click mouse");
    }

    public void dbclick() {
        System.out.println("double kick");
    }

    public void scroll(int direction){
        if (direction>0)
            System.out.println("scroll up");
        else if (direction<0)
            System.out.println("scroll down");
        else
            System.out.println("don't touch");
    }
}

class EngKeyboard implements Keyboard{
    public void print(){
        System.out.print("Print string");
    }

    public void println(){
        System.out.println("Print string with (println)");
    }
}

class EngTouchpad implements Touchpad{
    public void track(int deltaX, int deltaY){
        int s = (int) Math.sqrt(Math.pow(deltaX, 2)+ Math.pow(deltaY, 2));
        System.out.println("GOTO"+s+"pix");
    }
}

class EngDeviceFactory implements DeviceFactory{

    public Mouse getMouse(){
        return new EngMouse();
    }

    public Keyboard getKeyboard(){
        return new EngKeyboard();
    }

    @Override
    public Touchpad getTochpad() {
        return new EngTouchpad();
    }
}

class RuDeviceFactory implements DeviceFactory{

    public Mouse getMouse(){
        return new RuMouse();
    }

    public Keyboard getKeyboard(){
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTochpad() {
        return new RuTouchpad();
    }
}

