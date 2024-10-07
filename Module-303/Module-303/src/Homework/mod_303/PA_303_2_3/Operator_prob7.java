package Homework.mod_303.PA_303_2_3;

//Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
// Create another variable sum and assign the value of ++x added to y, and print the result.
// Notice the value of the sum (should be 14).Now change the increment operator to postfix (x++) and re-run the program.
// Notice what the value of the sum is. The first configuration incremented x,
// and then calculated the sum, while the second configuration calculated the sum, and then incremented x.

public class Operator_prob7 {
    public static void main (String args[]){
        int x = 5;
        int y = 8;
        int sum = ++x + y;
        System.out.println("prefix operator");
        System.out.println("The result is : " + sum);
        //This configuration incremented x (x=6) first, & then calculated the sum (6+8 = 14)

        //postfix operator x++
         x = 5;
         y = 8;
         sum = x++ + y;
        System.out.println("postfix operator");
        System.out.println("The result is : " + sum);
        //This configuration calculated the sum (5+8 =13), and then incremented x (x=6).
    }
}
