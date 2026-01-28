package Arrays;

import java.util.Arrays;

public class TwoSumArrays {
    static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] =j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 7, 8};
        int target = 10;
        System.out.println( "index number = " +Arrays.toString(twoSum(nums, target)));
    }
}
