package com.main.recursion_backtracking;

public class PrintNumber {
    void f(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        f(i+1, n);
    }
    public static void main(String[] args) {

        PrintNumber obj = new PrintNumber();
        int n =5;
        obj.f(1, n);
    }
}
