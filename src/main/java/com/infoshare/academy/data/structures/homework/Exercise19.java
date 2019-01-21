package com.infoshare.academy.data.structures.homework;

import java.util.ArrayList;
import java.util.List;

public class Exercise19 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("You");
        list.add("touch");
        list.add("my");
        list.add("tralala");
        list.add("My");
        list.add("ding");
        list.add("ding");
        list.add("dong");

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
}
