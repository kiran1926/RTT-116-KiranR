package Homework.mod_303.PA_303_2_3;

//Write a program that declares a variable x, and assigns 150 to it,
// and prints out the binary string version of the number.
// Now use the right shift operator (>>) to shift by 2 and assign the result to x.
// Write a comment indicating what you anticipate the decimal and binary values to be.
// Now print the value of x and the binary string.
//Perform the preceding exercise with the following values:
//225
//1555
//32456
public class Right_Shift_Operator_Prob2 {

    //creating rightshift method
    public static void rightShift(int i) {
        System.out.println("Value of int i in binary is " + Integer.toBinaryString(i));
        i >>= 2;
        System.out.println("Value of int i in decimal : " + i);
        System.out.println("Value of int i in binary : " + Integer.toBinaryString(i) +"\n");
    }

    public static void main(String args[]) {

        //exapmle
        int x = 150;
        System.out.println("Value of x in binary is " + Integer.toBinaryString(x));
        x >>= 2;
        //prediction in decimal = 37; in binary = 100101;
        System.out.println("Value of x in decimal : " + x);
        System.out.println("Value of x in binary : " + Integer.toBinaryString(x) +"\n");

        //a. 225
        System.out.println("1. For int a = 225 :");
        rightShift(225);
        //b.1555
        System.out.println("1. For int b = 1555 :");
        rightShift(1555);
        //c.32456
        System.out.println("1. For int c = 32456 :");
        rightShift(32456);

    }
}
