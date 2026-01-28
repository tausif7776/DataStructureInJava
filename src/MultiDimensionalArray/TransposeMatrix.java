package MultiDimensionalArray;

import java.util.Arrays;

public class TransposeMatrix {
    public static void transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
       for(int[] ele : arr){
           System.out.println(Arrays.toString(ele));
       }
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 5}, {4, 6, 5, 6}, {7, 8, 8, 9}, {5, 7, 8, 3}};
       transpose(arr);
    }
}
