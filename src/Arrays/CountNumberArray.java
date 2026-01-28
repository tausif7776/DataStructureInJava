package Arrays;

public class CountNumberArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 66, 55, 77, 88, 99, 1, 77, 90};
        int max = arr[0];
        int count = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                count++;
            }
        }
        System.out.println(count);
    }
}
