package MultiDimensionalArray;

public class MinOfRowMax {
        static void maxsum(int[][] arr){
           int minofmax = Integer.MAX_VALUE;
            for(int i=0; i< arr.length; i++){
                int rowmax = Integer.MIN_VALUE;
                for(int j=0; j<arr[0].length; j++){
                    if(arr[i][j]>rowmax){
                        rowmax = arr[i][j];
                    }
                }
                if(rowmax < minofmax){
                    minofmax = rowmax;
                }
            }
            System.out.println(minofmax);
        }
        public static void main(String[] args) {
            int[][] arr = {{2, 4, 6}, {3, 2, 1},{8, 3, 4}};
            maxsum(arr);
        }
}
