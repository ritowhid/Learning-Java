package com.main.OOPs.Inheritance;

sealed class A extends Thread implements Cloneable permits B,C {

}
non-sealed class B extends A {

}
final class C extends A{

}
class D extends B{

}
sealed interface X permits Y {

}
non-sealed interface Y extends X {

}
public class Sealed_Classes {
    public static void main(String[] args) {

    }
}
/*
    -> if you give a permit to a class or extends a class, its should be final or sealed or non-sealed.
    -> It restricts which classes can inherit from it. This helps improve security, maintainability, and exhaustive type-checking
    -> Why Use Sealed Classes?
        - To control inheritance.
        - To make your class hierarchy predictable and safe.
        - To support exhaustiveness checks in pattern matching.
 */