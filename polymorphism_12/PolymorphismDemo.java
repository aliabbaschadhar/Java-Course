package polymorphism_12;

/**
 * This class demonstrates both types of polymorphism in Java:
 * 1. Compile-time (Static) Polymorphism - achieved through method overloading
 * 2. Runtime (Dynamic) Polymorphism - achieved through method overriding
 */
public class PolymorphismDemo {
    
    /**
     * Calculator class to demonstrate compile-time polymorphism through method overloading
     * Method overloading: multiple methods with same name but different parameters
     */
    static class Calculator {
        // Method overloading examples
        public int add(int a, int b) {
            return a + b;
        }
        
        public double add(double a, double b) {
            return a + b;
        }
        
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    }
    
    /**
     * Base class for demonstrating runtime polymorphism
     */
    static class Animal {
        public void makeSound() {
            System.out.println("Some sound");
        }
        
        public void move() {
            System.out.println("Animal moves");
        }
    }
    
    /**
     * Derived class that overrides methods from Animal
     * Demonstrates runtime polymorphism through method overriding
     */
    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof! Woof!");
        }
        
        @Override
        public void move() {
            System.out.println("Dog runs on four legs");
        }
    }
    
    /**
     * Another derived class to demonstrate runtime polymorphism
     */
    static class Bird extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Chirp! Chirp!");
        }
        
        @Override
        public void move() {
            System.out.println("Bird flies in the sky");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Compile-time (Static) Polymorphism Example ===");
        Calculator calc = new Calculator();
        
        // Same method name 'add' but different parameter types/numbers
        System.out.println("Adding integers: " + calc.add(5, 3));
        System.out.println("Adding doubles: " + calc.add(4.5, 3.2));
        System.out.println("Adding three integers: " + calc.add(1, 2, 3));
        
        System.out.println("\n=== Runtime (Dynamic) Polymorphism Example ===");
        // Parent reference can hold child objects
        Animal dog = new Dog();    // Upcasting
        Animal bird = new Bird();  // Upcasting
        
        // Method call is resolved at runtime based on actual object type
        System.out.println("Dog behavior:");
        dog.makeSound();  // Calls Dog's version of makeSound
        dog.move();      // Calls Dog's version of move
        
        System.out.println("\nBird behavior:");
        bird.makeSound(); // Calls Bird's version of makeSound
        bird.move();      // Calls Bird's version of move
    }
}
