package com.main.Arrays_ArrayList;

public class ArrayOfObject {
    int rollNo, marks;
    String name;


    public static void main(String[] args) {
        ArrayOfObject s1 = new ArrayOfObject();
        s1.name = "Rakib";
        s1.rollNo = 22;
        s1.marks = 88;

//        System.out.println(s1.name + '\n' + s1.rollNo + '\n' + s1.marks);

        ArrayOfObject s2 = new ArrayOfObject();
        s2.name = "Islam";
        s2.rollNo = 34;
        s2.marks = 98;

        ArrayOfObject s3 = new ArrayOfObject();
        s3.name = "Towhid";
        s3.rollNo = 43;
        s3.marks = 45;

        ArrayOfObject students[] = new ArrayOfObject[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i=0; i<students.length; i++) {
            System.out.println("Name: " + students[i].name + '\n'+
                    "Roll: " + students[i].rollNo + '\n' +
                    "Marks: " + students[i].marks + '\n' +
                    "-------------");
        }

        // enhanced for loop
        for (ArrayOfObject std : students) {
            System.out.println("Name: " + std.name + '\n' +
                    "Roll: " + std.rollNo + '\n' +
                    "Marks: " + std.marks + '\n' +
                    "-------------");
        }
    }
}
