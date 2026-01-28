package BasicSorting;

//public class BubbleSort {
//    public static void Print(int[] arr) {
//        for(int num : arr){
//            System.out.print(num+ " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int[] arr = {0, 2, 1, 4, 3, 5, 6};
//        int n = arr.length;
//        for(int i=0; i<n; i++){
//            int swap = 0;
//            for(int j=0; j<n-1-i; j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    swap++;
//                }
//            }
//            if(swap==0) break;
//        }
//        Print(arr);
//    }
//}


import java.util.Arrays;

public class BubbleSort {
    static void bubbbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int swap = 0;
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {234,24, 5, 3, 6, 23, 98, 54, 23};
       bubbbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}





















