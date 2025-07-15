package com.main.recursion_backtracking;

import java.util.Scanner;

public class FunctionalSum {

    int funcSum(int n) {
        if (n==0) return 0;

        return n+funcSum(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FunctionalSum obj = new FunctionalSum();


        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int result = obj.funcSum(n);
        System.out.println(result);
    }
}
