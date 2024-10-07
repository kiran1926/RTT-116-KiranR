package Homework.mod_303.PA_303_2_3;

//Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
// Write a comment that indicates what you predict will be the result of the "bitwise AND" operation on x and y.
// Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.

public class Bitwise_Operator_Prob3_Prob4 {
    public static void main (String args[]){

        // ======== Problem 3 ==========
        int x = 7; //111
        int y = 17; //10001
        int z = x & y; //00001 -> decimal : 1
        System.out.println("Bitwise \"AND\" :");
        System.out.println("value of z after Bitwise AND operation in decimal "+ z);
        System.out.println("value of z after Bitwise AND operation in binary "+ Integer.toBinaryString(z) + "\n");


        // ========= Problem 4 =========
        //Now, with the preceding values, use the bitwise "AND" operator to calculate the “OR” value between x and y.
        // As before, write a comment that indicates what you predict the values to be before printing them out.
        //00111
        //10001
        //prediction in binary = 10111 in decimal = 23 i.e.(1+2+4+16)
        z = x | y;
        System.out.println("Bitwise \"OR\" :");
        System.out.println("value of z after Bitwise AND operation in decimal "+ z);
        System.out.println("value of z after Bitwise AND operation in binary "+ Integer.toBinaryString(z));

    }
}
