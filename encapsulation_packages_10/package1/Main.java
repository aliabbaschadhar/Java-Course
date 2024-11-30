package encapsulation_packages_10.package1;

import encapsulation_packages_10.package2.Dog;

public class Main {
    public static void main(String[] args) {
        // Create an Animal in the same package
        Animal cat = new Animal("Whiskers", 3, "Persian", "Feline");

        // In same package as Animal, we can access:
        System.out.println("\nAccessing Animal members from same package:");
        // Public members
        System.out.println("Species (public): " + cat.species);
        // Protected members
        System.out.println("Age (protected): " + cat.age);
        // Default members
        System.out.println("Breed (default): " + cat.breed);
        // Cannot access private members
        // System.out.println(cat.name); // This would cause error

        // Create a Dog (subclass in different package)
        Dog dog = new Dog("Rex", 5, "German Shepherd");
        System.out.println("\nDemonstrating access in Dog class (different package):");
        dog.demonstrateAccess();

        // Call public method
        System.out.println("\nCalling public method:");
        dog.displayInfo();
    }
}
