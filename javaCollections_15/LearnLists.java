package javaCollections_15;

import java.util.ArrayList;
import java.util.List;

//Java Collection is a interface not a class so we can't make an object of it.

public class LearnLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(22);
        list1.add(23);
        list1.add(12);

        list2.add(21);
        list2.add(89);
        list2.add(23);

        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.contains(22));

        list1.remove(2);// removes value at index
        list1.remove(Integer.valueOf(12));// If we pass object then it will the remove the value || we can
                                          // pass the value which we want to be removed.
        System.out.println(list1);

        list1.addAll(list2); // Get elements of both lists in one list other list remains.
        System.out.println(list1);
    }
}
