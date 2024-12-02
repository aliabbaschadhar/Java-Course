package javaCollections_15;

import java.util.*;

public class LearnComparableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(7, "Tommy", 12);
        Animal a2 = new Animal(3, "Timmy", 21);
        Animal a3 = new Animal(5, "Terry", 15);
        Animal a4 = new Animal(8, "Don", 21);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs.toString());

        Collections.sort(dogs);
        System.out.println(dogs);

    }
}