package LeetCode;

public class MajorityElement {
    static int major(int[] arr){
        int n=arr.length;
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
           int[] arr = {4, 4, 5, 3, 2, 4, 4, 7, 4};
        System.out.println(major(arr));
    }
}