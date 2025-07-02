package com.main.Recursion_Backtracking;

import java.util.Scanner;

public class PrintNumber {
    void f(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        f(i+1, n);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintNumber obj = new PrintNumber();
        System.out.print("Enter how many num to print: ");
        int n = in.nextInt();
        obj.f(1, n);
    }
}
