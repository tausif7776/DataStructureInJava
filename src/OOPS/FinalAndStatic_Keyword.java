package OOPS;

class Cricketer {
     static String country = "India";
    int runs;
    String name;
}
public class FinalAndStatic_Keyword {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        c1.country = "England";
        System.out.println(c1.country);


    }
}
