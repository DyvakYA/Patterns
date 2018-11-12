package behavioral.visitor.sample3;

//Visitor
interface Visitor2Two {
    void visit(EngineElementTwo engine);

    void visit(BodyElementTwo body);

    void visit(WheelElement wheel);

    void visit(CarElement car);
}
