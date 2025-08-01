package com.main.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_example {
    public static void main(String[] args) {

        // Code to create a new file
        /*
        File myFile = new File("coding_file_example.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }




        // Code to write to a file

        try {
            FileWriter fileWriter = new FileWriter("coding_file_example.txt");
            fileWriter.write("This is our first file from this java file\nok goodbye.");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        // Reading a file
        File fileReader = new File("test.txt");
        try {
            Scanner in = new Scanner(myFile);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

         */

        // Deleting a file
        File fileDeleter = new File("coding_file_example.txt");
        if (fileDeleter.delete()) {
            System.out.println("I have deleted: " + fileDeleter.getName());
        }else {
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
