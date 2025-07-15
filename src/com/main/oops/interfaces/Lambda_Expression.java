package com.main.oops.interfaces;

@FunctionalInterface
interface Fun {
    void show(int i, int j);
}

public class Lambda_Expression {
    public static void main(String[] args) {
        Fun obj = (i, j) -> System.out.println("in show " + i + ", " + j); //syntactical sugar
        obj.show(5, 10);
// we can pass parameter value,
// we can pass multiple value,
// we can pass the value without mention its type
// if we have one value, we don't need to bracket in obj creation; Fun obj = i ->
// the file size will increase after lambda usage

    }
}