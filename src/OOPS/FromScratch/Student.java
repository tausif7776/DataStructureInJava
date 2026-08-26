package OOPS.FromScratch;

public class Student {

    private String name;
    private int age;
    private int rollNum;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 18)
           this.age = age;
        return;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public Student() {

    }

    public void display() {
        System.out.println(name+" "+age+" "+rollNum);
    }
}
