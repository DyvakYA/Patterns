package behavioral.visitor.sample2;

//Visitor
interface Visitor{
    void visit(EngineElement engine);
    void visit(BodyElement body);
}
