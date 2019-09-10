package specification;

public class AndSpecification extends CompositeSpecification {

    private Specification leftCondition;
    private Specification rightCondition;

    public AndSpecification(Specification leftCondition, Specification rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return leftCondition.isSatisfiedBy(candidate) && rightCondition.isSatisfiedBy(candidate);
    }
}
