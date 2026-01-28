package MultiDimensionalArray;

//public class RowMaximumSum {
//    static int maxsum(int[][] arr){
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i< arr.length; i++){
//            int sum = 0;
//            for(int j=0; j<arr[0].length; j++){
//                sum += arr[i][j];
//            }
//          max = sum;
//            max = Math.max(max, sum);
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int[][] arr = {{2, 4, 6}, {3, 2, 1},{8, 3, 4}};
//        System.out.println(maxsum(arr));
//    }
//}


public class RowMaximumSum {
    static void maxsum(int[][] arr){
        int max = Integer.MIN_VALUE;
        int row = -1;
        for(int i=0; i< arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
            if(sum > max){
                max = sum;
                row = i;
            }
        }
        System.out.println(row + " " +max);
    }
    public static void main(String[] args) {
        int[][] arr = {{2, 4, 6}, {3, 2, 1},{8, 3, 4}};
        maxsum(arr);
    }
}










