package abstraction_11;

public class LearnInnerClass {
    String name;

    // non-static class
    public class Toy {
        int price;

        void print() {
            System.out.println("Print the price " + price);
        }
    }
    // Non static class in class called as InnerClass.

    public static class Playstation {
        int version;

        void printVersion() {
            System.out.println("Print version of playstation: " + version);
        }
    }

    public static void main(String[] args) {
        // Toy toy = new Toy();
        // Can't made the object of Toy class because Toy Class is a non static class.
        // For non static class we first have to make the object of the LearnInnderClass
        // then we can access the Toy class in it.
        // Toy toy = new LearnInnerClass().new Toy();
        // Another way to do
        LearnInnerClass learn = new LearnInnerClass();
        Toy toy = learn.new Toy();
        toy.price = 98;
        toy.print();
        // toy.name = "non-static"; //Can't access it

        Playstation play = new Playstation();
        // This is possible because the for a static class we don't need to create a
        // object to to access it
        play.version = 4;
        play.printVersion();

    }
}
