package abstraction_11;

/**
 * This class demonstrates the usage of Functional Interfaces and Lambda
 * Expressions in Java
 * 
 * Key Points about Functional Interfaces:
 * 1. Contains exactly one abstract method
 * 2. Can be annotated with @FunctionalInterface
 * 3. Can be implemented using Lambda expressions
 * 4. Can have default and static methods
 */
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Example 1: Simple lambda with no parameters
        Greeting greeting = () -> System.out.println("Hello World!");
        greeting.sayHello();

        // Example 2: Lambda with one parameter
        Calculator square = (num) -> num * num;
        System.out.println("Square of 5: " + square.calculate(5));

        // Example 3: Lambda with multiple parameters
        StringCombiner combiner = (str1, str2) -> str1 + " " + str2;
        System.out.println(combiner.combine("Hello", "World"));

        // Example 4: Lambda with block of code
        NumberProcessor processor = (x) -> {
            if (x > 0) {
                return "Positive";
            } else if (x < 0) {
                return "Negative";
            } else {
                return "Zero";
            }
        };
        System.out.println("Processing -5: " + processor.process(-5));

        // Example 5: Using method reference
        StringPrinter printer = System.out::println;
        printer.print("Using method reference!");
    }
}

// Example 1: Interface with no parameters
@FunctionalInterface
interface Greeting {
    void sayHello(); // Abstract method
}

// Example 2: Interface with one parameter and return value
@FunctionalInterface
interface Calculator {
    int calculate(int number); // Abstract method with return type
}

// Example 3: Interface with multiple parameters
@FunctionalInterface
interface StringCombiner {
    String combine(String str1, String str2);
}

// Example 4: Interface demonstrating complex logic
@FunctionalInterface
interface NumberProcessor {
    String process(int number);
}

// Example 5: Interface for method reference demonstration
@FunctionalInterface
interface StringPrinter {
    void print(String message);
}