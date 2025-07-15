package com.main.oops.enumerations;

enum Status {
    Running, Failed, Pending, Success;
}

public class Enum_condition_Switch {
    public static void main(String[] args) {
        Status s = Status.Running;

        switch (s) {
            case Running -> System.out.println("All Good");
            case Failed -> System.out.println("Try Again");
            case Pending -> System.out.println("Please Wait");
            default -> System.out.println("Done");
        }
//        if (s == Status.Running) {
//            System.out.println("All Good");
//        } else if (s == Status.Failed) {
//            System.out.println("Try Again");
//        } else if (s == Status.Pending) {
//            System.out.println("Please Wait");
//        } else {
//            System.out.println("Done");
//        }
    }
}
