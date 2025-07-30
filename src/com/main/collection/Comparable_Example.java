package com.main.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparable is an interface in Java.It lets you define the default way to sort objects of your class.
class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) return 1;
        else return -1;
    }
}

public class Comparable_Example {
    public static void main(String[] args) {
        // Sorting by age.
        // if you implement 'Comparable', you don't need Comparator.
//        Comparator<Student> com = new Comparator<Student>() { // Comparator is interface
//            @Override
//            public int compare(Student i, Student j) {
//                if (i.age > j.age) return 1;
//                else return -1;
//            }
//        };
        // Comparator in enhanced way
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;


        List<Student> std = new ArrayList<>();
        std.add(new Student(21, "Towhid"));
        std.add(new Student(12, "Rakibul"));
        std.add(new Student(23, "Islam"));
        std.add(new Student(22, "Ovi"));

//        System.out.println(std);

        Collections.sort(std);
        /* Integer class implements 'Comparable', that's why by default sort work with integer
        our 'Student' is not implementing comparable.

        So if you want natural sorting, you can implement Comparable. The only thing is this
        comparable interface has a method called compareTo();

         */
        //print one by one using enhanced for loop
        for (Student s : std) {
            System.out.println(s);
        }


    }
}
