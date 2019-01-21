package com.infoshare.academy.data.structures.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise16 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List before reversing: \n" + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("List after reversing: \n" + list);

    }
}
