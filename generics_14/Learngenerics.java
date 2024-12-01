package generics_14;

public class Learngenerics {
    public static void main(String[] args) {
        Dog<Integer, String> dog = new Dog<>(12, "Tommy");
        dog.print();
        System.out.println(dog.getName());
        Learngenerics generics = new Learngenerics();
        generics.doubleData(90);
    }

    // Generic methods
    static <E> void printData(E data) {
        System.out.println(data);
    }

    <E> void doubleData(E data) {
        System.out.println(data);
    }
}

class Dog<T, V> {
    T id;
    V name;

    public Dog(T id, V name) {
        this.id = id;
        this.name = name;
    }

    public void print() {
        System.out.println("Dog name is : " + name + " and it's id is : " + id);
    }

    T getName() {
        return id;
    }
}
