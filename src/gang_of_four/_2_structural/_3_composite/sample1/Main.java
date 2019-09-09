package structural.composite.sample1;

/**
 * Created by Dyvak on 27.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape triangle1 = new Triangle();

        Shape square3 = new Square();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite.addComponent(square1);
        composite.addComponent(square2);
        composite.addComponent(triangle1);

        composite1.addComponent(square3);
        composite1.addComponent(circle1);

        composite2.addComponent(circle2);
        composite2.addComponent(circle3);

        composite.addComponent(composite1);
        composite.addComponent(composite2);
        composite.addComponent(new Circle());

        composite.drew();


    }
}

