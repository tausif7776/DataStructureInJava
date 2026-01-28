package String;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



//        String str = "";  // empty string
//        str += n;

        String str = Integer.toString(n);
        System.out.println(str);
    }
}
