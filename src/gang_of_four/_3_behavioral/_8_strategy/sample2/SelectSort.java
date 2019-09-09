package behavioral.strategy.sample2;

import java.util.Arrays;

//Selection sorting behavioral.behavioral.sample1.sample1 (Сортировка выборками)
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
