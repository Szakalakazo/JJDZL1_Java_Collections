package com.infoshare.academy.data.structures.sets;



import com.infoshare.academy.data.structures.lists.Person;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTask {

    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("Joanna", "Kicek"));
        hashSet.add(new Person("Tomek", "Bodzek"));
        hashSet.add(new Person("Janek", "Supek"));
        hashSet.add(new Person("Zbyszek", "Moniek"));
        hashSet.add(new Person("Tomek", "Bodzek"));

        System.out.println(hashSet.toString());

        TreeSet<Person> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet.toString());


    }
}
