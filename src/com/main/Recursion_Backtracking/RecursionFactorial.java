package com.main.Recursion_Backtracking;

import java.util.Scanner;

public class RecursionFactorial {
    int fact(int n) {
        if (n == 1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RecursionFactorial obj = new RecursionFactorial();

        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int result = obj.fact(n);
        System.out.println("The factorial of " + n + "is: " + result);

    }
}
