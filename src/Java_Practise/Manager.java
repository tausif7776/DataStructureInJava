package Java_Practise;

public class Manager {
    int managerId;
    String managerName;

    public void acceptData(int managerId, String managerName) {
        this.managerId = managerId;
        this.managerName = managerName;
    }
    public void showData() {
        System.out.println("Manger Id is: " +managerId);
        System.out.println("Manager Name is: " +managerName);
    }
}
