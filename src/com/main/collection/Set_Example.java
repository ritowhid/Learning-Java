package com.main.collection;

import java.util.*;

public class Set_Example {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        // Adding values to the set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate will be ignored

        // Iterating through the set (unordered, no duplicates)
        for (int n : numbers) {
            System.out.println(n);
        }
        System.out.println("Set: " + numbers);

//=============================================================================================
        // In Sorted Format: use TreeSet
        Set<Integer> sortedNumbers = new TreeSet<>(); // instead of Set<>, can use Collection bcz Set implements set, and set extends collection.
        // Adding elements (duplicates will be ignored)
        sortedNumbers.add(20);
        sortedNumbers.add(5);
        sortedNumbers.add(15);
        sortedNumbers.add(10);

        // Automatically sorted in ascending order
        for (int n : sortedNumbers) {
            System.out.println(n);
        }

        System.out.println("Sorted Set: " + sortedNumbers);

//=============================================================================================
        /* In top of Collection we have one more interface which is called Iterable.
           Iterable is the superinterface of the Collection interface that allows any
           object to be used in a for-each loop or accessed through an Iterator.
           This means all collections like List, Set, and Queue
           implement Iterable either directly or indirectly.
         */

        // Using Iterable to hold a list of numbers
        Iterable<Integer> values = new ArrayList<>();
        // Casting to ArrayList to add elements (since Iterable doesn't have add())
        ((ArrayList<Integer>) values).add(10);
        ((ArrayList<Integer>) values).add(20);
        ((ArrayList<Integer>) values).add(30);
        ((ArrayList<Integer>) values).add(40);

        // Iterating using Iterator (from Iterable)
        System.out.println("Using Iterator:");
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            System.out.println(n);
        }

        // Iterating using enhanced for-loop (for-each)
        System.out.println("Using enhanced for-loop:");
        for (int nums : values) {
            System.out.println(nums);
        }
        // Provide a standard way to traverse/loop over elements of a collection
        // (or any group of objects), without knowing how the collection is implemented internally.
        //  For-each Support, Read-Only Access, Unified Interface, Minimal Contract

    }
}

/*
 * Set is part of the Java Collection Framework.
 * It stores unique elements and does not allow duplicates.
 * Set does not support indexing or ordered access.
 * Common implementations: HashSet, LinkedHashSet, TreeSet.
 */