package behavioral.strategy;

import java.util.Arrays;

/**
 * Created by Dyvak on 19.11.2016.
 */
public class StrategyOne {
    public static void main(String[] args) {
        StrategyClient c = new StrategyClient();

        int[] arr0 ={1,3,2,1};
        c.setStrategy(new SelectSort());
        c.executeStrategy(arr0);

        int[] arr1 ={11,3,22,16,12,16,12};
        c.setStrategy(new InsertSort());
        c.executeStrategy(arr1);

        int[] arr2 ={1,32,-2,17,4,6,3,2};
        c.setStrategy(new BubbleSort());
        c.executeStrategy(arr2);
    }
}

//Context
class StrategyClient{
    Sorting strategy;
    public void setStrategy(Sorting strategy) {this.strategy = strategy;}
    public void executeStrategy(int[] arr) {strategy.sort(arr);}
}

//behavioral.behavioral.strategy.strategy
interface Sorting{
    void sort(int[] arr);
}

//Bubble sorting behavioral.behavioral.strategy.strategy (Сортировка пузырьком)
class BubbleSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("BubbleSort");
        System.out.println("until:\t" + Arrays.toString(arr));
        for (int barier = arr.length - 1; barier >= 0; barier--) {
            for (int i = 0; i < barier; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr));
    }
}

//Selection sorting behavioral.behavioral.strategy.strategy (Сортировка выборками)
class SelectSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("SelectSort");
        System.out.println("until:\t" + Arrays.toString(arr));
        for (int barier = 0; barier < arr.length - 1; barier++) {
            for (int i = barier + 1; i < arr.length; i++) {
                if (arr[i] < arr[barier]) {
                    int tmp = arr[i];
                    arr[i] = arr[barier];
                    arr[barier] = tmp;
                }
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr));
    }
}

//Inserting sorting behavioral.behavioral.strategy.strategy (Сортировка вставками)
class InsertSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("InsertSort");
        System.out.println("until:\t" + Arrays.toString(arr));
        for (int barier = 1; barier < arr.length; barier++) {
            int index=barier;
            while (index-1 >= 0 && arr[index] < arr[index-1]) {
                int tmp = arr[index];
                arr[index] = arr[index-1];
                arr[index-1] = tmp;
                index--;
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr));
    }
}

