package org.perscholas.Module_303_9;

public class RunnerShape {
    public static void main ( String args[]){

        Circle c = new Circle();
        c.setRadius(10.0); //this method is implemented in circle class
        c.setName("Circle"); // this is implemented in shape class
        c.setPI(4);
        System.out.println(c.getRadius()  + " & " + c.getPI());


        //new circle
        Circle c1 = new Circle();
        c1.setRadius(10.0); //this method is implemented in circle class
        c1.setName("Circle"); // this is implemented in shape class

        System.out.println(c1.getRadius()  + " & " + c1.getPI());

        c1.setPI(5);

        System.out.println("the circle c = " + c.getPI() + " the circle c1 = " + c1.getPI());

       // t.setRadius() only available to class circle

        Triangle t = new Triangle();
        t.setBase(10);
        t.setHeight(15);
        t.setName("Triangle");
    }
}
