package com.main.method;

public class Scope {
    public static void main(String[] args) {
        int a = 33;
        int b = 34;
        String name = "Rahul";
//  1.      System.out.println(marks);  // Method Scope: i can access this variable only in the random() function. it can't be access outside the class.

        // Block Scope...................................
        {
//            int a = 78; // same variable can't be initialised again.It can change the value without initialised
            a = 100; // reassign the original ref variable to some other value
            int c = 98;
            name = "Kunal";
            System.out.println(name);
            // values initialised in this block, will remain in block
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); // cannot use outside the block

        // scoping in for loops
        for (int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println(a);

    }
    static void random(int marks){
        int num = 65;
        System.out.println(num);
    }
}
// scope means: where a certain variable or method is accessible in a program
// anything is initialised outside the block, can be use inside the block.
// anything is initialised outside the block, cannot be initialised inside the block.
// anything is initialised inside the block, can be initialised outside the block.
// anything is initialised inside the block can't use outside the block