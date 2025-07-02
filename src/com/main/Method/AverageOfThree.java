package com.main.Method;

import java.util.Scanner;

public class AverageOfThree {

    static int average(int a, int b, int c){
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = in.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = in.nextInt();

        System.out.print("Enter 3rd number: ");
        int c = in.nextInt();

        System.out.println("The average value is " + average(a, b, c) + "\n");
    }
}
