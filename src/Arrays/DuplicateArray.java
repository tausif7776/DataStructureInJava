package Arrays;

//import java.util.Arrays;
//public class DuplicateArray {
//    static void duplicate(int[] arr){
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i] == arr[j]){
//                    System.out.print(arr[i]+ " ");
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {5, 5,  1, 3, 4, 2, 4};
//        duplicate(arr);
//
//
//      System.out.println(Arrays.toString(arr));
//    }
//}


//public class DuplicateArray {
//
//    static boolean hasDuplicate(int[] arr) {
//        int n = arr.length;
//        boolean[] flag = new boolean[n + 1];
//
//        for (int i = 0; i < n; i++) {
//            int element = arr[i];
//            if (element < 0 || element > n) {
//                continue;
//            }
//            if (flag[element]) {
//                return true;
//            }
//            flag[element] = true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {5, 5, 1, 3, 4, 2, 4};
//        boolean result = hasDuplicate(arr);
//        System.out.println(result);
//    }
//}




//public class DuplicateArray {
//    public ArrayList<Integer> dublicate(int[] arr){
//        ArrayList<Integer> result = new ArrayList<>();
//        for(int i=0; i<arr.length; i++){
//            int index = Math.abs(arr[i])-1;
//            if(arr[index]< 0){
//                result.add(Math.abs(arr[i]));
//            } else{
//                arr[index] = -arr[index];
//            }
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 5, 3, 1, 2};
//        DuplicateArray num = new DuplicateArray();
//        ArrayList<Integer> ans = num.dublicate(arr);
//        System.out.println(ans);
//    }
//}
//

























