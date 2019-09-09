package behavioral.templateMethod.sample1;

public class Transaction {
    private TransactionMethod transactionMethod;

    public Transaction(TransactionMethod transactionMethod) {
        this.transactionMethod = transactionMethod;
    }

    public void setMethod(TransactionMethod transactionMethod) {
        this.transactionMethod = transactionMethod;
    }

    public void perform() {
        transactionMethod.perform();
    }
}
