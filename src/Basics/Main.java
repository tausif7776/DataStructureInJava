package Basics;

// Step 1: Custom Exception Class
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Business Logic Class
class Test {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}

// Step 3: Main Class
public class Main {

    public static void main(String[] args) {

        try {
            Test.checkAge(16);  // change value to test
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}