package org.perscholas.M303_12;

import java.util.Locale;

public class ExceptionExample {

    public static void main (String args[]){

        int [] numbers = {1, 2, 3, 4, 5};

        //this will try to access the array at position 10 which does not exist
        //this will throw an exception
        try {

            //ArithmeticException
            //int x = 10 / 0;

            //ArrayOUtOfBoundException
            //System.out.println(numbers[10]);

            //StringIndexOutOfBoundException
            //String s1 = "abc";
            //s1.charAt(10);

            //NullPointerException - most common form of programmer error
            String s2 = null;
            s2.toUpperCase();

            //this line of code will not execute if exception happens in the code above it
            //this is very important to know and very powerful feature of modern programming languages
            System.out.println("This is the last line of the try catch block and will only execute if no problem");

        }catch (ArithmeticException ae) {
            //this is the code for when the divide by 0
            System.out.println("Divide by 0 exception");
        }catch (ArrayIndexOutOfBoundsException aioobe ){
            //specifically catching only ArrayIndexOffBoundsException
            aioobe.printStackTrace();
            System.out.println("====> "+ aioobe.getMessage());
        } catch (Exception e ){
            System.out.println("This is something unexpected"+ e.getMessage());
            e.printStackTrace();
        }finally {
            //finally block is optional
            //this code will execute no matter what
            //in both success or failure
            //often times it is used to clean up or close a resource
            //you need to justify using a finally block with a valid reason
            System.out.println("----finally----");
        }

        // okay to continue with code here
    }
}
