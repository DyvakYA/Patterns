package behavioral.visitor.sample3;

class HooliganVisitorTwo implements Visitor2Two {
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
        System.out.println("kick " + wheel.getName() + "wheel");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Smoke in the car");
    }
}
