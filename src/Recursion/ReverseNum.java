package Recursion;

//public class ReverseNum {
//    public static void revers(int n, int r){
//        if(n==0){
//            System.out.println(r);
//            return;
//        }
//        revers(n/10, r*10+n%10);
//    }
//    public static void main(String[] args) {
//        int n = 56356;
//        revers(n, 0);
//    }
//}


//public class ReverseNum {
//    public static int revers(int n, int r){
//        if(n==0){
//            return r;
//        }
//        return revers(n/10, r*10+n%10);
//    }
//    public static void main(String[] args) {
//        int n = 56356;
//        System.out.println(revers(n, 0));
//    }
//}



public class ReverseNum {
    public static int findSum(int n){
        if(n==1) return 1;
        return n + findSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(findSum(5 ));
    }
}


















