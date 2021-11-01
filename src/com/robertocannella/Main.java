package com.robertocannella;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        ThirtyDaysOfCode.LinkedListNode node = new ThirtyDaysOfCode.LinkedListNode(1);
        node.next = new ThirtyDaysOfCode.LinkedListNode(1);
        node.next.next = new ThirtyDaysOfCode.LinkedListNode(1);
        node.next.next.next = new ThirtyDaysOfCode.LinkedListNode(1);
        node.next.next.next.next = new ThirtyDaysOfCode.LinkedListNode(1);
        node.next.next.next.next.next = new ThirtyDaysOfCode.LinkedListNode(1);
        node.next.next.next.next.next.next = new ThirtyDaysOfCode.LinkedListNode(1);

        ThirtyDaysOfCode.removeDuplicates(node);

        System.out.println("done");


    }
}
