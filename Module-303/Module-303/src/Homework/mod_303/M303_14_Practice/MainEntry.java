package Homework.mod_303.M303_14_Practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MainEntry {
    public static void main (String args[]) {
        //taking input series of numbers from user

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers separated by space: ");
        String input = scan.nextLine();
        String[] tokens = input.split(" ");
        Integer[] numbers = new Integer[tokens.length];

        for(int i =0; i< tokens.length; i++){
            numbers[i] = Integer.parseInt(tokens[i]);
        }

        //TODO Page 19 of Slide deck 303.14 Functional prog interface name Calc

    }

}
