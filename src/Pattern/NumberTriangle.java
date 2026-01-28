//package Pattern;
//
//public class NumberTriangle {
//    static void number(int n){
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                System.out.print(col+ " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        number(4);
//    }
//}



//package Pattern;
//
//public class NumberTriangle {
//    static void number(int n){
//        for(int row=1; row<=n; row++){
//            for(int col=n; col>=row; col--){
//                System.out.print(col+ " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        number(4);
//    }
//}



//package Pattern;
//
//public class NumberTriangle {
//    static void newpa(int n){
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        newpa(5);
//    }
//}



package Pattern;

public class NumberTriangle {
    static void Number(int n){
        for(int i=0; i<2*n; i++){
            int totalcols = i>n ? 2*n-i: i;
            for(int j=0; j<totalcols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Number(7);
    }
}


















