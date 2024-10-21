package Homework.mod_303.HackerRank;

import java.util.Enumeration;
import java.util.Scanner;

public class FourthBIt {

    public static int fourthBit (int number){
        String binary = "";
        while (number != 0){
            int remainder = number%2;
            binary = Integer.toString(remainder) + binary;
            number= number/2;

        }
        System.out.println("Binary Number: "+ binary);
        char c = binary.charAt(binary.length() - 4);
        int fourth = c;
        if (fourth == 48){
            fourth = 0;
        }else{
            fourth = 1;
        }
        return fourth;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();
        System.out.println(fourthBit(num));



        //Parse int practice
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i);
        int r = Integer.valueOf(s);
        System.out.println(r);
        String str = "abc";
        System.out.println(Integer.parseInt(s));
//        System.out.println(Integer.parseInt(str));
//        System.out.println(Integer.valueOf(str));
//        System.out.println(Integer.valueOf(str.charAt(1)));

    }
}
