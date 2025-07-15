package com.main.oops.encapsulation;

class Human {
    private int age=11;
    private String name="Rakib";

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Towhid");
        obj.setAge(12);
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
