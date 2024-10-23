package Homework.mod_303.GLAB_303_10_1.GLAB_303_10_2;

public class Triangle extends Shape{

    //empty constructor
    public Triangle (){
    }
    //constructor with parent values
    //constructpr fro color
    public Triangle(String color) {
        super(color);
    }
    //constructor for rest parameters


    public Triangle(String color, double area, double base, double width, double height) {
        super(color, area, base, width, height);
    }

    public void setBase (double base){
        super.base = base;
    }
    public void setHeight (double height) {
        super.height = height;
    }

    @Override
    public double calculateArea() {
        return (0.5 * base * height);
    }

    @Override
    public void displayShapeName() {
        System.out.println("I am a Triangle");
    }

    @Override
    public String toString() {
        return "Triangle[ base = " + base + ", height = " +height + "," + super.toString() + "]";
    }
}
