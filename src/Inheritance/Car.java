package Inheritance;

public class Car extends Vihcle{

    public int noOfDoors;

    public String transMissionType;

    public Car(String name, int noOfTyres, int model, int noOfDoors, String transMissionType) {
        super(name, noOfTyres, model);
        this.noOfDoors = noOfDoors;
        this.transMissionType = transMissionType;
    }

    public void ArcStart() {
        System.out.println("Car Engine Start");
    }
}
