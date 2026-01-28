package Java_Practise.Passing_Object_Refrence;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmployeeNumber(111);
        e1.setEmployeeName("Ravi");

        Manager m1 = new Manager(e1);
        System.out.println(m1);
    }
}
