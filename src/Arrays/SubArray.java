package Arrays;

public class SubArray {
    static void suba(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print("["+ + arr[i] + "]" + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};
        suba(nums);
    }
}



























