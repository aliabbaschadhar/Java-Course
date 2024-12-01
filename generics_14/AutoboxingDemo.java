package generics_14;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingDemo {
    public static void main(String[] args) {
        // Autoboxing: Automatic conversion of primitive types to their corresponding
        // wrapper classes
        // Primitive Type -> Wrapper Class
        // int -> Integer
        // double -> Double
        // char -> Character
        // boolean -> Boolean
        // etc.

        // Example 1: Basic Autoboxing
        int primitiveInt = 42;
        Integer wrappedInt = primitiveInt; // Autoboxing: automatically converts int to Integer
        System.out.println("Autoboxed value: " + wrappedInt);

        // Example 2: Unboxing
        // Unboxing is the automatic conversion of wrapper class objects to their
        // primitive types
        Integer wrappedNumber = 100;
        int primitiveNumber = wrappedNumber; // Unboxing: automatically converts Integer to int
        System.out.println("Unboxed value: " + primitiveNumber);

        // Example 3: Autoboxing in Collections
        // Collections can only store objects, not primitives
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); // Autoboxing: int -> Integer
        numbers.add(2); // Autoboxing: int -> Integer
        numbers.add(3); // Autoboxing: int -> Integer

        // Example 4: Unboxing in calculations
        Integer num1 = 10; // Autoboxed
        Integer num2 = 20; // Autoboxed
        int sum = num1 + num2; // Both numbers are unboxed, added, then the result remains primitive
        System.out.println("Sum: " + sum);

        // Example 5: Mixed operations
        // Java handles the boxing/unboxing automatically as needed
        Integer boxedResult = 10 + num1; // 10 is first autoboxed, then addition occurs, result is autoboxed
        System.out.println("Mixed operation result: " + boxedResult);

        // Example 6: Performance Considerations
        // Be careful with autoboxing in loops - it can create many unnecessary objects
        Long sum2 = 0L; // Autoboxed
        for (int i = 0; i < 1000; i++) {
            sum2 += i; // Each iteration involves unboxing sum2, adding i, and autoboxing the result
        }

        // Better performance approach - use primitive
        @SuppressWarnings({ "all" })
        long sum3 = 0L; // Primitive
        for (int i = 0; i < 1000; i++) {
            sum3 += i; // Pure primitive operations, no boxing/unboxing
        }

        // Example 7: Null considerations
        Integer nullInteger = null; // Wrapper classes can be null
        try {
            @SuppressWarnings({ "all" })
            int x = nullInteger; // This will throw NullPointerException when unboxing
        } catch (NullPointerException e) {
            System.out.println("Cannot unbox null value!");
        }

        // Example 8: Comparing values
        Integer val1 = 127;
        Integer val2 = 127;
        System.out.println("Comparing small integers (127): " + (val1 == val2)); // true

        Integer val3 = 128;
        Integer val4 = 128;
        System.out.println("Comparing large integers (128): " + (val3 == val4)); // false
        System.out.println("Comparing large integers using equals: " + val3.equals(val4)); // true

        // The above demonstrates Integer caching (-128 to 127)
        // For values outside this range, use equals() for comparison
    }
}
