package Homework.mod_303.GLAB_303_10_3;

public class Triangle extends Shape{

    //constructor 1
    public Triangle(){

    }
    //constructor 2
    public Triangle(String color) {
        super.color = color;
    }
    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        double area = 0.5 * super.base * super.height;
        return area;
    }

    @Override
    public String toString() {
        return "Triangle[base=" + super.base + ",height=" + super.height + "," + super.toString() + "]";
    }

    @Override
    public void displayShapeName() {
        System.out.println("I am a Triangle"  );

    }
}
