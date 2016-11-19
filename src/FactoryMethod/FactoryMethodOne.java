package FactoryMethod;

import java.util.Date;
/**
 * Created by Dyvak on 19.11.2016.
 */

public class FactoryMethodOne {
    public static void main(String[] args) {

        WatchMaker maker = getMakerByName("Digital");
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker){
        if(maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if (maker.equals("Digital"))
            return new RomeWatchMaker();

        throw new RuntimeException("No watch"+ maker);
    }
}

interface Watch{
    void showTime();
}

class DigitalWatch implements Watch{
    public void showTime(){
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch{
    public void showTime(){
        System.out.println("VII-XX");
    }
}

interface WatchMaker{
    Watch createWatch();
}

class DigitalWatchMaker implements WatchMaker{
    public Watch createWatch(){
        return new DigitalWatch();
    }
}

class RomeWatchMaker implements WatchMaker{
    public Watch createWatch(){
        return new RomeWatch();
    }
}

