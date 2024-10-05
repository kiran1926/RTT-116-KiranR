package Homework.m303_2.GLAB_303_2_2;

//Implicit typecasting aka automatic type conversion

public class AutoTypeConversion {
    public static void main ( String args[]) {
         int x = 20;
         double y = 40.5;
         long p = 30;
         float q = 10.60f;
         //int z = x + y ; (1) Error; can't convert from double to int
          double z = x + y;
          System.out.println("Sum of two numbers: "+ z);

          //long r = p - q; // (2) Error cannot convert from float to long
        float r = p - q;
        System.out.println("Subtraction of two numbers: " + r);

    }
}
