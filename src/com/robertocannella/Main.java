package com.robertocannella;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(6);

        ThirtyDaysOfCode.bubbleSort(a);

    }
}
