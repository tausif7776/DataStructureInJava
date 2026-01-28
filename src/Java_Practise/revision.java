package Java_Practise;


class Student {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
public class revision {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(21);
        System.out.println(s1.getAge());
    }
}
