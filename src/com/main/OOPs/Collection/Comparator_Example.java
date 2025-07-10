package com.main.OOPs.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*  -> A Comparator helps you decide how to sort things in your own way.

    -> Collection is an interface that defines a general
       structure for storing groups of objects, like lists, sets, or queues.

    -> Collections (with an 's') is a utility class containing static methods
       for operating on these collections, such as sorting or searching.
 */
public class Comparator_Example {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(5);
        num.add(2);
        num.add(3);
        num.add(1);

        Collections.sort(num);
        System.out.println(num);
//================================================================================================
        //sort based on last digit
        Comparator<Integer> com = new Comparator<Integer>() { // Comparator is interface
            @Override
            public int compare(Integer n1, Integer n2) {
                if (n1 % 10 > n2 % 10) return 1;
                else return -1;
            }
        };
        List<Integer> number = new ArrayList<>();
        number.add(54);
        number.add(25);
        number.add(52);
        number.add(73);
        number.add(21);
        number.sort(com);
        System.out.println(number);

//===============================================================================================

        Comparator<String> lenCom = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };
//        // Sorting by length of String
        List<String> words = new ArrayList<>();
        words.add("Banana");
        words.add("Apple");
        words.add("Kiwi");
        words.add("Strawberry");
        words.add("Fig");

        Collections.sort(words, lenCom);
        System.out.println(words);
//==============================================================================================
        // Sorting Alphabetically:
        List<String> str = new ArrayList<>();
        str.add("Banana");
        str.add("Apple");
        str.add("Kiwi");
        str.add("Strawberry");
        str.add("Fig");

        Collections.sort(str, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted list (alphabetical, case-insensitive):" + '\n' + str);


    }
}
