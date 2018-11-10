package behavioral.visitor.visitor;

public interface CarPart {
    void accept(CarVisitor visitor);
}
