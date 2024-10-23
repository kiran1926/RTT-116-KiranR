package Homework.mod_303.GLAB_303_13_1.GLAB_303_13_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
//Example One: Multiple source channels (input files) to a single output channel.
//
//In this example, we will read the file content from two different files and write their combined output into a single separate file.
//In total, we will create three channels:
//We will create two channels for the source file.
//We will create one channel for the destination file.

public class NioExample1 {
    public static void main (String args[]) throws IOException {

        //initializing two files in an array
        String[] inputFiles = {"/Users/Kiran/Downloads/File1.txt","/Users/Kiran/Downloads/File2.txt"};

        // Specify out file with path location
        ////Files contents will be written in these files
        String outputFile = "/Users/Kiran/Downloads/nioOutput.txt";

        //Get channel for destination file
        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for(int i = 0; i < inputFiles.length; i++){
            //get channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();
            //size of input channel
            long size = inputChannel.size();

            ByteBuffer buf = ByteBuffer.allocate((int)size);
            System.out.println((char) buf.get());

            while(inputChannel.read(buf) > 0) {
                buf.flip();
                while(buf.hasRemaining()){
                    System.out.println((char) buf.get());
                    targetChannel.write(buf);
                }
            }
            fis.close();
        }

    }
}
