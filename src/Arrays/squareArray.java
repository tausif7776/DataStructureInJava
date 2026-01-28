package Arrays;

import java.util.Arrays;

public class squareArray {
    public static int[] squareArray(int[] arr){
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        int head=0;
        int tail=arr.length-1;
        for(int pos=tail; pos>=0; pos--){
            if(arr[head] > arr[tail]){
                result[pos] = arr[head];
                head++;
            }
            else{
                result[pos] = arr[tail];
                tail--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-3, 5, -2, 7, 9, 10};
        int[] squaredSorted = squareArray(arr);
        System.out.println(Arrays.toString(squaredSorted));
    }
}
