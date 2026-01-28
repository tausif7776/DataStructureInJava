package BasicSorting;


import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    static ArrayList<Integer> common(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;

        while (i < n && j < m) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 2, 2, 4};
        int[] b = {3, 2, 2, 7};
        System.out.println(common(a, b));
    }
}


//import java.util.Arrays;
//
//public class CommonElements {
//    static int[] common(int[] a, int[] b) {
//        Arrays.sort(a);
//        Arrays.sort(b);
//        int n = a.length;
//        int i = 0;
//        int j = 0;
//
//        while (i < n && j < n) {
//            if (a[i] == b[j]) {
//                i++;
//                j++;
//            } else if (a[i] < b[j]) {
//                i++;
//            } else {
//                j++;
//            }
//        }
//        return a;
//
//    }
//
//    public static void main(String[] args) {
//        int[] a = {2, 3, 5, 6, 7};
//        int[] b = {2, 3, 9, 6, 10};
//        System.out.println(Arrays.toString(common(a, b)));
//    }
//}





































