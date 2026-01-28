package Arrays;

import java.util.Arrays;

public class RotateArrays {
    static void rotateArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
      int[] arr = {2, 4, 5, 6, 7, 8, 9, 0, 9};
        System.out.println(Arrays.toString(arr));
    }
}
