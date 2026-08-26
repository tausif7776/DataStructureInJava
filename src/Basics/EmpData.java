package Basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {

        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }
}

public class EmpData {

    public static void main(String[] args) {

        List<Employee> emps = new ArrayList<Employee>();

        emps.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        emps.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        emps.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        emps.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        emps.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
        emps.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        emps.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        emps.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
        emps.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        emps.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
        emps.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
        emps.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));



		/*
		// (1) Count How much Male and Female in List.....
		Map<String, Long> map1 = emps.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map1);
		*/



		/*
		// (2)  Print all department
		//emps.stream().map(e -> e.department).forEach(name -> System.out.println(name));

		//  unique
		emps.stream()
		    .map(Employee :: getDepartment)
		    .distinct()
		    .forEach(name -> System.out.println(name));
		    */



		/*
		// (3) print average age male and female
		Map<String, Double> map2 = emps.stream()
				                       .collect(Collectors.groupingBy(Employee :: getGender,
				                        Collectors.averagingInt(Employee :: getAge)));

		System.out.println(map2);
		*/




		/*
		// (4)  Highest paid employees in list

		Optional<Employee> optional = emps.stream()
				                          .collect(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary)));

		if (optional.isPresent()) {

			Employee employee = optional.get();

			System.out.println(employee);
		}
		*/




		/*
		// (5) Get the all employees who have joined after 2015 ?

		emps.stream()
		    .filter(e -> e.yearOfJoining > 2015)
		    .map(e -> e.name)
		    .forEach(name -> System.out.println(name));

		    */




		/*
		// (6) count the number of employees in each department

		Map<String, Long> map3 = emps.stream()
				                     .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map3);
		*/




		/*
		// (7) print average salary of each department


		Map<String, Double> map3 = emps.stream()
                .collect(Collectors.groupingBy(Employee :: getDepartment,
                 Collectors.averagingDouble(Employee :: getSalary)));

		System.out.println(map3);
		*/





        // (8) Get the details of youngest male employee in the Development department ?

        Optional<Employee> optional = emps.stream()
                .filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
                .min(Comparator.comparing(Employee::getAge));

        if (optional.isPresent()) {

            System.out.println(optional.get());
        }



    }

}