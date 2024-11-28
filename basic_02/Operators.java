public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b): " + (a + b));        // Adds two numbers
        System.out.println("Subtraction (a - b): " + (a - b));     // Subtracts second number from first
        System.out.println("Multiplication (a * b): " + (a * b));  // Multiplies two numbers
        System.out.println("Division (a / b): " + (a / b));        // Divides first number by second
        System.out.println("Modulus (a % b): " + (a % b));         // Returns division remainder
        
        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 15;                  // Simple assignment
        c += 3;                      // c = c + 3
        System.out.println("+=: " + c);
        c -= 3;                      // c = c - 3
        System.out.println("-=: " + c);
        c *= 2;                      // c = c * 2
        System.out.println("*=: " + c);
        c /= 3;                      // c = c / 3
        System.out.println("/=: " + c);
        
        // Comparison Operators
        System.out.println("\nComparison Operators:");
        System.out.println("Equal to (a == b): " + (a == b));          // Checks if equal
        System.out.println("Not equal to (a != b): " + (a != b));      // Checks if not equal
        System.out.println("Greater than (a > b): " + (a > b));        // Checks if greater than
        System.out.println("Less than (a < b): " + (a < b));          // Checks if less than
        System.out.println("Greater than or equal (a >= b): " + (a >= b));  // Checks if greater than or equal
        System.out.println("Less than or equal (a <= b): " + (a <= b));    // Checks if less than or equal
        
        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND (x && y): " + (x && y));   // Returns true if both statements are true
        System.out.println("Logical OR (x || y): " + (x || y));    // Returns true if one of the statements is true
        System.out.println("Logical NOT (!x): " + (!x));           // Reverses the result
        
        // Increment and Decrement Operators
        System.out.println("\nIncrement/Decrement Operators:");
        int d = 5;
        System.out.println("Pre-increment (++d): " + (++d));   // Increments then uses the value
        System.out.println("Post-increment (d++): " + (d++));  // Uses the value then increments
        System.out.println("Pre-decrement (--d): " + (--d));   // Decrements then uses the value
        System.out.println("Post-decrement (d--): " + (d--));  // Uses the value then decrements
        
        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int e = 5;  // 101 in binary
        int f = 3;  // 011 in binary
        System.out.println("Bitwise AND (e & f): " + (e & f));     // Performs bit by bit AND operation
        System.out.println("Bitwise OR (e | f): " + (e | f));      // Performs bit by bit OR operation
        System.out.println("Bitwise XOR (e ^ f): " + (e ^ f));     // Performs bit by bit XOR operation
        System.out.println("Bitwise NOT (~e): " + (~e));           // Inverts all the bits
        System.out.println("Left shift (e << 1): " + (e << 1));    // Shifts bits to the left
        System.out.println("Right shift (e >> 1): " + (e >> 1));   // Shifts bits to the right
    }
}
