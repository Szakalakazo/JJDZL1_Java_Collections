package com.infoshare.academy.data.structures.homework;

import java.util.*;

public class Exercise15 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < 25; i++) {
            list.add((int) (Math.random() * list.size()));
        }

        /*
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(21);
        list.add(131);
        list.add(55);
        */

        System.out.println("list:\n" + list);


        Set set = new TreeSet();
        for (Integer number : list) {
            int frequency = Collections.frequency(list, number);
            if (frequency > 1) set.add(number);
        }
        System.out.println("Duplicated numbers in list are: " + set);
    }
}

