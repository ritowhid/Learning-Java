package com.main.OOPs;

public class This_Keyword_Example {
    String name;
    int age;

    // Constructor with parameters
    public This_Keyword_Example(String name, int age) {
        // Using 'this' to differentiate between instance variables and parameters
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        // Using 'this' to refer to instance variables
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Using 'this' to call another constructor
    public This_Keyword_Example() {
        this("Default Name", 0); // Calls the parameterized constructor
    }

    // Returning current instance using 'this'
    public This_Keyword_Example getInstance() {
        return this; //this → Refers to the current object in memory — the one that invoked the method.
    }
    public static void main(String[] args) {
        // Creating an object using parameterized constructor
        This_Keyword_Example person1 = new This_Keyword_Example("Alice", 25);
        person1.displayDetails();

        // Creating an object using default constructor
        This_Keyword_Example person2 = new This_Keyword_Example();
        person2.displayDetails();

        // Returning the current instance
        This_Keyword_Example person3 = person1.getInstance();
        /*
            This means: When person1.getInstance() is called:
            Inside that method, (this) refers to person1.
            So, return this; means return the person1 object itself.
            As a result, person3 will point to the same object as person1.
         */

        System.out.println("Current instance: " + person3); // person3 == person1 -> true, they point to the same object


        /*
            What happens in memory?
            Person1 and person3 both refer to the same object.
            If you change person3.name = "Bob", then person1.name will also become "Bob".
         */
    }
}