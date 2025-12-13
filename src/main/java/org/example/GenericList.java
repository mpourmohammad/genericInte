package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{

    public ArrayList<T> items = new ArrayList<>();
    int count;

    public void add(T item) {
        items.set(count++, item);
    }

    public T get(int index) {
        return items.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
