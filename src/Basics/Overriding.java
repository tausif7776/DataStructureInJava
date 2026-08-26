package Basics;

class Super {

    public void show() {

        System.out.println("Super Class ......");
    }
}
class Child extends Super {

    @Override
    public void show() {
        System.out.println("Child Class......");
    }
}
public class Overriding {
    public static void main(String[] args) {

        Super s = new Child();
        s.show();

        Child c = new Child();
        c.show();

        
    }
}
