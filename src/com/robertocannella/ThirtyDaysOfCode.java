package com.robertocannella;

import java.util.Scanner;

public class ThirtyDaysOfCode {
    // day two
    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        // Write your code here
        double tipAmount = ((double) tipPercent/100) * mealCost;
        double taxAmount = ((double)taxPercent/100) * mealCost;
        tipAmount = Math.round(tipAmount*100)/100d;
        taxAmount = Math.round(taxAmount*100)/100d;
        double total = (mealCost + tipAmount + taxAmount);
        total = Math.round(total);
        //System.out.println((double) 20/100);
        System.out.println(tipAmount);
        System.out.println(taxAmount);
        System.out.println(total);
        System.out.println(taxAmount+tipAmount+mealCost);
    }
    // day one
    public static void dayOne(){
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);

    /* Declare second integer, double, and String variables. */
    int a;
    double b;
    String c;
    /* Read and save an integer, double, and String to your variables.*/
        a = scan.nextInt();
        b = scan.nextDouble();
        scan.nextLine();
        c = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+a);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+b);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+c);

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        scan.close();
}
}
