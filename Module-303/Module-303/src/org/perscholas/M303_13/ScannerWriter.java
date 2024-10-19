package org.perscholas.M303_13;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerWriter {
    public static void main (String args[]){

        // character input stream that the user types on the keyboard
        Scanner scan = new Scanner(System.in);

       try {
           File file = new File("src/temp2.txt");
           PrintWriter pw = new PrintWriter(new FileWriter(file, true));

           System.out.println("Enter a string to write to the file: ");

           String input = scan.nextLine();
           pw.println(input);
           ////
           pw.flush();

           pw.close();

       } catch (Exception e) {
           e.printStackTrace();
       }


    }
}
