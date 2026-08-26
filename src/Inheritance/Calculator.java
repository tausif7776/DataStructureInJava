package Inheritance;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(10, 20));
        System.out.println(c1.add(30, 40, 50));
        System.out.println(c1.add(20.3, 88.55));
    }
}
