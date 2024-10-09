package Homework.mod_303.GLAB_303_5;

import java.util.Scanner;

// For Loop GLAB

public class GLAB_303_5_1 {
    public static void main(String args[]){
        // example 1 : print a text 5 times
        int n = 5;
        for(int i = 0; i<5; i++){
            System.out.println("Java is fun");
        }

        //example 2 : display sum of n natural numbers from 1 to 1000
        int sum = 0;
        n = 1000;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum = "+ sum);

        //example 3 : Palindrome
        //check if a number is a palindrome (when reversed, represents same number)

        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();
        String reverse = "";

        for (int i = (original.length() - 1); i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("Entered string/number is a palindrom");
        }else{
            System.out.println("Not a palindrome");
        }

        // example 4 : left pyramid

        for (int i = 0; i < 5; i++){
            for(int j = 0; j < i +1; j++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
