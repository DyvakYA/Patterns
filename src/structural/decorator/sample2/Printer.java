package structural.decorator.sample2;

class Printer implements PrinterInterface {
    private String value;

    public Printer(String value) {
        this.value = value;
    }

    public void print() {
        System.out.print(value);
    }
}
