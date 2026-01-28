package OOPS;

public class PassingClassesToMethods {
    public static class Car {
        int seats;
        String name;
        double length;
        String type;

        void print() {
            System.out.println(seats+ " "+name+" "+length+" "+type);
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.name = "Toyota";
        c.seats = 5;
        c.type = "SUV";

        change(c);
        System.out.println(c.seats);

        c.print();

    }

    public static void change(Car x) {
       x.seats = 4;
    }
}
