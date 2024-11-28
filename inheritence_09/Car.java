package inheritence_09;

public class Car extends Vehicle {

    public Car() {
        super(4);// Calling parent constructor
        System.out.println("Car created");
    }

    public void start() {
        super.start();
        System.out.println("Car is starting");
    }

    public static void main(String[] args) {
        // Create a new Car instance
        Car car = new Car();
        // Set the model of the car
        car.model = "Toyota";
        // Call the start method to start the car
        car.start();
    }
}
