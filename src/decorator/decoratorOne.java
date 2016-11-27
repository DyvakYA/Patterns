package decorator;

/**
 * Created by Dyvak on 19.11.2016.
 */

public class DecoratorOne {

    public static void main(String[] args) {
        //PrinterInterface printer = new Printer("Hi");
        PrinterInterface printer = new QuotesDecorator(new RightBracketDecorator(new LeftBracketDecorator(new QuotesDecorator(new Printer("Hi")))));
        printer.print();
    }
}

interface PrinterInterface{
    void print();
}

class Printer implements PrinterInterface {
    String value;

    public Printer(String value) {
        this.value = value;
    }

    public void print() {
        System.out.print(value);
    }
}

abstract class Decorator implements PrinterInterface{
    PrinterInterface component;
    public Decorator(PrinterInterface component){this.component = component;}
}

class QuotesDecorator extends Decorator  {
    public QuotesDecorator(PrinterInterface component) {super(component);}
    public void print(){
        System.out.print("/?");
        System.out.print("-----");
        component.print();
        System.out.print("------");
    }
}

class LeftBracketDecorator extends Decorator{
    public LeftBracketDecorator(PrinterInterface component) {super(component);}
    public void print(){
        System.out.print("{");
        component.print();
    }
}

class RightBracketDecorator extends Decorator{
    public RightBracketDecorator(PrinterInterface component) {super(component);}
    public void print(){
        component.print();
        System.out.print("???");
    }
}

