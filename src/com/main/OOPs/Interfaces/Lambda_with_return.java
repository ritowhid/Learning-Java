package com.main.OOPs.Interfaces;

@FunctionalInterface // lambda expression only works with functional interface
interface Funct {
    int add(int i, int j);
}

public class Lambda_with_return  {
    public static void main(String[] args) {
        Funct obj = (i,j) -> i + j;
        int result = obj.add(5, 10);
        System.out.println(result);
// you are calling a function or the method by passing the object, you can also pass the


    }
}