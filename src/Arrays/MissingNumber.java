package Arrays;

//public class MissingNumber {
//    public static int missing(int[] arr){
//        int n=arr.length;
//        int sum=0;
//        for(int i=0; i<n; i++){
//            sum += arr[i];
//        }
//        int actualSum = (n*(n+1))/2;
//        int missing = actualSum-sum;
//        return missing;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3,  5};
//        System.out.println(missing(arr));
//    }
//}


public class MissingNumber {
    public static int missing(int[] arr) {
        int n = arr.length;
        for (int i = 1; i <= n + 1; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println("Missing number is: " + missing(arr));
    }
}




























