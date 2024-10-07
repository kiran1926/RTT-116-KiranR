package Homework.mod_303.PA_303_2_3;

//Write a program that declares an integer variable, assigns a number,
// and uses a postfix increment operator to increase the value.
// Print the value before and after the increment operator.

public class Postfix_Increment_Operator {
    public static void main ( String args[]){
        int x = 20;
        // Print the value before the increment
        System.out.println("value of x before increment operator : "+ x);
        // Use the postfix increment operator
        int y = x++;
        // Print the value after the increment
        System.out.println("value of x after increment operator : "+ x);

        System.out.println("value of y (value is assigned before increment) after increment operator : "+ y);
        //Initially, x is 20.
        //After the statement y = x++, the value of x is first assigned to y (so y becomes 20),
        // and then x is incremented (so x becomes 21).

    }
}
