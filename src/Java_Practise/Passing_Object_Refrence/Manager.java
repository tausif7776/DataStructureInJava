package Java_Practise.Passing_Object_Refrence;

public class Manager {
    private int managerId;
    private String managerName;

    Manager (Employee e) { // e1 = e
        managerId = e.getEmployeeNumber();
        managerName = e.getEmployeeName();
    }

//    public void showManagerData() {
//        System.out.println("Manager Id is : " +managerId);
//        System.out.println("Manager Name is : " +managerName);
//    }


    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}
