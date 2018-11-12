package behavioral.visitor.sample1;

public interface CarPart {
    void accept(CarVisitor visitor);
}
