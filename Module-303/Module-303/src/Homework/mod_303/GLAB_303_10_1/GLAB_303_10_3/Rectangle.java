package Homework.mod_303.GLAB_303_10_1.GLAB_303_10_3;

public class Rectangle extends Shape{

    //constructor methods
    public Rectangle(String color) {
        super.color = color;
    }

    // constructor method
    public Rectangle(String color, double height, double width) {
       super.height = height;
       super.width = width;
       super.color = color;
    }

    @Override
    public double calculateArea() {
        double area = super.height * super.width;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";

    }

    @Override
    public void displayShapeName() {
        System.out.println("I am a Rectangle"  );
    }
}
