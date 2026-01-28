package Arrays;

public class SortedArray {
    static boolean ArraysSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 7, 8, 9, 10};
        System.out.println(ArraysSort(nums));
    }
}
