package polymorphism_12;

/**
 * This class demonstrates upcasting in Java with detailed memory explanation
 */
public class UpcastingDemo {
    
    static class Animal {
        String type = "Generic Animal";
        
        public void makeSound() {
            System.out.println("Some sound");
        }
        
        public void move() {
            System.out.println("Animal moves");
        }
    }
    
    static class Dog extends Animal {
        String breed = "German Shepherd";  // Dog-specific field
        
        @Override
        public void makeSound() {
            System.out.println("Woof! Woof!");
        }
        
        public void wagTail() {  // Dog-specific method
            System.out.println("Dog is wagging tail!");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Understanding Upcasting ===\n");
        
        // Regular object creation (no upcasting)
        System.out.println("1. Regular object creation:");
        Dog myDog = new Dog();
        System.out.println("Type: " + myDog.type);
        System.out.println("Breed: " + myDog.breed);
        myDog.makeSound();
        myDog.wagTail();
        
        System.out.println("\n2. With upcasting:");
        // Upcasting
        Animal upcastedDog = new Dog();  // Animal reference, Dog object
        System.out.println("Type: " + upcastedDog.type);
        // System.out.println("Breed: " + upcastedDog.breed);  // Won't compile - breed not visible
        upcastedDog.makeSound();  // Calls Dog's version
        // upcastedDog.wagTail();  // Won't compile - method not visible
        
        System.out.println("\n3. Demonstrating instanceof:");
        // Check actual object type
        System.out.println("upcastedDog instanceof Animal: " + (upcastedDog instanceof Animal));
        System.out.println("upcastedDog instanceof Dog: " + (upcastedDog instanceof Dog));
        
        // Downcasting (if needed)
        System.out.println("\n4. Downcasting back to Dog:");
        if (upcastedDog instanceof Dog) {
            Dog downcasted = (Dog) upcastedDog;
            System.out.println("Breed after downcasting: " + downcasted.breed);
            downcasted.wagTail();
        }
    }
}
