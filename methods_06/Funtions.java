public class Funtions {
    // ========== METHOD SYNTAX IN JAVA ==========
    /*
     * Basic syntax:
     * access_modifier return_type method_name(parameter_list) {
     *     // method body
     *     return value; // if return type isn't void
     * }
     */

    // 1. Method with no parameters and no return value (void)
    public static void sayHello() {
        System.out.println("Hello!");
    }

    // 2. Method with parameters and return value
    static int sum(int a, int b) {
        return a + b;
    }

    // 3. Method with multiple parameters
    static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    // 4. Method with array parameter
    static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
        }
        return max;
    }

    // 5. Method overloading (same name, different parameters)
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    // 6. Method with variable arguments (varargs)
    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // 7. Recursive method
    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Additional varargs examples
    static void printInfo(String name, int... marks) {
        System.out.println("Student Name: " + name);
        System.out.println("Marks:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal marks: " + sum(marks));  // reusing our sum varargs method
    }

    // String varargs examples
    
    // 1. Basic String varargs
    static void printStrings(String... strings) {
        System.out.println("Number of strings: " + strings.length);
        for (String str : strings) {
            System.out.println("- " + str);
        }
    }

    // 2. Concatenate strings with separator
    static String joinStrings(String separator, String... words) {
        if (words.length == 0) return "";
        
        StringBuilder result = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            result.append(separator).append(words[i]);
        }
        return result.toString();
    }

    // 3. Find longest string
    static String findLongestString(String... strings) {
        if (strings.length == 0) return null;
        
        String longest = strings[0];
        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }

    // 4. Search in strings
    static boolean containsString(String searchStr, String... strings) {
        for (String str : strings) {
            if (str.contains(searchStr)) return true;
        }
        return false;
    }

    // ! Why use static methods?
    // No Object Required: Static methods can be called without creating an instance
    // of the class
    // Memory Efficiency: They belong to the class rather than object instances
    // Utility Functions: Perfect for operations that don't need object state
    // Main Method: That's why main() is always static - Java needs to run it
    // without creating an object

    public static void main(String[] args) {
        // Testing different method types
        System.out.println("=== Method Examples ===\n");

        // 1. Calling void method
        System.out.println("1. Void method:");
        sayHello();

        // 2. Method with parameters
        System.out.println("\n2. Method with parameters:");
        int sum = sum(5, 3);
        System.out.println("Sum of 5 and 3 is: " + sum);

        // 3. Method with multiple parameters
        System.out.println("\n3. Method with multiple parameters:");
        double avg = calculateAverage(10.5, 20.5, 30.5);
        System.out.println("Average is: " + avg);

        // 4. Method with array parameter
        System.out.println("\n4. Method with array parameter:");
        int[] numbers = {5, 8, 2, 1, 9};
        System.out.println("Maximum value is: " + findMax(numbers));

        // 5. Method overloading
        System.out.println("\n5. Method overloading:");
        System.out.println("Integer multiplication: " + multiply(5, 4));
        System.out.println("Double multiplication: " + multiply(5.5, 4.5));

        // 6. Varargs method
        System.out.println("\n6. Varargs method:");
        System.out.println("Sum of multiple numbers: " + sum(1, 2, 3, 4, 5));

        // 7. Recursive method
        System.out.println("\n7. Recursive method:");
        System.out.println("Factorial of 5 is: " + factorial(5));

        // Additional varargs example
        System.out.println("\n8. Varargs with multiple parameters:");
        printInfo("John", 85, 90, 78, 92);

        // String varargs examples
        System.out.println("\n9. String Varargs Examples:");
        
        // Basic string varargs
        System.out.println("\na) Basic String varargs:");
        printStrings("Apple", "Banana", "Orange");
        
        // Join strings with separator
        System.out.println("\nb) Join strings with separator:");
        String joined = joinStrings(", ", "Java", "Python", "C++", "JavaScript");
        System.out.println("Joined strings: " + joined);
        
        // Find longest string
        System.out.println("\nc) Find longest string:");
        String longest = findLongestString("cat", "elephant", "dog", "rhinoceros");
        System.out.println("Longest word: " + longest);
        
        // Search in strings
        System.out.println("\nd) Search in strings:");
        boolean contains = containsString("Java", "Python", "JavaScript", "Java", "C++");
        System.out.println("Contains 'Java': " + contains);
        
        // Empty varargs
        System.out.println("\ne) Empty varargs call:");
        printStrings();  // Valid - prints nothing
    }
}
