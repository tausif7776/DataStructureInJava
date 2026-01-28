package MultiDimensionalArray;

//public class OutputIn2DArray {
//    public static void main(String[] args) {
//        int[][] arr = new int[3][4];
//       System.out.println(arr.length + " "+arr[0].length);
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[0].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}



public class OutputIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}, {2, 4, 6, 8}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}