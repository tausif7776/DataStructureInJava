package MultiDimensionalArray;

import java.util.Arrays;

public class ShalloAndDeepCopy {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}, {2, 4, 6, 8}};
        int[][] brr = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}, {2, 4, 6, 8}};
        int [] crr= {2,1,5,4,5};
        brr[1][3] = 20;
        System.out.println();
        int[] c= Arrays.copyOf(crr,5);
        for (int ele:c){
            System.out.print(ele+" ");
        }
    }
}
