package org.perscholas;

public class TypeCasting {
    public static void main(String args []) {
        int x = 7;
        int k = 2;

        // normal int calculation
        int y = x / 2;
        System.out.println("Y = " + y);

        //assigning to a float datatype variable t
        float t = x / 2;
        System.out.println("T = " + t);

        //with using values in double form in equation
        double z = 7.0 / 2.0;
        System.out.println("Z = " + z);

        //with typecasting
        double d = (double) x / (double) k ;
        System.out.println("D = " + d);

    }
}
