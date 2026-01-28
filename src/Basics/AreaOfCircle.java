package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Area = Pie * r * r;

//        int radius = 4;
//        double result = 3.14 * radius * radius;
//        System.out.println(result);


//         double r = 3.2;
//         double result = (4.0/3.0) * (3.14 * r * r * r);
//        System.out.println(result);


        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double result = 2 * (l*b + b*h + l*h);
        System.out.println(result);



    }
}
