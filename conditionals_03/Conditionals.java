
public class Conditionals {
    public static void main(String[] args) {
        // Simple if-else statement
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }

        // if-else if-else statement
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Nested if-else statement
        boolean hasLicense = true;
        int drivingAge = 19;
        if (drivingAge >= 18) {
            if (hasLicense) {
                System.out.println("You can drive a car");
            } else {
                System.out.println("Please get your license first");
            }
        } else {
            System.out.println("You are too young to drive");
        }

        // Logical AND (&&) and OR (||) operators
        boolean hasPassport = true;
        boolean hasVisa = true;
        if (hasPassport && hasVisa) {
            System.out.println("You can travel internationally");
        }

        boolean hasCash = false;
        boolean hasCard = true;
        if (hasCash || hasCard) {
            System.out.println("You can make a payment");
        }

        // Switch statement
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of work week");
                break;
            case "Wednesday":
                System.out.println("Mid week");
                break;
            case "Friday":
                System.out.println("TGIF!");
                break;
            default:
                System.out.println("Regular day");
                break;
        }

        // Enhanced switch statement (newer Java versions)
        String fruit = "Apple";
        switch (fruit) {
            case "Apple" -> System.out.println("Selected fruit is Apple");
            case "Banana" -> System.out.println("Selected fruit is Banana");
            default -> System.out.println("Unknown fruit");
        }

        // Ternary operator - shorthand for if-else
        int number = 7;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);

        // Multiple conditions with ternary operator
        int value = 75;
        String grade = value >= 90 ? "A" : value >= 80 ? "B" : value >= 70 ? "C" : "F";
        System.out.println("Grade: " + grade);
    }
}
