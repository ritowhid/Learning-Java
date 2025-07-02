package com.main.BasicJava;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //.....................................
        System.out.print("Enter any number: ");
        int a = input.nextInt();
        if (a > 5){
            System.out.println("hello");
        }else System.out.println("This number is greater than five");

        //.......................................
        System.out.println("Enter any number: ");
        int time = input.nextInt();
        if (time < 10){
            System.out.println("Good morning");
        }else if (time < 18){
            System.out.println("Good day");
        }else System.out.println("Good evening");

        //Short Hand if_else
        /*
            Syntax:
            variable = (condition)? expressionTrue : expressionFalse;
         */
        int myTime = 20;
        String result = (myTime < 16) ? "Good Day." : "Good Evening";
        System.out.println(result);

        // Q: Alphabet check
        char ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
