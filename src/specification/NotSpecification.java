package specification;

public class NotSpecification extends CompositeSpecification {

    private Specification wrapped;

    public NotSpecification(Specification specification) {
        this.wrapped = specification;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return !wrapped.isSatisfiedBy(candidate);
    }
}
