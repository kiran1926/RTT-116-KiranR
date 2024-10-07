package Homework.mod_303.PA_303_2_3;

//Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
// Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1,
// and then print it again.

public class Increment_Operator_Prob6 {
    public static void main(String args[]){

        // ==== Postfix ===== (x++)
        int x = 10;
        System.out.println("value of x before incrementing = " + x);
        x++;
        System.out.println("value of x after first increment = " + x);
        x++;
        System.out.println("value of x after 2nd increment = " + x);

        // ===== Prefix ===== (++x)
        int y = 10;
        System.out.println("value of y before incrementing = " + y);
        ++y;
        System.out.println("value of y after first increment = " + y);
        ++y;
        System.out.println("value of y after 2nd increment = " + y);

        // ===== addition assignment operator ==== (x += 1)
        int z = 10;
        System.out.println("value of z before incrementing = " + z);
        z += 1;
        System.out.println("value of z after first increment = " + z);
        z += 1;
        System.out.println("value of z after 2nd increment = " + z);

    }
}
