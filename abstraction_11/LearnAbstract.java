package abstraction_11;

public class LearnAbstract {
    public static void main(String[] args) {
        // Vehicle ve = new Vehicle() ;//Can't create obj of abstract class
        Car car = new Car();
        car.honks();
        car.accelrates();
    }
}

abstract class Vehicle {
    abstract void accelrates();

    abstract int brakes(int wheels);

    void honks() {
        System.out.println("Vehicle honks");
    }
}

class Car extends Vehicle {
    @Override // Called annotations
    // They are used to increase code readability and also comes with specific
    // properties like:
    // @Override check that is that accelrates() truely exist which the accelrates()
    // in vehicle trying to override also matches the signature etc etc...

    void accelrates() {
        System.out.println("Car accelrates");
    }

    @Override
    int brakes(int wheels) {
        System.out.println("The Car has " + wheels + " wheels");
        return wheels;
    }

    @Override
    void honks() {
        System.out.println("Car honked");
    }
}