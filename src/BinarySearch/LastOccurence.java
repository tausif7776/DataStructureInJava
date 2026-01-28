package BinarySearch;


import java.util.ArrayList;
import java.util.Arrays;

public class LastOccurence {
    ArrayList<Integer> lastoccu(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();

        // first occurence
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                index = mid;
                end = mid - 1;
            }
        }
        ans.add(index);


        // second Occurence
         start=0;
        end=arr.length-1;
        index=-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid - 1;
            }
            else{
                index = mid;
                start = mid + 1;
            }
        }
        ans.add(index);
        return ans;
    }
    public static void main(String[] args) {
       int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
       int target = 5;

       LastOccurence  last = new LastOccurence();
       ArrayList<Integer> result = last.lastoccu(arr, target);
        System.out.println(result);

    }
}