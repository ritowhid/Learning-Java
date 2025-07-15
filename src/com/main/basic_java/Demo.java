package com.main.basic_java;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        String strs[] = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            char ch = (char) ('a' + i);
//            builder.append(ch);
//        }
//        System.out.println(builder.toString());
//        builder.reverse();
//        System.out.println(builder);

//        String name = "Rakibul Towhid";
//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(name.toUpperCase());
//        System.out.println(name.indexOf('b'));
//        System.out.println(Arrays.toString(name.split(" ")));

    }

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();
        // Sort the array:
        Arrays.sort(strs);

        // Get the first and last strings:
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        //  Start compiling
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }
}