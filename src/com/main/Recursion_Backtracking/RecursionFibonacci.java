package com.main.Recursion_Backtracking;

public class RecursionFibonacci {
    public int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int[] map = new int[n + 1];

        map[0] = 0;
        map[1] = 1;
        for (int i=2; i<=n; i++) {
            map[i] = map[i-1] + map[i-2];
        }
        return map[n];
    }

    /* Space Optimize way:
    public int fib(int n) {
        if (n <= 1) {
            return n; // Base cases
        }

        int a = 0, b = 1; // Initialize variables for Fib(0) and Fib(1)

        for (int i = 2; i <= n; i++) { // Calculate Fibonacci numbers iteratively
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
     */

    public static void main(String[] args) {
        RecursionFibonacci obj = new RecursionFibonacci();

        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + obj.fibo(n));
    }
}
