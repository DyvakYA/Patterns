package behavioral.visitor.sample3;

//coleso
class WheelElement implements ElementTwo {

    private String name;

    public WheelElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor2Two visitor) {
        visitor.visit(this);
    }
}
