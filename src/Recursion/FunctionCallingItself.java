package Recursion;

//public class FunctionCallingItself {
//    public static void Tausif(int n){
//        if(n==10) return;
//        System.out.println("I'm tausif");
//        Tausif(n+1);
//    }
//    public static void main(String[] args) {
//        Tausif(1);
//    }
//}




//import java.util.Scanner;
//
//public class FunctionCallingItself {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        print(n);
//    }
//    public static void print(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        print(n-1);
//    }
//}


import java.util.Scanner;

public class FunctionCallingItself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }
}

























