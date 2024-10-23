package Homework.mod_303.GLAB_303_10_1.GLAB_303_10_4;

public class Circle extends Shape implements Movable{
    protected double radius;
    private int x, y;   // x and y coordinates of the point
    private final double PI = Math.PI;


    //constructor 1
    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    //constructor 2
    public Circle(double radius) {
        this.radius = radius;
    }
    //constructor 3
    public Circle(double radius, double height){
        this.radius = radius;
        super.height =height;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String getCoordinate() {
        return  "(" + x + "," + y + ")";
    }

    @Override
    public double calculateArea() {
        double area = PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() +  "] ";
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

}
