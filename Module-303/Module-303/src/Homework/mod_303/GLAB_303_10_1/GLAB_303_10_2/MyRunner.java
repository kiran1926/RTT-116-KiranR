package Homework.mod_303.GLAB_303_10_1.GLAB_303_10_2;

public class MyRunner {
    public static void main (String args []){

        Circle c = new Circle(100);
        System.out.println("Area of Circle "+ c.calculateArea());

        //Object typecasting
        //declaration of object variable obj of the shape classs
        //Shape obj ; object creation of the shape class
        Shape sObj = new Shape();
        sObj.displayShapeName();
        System.out.println(sObj instanceof Shape);

        //object creation of the Circle class
        System.out.println("+++++++");

        Shape c1 = new Circle(10);
        c1.displayShapeName();
        System.out.println("Area of circle "+c1.calculateArea());
        System.out.println(c1);
        System.out.println(c1 instanceof Circle);

        System.out.println("--------------");
        Shape r1 = new Rectangle("Red");
        r1.displayShapeName();
        r1.setHeight(2);
        r1.setWidth(2);
        System.out.println("Area of Rectangle is "+ r1.calculateArea());
        System.out.println(r1);
        System.out.println(r1 instanceof Rectangle);
        System.out.println(sObj instanceof Rectangle);


        System.out.println("--------------------");
        Shape t1 = new Triangle("Blue"); //UpCasting
        t1.displayShapeName();
        t1.setHeight(2);
        t1.setBase(3);
        System.out.println("Area of Triangle is " + t1.calculateArea());
        System.out.println(t1);  // Run Triangle's toString()

        // Use instanceof operator for Validation
        System.out.println(t1 instanceof Triangle); // true
        System.out.println(sObj instanceof Triangle); // false because Shape is not a Triangle
        System.out.println("--------------------");

        Cylinder cylinder1 = new Cylinder(3); //UpCasting
        cylinder1.displayShapeName();
        cylinder1.setHeight(3);
        System.out.println("Area of Cylinder is " + cylinder1.getVolume());
        System.out.println(cylinder1);  // Run cylinderShape's toString()



    }
}
