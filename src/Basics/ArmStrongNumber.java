package Basics;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int temp = n;
        int rev=0;

        while (n > 0) {
            int digit = n % 10;
            rev += digit * digit * digit;
            n = n / 10;
        } if (temp == rev) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
