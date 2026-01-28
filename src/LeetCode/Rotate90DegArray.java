package LeetCode;

import java.util.Arrays;

public class Rotate90DegArray {
    public static void rotate(int[][] arr){
        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
        for(int i=0; i<arr.length; i++) {
            int startcol=0;
            int endcol = arr[0].length-1;
            while (startcol<endcol){
                int temp = arr[i][startcol];
                arr[i][startcol] = arr[i][endcol];
                arr[i][endcol] = temp;
                startcol++;
                endcol--;
            }
        }
        for(int[] ele: arr){
            System.out.println(Arrays.toString(ele));
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);

    }
}
