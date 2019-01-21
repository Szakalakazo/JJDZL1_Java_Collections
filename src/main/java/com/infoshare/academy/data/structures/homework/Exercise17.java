package com.infoshare.academy.data.structures.homework;

import java.util.ArrayList;
import java.util.List;

public class Exercise17 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Sue");
        list.add("Mike");
        list.add("aXel");
        list.add("ToMMy");
        list.add("Donald");

        System.out.println("List changing the letters : \n" + list);
        System.out.println();


        for (int i = 1; i <= list.size(); i += 2) {
            String word = list.get(i);
            String result = "";

            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) result += Character.toLowerCase(c);
                else result += Character.toUpperCase(c);
            }
            list.set(i, result);
        }
        System.out.println("List after changing the letters: \n" + list);
    }
}
