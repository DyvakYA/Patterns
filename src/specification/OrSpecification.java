package specification;

public class OrSpecification extends CompositeSpecification {

    private Specification rightCondition;
    private Specification leftCondition;

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return leftCondition.isSatisfiedBy(candidate) || rightCondition.isSatisfiedBy(candidate);
    }

    public OrSpecification(CompositeSpecification right, Specification left) {
        this.rightCondition = right;
        this.leftCondition = left;
    }
}
