package Arrays;

public class SwapNumber {




//    static void swap(int[] a, int[] b){
//        int temp = a[0];
//        a[0] = b[0];
//        b[0] = temp;
//    }
//
//    public static void main(String[] args) {
//        int[] a = {10};
//        int[] b = {20};
//        System.out.println("Before Swap = " + a[0]+ " "+b[0]);
//        swap(a, b);
//        System.out.println( "After Swap = " +a[0]+ " " +b[0]);
//    }




    static void swap(int[] a){
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;

    }

    public static void main(String[] args) {
        int[] a = {24, 48};
        System.out.println("Before Swap = " + a[0]+ " "+a[1]);
        swap(a);
        System.out.println("Before Swap = " + a[0]+ " "+a[1]);
    }
}
