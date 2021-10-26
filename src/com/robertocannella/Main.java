package com.robertocannella;


public class Main {

    public static void main(String[] args)  {

        ThirtyDaysOfCode.Calculator calc = new ThirtyDaysOfCode.Calculator();
        try{
            int pwr = calc.power(-2,2);
            System.out.println(pwr);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
