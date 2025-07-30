package com.main.collection;

import java.util.Arrays;
import java.util.List;

public class NeedOf_StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8);

//        // print the value
//        for (int i =0; i< nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }
//
//        // print the value in enhanced loop
//        for (Integer num : nums) {
//            System.out.println(num);
//        }

        // using forEach method to print value
//        nums.forEach(n -> System.out.println(n));

        // how forEach method works:
//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };
//        nums.forEach(con);

        // forEach method using Lambda Expression
//        Consumer<Integer> con = n -> System.out.println(n));
//        Consumer<Integer> con = System.out::println; // more enhanced
//        nums.forEach(n -> System.out.println(n)); // more enhanced
        nums.forEach(System.out::println); // more enhanced
//        int sum = 0;
//        for (int n : nums) {
//            if (n % 2 == 0) {
//                n *= 2;
//                sum += n;
//            }
//        }
//        System.out.println(sum);
    }
}
/* The Stream API is a feature in Java (since Java 8) that lets you process collections
   (like List, Set) in a fast, clean, and functional way, instead of writing loops
 */