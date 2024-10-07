package Homework.mod_303.GLAB_303_3_1;
import java.io.*;
import java.util.*;
public class SplitExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here
        String [] tokens = s.split("[A-Za-z !,?._'@]+");
        System.out.println(Arrays.toString(tokens));
        scan.close();
    }
}

