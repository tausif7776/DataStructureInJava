package String;

public class FrequencyEachChar {
    public static void main(String[] args){
        String str = "Taaausiiif";

        str = str.toLowerCase();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                freq[ch]++;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Character '" + (char)i + "' occurs " + freq[i] + " times");
            }
        }
    }
}
