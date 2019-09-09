package creational.factoryMethod.sample3;

/**
 * Created by Dyvak on 19.11.2016.
 */

public class Main {
    public static void main(String[] args) {

        WatchMaker maker = getMakerByName("Digital");
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker) {
        if (maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if (maker.equals("Rome"))
            return new RomeWatchMaker();

        throw new RuntimeException("No watch" + maker);
    }
}

