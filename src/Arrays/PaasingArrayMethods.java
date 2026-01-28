package Arrays;

public class PaasingArrayMethods {
    static void change(int[] arr){
        arr[0] = 99;
    }
    public static void main(String[] args) {
        int[] arr = {34, 4, 3, 5, 6, 77, 88};
//        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[0]);
    }
}
