package in.Two_pointer;

// Brute Force
//public class Three_Sum {
//    public static void threeSum(int[] arr, int target) {
//        int n = arr.length;
//
//        for (int i=0; i<n; i++) {
//            for (int j=i+1; j<n; j++) {
//                for (int k=j+1; k<n; k++) {
//                    if (arr[i] + arr[j] + arr[k] == target) {
//                        System.out.println(arr[i] + "," +arr[j]+ "," +arr[k]);
//                    }
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {-1, 0, 1, 2, -1, -4};
//        int target = 0;
//        threeSum(arr, target);
//    }
//}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Optimal Solution
public class Three_Sum {
    public static List<List<Integer>> ThreeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        for (int f=0; f<arr.length; f++) {
            if (arr[f] > 0) {
                break;
            }
            if (f==0 || arr[f] != arr[f-1]) {
                twoSumHelpher(f, arr, res);
            }
        }
        return res;
    }
    public static void twoSumHelpher(int f, int[] arr, List<List<Integer>> res) {
        int i=f+1;
        int j=arr.length-1;
        while (i < j) {
            int sum = arr[f] + arr[i] + arr[j];
            if (sum < 0) {
                j--;
            } else if (sum > 0) {
                i++;
            } else {
                res.add(Arrays.asList(arr[f], arr[i], arr[j]));
                i++;
                j--;
            }
            while (i<j && arr[i] == arr[i-1]){
                i++;
            }
            while (i<j && arr[j] == arr[j+1]) {
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(Arrays.toString(new List[]{ThreeSum(arr)}));
    }
}














