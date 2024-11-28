
public class MainClass { // There can be only one public class
    // Code will always execute from main method of public class main method.

    public static void main(String[] args) {
        Dog dog = new Dog();
        // new--> new keyword is used to allocate memory in heap for a new object. Size
        // of memory depends upon class definition.
        // After allocating memory automatically calls the constructor and returns a
        // refrence to the newly created object.
        dog.name = "Tommy";
        dog.color = "Brown";
        dog.bark();
        Dog dog2 = new Dog();
        dog2.name = "Leo";
        dog2.bark();
        // Cat cat ;//Don't have refrence to class where to create the object
        // cat.name = "meow"; //Will give compilation error because cat is assigned to
        // null
        Cat cat = new Cat("kitty");
        cat.sit();
    }
}

// Class is stored in metaspace when program is terminated it vanishes.
// Class is a user defined data types.
class Dog {
    String name;
    int age;
    String color;

    void walk() {
        System.out.println(name + " is walking");
    }

    void bark() {
        System.out.println(name + " is barking");
    }

}

class Cat {
    String name;

    // Constructor
    public Cat(String name) {
        this.name = name;
    }

    void sit() {
        System.out.println(name + " is Sitting");
    }
}
