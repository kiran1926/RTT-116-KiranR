package Homework.mod_303.GLAB_303_13_2;

//As in normal Java applications, where IO happens mostly between an input source and an output target, it happens in NIO as well, and we may need to transfer data from one channel to another channel frequently.
//Bulk transfers of file data from one place to another are so common that a couple of optimization methods have been added to the FileChannel class to make it even more efficient.
//Data Transfer between Channels
//Java NIO provides two methods for transferring the data between two channels:
//FileChannel.transferTo()
//FileChannel.transferFrom()
//
//
//The transferTo() and transferFrom() methods allow us to cross-connect one channel to another. This eliminates the need to pass the data through an intermediate buffer.
//These methods exist only in the FileChannel class; therefore, one of the channels involved in a channel-to-channel transfer must be a FileChannel.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo {
    public static void main (String args[]) throws IOException {

        //input files
        String[] inputFiles = {"/Users/Kiran/Downloads/File1.txt", "/Users/Kiran/Downloads/File2.txt"};

        //files contents will be written in these files

        String outputFile = "/Users/Kiran/Downloads/OutputExample2.txt";

        //get channel for output file
        FileOutputStream fos = new FileOutputStream(outputFile);
        //FileChannel targetChannel = fos.getChannel();
        WritableByteChannel targetChannel = fos.getChannel();
        for (int i = 0; i < inputFiles.length; i++ ){

            //get channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //close the input channel
            inputChannel.close();
            fis.close();
        }

        //finally close the target channel
        targetChannel.close();
        fos.close();




    }


}
