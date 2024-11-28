import static java.lang.Math.*;

/**
 * This class demonstrates the usage of Java's built-in Math class methods
 */
public class MathDemo {
    public static void main(String[] args) {
        System.out.println("JAVA MATH CLASS METHODS TUTORIAL\n");

        // Basic Math operations
        System.out.println("Basic Math Operations:");
        System.out.println("Max of 10 and 20: " + max(10, 20));
        System.out.println("Min of 10 and 20: " + min(10, 20));
        System.out.println("Absolute value of -15: " + abs(-15));
        
        // Rounding methods
        System.out.println("\nRounding Methods:");
        System.out.println("Round 3.7: " + round(3.7));    // Rounds to nearest integer
        System.out.println("Ceil 3.2: " + ceil(3.2));      // Rounds up
        System.out.println("Floor 3.8: " + floor(3.8));    // Rounds down
        
        // Power and root operations
        System.out.println("\nPower and Root Operations:");
        System.out.println("2 to the power 3: " + pow(2, 3));
        System.out.println("Square root of 16: " + sqrt(16));
        System.out.println("Cube root of 27: " + cbrt(27));
        
        // Trigonometric functions (angles in radians)
        System.out.println("\nTrigonometric Functions:");
        System.out.println("Sin of 90 degrees: " + sin(toRadians(90)));
        System.out.println("Cos of 0 degrees: " + cos(toRadians(0)));
        System.out.println("Tan of 45 degrees: " + tan(toRadians(45)));
        
        // Constants
        System.out.println("\nMath Constants:");
        System.out.println("Value of PI: " + PI);
        System.out.println("Value of E: " + E);
        
        // Random numbers
        System.out.println("\nRandom Numbers:");
        System.out.println("Random number between 0 and 1: " + random());
        // Random number between 1 and 100
        int randomNum = (int)(random() * 100) + 1;
        System.out.println("Random number between 1 and 100: " + randomNum);
    }
}
