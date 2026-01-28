package OOPS;

public class this_Use_In_Constructor {
    public static class Car {
        int price;
        String name;

        Car(int price, String  name) {
            this.price = price;
            this.name = name;
        }
        void print() {
            int price = 43;
            System.out.println(this.price+ " " +this.name);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(23999, "BMW");
        Car c2 = new Car(54777, "Toyota");
        c1.print();
        c2.print();
    }
}
