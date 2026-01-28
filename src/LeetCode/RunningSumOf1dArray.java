package LeetCode;

public class RunningSumOf1dArray {
    static void runningSum(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<=i; j++){

                System.out.print(nums[i]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        runningSum(arr);
    }
}
