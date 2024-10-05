package org.perscholas;

public class WrapperClassesExample {

    //method created for converting to integer
    public static void autobox(Integer x){
        System.out.println("Function called with " + x);
    }

    //method for converting to boolean
    public static void booleanAutobox(Boolean b){
        System.out.println("FUnction called with: " +b);
    }

    public static void main( String args []) {
        int x = 5;

        //this is autoboxing- the compiler i.e JVM automatically convert between primitive datatypes and wrapper calss
       Integer y = x;

       //this is manually converting a primitive int to a wrapper class
        Integer z = Integer.valueOf(x);

        // call the function
        autobox(5);
        autobox(y);
        autobox(z);

        //all the java objects can be null
        Integer k = null;
        //a primitive can not be null
        //int i = null;

        Boolean b1 = true;
        boolean b2 = false;
        booleanAutobox(b1);
        booleanAutobox(b2);

    }
}
