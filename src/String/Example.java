package String;

import java.util.Arrays;

public class Example {
    public static void print(String str) {
        int n = str.length();
        int count = 0;
        for (int i=0; i<n; i++){
            count++;
        }
        System.out.println(count);
    }

    public static int countVowels(String str) {
         int count = 0;
         for (int i=0; i<str.length(); i++){
             char ch = str.charAt(i);
             if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                 count++;
             }
         }
         return count;
    }

    public static char[] reverseString(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }

    public static boolean plain(String str) {
        int i=0;
        int j=str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static boolean plainRom(String str) {
        String orginal = str;
        String reverse = Arrays.toString(reverseString(orginal));
        for (int i=0; i<orginal.length(); i++) {
            char ch1 = orginal.charAt(i);
            char ch2 = reverse.charAt(i);

            if (ch1 == ch2) {
                return false;
            }
        }
        return true;
    }

    public static int checkConsonant(String str) {
        int countCons = 0;
        for (int i=0; i<str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')) {
                    countCons++;
                }
            }
        }
        return countCons;
    }

    public static void findUpperCase(String str) {
        String result = str.toUpperCase();
        System.out.println(result);
    }


    public static void main(String[] args) {
       String str = "Examination";
        findUpperCase(str);
    }
}
