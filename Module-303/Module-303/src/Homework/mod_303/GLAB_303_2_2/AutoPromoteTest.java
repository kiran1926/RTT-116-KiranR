package Homework.mod_303.GLAB_303_2_2;

public class AutoPromoteTest {
    public static void main (String args [] ) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        //Expression:
        double result = (f * b) + ( i / c) - (d * s); // value of c i.e letter a is converted to its ascii value 01100011 whose decimal reprsentation is '97'
        // in f*b b is promoted to float , result of this subexpression is float
        //in i/c, first c is converted to int and the result of this subexpression is int
        //in d*s, s is promote to double and the result of the subexpression is double
        //Result after all the promotions are done
        System.out.println("result = " + result);

    }
}
