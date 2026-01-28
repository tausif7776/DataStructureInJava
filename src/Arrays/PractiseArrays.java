package Arrays;

  //  Find the maximum and minimum element in an array.

//public class PractiseArrays {
//    static int max(int[] arr){
//        int maxValue = arr[0];
//        for(int i=1; i<arr.length; i++){
//            if(maxValue<arr[i]){
//                maxValue = arr[i];
//            }
//        }
//        return maxValue;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {33, 45, 6, 7, 8, 99};
//        System.out.println(max(arr));
//    }
//}





// find the sum of all elements in an array

//public class PractiseArrays {
//    static int allSumelement(int[] arr){
//        int sum = 0;
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i];
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(allSumelement(arr));
//    }
//}




// Search for an element in an array (Linear Search)

//public class PractiseArrays {
//    static int LinearSearch(int[] arr, int key){
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == key){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 1, 6, 8};
//        int key = 45;
//        System.out.println(LinearSearch(arr, key));
//    }
//}




//Find the index of the first occurrence of an element

//public class PractiseArrays {
//    static int Firstele(int[] arr, int target){
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[] arr = {20, 20, 30, 20, 40, 50};
//        int target = 20;
//        System.out.println(Firstele(arr, target));
//    }
//}





// Reverse the array

//
//public class PractiseArrays {
//    static void reverse(int[] arr){
//        for(int i=0; i<arr.length-1; i++){
//            int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {4, 7, 8, 9, 10, 12};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}









//
//import java.util.Arrays;
//
//public class PractiseArrays {
//    static void reverse(int[] arr, int start, int end){
//        int temp = arr[start];
//           arr[start] = arr[end];
//           arr[end] = temp;
//    }
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start<end){
//            reverse(arr, start, end);
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}
//
//import java.util.Arrays;
//
//public class PractiseArrays {
//    static void reverse(int[] arr, int start, int end){
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//    }
//    public static void main(String[] args) {
//      int[] arr = {2, 6, 8, 1, 3, 9, 20};
//      int start = 0;
//      int end = arr.length-1;
//
//      while (start < end){
//          reverse(arr, start, end);
//          start++;
//          end--;
//      }
//        System.out.println(Arrays.toString(arr));
//    }
//}


//import java.util.Arrays;
//
//public class PractiseArrays {
//    static void swap(int[] arr, int start, int end){
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//    }
//    static void reverse(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//        while (start<end){
//            swap(arr, start, end);
//            start++;
//            end--;
//        }
//    }
//    public static void main(String[] args) {
//         int[] arr = {23, 24, 55, 66, 77, 88, 99};
//         reverse(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}




//
//public class PractiseArrays {
//    static void sorted(int[] arr){
//        for(int i=0; i<arr.length; i++) {
//            if (arr[i] < arr[i + 1]) {
//                System.out.println("Sorted array");
//            }
//            else{
//                System.out.println("unsorted array");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 1, 8, 10, 12};
//        sorted(arr);
//    }
//}



//Check if the array is sorted (ascending)


//public class PractiseArrays {
//    static boolean sorted(int[] arr) {
//        boolean sort = true;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                sort = false;
//                break;
//            }
//        }
//        if (sort) {
//            System.out.println("Sorted Array");
//        } else {
//            System.out.println("Unsorted Array");
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 10, 40, 50};
//        sorted(arr);
//    }
//}




//Count the number of even and odd numbers in the array.
//
//public class PractiseArrays {
//    static void evenOdd(int[] arr) {
//        for (int i : arr) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//            System.out.println();
//            for (int i : arr) {
//                if (i % 2 != 0) {
//                    System.out.print(i + " ");
//                }
//            }
//        }
//
//    public static void main(String[] args) {
//        int[]arr = {12, 14, 16, 21, 23, 37};
//        evenOdd(arr);
//    }
//}








// Copy elements from one array to another.
//
//public class PractiseArrays {
//    public static void main(String[] args) {
//        int[] arr1 = {10, 34, 66, 77, 88, 103};
//        int[] arr2 = new int[arr1.length];
//
//        for(int i=0; i<arr1.length; i++){
//            arr2[i] = arr1[i];
//        }
//        for (int nums: arr2){
//            System.out.print(nums+ " ");
//        }
//    }
//}


//jij









//
//
//public class PractiseArrays {
//    static void sort(int[] arr){
//        int n = arr.length;
//
//        for(int i=0; i<n; i++){
//            if (arr[i] < arr[i+1]){
//
//            }
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}

//
//public class PractiseArrays {
//    public static void main(String[] args) {
//        int[] arr = {2 , 4, 5, 6, 7, 8, 9};
//        int target = 9;
//        int temp = 0;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==target){
//                System.out.println(i);
//                temp = temp+1;
//            }
//        }
//        if(temp==0){
//            System.out.println("not found");
//        }
//    }
//}

//
//public class PractiseArrays {
//    static int sliding(int[] arr, int k){
//        int sum=0;
//        int maximum=0;
//
//        for(int i=0; i<k; i++){
//            sum += arr[i];
//        }
//        maximum = sum;
//
//        for(int i=k; i<arr.length; i++){
//            sum += arr[i] - arr[i-k];
//            maximum = Math.max(maximum, sum);
//        }
//        return maximum;
//    }
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 6, 8, 9, 1};
//        int k = 3;
//        System.out.println(sliding(arr, k));
//    }
//}




//public class PractiseArrays {
//    static int descending(int[] arr, int target){
//        int start=0;
//        int end=arr.length-1;
//
//        while (start<=end){
//            int mid = start + (end-start)/2;
//            if(arr[mid]==target){
//                return mid;
//            }
//            else if(arr[mid]>target){
//                end--;
//            }
//            else{
//                start++;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[] arr = {6, 4, 3, 2, 1, 0};
//        int target = 2;
//        System.out.println(descending(arr,target));
//    }
//}







public class PractiseArrays {
    public static int Gcd(int a, int b){
        while (b != 0){
            int temp = b;
                b = a%b;
                a = temp;
        }
        return a;
    }
    public static int Lcm(int a, int b){
        return (a*b) / Gcd(a, b);
    }
    public static void main(String[] args) {
       int result =  Gcd(20, 10);
        System.out.println(result);
       int ans =  Lcm(20, 10);
        System.out.println(ans);
    }
}
























