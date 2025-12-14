package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NewTest {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        Collections.addAll(collection, "a", "b", "c");

        for (var item : collection) {
            System.out.println(item);
        }
    }
}
