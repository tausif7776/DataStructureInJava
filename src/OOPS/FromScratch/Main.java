package OOPS.FromScratch;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("John");
        student.setAge(9);
        student.setRollNum(1025);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRollNum());

    }
}
