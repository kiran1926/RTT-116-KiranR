package Homework.mod_303.GLAB_303_10_1.GLAB_303_10_3;

public class MyRunner {
    public static void main ( String args []){
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.calculateArea());

        // Shape sObj = new Shape(); // This will give Error, we can not instantiate Abstract class

        // object creation of the Circle class
        System.out.println("+++++++++++++++++");
        // it’s fine because a Circle is a Shape by inheritance
        Shape c1 = new Circle(100);  // UpCasting
        c1.displayShapeName();
        System.out.println("Area of Circle " + c1.calculateArea());
        System.out.println(c1);  // Run circle's toString()
        // Use instanceof operator for Validation
        System.out.println(c1 instanceof Circle); // true

        System.out.println("+++++++++++++++++");
        Shape r1 = new Rectangle("Red"); //UpCasting
        r1.displayShapeName();
        r1.setHeight(2);
        r1.setWidth(4);
        System.out.println("Area of Rectangle is " + r1.calculateArea());
        System.out.println(r1);  // Run Rectangle's toString()
        // Use instanceof operator for Validation
        System.out.println(r1 instanceof Rectangle); // true

        System.out.println("--------------------");
        Shape t1 = new Triangle("Blue"); //UpCasting
        t1.displayShapeName();
        t1.setHeight(10);
        t1.setBase(15);
        System.out.println("Area of Triangle is " + t1.calculateArea());
        System.out.println();  // Run Triangle's toString()



    }
}
