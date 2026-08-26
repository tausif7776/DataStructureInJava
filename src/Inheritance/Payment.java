package Inheritance;

public class Payment {
    void pay() {
        System.out.println("Payment is Paying different method");
    }
}
class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment using UPI");
    }
}
class CreditCard extends Payment {

    @Override
    void pay() {
        System.out.println("Payment using CreditCard");
    }
}
