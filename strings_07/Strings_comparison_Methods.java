import java.util.Scanner;

public class Strings_comparison_Methods {
    public static void main(String[] args) {
        // PART 1: equals() vs ==
        System.out.println("PART 1: equals() vs == operator");
        System.out.println("--------------------------------");

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("Using == operator (compares references):");
        System.out.println("s1 == s2: " + (s1 == s2));
        if (s1 == s2) {
            System.out.println("True");
        } // true (same reference in pool)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (different references)

        System.out.println("\nUsing equals() method (compares content):");
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true

        // PART 2: compareTo() method
        System.out.println("\nPART 2: compareTo() method");
        System.out.println("------------------------");

        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // negative (a comes before b)
        System.out.println("str2.compareTo(str1): " + str2.compareTo(str1)); // positive (b comes after a)
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // 0 (equal strings)

        // PART 3: equalsIgnoreCase()
        System.out.println("\nPART 3: equalsIgnoreCase() method");
        System.out.println("--------------------------------");

        String upper = "HELLO";
        String lower = "hello";

        System.out.println("Using equals():");
        System.out.println("upper.equals(lower): " + upper.equals(lower)); // false

        System.out.println("\nUsing equalsIgnoreCase():");
        System.out.println("upper.equalsIgnoreCase(lower): " + upper.equalsIgnoreCase(lower)); // true

        // PART 4: contentEquals() method
        System.out.println("\nPART 4: contentEquals() method");
        System.out.println("-----------------------------");

        String text = "Hello";
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbuf = new StringBuffer("Hello");

        System.out.println("text.contentEquals(sb): " + text.contentEquals(sb)); // true
        System.out.println("text.contentEquals(sbuf): " + text.contentEquals(sbuf)); // true

        // PART 5: regionMatches() method
        System.out.println("\nPART 5: regionMatches() method");
        System.out.println("-----------------------------");

        String source = "Hello World";
        String target = "lo Wo";

        // Check if substring matches at specific position
        boolean matches = source.regionMatches(3, target, 0, 5);
        System.out.println("Substring matches: " + matches); // true

        // Case-insensitive comparison
        String source2 = "Hello WORLD";
        String target2 = "lo wo";
        boolean matchesIgnoreCase = source2.regionMatches(true, 3, target2, 0, 5);
        System.out.println("Substring matches (ignore case): " + matchesIgnoreCase); // true

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name :");
        String firstName = sc.nextLine();
        System.out.println("Enter your lastName:");
        String lastName = sc.nextLine();
        System.out.println("Your full name is " + firstName + " " + lastName);
        sc.close();
    }
}
