package behavioral.visitor.sample2;

//engine
class EngineElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
