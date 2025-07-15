package com.main.recursion_backtracking;

import java.util.Scanner;

public class PrintNumBacktracking {

    void printingBacktrackNum(int i, int n) {
        if (i<1)
            return;
       printingBacktrackNum(i-1, n);
            System.out.println(i);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintNumBacktracking obj = new PrintNumBacktracking();

        System.out.print("Enter how many numbers you want to print: ");
        int n = in.nextInt();
        obj.printingBacktrackNum(n, n);
    }
}
