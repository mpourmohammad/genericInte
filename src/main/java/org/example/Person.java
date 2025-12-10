package org.example;

import java.util.Iterator;

public class Person implements Iterable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFull() {
        return this.name + ", " + this.age;
    }

    public String getFull(String a) {
        return this.name + ", " + a;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
