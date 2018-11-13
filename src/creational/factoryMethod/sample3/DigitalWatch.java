package creational.factoryMethod.sample3;

import java.util.Date;

class DigitalWatch implements Watch{
    public void showTime(){
        System.out.println(new Date());
    }
}
