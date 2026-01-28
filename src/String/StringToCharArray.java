package String;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "Ruhan";
        char[] arr = str.toCharArray();
        for(char ch : arr){
            System.out.println(ch);
        }
    }
}
