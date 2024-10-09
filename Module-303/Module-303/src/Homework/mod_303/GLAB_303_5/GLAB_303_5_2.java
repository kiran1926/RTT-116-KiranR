package Homework.mod_303.GLAB_303_5;

//While Loop GLAB

import java.util.Scanner;

public class GLAB_303_5_2 {
    public static void main(String args[]) {

        // example 1 : Guess the number
        //Generate a random number to be guessed
        //Write a program that randomly generates an integer between 0 and 100, inclusive.
        // The program should prompt the user to enter a number repeatedly
        // until the number matches the randomly generated number.
        //For each user input, the program tells the user whether the input is too low or too high.
        //When the user discovers the correct answer, the program outputs a congratulatory message,
        // and then provides the user with the opportunity to play again.

        int random = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        int guess = -1; // start with incorrect input
        while (guess != random) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            if (guess == random) {
                System.out.println("Congratulations! Your guess is correct " + random);
            } else if (guess < random) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }
        }

        // example 2 : An advanced math tool
        //Write a program that generates five single-digit integer subtraction problems.
        //Using a while loop, prompt the user to answer all five problems.
        //After all of the answers are entered, report the number of the correct answers.
        // Offer the user the opportunity to play the game again.

        final int NUMBER_OF_QUESTIONS = 5;
        Scanner input1 = new Scanner(System.in);
        String output = "";
        int count = 0;
        int correctCount = 0;

        while (count < NUMBER_OF_QUESTIONS) {
            //step 1: generate 2 random numbers
            int num1 = (int) (Math.random() * 100);
            int num2 = (int) (Math.random() * 100);
            //step 2: swap numbers if reqd
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            // perform subtraction
            System.out.println("What is " + num1 + " - " + num2);
            int answer = input1.nextInt();
            if (answer == (num1 - num2)) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong. \n" + num1 + " - " + num2 + " should be " + (num1 - num2));
            }
            count++;

        }
        System.out.println("Correct answers : " + correctCount);


        // example 3 : Controlling a loop with a sentinel value
        //Write a program that reads and calculates the sum of an unspecified number of integers.
        // The input 0 signifies the end of the input.
        //If data is not 0, it is added to the sum, and the next input data are read.
        // If data is 0, the loop body is not executed, and the while loop terminates.
        //If the first input read is 0, the loop body never executes, and the resulting sum is 0.

        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter an int value (the program exits if the input is 0): ");
        int number = input2.nextInt();
        int addition = 0;

        while (number != 0) {
            addition += number;
            System.out.println("Enter an int value (the program exits if the input is 0): ");
            number = input2.nextInt();
        }
        System.out.println("The addition is " + addition);


        // Example 1: Guess the number
//        Scanner scan = new Scanner(System.in);
//        int random = scan.nextInt();
//        while ((random < 0) || (random > 100)){
//            if (random < 0 ){
//                System.out.println("Entered number is too low");
//            } else if ( random > 100){
//                System.out.println("Entered number is too high");
//            }
//            random = scan.nextInt();
//        }
//        System.out.println("Congratulations! Entered number "+ random +" is valid.");


    }
}
