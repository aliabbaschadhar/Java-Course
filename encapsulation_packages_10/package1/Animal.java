package encapsulation_packages_10.package1;

public class Animal {
    // Different access modifiers for demonstration
    private String name; // Only accessible within Animal class
    protected int age; // Accessible in same package and subclasses
    String breed; // Default/package-private: accessible only in same package
    public String species; // Accessible everywhere

    public Animal(String name, int age, String breed, String species) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.species = species;
    }

    // Private method - only accessible within this class
    @SuppressWarnings("unused") //to supress the unused warnings
    private void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Protected method - accessible in same package and subclasses
    protected void eat() {
        System.out.println(name + " is eating");
    }

    // Default method - accessible only in same package
    void sleep() {
        System.out.println(name + " is sleeping");
    }

    // Public method - accessible everywhere
    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
}
