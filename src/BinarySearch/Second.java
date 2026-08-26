package BinarySearch;


import java.util.Scanner;
public class Second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int n = sc.nextInt();

        if (n >= 18) {
            System.out.println("You are above the age of consent\nGood For You!!!");
        } else if (n < 0) {
            System.out.println("You are Entering Invalid age");
        } else {
            System.out.println("You are below the age of consent");
        }
    }
}
