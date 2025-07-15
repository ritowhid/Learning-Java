package com.main.oops.interfaces;

@FunctionalInterface
interface Func_Intrfc {
    void show();
}

//class Fi implements Func_Intrfc {
//    public void show() {
//        System.out.println("in show");
//    }
//}

public class Functional_Interface {
    public static void main(String[] args) {
        Func_Intrfc obj = new Func_Intrfc() {
            @Override
            public void show() {
                System.out.println("in show");
            }
        };
        obj.show();

    }
}
