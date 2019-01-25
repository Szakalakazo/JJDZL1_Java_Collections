package com.infoshare.academy.data.structures.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise14 {
    public static void main(String[] args) {


        System.out.println("/*2D array*/\n");

        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i * arr.length) + j + 1;
                System.out.printf("%6s", arr[i][j] + " | ");
            }
            System.out.println();
        }


        System.out.println("\n/*2D list*/\n");

        int size = 10;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < size; i++) {
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < size; j++) {
                list.get(i).add((i * size + j + 1));
            }
        }

        for (List<Integer> integers : list) {
            for (Integer integer : integers) {
                System.out.printf("%6s",integer + " | ");
            }
            System.out.println();
        }
    }
}
