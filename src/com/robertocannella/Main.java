package com.robertocannella;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);


        String [] returnInput = scanner.nextLine().split(" ");
        String [] dueInput = scanner.nextLine().split(" ");
        scanner.close();
        int [] returnDate = new int[3];
        int [] dueDate = new int[3];


        // put into int array
        for (int i = 0; i < returnDate.length; i++) {
            returnDate[i] = Integer.parseInt(returnInput[i]);
            dueDate[i] = Integer.parseInt(dueInput[i]);
        }

        int fee = ThirtyDaysOfCode.libraryFees(returnDate,dueDate);
        System.out.println(fee);

    }
}
