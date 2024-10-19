package org.perscholas.M303_13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToAFile {
    public static void main(String args[]){

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write("Writing to a file.");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }

    }
}
