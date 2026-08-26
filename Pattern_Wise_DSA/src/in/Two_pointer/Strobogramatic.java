package in.Two_pointer;

import java.util.HashMap;
import java.util.Map;

public class Strobogramatic {
    public static boolean isStrobo(Map<Character, Character> map, String s) {

        int i = 0;
        int j = s.length() -1;

        while (i <= j) {
            char l = s.charAt(i);
            char r = s.charAt(j);

            if (map.containsKey(l)) {
                if (map.get(l) != r) {
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "198861";
        String s1 = "198461";
        String s2 = "198761";

        Map<Character, Character> map = new HashMap<>();

        /*
        *  0 ----> 0
        *  1 ----> 1
        *  8 ----> 8
        *  6 ----> 9
        *  9 ----> 6
         */

        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');

        System.out.println(isStrobo(map, s));
        System.out.println(isStrobo(map, s1));
        System.out.println(isStrobo(map, s2));

    }
}
