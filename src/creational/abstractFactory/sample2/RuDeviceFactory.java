package creational.abstractFactory.sample2;

class RuDeviceFactory implements DeviceFactory {

    public Mouse getMouse() {
        return new RuMouse();
    }

    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
