package org.perscholas;

public class IncrementVariables {
    public static void main(String [] args) {
        int a = 20;
        int b = 10;
        int c = 0;
        int d = 20;
        int e = 40;
        int f = 30;

        int result = -a; // result is now -20
        System.out.println(result); //-20

    // b++ is a post operation meaning first we assign the value of b to c and then increment
        c = b++;
        System.out.println("Value of c (b++) : c = " + c + " and b = " + b );
    //Value of c (b++) = 10
    // ++a is a pre operation meaning first we increment the value and then assign a to c
        c = ++a;
        System.out.println("Value of c (++a) : c = " + c + " and a = " + a );
    //Value of c (++a) = 21

    }
}
