package org.perscholas.M303_13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileExClass {
    public static void main (String args[]) {

        File file = new File("src/temp1.txt");

        BufferedWriter bw = null;
        try {

            //creating a new file writer with a single argument (file) it will overwrite the existing file
            //create a new file writer and 2nd argument, true is  append and false is overwrite
            bw = new BufferedWriter(new FileWriter(file, true));

            bw.write("Line 1\n");
            bw.write("Line 2\n");
            bw.write("Line 3");
            bw.write(" more on the line 3\n");

            //as we are writing to the file we are actually writing to a buffer in memory
            //when the buffer fills it will automatically write the buffer to the file as chunk
            //as an engg.. we have finished writing all that we want to write to the file
            // the final buffer may not have completely filled and we have a partial buffer
            // we need to flush that buffer to force it to write what ever it has to the file even tough its not full
            bw.flush();
            bw.write("after flush write");

            //this closes the writer and releases resources
            bw.flush();
            //bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if ( bw != null)
                    bw.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
