public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original string: " + str);
        System.out.println("--------------------");

        // 1. length() - Returns the number of characters in the string
        System.out.println("1. length():");
        System.out.println("Length of string: " + str.length());
        System.out.println();

        // 2. charAt(index) - Returns the character at specified index (0-based)
        System.out.println("2. charAt():");
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Character at index 6: " + str.charAt(6));
        System.out.println();

        // 3. substring() - Extracts a portion of string
        System.out.println("3. substring():");
        // substring(beginIndex) - from beginIndex to end
        System.out.println("substring(6): " + str.substring(6));  // "World"
        // substring(beginIndex, endIndex) - from beginIndex to endIndex-1
        System.out.println("substring(0, 5): " + str.substring(0, 5));  // "Hello"
        System.out.println();

        // 4. indexOf() - Returns the index of first occurrence of specified character/string
        System.out.println("4. indexOf():");
        System.out.println("Index of 'o': " + str.indexOf('o'));  // 4
        System.out.println("Index of 'World': " + str.indexOf("World"));  // 6
        System.out.println("Index of 'o' from index 5: " + str.indexOf('o', 5));  // 7
        System.out.println();

        // 5. lastIndexOf() - Returns the index of last occurrence of specified character/string
        System.out.println("5. lastIndexOf():");
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));  // 7
        System.out.println();

        // 6. toUpperCase() and toLowerCase() - Converts case of all characters
        System.out.println("6. Case conversion:");
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println();

        // 7. trim() - Removes leading and trailing whitespace
        String spacedStr = "   Spaced String   ";
        System.out.println("7. trim():");
        System.out.println("Original: '" + spacedStr + "'");
        System.out.println("Trimmed: '" + spacedStr.trim() + "'");
        System.out.println();

        // 8. replace() - Replaces all occurrences of a character/string
        System.out.println("8. replace():");
        System.out.println("Replace 'l' with 'L': " + str.replace('l', 'L'));
        System.out.println("Replace 'Hello' with 'Hi': " + str.replace("Hello", "Hi"));
        System.out.println();

        // 9. startsWith() and endsWith() - Checks if string starts/ends with specified prefix/suffix
        System.out.println("9. startsWith() and endsWith():");
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));  // true
        System.out.println("Ends with 'World': " + str.endsWith("World"));      // true
        System.out.println();

        // 10. isEmpty() and isBlank() - Check if string is empty or blank
        System.out.println("10. isEmpty() and isBlank():");
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("Empty string isEmpty(): " + emptyStr.isEmpty());     // true
        System.out.println("Blank string isEmpty(): " + blankStr.isEmpty());     // false
        System.out.println("Blank string isBlank(): " + blankStr.isBlank());    // true
        System.out.println();

        // 11. split() - Splits string into array based on delimiter
        System.out.println("11. split():");
        String sentence = "Java,Python,JavaScript";
        String[] languages = sentence.split(",");
        System.out.println("Split string into array:");
        for (String lang : languages) {
            System.out.println("- " + lang);
        }
        System.out.println();

        // 12. contains() - Checks if string contains specified sequence
        System.out.println("12. contains():");
        System.out.println("Contains 'World': " + str.contains("World"));  // true
        System.out.println("Contains 'Java': " + str.contains("Java"));    // false
    }
}
