package com.main.method;

import java.util.Scanner;

public class MethodSum {
    public static void main(String[] args) {
        int ans = sum2(22, 45);
        System.out.println(ans);

        String msg = myMessage("Towhid");
        System.out.println(msg);
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

    // Pass the value of numbers when you are calling the method in main()
    static int sum2(int  num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    static String myMessage(String name) {
        String message = "Hello " + name;
        return message;
    }



}
        /*
           Syntax:
           access modifier (we'll look in oop) return_type name(arguments) {
                 // body
                 return statement;
           }

         */