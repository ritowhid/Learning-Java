package com.main.Method;

import java.util.Scanner;

public class ReturningValue {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
        return sum; // if putting return value the function is over here
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}

        /*
           Syntax:
           access modifier (we'll look in oop) return_type name(arguments) {
                 // body
                 return statement;
           }
         */