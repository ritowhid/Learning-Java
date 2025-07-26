package com.main.oops.collection;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_example {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8);

//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        /* filter returns a stream, when you say s1.filter;
         it gives a new stream. also, stream s1 has already
         been operated upon or closed after used s2. you can't print s1 now.
        */
//        Stream<Integer> s3 = s2.map(n -> n*2); // now s2 is done.
//        s3.forEach(System.out::println);
//        s1.forEach(System.out::println); // can't use stream more than one time.

//        int result = s3.reduce(0, (c,e) -> c+e);
//        System.out.println(result); // can't use her forEach, bcz result will give one value.

        // we can perform this all operation more enhanced way:
        int result = nums.stream()
                .filter(n -> n%2==0) //filtered (even only): [4, 6, 8]
                .map(n -> n*2)       // Mapped (each ×2): [8, 12, 16]
                .reduce(0, (c,e) -> c+e); // Reduced (sum): 8 + 12 + 16 = 36
        System.out.println(result);

    }
}
/*
    -> Why Use Stream API in Java?
       Because it makes your code shorter, cleaner, and often faster
       when working with collections like List, Set, etc.
    -> Functional Style (like in Python or JavaScript).
       You don’t modify data directly.
       You chain operations (filter → map → collect) easily.
    -> No Need for Loops.
    -> Thread-safe option(parallel)
 */