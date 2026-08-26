package String;

public class ValidPalindrome {
    public static boolean paliValid(String s) {
        int i = 0;
        int j = s.length()-1;

        while (i<j) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }
             else if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }
             else if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "mom";
        System.out.println(paliValid(s));
    }
}
