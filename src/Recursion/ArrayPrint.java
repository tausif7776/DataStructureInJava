package Recursion;

//import java.util.Arrays;
//
//public class ArrayPrint {
//    public static void recPrint(int[] arr, int idx){
//        int n = arr.length;
//        if(idx == n) return;
//        System.out.print(arr[idx]+ " ");
//        recPrint(arr, idx+1);
//    }
//    public static void main(String[] args) {
//        int[] arr = {2, 34, 12, 65, 29, 87, 45};
//        System.out.println(Arrays.toString(arr));
//    }
//}




public class ArrayPrint {
    public static boolean linearSearch(int[] arr, int ele, int idx){
        if(idx == arr.length) return  false;
        if(arr[idx] == ele) return true;
        return linearSearch(arr, ele, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        int ele = 6;
        System.out.println(linearSearch(arr, ele, 0));

    }
}






















