package org.perscholas.Module_303_9;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CalcRunner {
    public static void main(String args[]){
        Circle c = new Circle();
        c.setRadius(10.0);
        c.setName("Circle");

        Circle c1 = new Circle();
        c1.setRadius(15.0);
        c1.setName("Circle1");

        Triangle t = new Triangle();
        t.setBase(10.0);
        t.setHeight(10.0);
        t.setName("Triangle");


        //anonymous code block//module 303.14
        Shape sq = new Shape(){

            @Override
            public double calculateArea() {
                return 0;
            }

            @Override
            public double calculatePerimeter() {
                return 0;
            }
        };
        sq.setName("Square");

        // we can no longer create or instantiate new shape because we dceclared shape as abstract class now
        // Shape s = new Shape();


        //make a list of shapes but notice that we are using the parent shape
        // in an indirect way, when we add individual shapes to this list , they are automatically being
        // typecasted to a shape
        List <Shape> shapes = new ArrayList<>();
        shapes.add(c);
        shapes.add(c1);
        shapes.add(t);

        //lets loop over  all the sahpes and calculate the area
        for ( Shape s : shapes) {
            double area = s.calculateArea();
            double perimeter = s.calculatePerimeter();

            //

            if ( s instanceof Triangle){
                System.out.println("s is instance of Triangle");
            }
            System.out.println("The area for shape "+ s.getName() + " is "+ area);
            System.out.println("The perimeter for shape "+ s.getName() + " is "+ perimeter);
        }


    }
}
