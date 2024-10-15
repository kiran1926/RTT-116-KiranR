package Homework.mod_303.GLAB_303_10_2;

public class Circle extends Shape{
    protected double radius;
    private final double PI= Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle (double radius, double height){
        this.radius = radius;
        super.height = height;
    }

    // generate area
    public double calculateArea (){
       // double area = Math.PI * this.radius * this.radius;
       // return area;
        // or by initializing value in parent class variable
        super.area = Math.PI * Math.pow(this.radius, 2);
        return super.area;
    }

    public void displayShapeName(){
        System.out.println("Drawing a Circle of radius "+ this.radius);
    }
    //returns a self-descriptive string


    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }
}
