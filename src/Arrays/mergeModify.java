package Arrays;

import java.util.Arrays;

public class mergeModify {
     public static int[] merge(int[] a, int[] b) {
         int n = a.length;
         int m = b.length;
         int[] res = new int[n+m];
         int i = 0;
         int j = 0;
         int idx = 0;

         while (i<n && j<m) {
             if (a[i] <= b[j]) {
                 res[idx] =a[i];
                 idx++;
                 i++;
             } else {
                 res[idx] = b[j];
                 idx++;
                 j++;
             }
         }
         while (j<m) {
             res[idx] = b[j];
             idx++;
             j++;
         }
         while (i<n) {
             res[idx] = a[i];
             idx++;
             i++;
         }
         return res;
     }
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] result = merge(a, b);
        System.out.println(Arrays.toString(result));
    }
}
