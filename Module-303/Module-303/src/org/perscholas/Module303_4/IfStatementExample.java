package org.perscholas.Module303_4;

public class IfStatementExample {
    public static void main(String args[]){

        double radius = 15;
        if ( radius > 20 ) {
            System.out.println("Radius greater than 20");
        } else if ( radius > 10 ) {
            System.out.println("Radius greater than to 10");
        } else {
            System.out.println("Radius less than or equal to 10");
        }

        System.out.println("Done");


        // ====== booleans =====
        // if teh boolean is set to true then if not specified if statement will always be checking if true
        boolean save = true;
        if ( save ) {
            //the same as saying if ( save == true)
            //this will execute when the boolean is true
        }
        //this is the condition where save == false
        if ( !save ) {
            // the same as saying if ( save == false)
        }

        // ===== Compound conditionals =====
        // in addition,short circuiting : means in this case if save is false the JVM will not even evaluate the radius
        if  ( save && (radius == 50)) {
            // both conditions are true
        } else {
            // one condition or the other is false or both are false
        }

        //this too will short circuit
        //means in this case if save is true the JVM will not even evaluate the radius it will execute here
        //75 % of the times if has 2 statements inside (eg. 1.save 2. radius == 50)
        if ( save || (radius == 50) ) {
            //if either condition or both are true then execute here
        } else {

        }

        // leap year problem
        int year = 2024;
        if ( ((year % 4 == 0) && (year % 100 != 0)) || ( year % 400 == 0) ) {
            System.out.println( "Leap year "+ year);
        } else {
            System.out.println("not a leap year "+ year);
        }

        // grades
         int grade = 30;
        if ( grade >= 90) {
            System.out.println("A");
        } else if ( grade >= 80){
            System.out.println("B");
        } else if (grade >= 70){
            System.out.println("C");
        } else if (grade >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //case statement / switch statement
        switch (grade) {
            case 90 :
                System.out.println("You got A");
                break;
            case 80 :
                System.out.println(" YOu got B");
                break;
            case 70 :
                System.out.println("You got C");
                break;
            case 60 :
                System.out.println("you got D");
                break;
            case 50 :
                System.out.println("F");
                break;
            default:
                System.out.println("Below F");

        }

    }
}
