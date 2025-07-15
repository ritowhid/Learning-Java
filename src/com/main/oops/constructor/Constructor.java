package com.main.oops.constructor;
/*
    - A constructor is a special method in Java that is used to create and initialize an object.
      It runs automatically when you use the new keyword to create an object.
    - Key Features:
    - The name of the constructor is always the same as the class name.
    - A constructor has no return type, not even void.
    - It is called only once, during object creation.
    - You can create multiple constructors using constructor overloading.

    Default Constructor->no parameters,
    Parameterized Constructor->Takes parameter to initialize fields,
    Copy Constructor->creates a new objects as a copy of another.
 */

class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "who are you...!";
        age = 21;
        System.out.println("Default Constructor: ");
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor: ");
    }

    // Copy Constructor
    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy Constructor: ");
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + '\n');
    }
}
public class Constructor {
    public static void main(String[] args) {
        // Using Default Constructor
        Student s1 = new Student();
        s1.display();  // Output: Unknown, 0

        // Using Parameterized Constructor
        Student s2 = new Student("Alice", 21);
        s2.display();  // Output: Alice, 21

        // Using Copy Constructor
        Student s3 = new Student(s2); // Copies from s2
        s3.display();  // Output: Alice, 21
    }
}
