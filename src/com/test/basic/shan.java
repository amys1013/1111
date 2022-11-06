package com.test.basic;

import java.util.ArrayList;

class Person {


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
}

public class shan {
    public static void main(String[] args) {

        ArrayList<Integer> iList = new ArrayList<>();
        iList.add(10);
        iList.add(25);

        System.out.println(iList);

        ArrayList<Person> a = new ArrayList<>();
        a.add(new Person("mao", 20));
        a.add(new Person("mao", 20));
        a.add(new Person("mao", 20));
        System.out.println(a);
        for (Person p : a) {
            System.out.println(p.name);

        }
    }
}
