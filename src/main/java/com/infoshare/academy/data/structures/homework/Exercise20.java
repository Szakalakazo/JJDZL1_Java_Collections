package com.infoshare.academy.data.structures.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise20 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");

        System.out.println("Original list: \n" + list);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if (s.length() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("\nList after removing words with even number of letters: \n" + list);
    }
}
