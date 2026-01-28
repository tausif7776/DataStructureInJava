package Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
       int[] arr = {2, 3, 4, 5, 6, 67, 44, 66, 99};
       int max = Integer.MIN_VALUE;

       for(int i=0; i<arr.length; i++){
           if(arr[i] > max){
               max = arr[i];
           }
       }
       int secmax = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
           if(arr[i] > secmax && arr[i] != max){
               secmax = arr[i];
           }
       }
        System.out.println(secmax);
    }
}

