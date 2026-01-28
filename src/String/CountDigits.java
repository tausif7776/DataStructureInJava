package String;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count=0;
        while (n != 0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}



//public class CountDigits {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String s = "" + n;
//    System.out.println(s.length());
//
//        String str = "5432";
//        int n = Integer.parseInt(str);
//        System.out.println(n+1);
//    }
//}























