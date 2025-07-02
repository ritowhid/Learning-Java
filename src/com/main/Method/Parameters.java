package com.main.Method;

public class Parameters {
    public static void main(String[] args) {
        int ans = sum3(10, 50);
        System.out.println(ans);
    }
    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}
