package org.example;

public class GenericTele {


    public static void main(String[] args) {
        int age = 30;     // stack
        int sum = age + 5;

        Person p1 = new Person("ali", 30);          // Heap params = stack
        p1.setAge(sum);
        p1.getFull();
    }
}








