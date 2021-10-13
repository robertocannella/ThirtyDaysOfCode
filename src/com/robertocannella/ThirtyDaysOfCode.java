package com.robertocannella;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ThirtyDaysOfCode {
    // day five
    public static void firstTenMultiples(int n){
        for (int i=1; i<=10; i++)
        System.out.println(n + " x " + i + " = " + i*n);
    }
    // day four
    public static class Person {
        private int age;

        public Person(int initialAge) {
            if (initialAge < 0){
                System.out.println("Age is not valid, setting age to 0.");
                this.age = 0;
            }else
                this.age = initialAge;
            // Add some more code to run some checks on initialAge
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if (isYoung())
                System.out.println("You are young.");
            else if (isTeenager())
                System.out.println("You are a teenager.");
            else
                System.out.println("You are old.");
        }
        public boolean isTeenager(){
            return (age >= 13 && age < 18);
        }
        public boolean isYoung (){
            return (age < 13);
        }
        public void yearPasses() {
            // Increment this person's age.
            age++;
        }
    }
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
