package LeetCode;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] arr1){
        int row = arr1.length;
        int col = arr1[0].length;
        int[][] arr2 = new int[col][row];
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                arr2[i][j] = arr1[j][i];
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       int[][] result =  transpose(arr);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
