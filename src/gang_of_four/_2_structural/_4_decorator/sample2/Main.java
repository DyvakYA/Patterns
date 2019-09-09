package structural.decorator.sample2;

/**
 * Created by Dyvak on 19.11.2016.
 */

public class Main {

    public static void main(String[] args) {
        //PrinterInterface printer = new Printer("Hi");
        PrinterInterface printer = new QuotesDecorator(new RightBracketDecorator(new LeftBracketDecorator(new QuotesDecorator(new Printer("Hi")))));
        printer.print();
    }
}

