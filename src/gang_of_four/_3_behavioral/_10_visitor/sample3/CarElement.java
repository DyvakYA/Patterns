package behavioral.visitor.sample3;

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
        for (ElementTwo elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);
    }
}
