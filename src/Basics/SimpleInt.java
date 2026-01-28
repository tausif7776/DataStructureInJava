package Basics;

import java.util.Scanner;

public class SimpleInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        int p = sc.nextInt();
        System.out.println("Enter Annual intrest rate: ");
        int R = sc.nextInt();
        System.out.println("Enter Time Period in Years: ");
        int T = sc.nextInt();
        int SI = (p * R * T) / 100;
        System.out.println("Simple Int = " +SI);
    }
}
