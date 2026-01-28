package String;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        String str = "Raza";
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                System.out.print(str.substring(i,j+1)+" ");
            }
            System.out.println();
        }
    }
}



// Sum of all substrings of a number
//
//public class PrintAllSubstrings {
//    public static void main(String[] args) {
//        String n = "6759";
//        int sum=0;
//
//        for (int i=0; i<n.length(); i++){
//        for(int j=i+1; j<=n.length(); j++){
//            String sub = n.substring(i,j);
//            int ans = Integer.parseInt(sub);
//            sum += ans;
//        }
//        }
//        System.out.println(sum);
//    }
//}