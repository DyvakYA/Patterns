package creational.factoryMethod.sample3;

class DigitalWatchMaker implements WatchMaker{
    public Watch createWatch(){
        return new DigitalWatch();
    }
}
