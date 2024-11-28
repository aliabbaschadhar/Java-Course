// This line indicates that the Vehicle class is part of the inheritence_09 package
// in the Java namespace. It is necessary to include this line in order to
// refer to other classes in the same package without fully qualifying the names.
// For example, if we have a class called Car in the same package, we can
// refer to it as Car rather than inheritence_09.Car.
package inheritence_09;

public class Vehicle {
    int wheelCount;
    String model;

    Vehicle(int wheels) {
        System.out.println("Vehicle created");
        this.wheelCount = wheels;
        System.out.println("Creating a vehicle with wheels");
    }

    public void start() {
        System.out.println("Vehicle Starts");
        System.out.println("Model is: " + model);
    }
}