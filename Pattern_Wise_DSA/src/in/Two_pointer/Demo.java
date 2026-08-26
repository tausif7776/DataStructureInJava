package in.Two_pointer;

public class Demo {
    public static int countSumPair(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] + arr[j] < target) {
                    System.out.println(arr[i] + "," +arr[j]);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 1, 2, 3, 1};
        int target = 2;
        System.out.println(countSumPair(arr, target));
    }
}
