package org.perscholas.M303_13;

import java.io.File;

public class FileExample {

    public static void main (String args[]){
        //main constructor usage is the name of the file
        //this can include  a partial path or the full path
        //

//        File file = new File(".gitignore");
//
//        System.out.println(file.getAbsoluteFile());
//        System.out.println("is directory ? "+ file.isDirectory());
//        System.out.println("is hidden "+ file.isHidden());

        File absolute = new File("/Users/Kiran/Development/RTT-116-Classwork/Module-303/Module-303/src");

        //relative - starts is the current working directory and goes from there
        File file = new File("src");

        System.out.println(file.getAbsoluteFile());
        System.out.println("exists "+ file.exists());
        System.out.println("is directory ? "+ file.isDirectory());
        System.out.println("is hidden "+ file.isHidden());
        System.out.println("can read "+ file.canRead());
        System.out.println("can write "+ file.canWrite());
        System.out.println("can execute "+ file.canExecute());
        System.out.println("size "+ file.length());
        System.out.println("URI "+ file.toURI());

        if (file.isDirectory()){
            //lets list the files in this directory
            File[] files = file.listFiles();
            for (File f : files){
                System.out.println("====> " + f.getName());
            }
        }

        //example for creating new directory
        File newDirectory = new File("asdf");
        //make a new directory

        if (! newDirectory.mkdir()){            // checks and prevents an error or making dir of same name
            newDirectory.mkdir();
        }
        //newDirectory.delete();

    }
}
