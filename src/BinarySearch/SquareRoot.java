package BinarySearch;

public class SquareRoot {
    static int square(int n){
        int root = 0;
        for(int i=0; i<=n; i++) {
            if (i * i > n) {
                break;
            }
            root =  i;
        }
        return root;
    }
    public static void main(String[] args) {
        System.out.println(square(12));
    }
}
