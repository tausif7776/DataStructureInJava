package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    static void remove(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == arr[i+1]){
                System.out.print(arr[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};
        remove(arr);
        System.out.println(Arrays.toString(arr));
    }
}
