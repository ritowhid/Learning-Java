package com.main.Recursion_Backtracking;

public class SimpleCounterRecursion {
    // Simple counter using recursion
    int count = 0;

    void f() {
        if (count == 3) { // Base case: Stop when count reaches 3
            return;
        }
        System.out.println(count); // Print current count
        count++; // Increment the counter
        f(); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("Running the first method:");
        SimpleCounterRecursion obj = new SimpleCounterRecursion();
        obj.f(); // Call the method
    }
}
