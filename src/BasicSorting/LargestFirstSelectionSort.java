package BasicSorting;


import java.util.Arrays;


public class LargestFirstSelectionSort {
    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;
            int index = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
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
