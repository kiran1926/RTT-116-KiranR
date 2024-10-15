package Homework.mod_303.GLAB_303_10_4;

public abstract class Shape {

    protected String color;
    protected double height;  // To hold height.
    protected double width;  //To hold width
    protected double base;  //To  hold base

    public void setColor(String color) {
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

    // set up an abstract method  calculateArea
    public abstract double calculateArea();


    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayShapeName()
    {
        System.out.println("I am a Shape.");
    }


}
