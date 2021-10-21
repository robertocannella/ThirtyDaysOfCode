package com.robertocannella;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] scores = {41, 42, 43, 44, 45, 46, 48};
        ThirtyDaysOfCode.Student s = new ThirtyDaysOfCode.Student("Roberto","cannella",234,scores);

        //s = new ThirtyDaysOfCode.Student("Roberto", "Cannella", 89234, scores);
        System.out.println(s.calculate());
    }

}
