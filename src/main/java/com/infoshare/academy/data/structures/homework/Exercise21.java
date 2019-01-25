package com.infoshare.academy.data.structures.homework;

import java.util.*;

public class Exercise21 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(54);
        list.add(53);
        list.add(2);
        list.add(12);
        list.add(176);
        list.add(1);

        System.out.println("Original list: \n" + list);

        Integer max = Collections.max(list);

        if (max.equals(list.get(list.size()-1))) {
            System.out.println("\nModified list: \n" + list);
            return;
        }

        list.add(max);

        for (int i = 0; i < list.size() - 2; i++) {
            if (list.get(i).equals(max)) {
                list.remove(list.get(i));
            }
        }

        System.out.println("\nModified list: \n" + list);

    }
}
