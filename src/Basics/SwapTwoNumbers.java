package Basics;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        /*int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " +a);
        System.out.println( "b = " +b);*/

        int a = 40;
        int b = 50;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
