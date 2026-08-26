package Basics;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int orginalNum = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            int fact = 1;
            for (int i=1; i<=digit; i++) {
                fact *= i;
            }
            sum += fact;
            n = n / 10;
        } if (orginalNum == sum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}
