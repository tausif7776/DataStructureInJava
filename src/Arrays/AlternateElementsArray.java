package Arrays;

import java.util.Arrays;

public class AlternateElementsArray {
    static int[] alternate(int[] arr){
        int size = (arr.length + 1) / 2;
        int[] result = new int[size];
        int j = 0;

        for(int i = 0; i < arr.length; i += 2){
            result[j++] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] alternateArr = alternate(arr);
        System.out.println(Arrays.toString(alternateArr));
    }
}


















