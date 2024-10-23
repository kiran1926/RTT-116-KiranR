package Homework.mod_303.GLAB_303_10_1.GLAB_303_10_2;

public class Rectangle extends Shape{

    //from parent class constructor
    public Rectangle (String color) {
        super(color);
    }
    //empty constructor
    public Rectangle(){

    }
    //Rectangle constructor with parent properties

    public Rectangle(String color, double area, double base, double width, double height) {
        super(color, area, base, width, height);
    }


    //setter methods for rectangle

    @Override
    public void setBase(double base) {
        super.base = base;
    }

    @Override
    public void setWidth(double width) {
      super.width = width;
    }

    @Override
    public double calculateArea() {
        super.area = super.base * super.height;
        return super.area;
    }

    //perimeter
    public double perimeter (){
        return ( 2 * (super.base + super.height));
    }

    //overriding displayShapeName
    @Override
    public void displayShapeName() {
        System.out.println(" I am a Rectangle");
    }


    public String toString() {
        return "Rectangle[height = " + height + ",width = " + width + "," + super.toString() + "]";
    }
}
