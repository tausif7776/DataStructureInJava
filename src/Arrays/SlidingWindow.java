package Arrays;

public class SlidingWindow {
    static int slidingWindow(int[] arr, int k){
        int sum=0;
        int max =0;


        for(int i=0; i<k; i++){
            sum = sum + arr[i];
        }
        max = sum;

        for(int i=k; i<arr.length; i++){
            sum = sum + arr[i] - arr[i-k];
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(slidingWindow(arr, k));
    }
}
