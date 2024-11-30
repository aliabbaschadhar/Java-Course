package encapsulation_packages_10.package2;

import encapsulation_packages_10.package1.Animal;

public class MainPackage2 {
    public static void main(String[] args) {
        // Creating an Animal object from different package
        Animal animal = new Animal("Tiger", 5, "Bengal", "Feline");

        // Can only access public members from different package
        System.out.println("From different package:");
        System.out.println("Species (public): " + animal.species);

        // Public method can be accessed
        animal.displayInfo();

        // These won't work (uncomment to see errors):
        // System.out.println(animal.name); // private - not accessible
        // System.out.println(animal.age); // protected - not accessible (not a
        // subclass)
        // System.out.println(animal.breed); // default - not accessible (different
        // package)
        // animal.sleep(); // default method - not accessible
        // animal.makeSound(); // private method - not accessible
    }
}
