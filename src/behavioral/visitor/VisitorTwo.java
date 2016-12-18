package behavioral.visitor;

/**
 * Created by Dyvak on 18.12.2016.
 */
public class VisitorTwo {
    public static void main(String[] args) {

        ElementTwo car = new CarElement();
        car.accept(new HooliganVisitorTwo());
        System.out.println();
        car.accept(new MechanicVisitorTwo());
    }
}

//Visitor
interface Visitor2Two{
    void visit(EngineElementTwo engine);
    void visit(BodyElementTwo body);
    void visit(WheelElement wheel);
    void visit(CarElement car);
}

//element
interface ElementTwo{
    void accept(Visitor2Two visitor);
}

//Body
class BodyElementTwo implements ElementTwo{
    @Override
    public void accept(Visitor2Two visitor) {
        visitor.visit(this);
    }
}

//engine
class EngineElementTwo implements ElementTwo{
    @Override
    public void accept(Visitor2Two visitor) {
        visitor.visit(this);
    }
}

//coleso
class WheelElement implements ElementTwo{

    private String name;

    public WheelElement(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor2Two visitor) {
        visitor.visit(this);
    }
}

//Car
class CarElement implements ElementTwo {
    ElementTwo[] elements;

    public CarElement() {
        this.elements = new ElementTwo[]{
                new WheelElement("front left"),
                new WheelElement("front right"),
                new WheelElement("back left"),
                new WheelElement("back right"),
                new BodyElementTwo(),
                new EngineElementTwo()};
    }

    @Override
    public void accept(Visitor2Two visitor) {
        for (ElementTwo elem: elements){
            elem.accept(visitor);
        }
        visitor.visit(this);
    }
}

class HooliganVisitorTwo implements Visitor2Two{
    @Override
    public void visit(EngineElementTwo engine) {
        System.out.println("Start engine");
    }

    @Override
    public void visit(BodyElementTwo body) {
        System.out.println("Kick body");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("kick "+wheel.getName()+ "wheel");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Smoke in the car");
    }
}

class MechanicVisitorTwo implements Visitor2Two{

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("check "+wheel.getName()+" weel");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("check all car");
    }

    @Override
    public void visit(EngineElementTwo engine) {
        System.out.println("Check engine");
    }

    @Override
    public void visit(BodyElementTwo body) {
        System.out.println("Check the body");
    }
}
