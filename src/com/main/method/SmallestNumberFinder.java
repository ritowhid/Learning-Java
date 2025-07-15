package com.main.method;

import java.util.Scanner;

public class SmallestNumberFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = in.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = in.nextInt();
        System.out.println("The smallest value is " + smallest(a, b, c) + "\n");
    }
    static int smallest(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }
}
