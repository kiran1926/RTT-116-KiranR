package org.perscholas.Module_303_8;

public class Runner {
    public static void main ( String args[]) {

        Rectangle r1 = new Rectangle(); //instantiation, invoking constructor tp create new object
        // with new word i.e instantiation //constructor 1 with no argument
        System.out.println(r1.toString());
        System.out.println("The area is "+ r1.CalculateArea());
        r1.setHeight(30);
        r1.setWidth(15);


        //this is an error because the function is set to private
        // r1.notAvailable();

        //this is okay because Runner and Rectangle are in the same package
        r1.partlyAvailable();

        Rectangle s2 = new Rectangle(10, 20); //constructor with argument
        System.out.println(s2.toString());
        System.out.println("The area is "+ s2.CalculateArea());

    }
}
