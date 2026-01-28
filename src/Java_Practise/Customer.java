package Java_Practise;

public class Customer {
    private double balance = 10000;

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Amount can't deposited");
        } else {
            balance += amount;
            System.out.println("Balance After deposit: " + balance);
        }
    }
    public void withdraw(int withdraw) {
        balance -= withdraw;
        System.out.println("Balance After withdraw: " +balance);
    }
}
