package com.infoshare.academy.data.structures.sets;


import com.infoshare.academy.data.structures.lists.Person;

import java.util.*;

public class SetTask {

    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("Joanna", "Kicek"));
        hashSet.add(new Person("Tomek", "Bodzek"));
        hashSet.add(new Person("Janek", "Supek"));
        hashSet.add(new Person("Zbyszek", "Moniek"));
        hashSet.add(new Person("Tomek", "Bodzek"));


        TreeSet<Person> person = new TreeSet<>(hashSet);

        System.out.println("\n-- treeSet person: ");
        TreeSet<Person> p = new TreeSet<>();

        PersonComparator personComparator = new PersonComparator();
        Comparator<Person> reversed = personComparator.reversed();

        person.add(new Person("Jan", "Nowak"));
        person.add(new Person("Tomcio", "Paluch"));


        System.out.println("-- linkedHashSet test: ");

        Set<String> string = new LinkedHashSet<String>();

        string.add("zwierzaki");
        string.add("słodziaki");
        string.add("alkoholicy");

        System.out.println(string.toString());


    }
}
