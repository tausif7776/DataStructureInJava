package LeetCode;

public class MajorityElement {
    static int major(int[] arr){
        int n=arr.length;
        for (int j : arr) {
            int count = 0;
            for (int k : arr) {
                if (j == k) {
                    count++;
                }
            }
            if (count > n / 2) {
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
           int[] arr = {4, 4, 5, 3, 2, 4, 4, 7, 4};
        System.out.println(major(arr));
    }
}