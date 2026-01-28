package OOPS;

//public class Revision {
//    public static class Pokemon {
//        int power;
//        String type;
//
//        Pokemon(int power, String type) {
//            this.power = power;
//            this.type = type;
//        }
//        void show() {
//            System.out.println("the power of Pokemon: " +this.power+ "\n"+ "the type of Pokemon: " +this.type);
//        }
//    }
//
//    public static void main(String[] args) {
//        Pokemon p1 = new Pokemon(80, "Electric");
//        p1.show();
//    }
//}
class Revision {
    String subName;
    int time;

    void show() {
        System.out.println("Started....");
    }
    public static void main(String[] args) {
        Revision r1 = new Revision();
        r1.show();
    }
}
