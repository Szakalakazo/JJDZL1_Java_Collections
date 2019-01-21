package com.infoshare.academy.data.structures.homework;

import java.util.ArrayList;
import java.util.List;

public class Exercise18 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('n');
        list.add('i');
        list.add('x');
        list.add('i');
        list.add('N');

        StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }

        System.out.println("Word is a palidrome: "
                + sb.toString().toUpperCase().equals(sb.reverse().toString().toUpperCase()));
    }
}
