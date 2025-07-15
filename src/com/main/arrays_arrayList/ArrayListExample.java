package com.main.arrays_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /* Syntax:
                 ArrayList<DataTypes> variable = new ArrayList<>();
         */

//        ArrayList<Integer> myInt = new ArrayList<>();
//
//
        ArrayList<Integer> list = new ArrayList<>(5);
//
//        list.add(44);
//        list.add(43);
//        list.add(23);
//        list.add(233);
//        list.add(2344);
//        System.out.println(list);
//        list.set(4, 55);
//
//        list.remove(0);
//        System.out.println(list);
//
//        System.out.println(list.contains(444));

        // input
        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        // get item in any index
        for (int i = 0; i<5; i++){
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
