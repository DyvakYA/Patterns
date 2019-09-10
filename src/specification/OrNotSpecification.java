package specification;

public class OrNotSpecification extends CompositeSpecification {

    private Specification rightCondition;
    private Specification leftCondition;

    public OrNotSpecification(CompositeSpecification right, Specification left) {
        this.rightCondition = right;
        this.leftCondition = left;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return leftCondition.isSatisfiedBy(candidate) || rightCondition.isSatisfiedBy(candidate) != true;
    }
}
