package behavioral.visitor.visitor;

public class Engine implements CarPart {
    private double volume;

    public Engine(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
}
