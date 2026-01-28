package String;

public class RemoveDuplicateCharacters {
    public static boolean duplicate(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] search = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!search[ch]) {
                search[ch] = true;
                result.append(ch);
            }
        }
        System.out.println(result);
        return true;
    }


    public static void main(String[] args) {
        String str = "Hello world";
        duplicate(str);
    }
}
