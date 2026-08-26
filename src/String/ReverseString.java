package String;

//public class ReverseString {
//    public static void main(String[] args) {
//        String s = "Tau.si.f";
//        StringBuilder sb = new StringBuilder(s);
//        int i=0;
//        int j=sb.length()-1;
//
//        while (i<=j){
//            char temp1 = sb.charAt(i);
//            char temp2 = sb.charAt(j);
//            sb.setCharAt(i, temp2);
//            sb.setCharAt(j, temp1);
//            i++;
//            j--;
//        }
//        System.out.println(sb);
//    }
//}


import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s1 = {'H','E','L','L','O'};
        int i = 0;
        int j = s1.length-1;
        while (i<j) {
            char temp = s1[i];
            s1[i] = s1[j];
            s1[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(s1));
    }
}






















