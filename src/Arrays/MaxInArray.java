package Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 6, 7, 5};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i-1];
            }
        }
        System.out.println(max);

    }

}
