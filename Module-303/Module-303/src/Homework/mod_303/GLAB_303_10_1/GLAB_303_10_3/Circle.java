package Homework.mod_303.GLAB_303_10_1.GLAB_303_10_3;

public class Circle extends Shape{
    protected double radius;
    private final double PI = Math.PI;

    //constructor for radius
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }

    @Override
    public double calculateArea() {
        double area = PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Circle of radius "+ this.radius);
    }


    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }
}
