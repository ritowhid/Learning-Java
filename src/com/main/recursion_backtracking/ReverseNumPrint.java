package com.main.recursion_backtracking;

import java.util.Scanner;

public class ReverseNumPrint {

    void printing(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.print(i + " ");
        printing(i-1, n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ReverseNumPrint obj = new ReverseNumPrint();

        System.out.print("Enter how many numbers to print: ");

        int n = in.nextInt();
        obj.printing(n, n);
    }
}
