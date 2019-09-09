package creational.abstractFactory.sample2;

import creational.abstractFactory.*;

class EngDeviceFactory implements DeviceFactory{

    public Mouse getMouse(){
        return new EngMouse();
    }

    public Keyboard getKeyboard(){
        return new EngKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EngTouchpad();
    }
}
