package BinarySearch;

public class FloorArray {
    public static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int index = -1;

        while (start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid]<=target){
                index = mid;
                start = mid + 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 10, 12, 19};
        int target = 11;
        System.out.println(floor(arr, target));
    }
}
