package Pattern;

public class Pattern2nd {
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
