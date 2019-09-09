package behavioral.visitor.sample2;

class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Check engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Check the body");
    }
}
