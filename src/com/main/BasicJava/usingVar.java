package com.main.BasicJava;
//class var { } error: var cannot be used as a class/instance variable type.
class A { }
public class usingVar {
//    var num = 10; error: This is illegal outside methods, gives error, can only be used for local variables inside methods or blocks.
// You cannot use 'var' at class-level (fields) or static variables.
    public static void main(String[] args) {
        int a = 9;
        var b = 8;

        String var = "Towhid"; // 'var' can use as variable name.

        int c; // OK: explicit type declaration without initialization
//        var d; ERROR: cannot infer type without initialization
        System.out.println(a+b + var);

        int nums[] = new  int[10]; // normal array declaration
        var num = new int[5]; // OK: var infers type as int[]

        // class object
        class Alien{ }
        var obj = new Alien();

        var obj2 = new  A();

        /*
        'var' is a contextual keyword.
        This means 'var' behaves like a keyword only in the
        context of local variable declarations with initialization.
        Otherwise, it behaves like any normal identifier.
         */
    }
}
