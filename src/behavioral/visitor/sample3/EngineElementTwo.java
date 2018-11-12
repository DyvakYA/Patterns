package behavioral.visitor.sample3;

//engine
class EngineElementTwo implements ElementTwo {
    @Override
    public void accept(Visitor2Two visitor) {
        visitor.visit(this);
    }
}
