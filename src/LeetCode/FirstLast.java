package LeetCode;

//import java.util.Arrays;
//
//public class FirstLast {
//    public static void main(String[] args) {
//        int[] arr = {5, 7, 7, 7, 7, 8, 10};
//        int target = 7;
//        int[] result = firstLast(arr, target);
//        System.out.println(Arrays.toString(result));
//    }
//
//    static int[] firstLast(int[] arr, int target) {
//        int[] ans = {-1, -1};
//
//        // Find first occurrence
//        ans[0] = search(arr, target, true);
//
//        // Find last occurrence
//        if (ans[0] != -1) { // Only search for last if first is found
//            ans[1] = search(arr, target, false);
//        }
//
//        return ans;
//    }
//
//    static int search(int[] arr, int target, boolean findStartIndex) {
//        int ans = -1;
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                ans = mid;
//                if (findStartIndex) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//
//        return ans;
//    }
//}

//import java.util.*;
//
//class GFG {
//    ArrayList<Integer> find(int arr[], int x) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        int first = -1, last = -1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                if (first == -1) {
//                    first = i;   // pehli baar mila
//                }
//                last = i;        // hamesha update karte raho
//            }
//        }
//
//        ans.add(first);
//        ans.add(last);
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        GFG obj = new GFG();
//        int[] arr = {2, 3, 4, 4, 4, 5, 6, 7};
//        System.out.println(obj.find(arr, 4)); // Output: [2, 4]
//        System.out.println(obj.find(arr, 9)); // Output: [-1, -1]
//    }
//}

