package com.robertocannella;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

        ThirtyDaysOfCode.EmptyBST<Integer> tree = new ThirtyDaysOfCode.EmptyBST<>();
        var tree2 = tree.add(23);
        System.out.println("done");
        var height = tree2.getHeight(tree2);

    }
}
