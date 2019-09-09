package structural.decorator.sample2;

class RightBracketDecorator extends Decorator{
    public RightBracketDecorator(PrinterInterface component) {super(component);}
    public void print(){
        component.print();
        System.out.print("???");
    }
}
