package specification;

public class AndNotSpecification extends CompositeSpecification {

    private Specification leftCondition;
    private Specification rightCondition;

    public AndNotSpecification(CompositeSpecification left, Specification right) {
        this.leftCondition = left;
        this.rightCondition = right;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return leftCondition.isSatisfiedBy(candidate) && rightCondition.isSatisfiedBy(candidate) != true;

    }
}
