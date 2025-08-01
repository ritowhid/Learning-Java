package com.main.optionals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Optionals_example {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Towhid", 100);
        marks.put("Rakibul", 230);

//        System.out.println(marks.get("Bob")>10);
        Optional<Integer> marksR = Optional.ofNullable(marks.get("Bob"));
//        System.out.println(marksR);
        if (marksR.isPresent()) {
            System.out.println("Bob present");
        } else {
            System.out.println("Bob is not present");
        }
    }
}
/*
    'Optional' is a container object that may or may not contain a non-null value.
    It's used to represent the absence of a value, providing a clearer way to handle
    'null' than traditional 'null' checks, which often lead to 'NullPointerException's.
 */