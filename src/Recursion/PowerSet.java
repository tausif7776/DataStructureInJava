package Recursion;

//public class PowerSet {
//    public static void subsets(String ans, String s, int idx){
//        if(idx==s.length()){
//            System.out.print(ans+" ");
//            return;
//        }
//        char ch = s.charAt(idx);
//        subsets(ans+ch, s, idx+1); // pick
//        subsets(ans,  s,  idx+1);   // skip
//    }
//    public static void main(String[] args) {
//        String s = "abc";
//        subsets(" ", s, 0);
//    }
//}


import java.util.*;

public class PowerSet {
    public static void subsets(String ans, String s, int idx, List<String> list) {
        if (idx == s.length()) {
            if (ans.length() != 0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans + ch, s, idx + 1, list);
        subsets(ans, s, idx + 1, list);
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        subsets("", s, 0, list);
        System.out.println(list);
    }
}
























