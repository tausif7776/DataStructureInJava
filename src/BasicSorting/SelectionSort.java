package BasicSorting;

import java.util.Arrays;


public class SelectionSort {
    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 9, -2, 4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}