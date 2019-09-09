package creational.abstractFactory.sample2;

/**
 * Created by Dyvak on 19.11.2016.
 */

public class Main {

    public static void main(String[] args) {

        DeviceFactory factory = getFactoryByCountryCode("RU");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        Touchpad t = factory.getTouchpad();

        m.click();
        k.print();
        k.println();
        t.track(10, 35);
    }

    private static DeviceFactory getFactoryByCountryCode(String lang) {
        switch (lang) {
            case "RU":
                return new RuDeviceFactory();
            case "ENG":
                return new EngDeviceFactory();
            default:
                throw new RuntimeException("Unsupported country Code; " + lang);
        }
    }
}

