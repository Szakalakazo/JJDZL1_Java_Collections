package com.infoshare.academy.data.structures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTask {

    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (i + 1) * (int) (Math.random() * 5);
        }
        System.out.println("First array: " + Arrays.toString(array));


        int[] copyOfArray = Arrays.copyOf(array, array.length * 2);

        for (int i = 0; i < copyOfArray.length; i++) {
            i = (i + 1) * (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(copyOfArray));
        Arrays.sort(copyOfArray);

        System.out.println("Copy off array: " + Arrays.toString(copyOfArray));

        ArrayList list = new ArrayList(Arrays.asList(array));



        Collections.sort(list, Collections.reverseOrder());
        System.out.println(array);




    }
}
