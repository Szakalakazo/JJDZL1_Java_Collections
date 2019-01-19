package com.infoshare.academy.data.structures.maps;

import com.infoshare.academy.data.structures.lists.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTask {

    public static void main(String[] args) {

        Map<String, Person> map = new HashMap<>();
        map.put("login3", new Person("Joe", "Ali"));
        map.put("login2", new Person("Sue", "Cal"));
        map.put("login1", new Person("Bob", "Brink"));
        map.put("login4", new Person("Mike", "Sali"));


        System.out.println("-- SET --");
        Set set = map.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }


        System.out.println("");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }


    }
}
