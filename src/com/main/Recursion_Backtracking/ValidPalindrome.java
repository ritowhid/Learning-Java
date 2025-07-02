package com.main.Recursion_Backtracking;

import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

        // Two-pointer approach to check palindrome
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string to check if it's a palindrome: ");
        String s = in.nextLine();

        // Check if the string is a palindrome
        boolean result = isPalindrome(s);

        // Output the result
        if (result) {
            System.out.println("The string is a valid palindrome.");
        } else {
            System.out.println("The string is not a valid palindrome.");
        }
    }
}