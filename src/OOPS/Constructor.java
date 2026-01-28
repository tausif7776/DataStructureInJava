package OOPS;

//public class Constructor {
//    public static class Car {
//        int seats;
//        String name;
//        double length;
//
//
////        Car() { //Default Constructor
////
////        }
//
//        Car(int x, String s, double d) {
//            seats = x;
//            name = s;
//            length = d;
//        }
//        void print() {
//            System.out.println(seats+" "+name+" "+length);
//        }
//    }
//    public static void main(String[] args) {
//        Car c1 = new Car(5, "BMW", 5.443);
//        c1.print();
//
//    }
//}


//
//class Calculator {
//
//    int add(int a, int b) {
//        return a + b;
//    }
//
//    int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    double add(double a, double b) {
//        return a + b;
//    }
//}
//
//public class Constructor {
//    public static void main(String[] args) {
//        Calculator c = new Calculator();
//
//        System.out.println(c.add(10, 20));        // 30
//        System.out.println(c.add(10, 20, 30));    // 60
//        System.out.println(c.add(5.5, 4.5));      // 10.0
//    }
//}






//public class Constructor {
//    public static class StudentData {
//        String name;
//        int rno;
//        int size;
//        int[] marks ;
//        StudentData( int s) {
//            marks = new int[s];
//        }
//    }
//    public static void main(String[] args) {
//        StudentData s1 = new StudentData(4);
//        StudentData s2 = new StudentData(2);
//    }
//}



public class Constructor {
    public static class Student {
        int id ;
        String name ;

        // Constructor
        Student() {
            id = 21;
            name = "Tausif";
        }
        void print() {
            System.out.println(id+" "+name);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.print();
    }
}
























