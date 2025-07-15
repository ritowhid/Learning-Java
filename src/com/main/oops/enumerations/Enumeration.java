package com.main.oops.enumerations;
// enums are named constants which we create, basically if you try to have some constant\

enum Day {
    Saturday, Sunday, Monday, Tuesday, Wednesday, Thursday, Friday;
}

public class Enumeration {
    public static void main(String[] args) {
//        Day d = Day.Friday;
//        System.out.println(d);
//        System.out.println(d.ordinal()); // using ordinal method, get the serial number;


        // access all day at once
        Day[] d = Day.values();
//        System.out.println(d); can't print like this, can print using d[0] but one element.
        // her need loop
        for (Day dd : d) {
            System.out.print("[" + dd + "]");
        }
    }
}
