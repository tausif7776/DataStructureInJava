package BinarySearch;

public class BinarySearch {
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-76, -4, 28, 47, 49, 510, 615, 991, 9999};
        int target = 510;
      int result =  binarySearch(arr, target);
        System.out.println("Index Number = " +result);

    }
}
