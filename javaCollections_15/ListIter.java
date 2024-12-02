package javaCollections_15;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListIter {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        // For loop iterator
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Fruit is " + fruits.get(i));
        }

        // for each
        for (String fruit : fruits) {
            System.out.println("for each fruit " + fruit);
        }

        // Iterator
        // Iterator<String> fruitr = fruits.iterator(); //From Collection.java
        ListIterator<String> fruitr = fruits.listIterator(); // From List.java
        while (fruitr.hasNext()) {
            System.out.println("Iterator " + fruitr.next());
        }

        List<String> smallList = fruits.subList(1, 3);
        System.out.println(smallList);
    }
}
