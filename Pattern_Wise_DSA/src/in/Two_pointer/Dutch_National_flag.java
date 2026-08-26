package in.Two_pointer;

import java.util.Arrays;

public class Dutch_National_flag {

    public static void threeColor(int[] arr) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;

        // Count 0s, 1s, 2s
        for (int num : arr) {
            if (num == 0) c0++;
            else if (num == 1) c1++;
            else c2++;
        }

        // Rewrite array
        int index = 0;

        for (int i = 0; i < c0; i++) {
            arr[index++] = 0;
        }

        for (int i = 0; i < c1; i++) {
            arr[index++] = 1;
        }

        for (int i = 0; i < c2; i++) {
            arr[index++] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arrs = {1, 2, 0, 0, 1, 2, 2, 0, 1};
        threeColor(arrs);
        System.out.println(Arrays.toString(arrs));
    }
}
