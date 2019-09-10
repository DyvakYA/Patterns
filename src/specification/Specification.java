package specification;

public interface Specification {

    boolean isSatisfiedBy(Object candidate);

    Specification and(Specification other);

    Specification andNot(Specification other);

    Specification or(Specification other);

    Specification orNot(Specification other);

    Specification not();
}
