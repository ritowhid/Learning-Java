package com.main.dsa.data_structure.hashing;

import java.util.Scanner;

public class CharHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next();

        //precompute:
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c - 'a']);
        }
    }
}