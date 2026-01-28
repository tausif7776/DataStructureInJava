package DsaPractise;

import java.util.Scanner;

//public class Simple_Login_System {
//    public static void main(String[] args) {
//
//        // Stored (correct) credentials
//        String correctUser = "admin";
//        String correctPass = "1234";
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Username: ");
//        String user = sc.nextLine();
//
//        System.out.print("Enter Password: ");
//        String pass = sc.nextLine();
//
//        if (user.equals(correctUser) && pass.equals(correctPass)) {
//            System.out.println("Login Successful!");
//        } else {
//            System.out.println("Invalid Username or Password");
//        }
//    }
//}






public class Simple_Login_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String user = sc.nextLine();

        System.out.print("Enter a password: ");
        String pass = sc.nextLine();

        System.out.print("userName: " +user + "\n");
        System.out.print("Password: " +pass);
    }
}

























