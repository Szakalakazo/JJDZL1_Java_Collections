package com.infoshare.academy.data.structures.lists;

import java.util.*;




class SurnameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getSurname().compareTo(p2.getSurname());
    }
}


public class ListTask {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("John", "Smith"));
        list.add(new Person("Susan", "Kowalsky"));
        list.add(new Person("Bob", "Rulofs"));


        System.out.println("Comparator sorting");
        Collections.sort(list, new SurnameComparator());


        System.out.println("List elements: ");
        System.out.println(list.toString());


        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println("\nList after removal:");
        list.toString();

        System.out.println("Comparable sorting");
        Collections.sort(list);


    }
}

