package Homework.mod_303.GLAB_303_3_2;

import java.util.Scanner;

public class Reading_String_from_Console_2 {
    public static void main(String args[]){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input1.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);

    }
}
