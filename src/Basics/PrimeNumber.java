package Basics;


// First
/*
public class PrimeNumber {
    public static void main(String[] args) {

        int n = 7;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i=2; i<n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}*/


// Second
/*public class PrimeNumber {
    public static void main(String[] args) {

        int n = 3;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i=2; i< Math.sqrt(n); i++) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number ");
    }
}*/


// Third
public class PrimeNumber {
    public static boolean checkPrimeNumber(int num) {

        if (num <= 1) {
            return true;
        }

        for (int i=2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int ans = 7;
        System.out.println(checkPrimeNumber(ans));
    }
}

