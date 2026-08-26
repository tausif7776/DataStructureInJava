package OOPS.FromScratch;

public class Bank {
    public static void main(String[] args) {

        IndianBank indianBank = new IndianBank();
        indianBank.setBalance(2000);
        indianBank.setName("John");
        System.out.println(indianBank.getBalance());
        System.out.println(indianBank.getName());
    }
}
