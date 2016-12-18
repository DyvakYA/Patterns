package behavioral.visitor;

/**
 * Created by Dyvak on 18.12.2016.
 */
public class VisitorOne {
    public static void main(String[] args) {

        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor hool = new HooliganVisitor();

        body.accept(hool);
        engine.accept(hool);
    }
}

//Visitor
interface Visitor{
    void visit(EngineElement engine);
    void visit(BodyElement body);
}

//element
interface Element{
    void accept(Visitor visitor);
}

//Body
class BodyElement implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

//engine
class EngineElement implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class HooliganVisitor implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Start engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Kick body");
    }
}

class MechanicVisitor implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Check engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Check the body");
    }
}