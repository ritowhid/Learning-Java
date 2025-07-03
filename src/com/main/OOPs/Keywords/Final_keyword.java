package com.main.OOPs.Keywords;

// 'final' keyword can be used with - variable, method, class.\

// let's talk about the final class:
final class Calc {
    public void show() {
        System.out.println("in Calc Show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

//class AdvCalc extends Calc {
// when you make a class 'final' no one can extend it. You stop the inheritance.
//}

class Calculate {
    public final void show1() {
        System.out.println("By Towhid");
    }

    public void add1(int c, int d) {
        System.out.println(c + d);
    }
}

class Advanced extends Calculate {
//    public void show1() { ::If you make your method 'final,' no one can override.
//        System.out.println("By john"); // someone using your features with his name.
                                        // now I don't want anyone to override my method
//    }
}

public class Final_keyword {
    public static void main(String[] args) {
        final int num = 8; // make it constant using 'final' keyword
//        num = 9; whenever you have a value which you think will not change, try to make it final

//        Calc obj = new Calc();
//        obj.show();
//        obj.add(4, 5);

        Advanced obj = new Advanced();
        obj.show1();
        obj.add1(6, 7);
    }
}
