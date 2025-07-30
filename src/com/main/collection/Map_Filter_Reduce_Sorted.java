package com.main.collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Map_Filter_Reduce_Sorted {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8);
// Functional interfaces using anonymous inner classes
        Predicate<Integer> evenFilter = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

        Function<Integer, Integer> doubleIt = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n * 2;
            }
        };

        BinaryOperator<Integer> sum = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer c, Integer e) {
                return c + e;
            }
        };

//        // Functional interfaces + lambdas
//        Predicate<Integer> evenFilter = n -> n % 2 == 0; // filter
//        Function<Integer, Integer> doubleIt = n -> n * 2; // map
//        BinaryOperator<Integer> sum = Integer::sum; // reduce
        int result = nums.stream()
                .filter(n -> n%2==0) //filtered (even only): [4, 6, 8]
                .map(n -> n*2)       // Mapped (each ×2): [8, 12, 16]
                .reduce(0, (c,e) -> c+e); // Reduced (sum): 8 + 12 + 16 = 36
        System.out.println(result);

        // sorting using Stream
        Stream<Integer> sortedValues = nums.stream() // if you want to filter by multiple threads: parallelStream. use it for filter not for sorting
                .filter(n -> n%2==0)
                .sorted();
        sortedValues.forEach(n -> System.out.println(n)); // enhanced way: forEach(System.out::println);

    }
}
