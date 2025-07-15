package com.main.oops.collection;

import java.util.HashMap;
import java.util.Map;

public class Map_Example {
    public static void main(String[] args) {
        Map<String, Integer> std = new HashMap<>(); // if you want to use normal-use HashMap, if you want synchronized version-use Hashtable; better to use when have multiple thread working
        std.put("Towhid", 43);
        std.put("Alice", 44);
        std.put("Bob", 49);
        std.put("Jack", 52);
        std.put("Alice", 59); // changing value

        // .add mean - adding a new element, .put mean - try to add the element, if you already have this key, replace it.

//        // output in maps
//        System.out.println(std);
//        // get specific data
//        System.out.println(std.get("Towhid"));
//
//        // accessing all key
//        System.out.println(std.keySet());
        for (String key : std.keySet()) {
            System.out.println(key + " : " + std.get(key)); //keySet() → Get the names (key) Example: "Towhid", "Alice", "Bob"
        }                                                   // get(key) → Get the value for that name, Example: get("Towhid") → 43

    }
}
/*
    -> A Map stores key-value pairs. Each key is unique. Each key map to exactly one value.
       It's not a subtype of Collection but part of the Collection Framework.
 */