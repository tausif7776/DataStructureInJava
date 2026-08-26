package OOps_Basics;

class Student {
    String name;
    int age;

    void display() {
        System.out.println(name+ " " +age);
    }
}
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Charlie";
        s1.age = 24;

        s1.display();
    }
}
