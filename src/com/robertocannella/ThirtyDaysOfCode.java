package com.robertocannella;

import java.util.Scanner;

public class ThirtyDaysOfCode {
    // day three
    public static void weirdOrNot(int n){
        if (n%2 != 0) {
            System.out.println("Weird");
            return;
        }
        if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
            return;
        }
        if (n >= 6 && n <=20){
            System.out.println("Weird");
        }
        else
            System.out.println("Not Weird");
    }
    // day two
    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        double tipAmount = ((double) tipPercent/100) * mealCost;
        double taxAmount = ((double) taxPercent/100) * mealCost;
        tipAmount = Math.round(tipAmount*100)/100d;
        taxAmount = Math.round(taxAmount*100)/100d;
        double total = (mealCost + tipAmount + taxAmount);
        total = Math.round(total);

        System.out.println((int)total);
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
