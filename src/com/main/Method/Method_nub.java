package com.main.Method;

class Computer {
    // This is a regular (non-static) method. It belongs to the object.
    public void playgames() {
        System.out.println("Playing games...");
    }

    // This method returns a String value
    public String getMePen() {
        return "Here is your pen!";
    }

    // This is a static method. It belongs to the class, not the object.
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
public class Method_nub {
    public static void main(String[] args) {
        // Create an object of the Computer class
        Computer obj = new Computer();

        // Call the non-static method using the object
        obj.playgames();

        // Call the method that returns a String and store the result
        String str = obj.getMePen();
        System.out.println(str); // Output: Here is your pen!

        // Call the static method directly using the class name (no object needed)
        int sum = Computer.addNumbers(10, 20);
        System.out.println("Sum: " + sum); // Output: Sum: 30
    }
}