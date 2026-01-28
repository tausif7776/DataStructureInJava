package Java_Practise.HAS_A;

public class Main {
    public static void main(String[] args) {
        College c1 = new College("GIET", "Khurda");

        Student s1 = new Student(1, "Tausif", c1);
        s1.displayStudent();

        Student s2 = new Student(2, "Aman", c1);
        s2.displayStudent();
    }
}
