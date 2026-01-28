package String;

//public class CompareString {
//    public static void main(String[] args) {
//        String a = "Tausif";  // difference print ASCII value
//        String b = "Ahmed";
//        System.out.println(a.compareTo(b));
//    }
//}


public class CompareString {
    static int compare(String a, String b){
        if(a.length() != b.length()){
            return a.length() - b.length();
        }

        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                return a.charAt(i)-b.charAt(i);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
       String a = "Asif";
       String b = "Tausif";
        System.out.println(a.compareTo(b));
    }
}