package DsaPractise;

public class Replace_White_Space_String {
    public static void main(String[] args) {

        String s = "Hii Welcome Java Course!";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Original String: " + s);
        System.out.println("White Space Number: " + count);

        String noSpace = s.replace(" ", "");
        System.out.println("After Removing WhiteSpace: " + noSpace);
    }
}

