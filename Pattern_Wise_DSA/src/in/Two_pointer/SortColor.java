package in.Two_pointer;

//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class SortColor {
//    public static void sortColor(int[] arr) {
//        int n = arr.length;
//
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<n; j++) {
//                if (arr[j]==0) {
//                    int temp = arr[i];
//                    arr[i] =  arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {0, 1, 1, 1, 0, 0, 1, 1};
//        sortColor(arr);
//        sortColor(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}


import java.util.Arrays;

public class SortColor {
    public static void sortColor(int[] nums) {

        int i=0;
        int j=nums.length-1;

        while (i<=j) {
            if (nums[i] == 0) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 0, 0, 1, 1};
        sortColor(nums);
        System.out.println(Arrays.toString(nums));
    }
}





















