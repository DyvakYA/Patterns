package creational.factoryMethod.sample3;

class RomeWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new RomeWatch();
    }
}
