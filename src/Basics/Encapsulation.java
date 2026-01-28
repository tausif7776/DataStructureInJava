package Basics;

    class Student {
        private int age = 19;
        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }
    }
    public class Encapsulation {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.setAge(19);
            System.out.println(s1.getAge());
        }
    }

