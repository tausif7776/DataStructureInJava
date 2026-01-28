package OOPS;

import java.util.Scanner;

public class UserDefineDataType {
    public static class Student { // own dataType Create
          String name;
          int rollNo;
          double cgpa;

          void print() {
              System.out.println(name+" "+rollNo+" "+cgpa);
          }
    }
    public static void main(String[] args) {
         Student s1 = new Student();
          s1.name = "shad";
          s1.rollNo = 123;
          s1.cgpa = 23.4;

          Student s2 = new Student();
          s2.name = "xyz";
          s2.rollNo = 3243;
          s2.cgpa = 3.4;

         Student s3 = new Student();
         s3.name = "kns";
         s3.rollNo = 343;
         s3.cgpa = 6.7;

         System.out.println(s1.name + " "+s1.rollNo+ " "+s1.cgpa);
         s1.print();
         s2.print();
         s3.print();

    }
}
