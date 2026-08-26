package Inheritance;

public class Vihcle {
    String name;
    int noOfTyres;
    int model;

    public Vihcle(String name, int noOfTyres, int model) {
        this.name = name;
        this.noOfTyres = noOfTyres;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Engine is Starting");
    }

    public void stopEngine() {
        System.out.println("Engine is Stopping");
    }
}
