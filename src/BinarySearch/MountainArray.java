package BinarySearch;

public class MountainArray {
    static int mountain(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 5, 6, 8, 6, 3};
        System.out.println(mountain(arr));
    }
}

//
//public class MountainArray {
//    static int peakArray(int[] arr){
//        int start=1;
//        int end=arr.length-2 ;
//
//        while (start<=end){
//            int mid = start + (end-start)/2;
//            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            else if(arr[mid]>arr[mid-1] && arr[mid] < arr[mid+1]){
//                start = mid + 1;
//            }
//            else{
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[] arr = {0, 1, 4,0,-1};
//        System.out.println(peakArray(arr));
//    }
//}
//















