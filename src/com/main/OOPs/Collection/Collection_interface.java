package com.main.OOPs.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection_interface {
    public static void main(String[] args) {
        // Using Collection interface with generics
        Collection<Integer> nums = new ArrayList<>();

        // Adding elements to the collection
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        /*
         * Collections in Java work with objects, not primitives.
         * Without specifying a type, added values are treated as Object.
         * To store primitive types like int, use wrapper classes like Integer.
         * Generics (e.g., Collection<Integer>) allow type safety and avoid casting.
         * Integer is the wrapper class for int and works with Collection APIs.
         */
        // Iterating using Object and performing some operation (not type-safe, casting required)
        for (Object n : nums) {
            int num = (Integer) n; // Manual type casting
            System.out.println(num * 2);
        }

        // Recommended: Iterating with type-safe enhanced for loop
        for (int n : nums) {
            System.out.println(n);
        }
        // Printing the whole collection without a loop
        System.out.println("Collection: " + nums);



        // Using List interface (supports indexing)
        List<Integer> numIndex = new ArrayList<>();

        numIndex.add(3);
        numIndex.add(9);
        numIndex.add(11);
        // Accessing elements by index
        System.out.println("Element at index 2: " + numIndex.get(2));     // Output: 11
        System.out.println("Index of element 3: " + numIndex.indexOf(3)); // Output: 0

        System.out.println("List: " + numIndex);

        /*
         * Collection interface doesn’t support indexing.
         * ArrayList implements List, which supports index-based methods like get().
         * Use Collection for simple add/remove operations.
         * Use List if you need to access elements by index.
         */


    }
}
/*
 * Notes:
 * - Collection is part of java.util, not java.lang, so it must be imported.
 * - List, Set, and Queue are sub-interfaces of Collection.
 * - Each has its own implementations:
 *   → List: ArrayList, LinkedList
 *   → Set: HashSet, LinkedHashSet
 *   → Queue: PriorityQueue, Deque
 * - Use List when index-based access is needed.
 * - Use Collection for basic storage and iteration without index.
 */