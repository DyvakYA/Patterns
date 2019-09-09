package behavioral.strategy.sample2;

import java.util.Arrays;

//Bubble sorting behavioral.behavioral.sample1.sample1 (Сортировка пузырьком)
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
