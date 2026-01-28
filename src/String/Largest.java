//package String;
//
//import java.util.Arrays;
//
//public class Largest
//import java.util.Arrays;
//import java.util.*;
//    public String largest(int[] arr){
//        String[] str = new String[arr.length];
//        for(int i=0; i<arr.length; i++){
//            str[i] = String.valueOf(arr[i]);
//        }
//
//        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
//
//        StringBuilder sb = new StringBuilder();
//        for(String s : str){
//            sb.append(s);
//        }
//
//        if(sb.charAt(0) == '0'){
//            return "0";
//        } else {
//            return sb.toString();
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {9, 3, 6, 34, 2, 7, 5};
//        Pattern.Example ex = new Pattern.Example();
//        System.out.println(ex.largest(arr));
//        // Output: 97653432
//    }
//}
//
//
//}
