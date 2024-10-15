package Homework.mod_303.PA_303_4_1;

import java.util.Scanner;

public class Conditionals_Prob1 {
    public static void main (String args[]) {
        //problem 1
        int x = 15;
        if (x < 10){
            System.out.println("Less than 10");
        }

        // problem 2
        x = 15;
        if (x < 10){
            System.out.println("less than 10");
        } else if (x > 10){
            System.out.println("greater than 10");
        }

        //prob 3
        x =15;
        if (x < 10){
            System.out.println("less than 10");
        } else if (x >10 && x < 20){
            System.out.println("between 10 & 20");
        } else {
            System.out.println("greater than 20");
        }

        //prob 4
        x =15;
        if (x < 10 || x > 20){
            System.out.println("out of range");
        } else if (x >10 && x < 20){
            System.out.println("in range");
        }

        // prob 5
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();

        if (score < 0 || score > 100){
            System.out.println("Score out of range");
        } else if (score >= 90 && score <= 100){
            System.out.println("Grade: A ");
        } else if (score >= 80 && score <= 89){
            System.out.println("Grade: B ");
        } else if (score >= 70 && score <= 79){
            System.out.println("Grade: C ");
        } else if (score >= 60 && score <= 69){
            System.out.println("Grade: D ");
        } else if ( score < 60) {
            System.out.println("Grade: F ");
        }

        // problem : 6
        //Write a program that accepts an integer between 1 and 7 from the user.
        // Use a switch statement to print out the corresponding weekday.
        // Print “Out of range” if the number is less than 1 or greater than 7.
        // Do not forget to include “break” statements in each of your cases.

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter an integer between 1 & 7 inclusive: ");
        int num = input1.nextInt();

        //if ( num < 1 || num > 7){
            //System.out.println("Out of range");}

        switch ( num ) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }


        // Problem 7
        //Create a program that lets the users input their filing status and income.
        // Display how much tax the user would have to pay according to status and income.








    }
}
