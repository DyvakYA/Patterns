package behavioral.visitor.sample3;

class MechanicVisitorTwo implements Visitor2Two {

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("check " + wheel.getName() + " weel");
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
