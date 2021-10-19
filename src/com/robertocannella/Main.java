package com.robertocannella;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        List<List<Integer>> list = new ArrayList<>();
        int dimensions = 6;

        for (int i = 0; i < dimensions; i++) {
            List<Integer> ints = new ArrayList<>();
            for (int j = 0; j < dimensions; j++) {
                ints.add(r.nextInt(18) -9);
            }
            list.add(ints);
        }
        for(List<Integer> row : list)
            System.out.println(row);
        System.out.println(ThirtyDaysOfCode.hourglass(list));
    }

}
