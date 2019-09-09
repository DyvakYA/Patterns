package behavioral.strategy.sample2;

import java.util.Arrays;

//Inserting sorting behavioral.behavioral.sample1.sample1 (Сортировка вставками)
class InsertSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("InsertSort");
        System.out.println("until:\t" + Arrays.toString(arr));
        for (int barier = 1; barier < arr.length; barier++) {
            int index = barier;
            while (index - 1 >= 0 && arr[index] < arr[index - 1]) {
                int tmp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = tmp;
                index--;
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr));
    }
}
