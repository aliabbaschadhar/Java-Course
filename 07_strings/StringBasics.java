public class StringBasics {
    public static void main(String[] args) {
        // PART 1: String Pool vs Heap Memory
        System.out.println("PART 1: String Pool vs Heap Memory");
        System.out.println("----------------------------------");

        // String literals go to String Pool (special memory area in heap)
        String str1 = "Hello"; // Creates string in pool
        String str2 = "Hello"; // Reuses same string from pool

        // new keyword always creates objects in main heap memory
        String str3 = new String("Hello"); // Creates new object in heap
        String str4 = new String("Hello"); // Creates another new object in heap

        // Comparing memory locations
        System.out.println("Memory Locations (HashCodes):");
        System.out.println("str1 (String Pool): " + System.identityHashCode(str1));
        System.out.println("str2 (String Pool): " + System.identityHashCode(str2));
        System.out.println("str3 (Heap): " + System.identityHashCode(str3));
        System.out.println("str4 (Heap): " + System.identityHashCode(str4));

        // PART 2: String Immutability in Detail
        System.out.println("\nPART 2: String Immutability in Detail");
        System.out.println("-----------------------------------");

        String original = "Hello";
        System.out.println("Original string: " + original);
        System.out.println("Original string memory location: " + System.identityHashCode(original));

        // String concatenation creates new object
        String modified = original + " World";
        System.out.println("Modified string: " + modified);
        System.out.println("Modified string memory location: " + System.identityHashCode(modified));

        // String methods always return new strings
        String uppercase = original.toUpperCase();
        System.out.println("Uppercase string: " + uppercase);
        System.out.println("Uppercase string memory location: " + System.identityHashCode(uppercase));

        // PART 3: Understanding String Pool Internals
        System.out.println("\nPART 3: String Pool Internals");
        System.out.println("---------------------------");

        // Using intern() to add heap string to pool
        String heapStr = new String("Pool");
        String poolStr = "Pool";
        String internedStr = heapStr.intern();

        System.out.println("heapStr memory location: " + System.identityHashCode(heapStr));
        System.out.println("poolStr memory location: " + System.identityHashCode(poolStr));
        System.out.println("internedStr memory location: " + System.identityHashCode(internedStr));

        System.out.println("heapStr == poolStr: " + (heapStr == poolStr)); // false
        System.out.println("internedStr == poolStr: " + (internedStr == poolStr)); // true

        // PART 4: Why use 'new' keyword?
        System.out.println("\nPART 4: Why use 'new' keyword?");
        System.out.println("---------------------------");

        // Example where 'new' is useful - Creating distinct objects
        String userInput1 = new String("user123"); // First user's input
        String userInput2 = new String("user123"); // Second user's input

        // Even though content is same, they are different objects
        // This can be useful for tracking different instances
        System.out.println("userInput1 memory location: " + System.identityHashCode(userInput1));
        System.out.println("userInput2 memory location: " + System.identityHashCode(userInput2));

        // PART 5: String Character Manipulation
        System.out.println("\nPART 5: String Character Manipulation");
        System.out.println("----------------------------------");

        String alpha = "Ali";
        System.out.println("Original string: " + alpha);
        
        // Wrong way (will not compile):
        // alpha[0] = "B";  // Error: array-like access not allowed
        
        // Correct ways to modify a string:
        
        // 1. Create new string using substring
        String modified1 = "B" + alpha.substring(1);
        System.out.println("Modified using substring: " + modified1);
        
        // 2. Convert to char array, modify, and create new string
        char[] chars = alpha.toCharArray();
        chars[0] = 'B';
        String modified2 = new String(chars);
        System.out.println("Modified using char array: " + modified2);
        
        // 3. Using StringBuilder (mutable string)
        StringBuilder sb = new StringBuilder(alpha);
        sb.setCharAt(0, 'B');
        String modified3 = sb.toString();
        System.out.println("Modified using StringBuilder: " + modified3);
        
        // Demonstrating that original string remains unchanged
        System.out.println("Original string is still: " + alpha);
    }
}
