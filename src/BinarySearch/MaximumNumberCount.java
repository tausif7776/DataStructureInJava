package BinarySearch;

//public class MaximumNumberCount {
//    public static int maximumCount(int[] arr){
//        int start=0;
//        int end = arr.length-1;
//        int max = Integer.MIN_VALUE;
//
//        while (start<=end){
//            int mid = start + (end - start)/2;
//            if(arr[mid]>max){
//                max = mid;
//                end = mid - 1;
//            }
//            else{
//                start = mid + 1;
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int[] arr = {-2, -1, -1, 1, 2, 3};
//        System.out.println(maximumCount(arr));
//    }
//}



// Maximum postive number and maximum negative number

public class MaximumNumberCount {
    public static int maximumCount(int[] arr){
        int pos = 0;
        int neg = 0;

        for(int num : arr){
            if(num > 0){
                pos++;
            }
            else if(num<0){
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
    public static void main(String[] args) {
        int[] arr = {-2, -1, -1, 0, 0, 2, 3, 5, 4};
        System.out.println(maximumCount(arr));
    }
}




















