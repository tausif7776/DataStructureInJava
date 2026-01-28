package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example {
    static void allZeroEnd(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] != 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 10, 0, 6, 7, 0, 3, 0, 9};
        allZeroEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
