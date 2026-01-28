package Arrays;

//import java.util.Arrays;
//
//public class MoveAllZeroEnd {
//    static void moveZeroEnd(int[] arr){
//        int n = arr.length;
//        for(int i=0; i<n-1; i++){
//            for(int j=0; j<n-1; j++){
//                if(arr[j]==0){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 0, 4, 0, 0, 6, 8, 8, 9, 9, 10};
//        moveZeroEnd(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}


import java.util.Arrays;

public class MoveAllZeroEnd {
    static void move(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 10, 0, 6, 7, 0, 3, 0, 9};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
}























