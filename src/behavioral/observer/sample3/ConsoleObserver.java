package behavioral.observer.sample3;

class ConsoleObserver implements Observer {

    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("Weather is change. t=" + temp + " p=" + presser + ".");
    }
}
