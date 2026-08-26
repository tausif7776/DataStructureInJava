package Inheritance;

public class MotorCycle extends Vihcle{

    public String handleBarStyle;
    public String suspentionType;


    public MotorCycle(String name, int noOfTyres, int model, String handleBarStylel, String suspentionType) {
        super(name, noOfTyres, model);
        this.handleBarStyle = handleBarStylel;
        this.suspentionType = suspentionType;
    }

    public void wheelie() {
        System.out.println("Motor Cycle is wheelieing");
    }
}
