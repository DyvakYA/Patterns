package behavioral.strategy.sample2;

/**
 * Created by Dyvak on 19.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        StrategyClient c = new StrategyClient();

        int[] arr0 = {1, 3, 2, 1};
        c.setStrategy(new SelectSort());
        c.executeStrategy(arr0);

        int[] arr1 = {11, 3, 22, 16, 12, 16, 12};
        c.setStrategy(new InsertSort());
        c.executeStrategy(arr1);

        int[] arr2 = {1, 32, -2, 17, 4, 6, 3, 2};
        c.setStrategy(new BubbleSort());
        c.executeStrategy(arr2);
    }
}

