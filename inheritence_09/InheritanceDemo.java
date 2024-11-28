package inheritence_09;

/**
 * This class demonstrates key Java concepts:
 * 1. Inheritance
 * 2. final keyword
 * 3. this keyword
 */
public class InheritanceDemo {
    // final class cannot be inherited
    final class Engine {
        // final variable must be initialized and cannot be changed
        final int maxRPM = 8000;
        
        // non-final variable can be modified
        int currentRPM;
        
        // final method cannot be overridden by child classes
        final void setMaxSafeRPM() {
            System.out.println("Max safe RPM is: " + maxRPM);
        }
    }
    
    // Parent class to demonstrate inheritance
    class Vehicle {
        // Instance variables
        private String brand;
        private int year;
        
        // Constructor
        Vehicle(String brand, int year) {
            // 'this' keyword refers to current instance
            // It helps distinguish between parameter and instance variable
            this.brand = brand;
            this.year = year;
        }
        
        // Method that can be overridden
        void displayInfo() {
            System.out.println("Brand: " + this.brand);
            System.out.println("Year: " + this.year);
        }
        
        // final method cannot be overridden by child classes
        final void showManufacturer() {
            System.out.println("Manufactured by: " + this.brand);
        }
    }
    
    // Child class inheriting from Vehicle
    class Car extends Vehicle {
        private String model;
        
        Car(String brand, int year, String model) {
            // 'super' calls parent class constructor
            super(brand, year);
            this.model = model;
        }
        
        // Override parent method to add additional functionality
        @Override
        void displayInfo() {
            // Call parent method using super
            super.displayInfo();
            System.out.println("Model: " + this.model);
        }
        
        // Cannot override showManufacturer() because it's final in parent class
    }
    
    public static void main(String[] args) {
        InheritanceDemo demo = new InheritanceDemo();
        
        // Create a car instance
        Car myCar = demo.new Car("Toyota", 2023, "Camry");
        
        // Demonstrate inheritance and method overriding
        System.out.println("=== Car Information ===");
        myCar.displayInfo();
        
        // Demonstrate final method call
        System.out.println("\n=== Manufacturer Info ===");
        myCar.showManufacturer();
        
        // Demonstrate final class usage
        Engine engine = demo.new Engine();
        System.out.println("\n=== Engine Info ===");
        engine.setMaxSafeRPM();
    }
}
