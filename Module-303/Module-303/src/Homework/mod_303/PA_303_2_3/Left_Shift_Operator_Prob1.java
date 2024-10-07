package Homework.mod_303.PA_303_2_3;

//Write a program that declares an integer a variable x, assigns the value 2 to it,
// and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
// Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
// Before printing the results, write a comment with the predicted decimal value and binary string.
// Now, print out x in decimal form and in binary notation.
//Perform the preceding exercise with the following values: 9, 17, 88

public class Left_Shift_Operator_Prob1 {

    public static void leftShift(int i){
        System.out.println("Binary string version of int is "+ Integer.toBinaryString(i) );
         i <<= 1;
        System.out.println("Value of int after left shift (in decimal) is "+ i);
        System.out.println("Value of int after left shift (in decimal) is " + Integer.toBinaryString(i) +"\n\n");
    }

    public static void main (String args []){
        Integer x = Integer.valueOf(2);
        System.out.println("Binary string version of int x is "+ Integer.toBinaryString(x) );
        x = x << 1; // or we can write x <<= 1;
        // predicted decimal value 4.0  binary string 100
        // left shift operator : binary x is 10, by <<=1, shift 10 to left by 1 position i.e 100, add 0 in the right.
        //100 binary i.e 4
        System.out.println("Value of x after left shift (in decimal) is "+ x);
        System.out.println("Value of int x after left shift (in decimal) is " + Integer.toBinaryString(x) +"\n\n");

        // a. 9
        System.out.println("1. For int a = 9 :");
        leftShift(9);
        //b. 17
        System.out.println("2. For int b = 17 :");
        leftShift(17);
        //c. 88
        System.out.println("3. For int c = 88 :");
        leftShift(88);




        //right shift operator example for practice
        int z = 7;
        System.out.println("value of z in binary " + Integer.toBinaryString(z));
        z >>= 3; //z in 32 bit binary : 00000000 00000000 00000000 00000111
        // shifting 3 places to right i.e adding three 0s in the right -> 000+00000 00000000 00000000 00000000
        System.out.println("value of z in decimal is "+ z);
        System.out.println("value of z in binary is "+ Integer.toBinaryString(z));


        //practice example for Unsigned right shift operator (>>>) - shifts bits to the right and fills the leftmost
        // bits with zeros, regardless of whether number is positive or negative
        //unlike the right shift operator (>>) which preserves the sign bit
        int y = -1;
        System.out.println("Binary y value : "+ Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(y >>> 29));
        System.out.println(y>>>29);
    }
}
