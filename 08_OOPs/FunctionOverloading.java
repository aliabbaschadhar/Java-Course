// Function Overloading: Multiple methods with same name but different parameters
// Parameters can differ in: 1. Number 2. Data type 3. Order
// Return type doesn't matter in overloading
public class FunctionOverloading {
    public static void main(String[] args) {
        Greetings greet = new Greetings();

        // Java automatically chooses the right method based on arguments passed
        greet.greeting();         // Uses no parameter version
        greet.greeting("Ali", 5);      // Uses 2 parameters version
    }
}

class Greetings {
    String name;
    int count;

    // Same method name 'greeting' with different parameter types/count
    void greeting() {
        System.out.println("Hello, Good Morning");
    }

    void greeting(String name) {
        System.out.println(name + " How are you?");
    }

    void greeting(String name, int count) {  // Different number of parameters
        for (int i = 0; i < count; i++) {
            System.out.println(name + ", are you ok?");
        }
    }
}