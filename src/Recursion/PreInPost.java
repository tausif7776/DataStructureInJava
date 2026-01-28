package Recursion;

public class PreInPost {
    public static void prePost(int n){
        if(n==0) return;
        System.out.print(n+" ");
        prePost(n-1);
        System.out.print(n+" ");
        prePost(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        prePost(3);
    }
}
