package behavioral.templateMethod.tempmethod;

public abstract class TransactionMethod {
    public abstract void enterPinCode();
    public abstract void updateBalance();
    public abstract void checkBalance();

    public void perform() {
        enterPinCode();
        updateBalance();
        checkBalance();
    }
}
