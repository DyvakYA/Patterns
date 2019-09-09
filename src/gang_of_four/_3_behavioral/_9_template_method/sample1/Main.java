package behavioral.templateMethod.sample1;

public class Main {
    public static void main(String[] args) {
        Transaction trans = new Transaction(new OnlineTransaction());
        trans.perform();

        trans.setMethod(new AtmTransaction());
        trans.perform();
    }
}
