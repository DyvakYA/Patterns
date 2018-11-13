package structural.decorator.sample2;

class QuotesDecorator extends Decorator  {
    public QuotesDecorator(PrinterInterface component) {super(component);}
    public void print(){
        System.out.print("/?");
        System.out.print("-----");
        component.print();
        System.out.print("------");
    }
}
