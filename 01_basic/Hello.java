public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // int age = 34; // Range: -2,147,483,648 to 2,147,483,647
        
        // long longAge = age; // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        byte count = 22; // Range: -128 to 127

        boolean isPass = true; // boolean can only be true or false

        // short studentCount = 1253; // Range: -32,768 to 32,767

        // float pi = 3.14f; // Use 'f' literal for float, contains 6 to 7 decimal places
        // Float precision: about 7 decimal places

        // double alpha = 989939.8934893199010; // Contains 15 or 16 decimal places
        // Double precision: about 15-17 decimal places

        char myLetter = 'A'; // Single character enclosed in single quotes

        System.out.print(isPass);

        System.out.println(count);

        System.out.println(myLetter);

        String greeting = "Hello, World!"; // Strings are enclosed in double quotes
        System.out.println("String variable: " + greeting);

        String name = "John";
        int ageInt = 30;
        String fullInfo = "My name is " + name + " and I am " + ageInt + " years old.";
        System.out.println(fullInfo);

        StringBuilder sb = new StringBuilder();
        sb.append("This is a ");
        sb.append("StringBuilder");
        System.out.println(sb.toString());

        String str = "Hello World";
        System.out.println(str.toUpperCase()); // Converts string to uppercase
        System.out.println(str.toLowerCase()); // Converts string to lowercase
        

    }
    
}
