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
    // day tewntySix
    public static int libraryFees(int[] returnDate, int[] dueDate){
        if (returnDate[2] > dueDate[2]) // years
            return 10000;
        if (returnDate[2] < dueDate[2])
            return 0;

        if (returnDate[1] > dueDate[1])
            return (returnDate[1] - dueDate[1]) * 500;
        if (returnDate[1] < dueDate[1])
            return 0;

        if (returnDate[0] > dueDate[0])
            return (returnDate[0] - dueDate[0]) * 15;

        return 0;

    }
    // day twentyFive
    //A prime number is a natural number greater than  that is only divisible by  and itself (note that  is not a prime). A primality algorithm is an algorithm for determining if some number, , is prime.
    //
    //The most basic primality algorithm is to simply iterate through each integer
    // (where ) and determine if it evenly divides ; if  is an even divisor of ,
    // then  is not prime. While this algorithm is , there are a number of
    // optimizations you can perform that will reduce it to
    // (even that can be slightly improved upon, though we will not discuss it here).
    // What are you waiting for? Get started on today's challenge!
    // And, when you're done, be sure to check the Editorial for a comparison of four primality algorithms.

    public static void getPrimes (int n){
        // Skip over 1 (not a prime number)
        if (n == 1){
            System.out.println("Not prime");
            return;
        }
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ( n%i == 0){
                isPrime = false;
                break;
            }
        }

        System.out.println((isPrime) ? "Prime" : "Not prime");

    }
    // day twentyFour
    public static class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int d) {
            data = d;
            next = null;
        }

    }
    public static LinkedListNode removeDuplicates(LinkedListNode head) {
        //Write your code here
        if (head == null)
            return head;

        LinkedListNode current = head;

        while (current.next != null ) {
            while (current.data == current.next.data) {
                current.next = current.next.next;
                if (current.next == null) {
                    return head;
                }
            }

            current = current.next;
        }
        return head;
    }
    // day twentyThree
    private Node root;

    public void levelOrder(){
        levelOrder(root);
    }
    public void levelOrder(Node root){
        // enqueue current root
        if (root == null){
            System.out.println("");
            return;
        }

        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);


        // while there are nodes to process
        while(queue.size() > 0) {
            // dequeue next node
            root = queue.remove();

            list.add(root.data);

            if(root.leftChild != null)
                queue.add(root.leftChild);

            if(root.rightChild != null)
                queue.add( root.rightChild );
        }
        String outputa = list.toString().replace("]", "");
        String outputb = outputa.toString().replace("[","");
        System.out.println(outputb.replace(",",""));

    }
    // day twentyTwo
       // from tutorial... doesn't work 100%  maybe just for theory
    public interface Tree<D extends Comparable>{
         public boolean isEmpty();
         public int cardinality();
         public boolean member(D element);
         public  NonEmptyBST<D> add(D element);
    }
    static class NonEmptyBST<D extends Comparable> implements Tree<D> {
        D data;
        Tree<D> left;
        Tree<D> right;

        public NonEmptyBST(D elt) {
            data = elt;
            left = new EmptyBST<D>();
            right = new EmptyBST<D>();
        }

        public NonEmptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree) {
            data = elt;
            left = leftTree;
            right = rightTree;
        }

        public boolean isEmpty() {
            return false;
        }

        public int cardinality() {
            return 1 + left.cardinality() + right.cardinality();
        }

        public boolean member(D elt) {
            if (data == elt) {
                return true;
            } else {
                if (elt.compareTo(data) < 0) {
                    return left.member(elt);
                } else {
                    return right.member(elt);
                }
            }
        }

        public NonEmptyBST<D> add(D elt) {
            if (data == elt) {
                return this;
            } else {
                if (elt.compareTo(data) < 0) {
                    return new NonEmptyBST(data, left.add(elt), right);
                } else {
                    return new NonEmptyBST(data, left, right.add(elt));
                }
            }
        }

    }
    public static class EmptyBST<D extends Comparable> implements Tree<D>{

        public EmptyBST() {

        }

        public boolean isEmpty() {
            return true;
        }

        public int cardinality() {
            return 0;
        }

        public boolean member(D elt) {
            return false;
        }

        public NonEmptyBST<D> add(D elt) {
            return new NonEmptyBST<D>(elt);
        }


    }
    // day twentyone
    public <T> void printArray (T[] arr){
        for(T item : arr)
            System.out.println(item);
    }
    // day twenty
    public static List<Integer> bubbleSort( List<Integer> a){
        int numberOfSwaps = 0;
        for (int i = 0; i < a.size(); i++) {
            // Track number of elements swapped during a single array traversal


            for (int j = 0; j < a.size()-1; j++) {
                // Swap adjacent elements if they are in decreasing order
                int jj = a.get(j);
                int jjplus1 = a.get(j+1);
                if (a.get(j) > a.get(j + 1)) {
                    int swap = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, swap);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
            System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
            System.out.println("First Element: " + a.get(0));
            System.out.println("Last Element: " + a.get(a.size()-1));
            return a;
    }
    // day nineteen
    // from geeksforgeeks
    public static int countDivisors(int n)
    {
        int cnt = 0;
        System.out.println(Math.sqrt(n));
        for (int i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                // If divisors are equal,
                // count only one
                if (n / i == i)
                    cnt++;

                else // Otherwise, count both
                    cnt = cnt + 2;
            }
        }
        return cnt;
    }
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
            if ( start > n/start )
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
        Node leftChild;
        Node rightChild;
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
