package javaCollections_15;

public class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " (age: " + age + ", weight: " + weight + "kg)" + "\n";
    }

    @Override
    public int compareTo(Animal that) {
        if (this.age == that.age)
            return this.name.compareTo(that.name);
        return this.age - that.age;
    }

    public static void main(String[] args) {

    }
}
