package com.main.OOPs.Random;
// inner class/nested class

class Outer {
    int age;

    public void show() {
        System.out.println("in Show");
    }

    class Inner {
        public void config() {
            System.out.println("in Config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = obj.new Inner();
        // If Inner class is static, then you can
        // create an object like this -> Outer.Inner obj1 = new Outer.Inner();
        // It will not work for non-static class
        // Also you can't make outer class static, it can be used only for inner class
        obj1.config();
    }
}
