package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dyvak on 27.11.2016.
 */
public class CompositeOne {
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

interface Shape{
    void drew();
}

class Square implements Shape{

    @Override
    public void drew() {
        System.out.println("Square");
    }
}

class Triangle implements Shape{

    @Override
    public void drew() {
        System.out.println("Triangle");
    }
}

class Circle implements Shape{

    @Override
    public void drew() {
        System.out.println("Circle");
    }
}

class Composite implements Shape{
    private List<Shape> components = new ArrayList<>();

    void addComponent(Shape component){
        components.add(component);
    }

    void removeComponent(Shape component){
        components.remove(component);
    }

    @Override
    public void drew() {
        for(Shape component: components){
            component.drew();
        }
    }
}