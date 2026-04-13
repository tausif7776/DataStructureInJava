package Arrays;

public class ReverseArray {
    static void reverse(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 8, 9, 10};
//        reverse(arr);
        int start=0;
        int end=arr.length-1;

        while (start < end){
              int temp = arr[start];
              arr[start] = arr[end];
              arr[end] = temp;
              start++;
              end--;
        }
        reverse(arr);
    }
}













//package Arrays;
//
//public class ReverseArray {
//    static void reverse(int[] arr){
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 5, 6, 7, 8, 9, 10};
//        reverse(arr);
//        int start=0;
//        int end=arr.length-1;
//
//        while (start < end){
//              int temp = arr[start];
//              arr[start] = arr[end];
//              arr[end] = temp;
//              start++;
//              end--;
//        }
//        reverse(arr);
//    }
//}













package Arrays;

public class ReverseArray {
    static void reverse(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void reverse(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 8, 9, 10};
        reverse(arr);
        int start=0;
        int end=arr.length-1;

        while (start < end){
           reverse(arr, start, end);
            start++;
            end--;
        }
        reverse(arr);
    }
}
