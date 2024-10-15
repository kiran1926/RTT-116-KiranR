package Homework.mod_303.GLAB_303_10_2;

public class Shape {
    private String color;
    protected double area = 1.0;
    protected double base = 1.0;
    protected double width = 1.0;
    protected double height = 1.0;
    protected double radius = 1.0;

    //constructor for shape with only color
    public Shape(String color){
        this.color = color;
    }
    //empty constructor
    public Shape (){

    }
    //constructs a shape instance with the given values

    public Shape(String color, double area, double base, double width, double height) {
        this.color = color;
        this.area = area;
        this.base = base;
        this.width = width;
        this.height = height;
    }

    // setter methods


    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //methods for area and displayName

    public double calculateArea(){
        //we have a problem here
        //we need to return some value to compile the program
        System.out.println("Shape unknown! cannot return area!");
        return 0;
    }
    public void displayShapeName(){
        System.out.println("I am a Shape");
    }

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + '}';
    }
}
