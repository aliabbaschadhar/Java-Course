package abstraction_11;

public class LearnAnonymousClass {
    public static void main(String[] args) {
        // Implementing anonynous class using super class
        OuterClass outerSuper = new OuterClass() {
            // Subclass
            @Override
            public void sing() {
                System.out.println("He sings in inner class");
            }
        };
        outerSuper.sing(); // he sings in inner class (overrides the OuterClass)
        // Using Interface
        SuperInterface inter = new SuperInterface() {
            @Override
            public void interfaceMethod() {
                System.out.println("In subclass of interface");
            }
        };
        inter.interfaceMethod();
    }
}

// Super class
class OuterClass {
    public void sing() {
        System.out.println("He sings in outerclass");
    }
}

// Using interfaces
interface SuperInterface {
    void interfaceMethod();
}