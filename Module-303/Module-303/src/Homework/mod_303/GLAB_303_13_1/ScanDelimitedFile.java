package Homework.mod_303.GLAB_303_13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimitedFile {
    //Create an object of type file. Set it to your file’s path, and
    //then we will pass this file instance to the Scanner class for scanning.
    //The Scanner class will read the file line-by-line.
    //Use the nextLine() method to read a line.
    //Split the file by delimiter by using String.split() method.
    //After the split, we can store data in ArrayList. We could store that line as a String[] array as shown below:
    //ArrayList<String[]>
    //After that, for display, we can Iterate through Arraylist.

    public static void main(String args[]) throws FileNotFoundException {

        try{
            String location = "/Users/Kiran/Downloads/cars.csv" ;
            File file = new File(location);
            Scanner input = new Scanner(file);

            ArrayList<String[]> data = new ArrayList<>();

            while(input.hasNextLine()){
                String line = input.nextLine();
                String [] splittedLine = line.split(",");
                data.add(splittedLine);
            }
            for (String[] line : data) {
                //System.out.println(line[0] + "|" + line[1] + "|" + line[2] + "|" + line[3]  + line[4] + "|"
                // + line[5] + "|" + line[6] + "|" + line[7] + "|" + line[8]);
                System.out.println("Car Name :" + line[0] );
                System.out.println("MPG :" + line[1] );
                System.out.println("Cylinder :" + line[2] );
                System.out.println("Displacement :" + line[3]);
                System.out.println("Horsepower :" + line[4]);
                System.out.println("Weight :" + line[5]);
                System.out.println("Acceleration :" + line[6]);
                System.out.println("Model :" + line[7]);
                System.out.println("Origin :" + line[8]);
                System.out.println("===============================");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }

    }
}
