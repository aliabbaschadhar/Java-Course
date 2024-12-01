package polymorphism_12;

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        // Now overriding the toString method in the Object class
        return "Car model is " + this.model + "Car year is " + this.year;
    }

    @Override
    public boolean equals(Object obj) {
        Car that = (Car) obj;
        return this.model == that.model && this.year == that.year;
    }
}

public class LearnObjectClass {
    public static void main(String[] args) {
        Car car = new Car("Honda", 2022);
        Car car2 = new Car("Honda", 2022);
        System.out.println(car.getClass());
        System.out.println("Refrence of object : " + car);
        System.out.println(car.toString());// Automatically called by the java to convert the output into the readerable
                                           // form
        System.out.println(car); // toString method called automatically

        // Normal equals compare the refrence of two object which is mostly time false
        // bcz their refrence are not same;
        // To compare their content we write a equals method and override it.
        System.out.println(car.equals(car2));
        // ! What is the contract between hashcode() & equals() ?
        // If two objects are equal according to the equals() method, they MUST have the
        // same hash code value returned by hashCode().
        // If you override equals(), you MUST override hashCode()
        // If a.equals(b) is true, then a.hashCode() must equal b.hashCode()
        // If a.hashCode() equals b.hashCode(), a.equals(b) may be true or false
    }
}
