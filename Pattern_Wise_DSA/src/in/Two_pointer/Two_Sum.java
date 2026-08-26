package in.Two_pointer;

public class Two_Sum {
    public static boolean twoSum(int[] arr, int target) {
        int n = arr.length-1;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " +arr[j]);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(arr, target));
    }
}
