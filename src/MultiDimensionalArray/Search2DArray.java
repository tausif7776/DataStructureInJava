package MultiDimensionalArray;

public class Search2DArray {
    public static boolean search(int[][] arr, int target){
        int m = arr.length;
        int n = arr[0].length;
        int i=0;
        int j = n-1;

        while (j<m && j>=0){
            if(arr[i][j] > target){
                j--;
            }
            else if(arr[i][j] < target){
                i++;
            }
            else{
                return  true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
           int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 14}, {15, 16, 17, 18}};
           int target = 11;
        System.out.println(search(arr, target));
    }
}
