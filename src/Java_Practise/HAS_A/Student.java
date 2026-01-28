package Java_Practise.HAS_A;

public class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }
    void displayStudent() {
        System.out.println("Student Id is : " +studentId);
        System.out.println("Student Name is : " +studentName);
        System.out.println("College Name is : " +college.getCollegeName());
        System.out.println("Student college is : " +college.getCollegeLocation());
        System.out.println();
    }
}
