package org.perscholas.Module_303_9;

public class Circle extends Shape{
    //when we

    public static double PI = 3.14159;

    private double radius;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }
}
