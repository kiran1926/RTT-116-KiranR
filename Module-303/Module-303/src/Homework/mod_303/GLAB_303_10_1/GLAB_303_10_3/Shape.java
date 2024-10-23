package Homework.mod_303.GLAB_303_10_1.GLAB_303_10_3;

public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;

    //constructor


    //setter methods
    public void setColor(String color){
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //abstract method calculateArea
    //it must be overridden in a subclass
    //all shapes must provide a method called calculateArea()

    public abstract double calculateArea();

    //returns a self descriptive string

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public void displayShapeName(){
        System.out.println("I am a shape");
    }
}
