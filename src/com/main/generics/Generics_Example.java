package com.main.generics;

import java.util.ArrayList;

/*
    Generics allow you to write reusable code that works with different data types while maintaining
    type safety (catching type-mismatch errors during compilation).
 */

class MyGenerics<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class Generics_Example {
    public static void main(String[] args) {
        ArrayList arrrlist = new ArrayList<>();

        arrrlist.add(44);
        arrrlist.add(55);
        arrrlist.add(66);
        arrrlist.add("Towhid");

        // ArrayList<Integer> arrrlist = new ArrayList<>(); -> if don't mentioned type, you have to Type cast
        String a = (String) arrrlist.get(3);
        System.out.println(a);



        MyGenerics<String, Integer> g1 = new MyGenerics(23, "Mystring", 54);
        String g = g1.getT1();
        Integer i = g1.getVal();
        Integer g2 = g1.getT2();
        System.out.println(i + " " + g + " " + g2);
    }
}
