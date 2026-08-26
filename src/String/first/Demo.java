package String.first;

public class Demo {
    public static int countLength(String str) {
        int n = str.length();
        int length = 0;
        for (int i=0; i<n; i++) {
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        System.out.println(countLength("Tausif"));
    }
}
