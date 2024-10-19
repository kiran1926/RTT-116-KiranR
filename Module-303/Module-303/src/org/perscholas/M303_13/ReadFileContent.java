package org.perscholas.M303_13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileContent {

        public static void whileLoop1(){

        File file = new File("src/temp.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            // another style of assigning to and evaluating at the same time
            //when the end of the file reached br.readLine() will return null !!!!!!!!
            while ((st = br.readLine()) != null) {


                //print the string
                System.out.println(st);
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void whileLoop2(){

        File file = new File("src/temp.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            // another style of assigning to and evaluating at different time
            // the 2 loops are the exact same the only difference is...in whileLoop1 we are doing 2 operations on a single line
            st = br.readLine();
            //when the end of the file reached br.readLine() will return null !!!!!!!!
            while (st != null) {
                //print the string
                System.out.println(st);

                // with this way you have to remember to read the next line at the end of the while loop
                st = br.readLine();

            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main (String args[]){

    }
}
