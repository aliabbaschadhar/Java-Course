package inheritence_09;

// Interface - defines a contract that classes must follow
interface Driveable {
    void accelerate(); // abstract method - no implementation
    void brake();      // all interface methods are implicitly public and abstract
}

// Another interface to demonstrate multiple inheritance through interfaces
interface Maintainable {
    void service();
    default void checkStatus() {  // default method - has implementation
        System.out.println("Performing general status check");
    }
}

// Abstract class - can have both abstract and concrete methods
abstract class AbstractVehicle {
    protected String type;  // protected - accessible in subclasses
    
    AbstractVehicle(String type) {
        this.type = type;
    }
    
    // Abstract method - must be implemented by concrete subclasses
    abstract void startEngine();
    
    // Concrete method - has implementation
    void stop() {
        System.out.println("Vehicle stopping");
    }
}

// Concrete class implementing multiple interfaces and extending abstract class
class ModernCar extends AbstractVehicle implements Driveable, Maintainable {
    private int speed;
    
    ModernCar() {
        super("Modern Car"); // Call abstract class constructor
        this.speed = 0;
    }
    
    // Implementing abstract method from AbstractVehicle
    @Override
    void startEngine() {
        System.out.println("Modern car engine starting with push button");
    }
    
    // Implementing interface methods
    @Override
    public void accelerate() {
        speed += 10;
        System.out.println("Accelerating. Current speed: " + speed);
    }
    
    @Override
    public void brake() {
        speed = Math.max(0, speed - 10);
        System.out.println("Braking. Current speed: " + speed);
    }
    
    @Override
    public void service() {
        System.out.println("Performing modern car service");
    }
}

// Another concrete class to demonstrate polymorphism
class VintageCar extends AbstractVehicle implements Driveable, Maintainable {
    private int speed;
    
    VintageCar() {
        super("Vintage Car");
        this.speed = 0;
    }
    
    @Override
    void startEngine() {
        System.out.println("Vintage car engine starting with crank");
    }
    
    @Override
    public void accelerate() {
        speed += 5; // Slower acceleration for vintage car
        System.out.println("Gradually accelerating. Current speed: " + speed);
    }
    
    @Override
    public void brake() {
        speed = Math.max(0, speed - 5);
        System.out.println("Gradually braking. Current speed: " + speed);
    }
    
    @Override
    public void service() {
        System.out.println("Performing vintage car service");
        System.out.println("Extra care needed for classic parts");
    }
}

public class AdvancedInheritance {
    public static void main(String[] args) {
        // Demonstrating polymorphism
        System.out.println("=== Polymorphism Demo ===");
        AbstractVehicle[] vehicles = {new ModernCar(), new VintageCar()};
        
        for (AbstractVehicle vehicle : vehicles) {
            System.out.println("\nTesting " + vehicle.type);
            vehicle.startEngine();
            vehicle.stop();
            
            // Using instanceof for safe casting
            if (vehicle instanceof Driveable) {
                Driveable driveable = (Driveable) vehicle;
                driveable.accelerate();
                driveable.brake();
            }
            
            if (vehicle instanceof Maintainable) {
                Maintainable maintainable = (Maintainable) vehicle;
                maintainable.service();
                maintainable.checkStatus(); // Using default method
            }
        }
    }
}
