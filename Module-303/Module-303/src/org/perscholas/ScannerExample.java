package org.perscholas;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        System.out.print("Enter the radius of circle");

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        //There is an implicit next line character in your text when you hit enter.
        //The scanner doesn’t use that for a double because it isn’t a number.
        //Therefore, if you don’t get rid of it
        //when you attempt to read the next line for a name, it will take in that new line
        //our in
        //scanner.nextLine();

        System.out.println("You entered " + x);

        double area = x * x * 3.14159;

        System.out.println("The area of the circle is " + area);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);

    }
}
