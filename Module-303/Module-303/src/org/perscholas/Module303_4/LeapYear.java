package org.perscholas.Module303_4;

public class LeapYear {
    public static void main( String args []){
        // leap year problem
        int year = 2024;
        if ( ((year % 4 == 0) && (year % 100 != 0)) || ( year % 400 == 0) ) {
            System.out.println( "Leap year "+ year);
        } else {
            System.out.println("not a leap year "+ year);
        }
    }
}
