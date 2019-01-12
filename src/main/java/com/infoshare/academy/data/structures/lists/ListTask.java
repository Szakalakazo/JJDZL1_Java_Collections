package com.infoshare.academy.data.structures.lists;

import java.util.ArrayList;
import java.util.List;

class Person {
    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String name, surname;
}

public class ListTask {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("John", "Smith"));
        list.add(new Person("Susan", "Kowalsky"));
        list.add(new Person("Bob", "Rulofs"));

        for (Person p : list) {
            System.out.println(p.getName() + " " + p.getSurname());
        }

    }
}
