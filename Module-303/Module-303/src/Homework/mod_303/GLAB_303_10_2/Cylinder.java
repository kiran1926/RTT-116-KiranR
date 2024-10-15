package Homework.mod_303.GLAB_303_10_2;

public class Cylinder extends Circle{
    private final double PI = Math.PI;

    public Cylinder(double radius) {
        super(radius);
    }

    //constructor method
    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    //RETURNS A VOLUME OF THIS CYLINDER
    public double getVolume (){
        return (PI * Math.pow(super.radius, 2) * super.height);
    }
    // get surface area
    public double getSurfaceArea(){
        return (2 * PI * super.radius * super.height);
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a cylinder of radius "+ super.radius);
    }
    public String toString() {
        return "radius is: " + super.radius +"height is : " + super.height;
    }
}
