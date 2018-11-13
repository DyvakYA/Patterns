package structural.decorator.sample2;

abstract class Decorator implements PrinterInterface {
    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }
}
