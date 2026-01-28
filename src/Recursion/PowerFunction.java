package Recursion;

public class PowerFunction {
    public static void main(String[] args) {
       double result = pow(2, 9);
        System.out.println(result);
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        return a*pow(a, b-1);
    }
}
