package Basics;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is Barking....");
        }
    }
}
public class Inheritence {
    public static void main(String[] args) {
       Animal.Dog obj = new Animal.Dog();
       obj.eat();
       obj.bark();
    }
}
