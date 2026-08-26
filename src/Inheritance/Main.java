package Inheritance;

public class Main {
    public static void main(String[] args) {
//         Car car = new Car("maruti", 4, 800, 8, "Auto" );
//         car.startEngine();
//         car.ArcStart();
//         car.stopEngine();

        MotorCycle motorCycle = new
                MotorCycle("Splender", 4, 6083,
                "leftSide", "popular");

        motorCycle.startEngine();
        motorCycle.wheelie();
        motorCycle.stopEngine();
    }
}
