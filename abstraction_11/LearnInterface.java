package abstraction_11;

public class LearnInterface {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.speaks();
    }
}

interface Animal {

    void eats();
}

interface Human {
    void speaks();

}

// implements acts as same as extends in interfaces
// using interfaces we can do multiple inheritence --- Now you can think it will
// cause ambugity like it was creating in classes
// No it will not create because interfaces behave like abstract classes and in
// absract classes we don't write the body of functions generally and we func)()
// overriding;
// Like there are two interfaces A & B both have a function named as sing() now
// C class implements interfaces from A & B when C will create it C obj = new
// C();
// Obj.sing() will call the sing() present in C because in abstract the all
// functions must be implemented which are shown below.
class Monkey implements Animal, Human {

    public void eats() {
        System.out.println("Monkey is eating");
    }

    public void speaks() {
        System.out.println("Monkey speaks");
    }
}
