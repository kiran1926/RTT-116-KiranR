package Homework.mod_303.GLAB_303_2_2;

//Explicit Typecasting (Narrowing conversion)
//The process of converting lower data types into higher data types is called widening or narrowing conversion in java
public class ExplicitTest {
    public static void main(String  args []) {
        double d = 100.04;
        //explicit type casting
        long l = (long)d;
        int i = (int)l ;
        System.out.println("double value "+ d);
        System.out.println("Long value "+ l);
        System.out.println("Int value "+ i);

        byte b;
        int z = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        b = (byte) z;
        System.out.println("z = " + z + " b = " + b); // read expla^n below. (257 mod 256) = 1
        System.out.println("Conversion of double to int.");

        z = (int) dou;
        System.out.println("dou = " + dou + " b = "+ z);
        System.out.println("Conversion of double to byte.");

        b = (byte) dou;
        System.out.println(" dou = " + dou + " b = " + b); //output is 67 why? as a byte is a signed value (-128 to 127)
        //which is 256. So anything higher or lower number needs to be adjusted when converting to byte.
        //so 323.142 first converted to an int, then (323 - 256 = 67) hence 67 is b (323 mod 256)


    }
}
