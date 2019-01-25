package com.infoshare.academy.data.structures.homework;

import java.util.*;

public class Exercise21 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(54);
        list.add(53);
        list.add(12);
//        list.add(176);
//        list.add(176);
        list.add(2);
        list.add(176);
        list.add(1);

        System.out.println("Original list: \n" + list);

        Integer max = Collections.max(list);

        /* Checking number of occurrence of max value in list. If more than once remove all duplicated vales*/
        if (Collections.frequency(list, max) > 1) {
            for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
                Integer value = (Integer) iterator.next();
                if (value.equals(max)) {
                    iterator.remove();
                }
            }
        }
        /* Checking whether max value occurs only once and is at the end of list. If so leave list as it is */
        if (max.equals(list.get(list.size() - 1))) {
            System.out.println("\nModified list: \n" + list);
            return;
        }

        list.add(max);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(max)) {
                list.remove(list.get(i));
            }
        }

        System.out.println("\nModified list: \n" + list);
    }
}
