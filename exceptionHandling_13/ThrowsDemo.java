package exceptionHandling_13;

public class ThrowsDemo {
    // throws keyword is used to declare that a method might throw one or more exceptions
    // It passes the responsibility of handling the exception to the caller method
    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            // throw keyword is used to explicitly throw an exception
            // It's used when we want to create and throw an exception manually
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        }
        System.out.println("Welcome! You are old enough.");
    }

    public static void main(String[] args) {
        try {
            // This will work fine
            validateAge(20);
            
            // This will throw an exception
            validateAge(-5);
            
            // This line won't be executed due to the exception above
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
