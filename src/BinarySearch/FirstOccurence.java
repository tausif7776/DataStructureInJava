package BinarySearch;

public class FirstOccurence {
    static int firstOccurence(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        int index=-1;

        while (start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
               start = mid+1;
            }
            else  if(arr[mid]==target){
                index = mid;
                end = mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 6, 9,1, 1, 1, 1};
        int target = 1;
        int result = firstOccurence(arr, target);
        System.out.println("Index number = " +result);
    }
}
