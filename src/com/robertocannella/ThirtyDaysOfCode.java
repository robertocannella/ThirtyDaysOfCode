package com.robertocannella;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class ThirtyDaysOfCode {
    // day nineteen
    interface AdvancedArithmetic{
        int divisorSum(int n);
    }
    static class Calculator2 implements AdvancedArithmetic {
        public int divisorSum(int n) {
            if (n == 1)
                return 1;

            Set<Integer> set = new HashSet<>();
            return divisorSum( n, set, 1);
        }

        private int divisorSum(int n, Set<Integer> sum, int start){
            // passes HackerRank, But Causes Stack Overflow over 999
            if ( start > n/2 )
                return 0;

            if (n%start == 0)
                sum.add(start);

            start++;

            divisorSum(n, sum, start);

            int total = 0;
            for(int number: sum)
                total+=number;
            return total +n;
        }
    }
    // day eighteen
    public static class palindrome {
        Queue<Character> queue = new ArrayDeque<>();
        Stack<Character> stack = new Stack<>();

        void pushCharacter(char ch){
            stack.push(ch);
        }
        void enqueueCharacter(char ch){
            queue.add(ch);
        }
        char popCharacter() {
            return stack.pop();
        }
        char dequeueCharacter(){
            return  queue.remove();
        }
    }
    // day seventeen
    public static class Calculator {
        public  int power(int n, int p) throws Exception {
            if (n < 0 || p < 0)
                throw new Exception("n and p should be non-negative");

            if (p == 0)
                return 1;

            return n * (power(n, p - 1));
        }
    }
    // day sixteen
    public static void convertStringToInt() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();


        try {
            int i = Integer.parseInt(S);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        } finally {
            bufferedReader.close();
        }
    }
    // day fifteen
    public static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static  Node insert(Node head,int data) {
        //Complete this method
        if (head == null){
            return new Node(data);
        }

        Node current = head;
        Node temp = new Node(data);
        while(current.next != null){
            current = current.next;

        }
        current.next = temp;

        return head;
    }
    // day fourteen
    class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        public Difference(int[] arr) {
            this.elements = arr;

        }

        public void computeDifference() {
            int max = elements[0];
            int min = elements[0];
            for (int element : elements) {
                if (element > max)
                    max = element;

                if (element < min)
                    min = element;
            }

            maximumDifference = Math.abs(max - min);
        }
    }
    // day thirteen
    abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }
    class MyBook extends Book {
        int price;
        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        public void display(){
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }
    // day twelve
    public static class Student extends Person{
        private int[] testScores;

        Student(String firstName, String lastName, int identification, int[] scores) {
            super(firstName, lastName, identification);
            this.testScores  = scores;
        }

        public char calculate(){
            int total = 0;

            for(int score: testScores)
                total+= score;

            int average = total/testScores.length;
            if (average >= 90 && average <=100)
                return 'O';
            if (average >= 80 && average < 90)
                return 'E';
            if (average >= 70 && average < 80)
                return 'A';
            if (average >= 55 && average < 70)
                return 'P';
            if (average >= 40 && average < 55)
                return 'D';
            else
                return 'T';
        }
    }
    static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }
    // day eleven
    public static int hourglass(List<List<Integer>> arr){
        int max  = Integer.MIN_VALUE;
        int total;
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 4; col++ ){
                total = arr.get(row).get(col) + arr.get(row).get(col+1) + arr.get(row).get(col+2);
                total += arr.get(row+1).get(col+1);
                total += arr.get(row+2).get(col) + arr.get(row+2).get(col+1) + arr.get(row+2).get(col+2);
                max = Math.max(total, max);
            }
        }
        return max;
    }
    // day ten
    public static int getConsecutiveOnes(int n){

        List<Integer> binary = convertToBinary(n);
        int sum = 0;
        int max = 0;
        for (Integer integer : binary) {
            if (integer == 0)
                sum = 0;
            else
                sum++;
            max = Math.max(max, sum);
        }
        System.out.println(binary);
        System.out.println(max);
        return max;
    }
    public static List<Integer> convertToBinary(int n){
       List<Integer> arr = new ArrayList<>();
       getRemainder(arr,n);
       reverseArrayList(arr);
       return arr;
    }
    private static int getRemainder(List<Integer> arr,  int n){
        if (n <= 0)
            return 0;

        arr.add(n%2);
        n = n/2;
        return  getRemainder(arr, n);
    }
    private static List<Integer> reverseArrayList(List<Integer> arr){

        for (int i = 0; i < arr.size()/2; i++) {
            int temp = arr.get(i);
            arr.set(i,arr.get((arr.size()-1)-i));
            arr.set((arr.size()-1)-i,temp);
        }
        return arr;
    }
    // day nine
    public static int factorial(int n) {
        // Base Case
        if (n <= 1)
            return 1;

        // Recursive Case
        return n * factorial(n -1 );
    }
    // day eight
    public static void phoneBook(){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> phoneBook = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.containsKey(s))
                System.out.println(s + "=" + phoneBook.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
    // day seven
    public static void reverseArray(int size, List<Integer> list){

        for (int i = 0; i <size/2 ; i++) {
            int temp = list.get(i);
            list.set(i,list.get((size-1)-i));
            list.set((size-1)-i,temp);
        }
        System.out.println(list);
    }
    // day six
    private static char[][] printOutEvenOdds( List<String> stringList ) {
        char[][] chars = new char[ stringList.size() ][];
        for ( int i = 0; i < stringList.size(); i++ ) {
            chars[i] = stringList.get( i ).toCharArray();
        }
        return chars;
    }
    private static String buildString(List<Character> str){

        //System.out.println("List - " + str);

        // create object of StringBuilder class
        StringBuilder sb = new StringBuilder();

        // Appends characters one by one
        for (Character ch : str) {
            sb.append(ch);
        }

        // convert and return
        return sb.toString();

    }
    public static void evenOddStrings(){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            strings.add(scanner.next());
        }
        char[][] charArray = printOutEvenOdds(strings);
        List<Character> odds = new ArrayList<>();
        List<Character> evens = new ArrayList<>();

        for (char[] array: charArray
             ) {

            for (int i = 0; i < array.length; i++) {
                if (i%2 == 0)
                    evens.add(array[i]);
                else
                    odds.add(array[i]);
            }
            System.out.println(buildString(evens) + " " + buildString(odds));
            odds.clear();
            evens.clear();
        }
    }
    // day five
    public static void firstTenMultiples(int n){
        for (int i=1; i<=10; i++)
        System.out.println(n + " x " + i + " = " + i*n);
    }
    // day four
    public static class PersonDay4 {
        private int age;

        public PersonDay4(int initialAge) {
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
