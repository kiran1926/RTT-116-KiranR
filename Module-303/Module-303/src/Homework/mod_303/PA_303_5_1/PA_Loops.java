package Homework.mod_303.PA_303_5_1;

import java.util.Scanner;

public class PA_Loops {
    public static void main (String args[]) {

        //problem 1 :
        //Print a Multiplication Table
        //Write a program that uses nested for loops to print a multiplication table.
        int table_size = 0;
        Scanner scan = new Scanner(System.in);
        table_size = scan.nextInt();
        for (int i = 1; i <= table_size; i++){
            for (int j =1; j <= table_size; j++){
                System.out.printf("%5d", i * j);
            }
            System.out.println("\n");
        }

        //problem 2 : Greatest common divisor

        int x = 0;
        int y = 0;
        Scanner intscan = new Scanner(System.in);
        x = intscan.nextInt();
        y = intscan.nextInt();
        int gcd = 0;

        int small = 0;
        if ( x < y){
            small = x;
        } else {
            small = y;
        }

        for ( int k = 1; k <= small; k++){
            if ( (x % k == 0) && (y % k == 0 )){
                gcd = k;
            }
        }
        System.out.println(gcd);


        // problem 3 : Predict future tuition

        double tuition = 10000;
        final double RATE = 1.07;
        int year = 0;

        while ( tuition <= 20000){
            tuition = tuition * RATE;
            year++;
        }
        System.out.println(year);

    }
}
