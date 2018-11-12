package behavioral.visitor.sample2;

/**
 * Created by Dyvak on 18.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor hool = new HooliganVisitor();

        body.accept(hool);
        engine.accept(hool);
    }
}

