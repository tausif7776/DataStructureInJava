package DsaPractise;

//public class MaxOccuring {
//    public static void main(String[] args) {
//
//        int[] arr = new int[127];
//        String s = "Md Tausif Raza";
////        int count = 0;
//
//        // Count frequency
//        for (int i = 0; i < s.length(); i++) {
//            arr[s.charAt(i)]++;
//        }
//
//        int max = -1;
//        char c = ' ';
//
//        // Find max occurring character
//        for (int i = 0; i < s.length(); i++) {
//            if (max < arr[s.charAt(i)]) {
//                max = arr[s.charAt(i)];
//                c = s.charAt(i);
//            }

import java.util.HashMap;
import java.util.Map;

////            count++;
//        }
//
//        System.out.println(c);
//    }
//}





//* Using HasMap
    import java.util.*;
public class MaxOccuring {
    public static void main(String[] args) {

        String s = "abbccc";
        HashMap<Character, Integer> hm = new HashMap<>();

        char [] c = s.toCharArray();
        for (char ch : c) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch)+1);
            } else {
                hm.put(ch, 1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';

        for (Map.Entry<Character, Integer> me : hm.entrySet()) {
            if (maxCount < me.getValue()) {
                maxCount = me.getValue();
                maxChar = me.getKey();
            }
        }
        System.out.println("Max is: " + maxChar);
    }
}

















