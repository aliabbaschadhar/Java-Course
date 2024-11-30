package encapsulation_packages_10.package2;

import encapsulation_packages_10.package1.Animal;

public class Dog extends Animal {
    public Dog(String name, int age, String breed) {
        super(name, age, breed, "Canine");
    }

    public void demonstrateAccess() {
        // Accessing inherited members:

        // Can access protected member from parent
        System.out.println("Age (protected): " + age);

        // Can access public member from parent
        System.out.println("Species (public): " + species);

        // Can call protected method from parent
        eat();

        // Cannot access private member 'name' from parent
        // System.out.println(name); // This would cause error

        // Cannot access default member 'breed' from parent (different package)
        // System.out.println(breed); // This would cause error

        // Cannot call private method from parent
        // makeSound(); // This would cause error

        // Cannot call default method from parent (different package)
        // sleep(); // This would cause error
    }
}
