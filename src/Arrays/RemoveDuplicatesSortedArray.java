package Arrays;

import java.util.Arrays;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicate(int[] arr) {

        int k = 1;

        for (int j = 1; j < arr.length; j++) {

            if (arr[j] != arr[j - 1]) {
                arr[k] = arr[j];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 5, 6, 6};

        int result = removeDuplicate(arr);

        System.out.println("Unique elements: " + result);

        System.out.println(
                Arrays.toString(Arrays.copyOf(arr, result))
        );
    }
}
