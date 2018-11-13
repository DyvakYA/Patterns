package structural.proxy.sample2;

class RealImage implements Image {

    private String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("Loading" + file);
    }

    @Override
    public void display() {
        System.out.println("Watch" + file);
    }
}
