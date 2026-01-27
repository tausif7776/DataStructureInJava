package Arrays;

public class FirstOccurence {
    public static int firstOccur(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                index = mid;
                end = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 4, 3, 6, 7, 8, 8};
        int target = 8;
        int result = firstOccur(arr, target);
        System.out.println("Index Number is : " +result);
    }
}
