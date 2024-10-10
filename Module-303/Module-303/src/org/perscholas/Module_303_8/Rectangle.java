package org.perscholas.Module_303_8;

public class Rectangle {

    // these are considered class members and class variables
    // we are not directly exposing these to the outside world... thus they are private class members
    private int height;
    private int width;

    // constructor shares name with the class name
    // it doesn't have a return type
    //invoke or call only with a new command with new object only

    //this is the constructor and takes no argument
    public Rectangle() {
        // this is run whenever the code contains new Square()
    }

    //this is also a constructor that takes in 2 arguments
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // we use what  are called getters and setters
    //setter
    public void setHeight (int height){
        this.height = height;
    }

    //getter
    public int getHeight() {
        return height;
    }

    // setter


    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth () {
        return width;
    }

    //this method is implemented on all java objects and is used to resturn a string representation of this object
    public String toString(){
        return "Square [width = " + width + " height = "+ height + "]";
        // return type : String
    }

    public int CalculateArea(){
        int p =  height * width;
        notAvailable();
        return p;
    }

    public int CalculatePerimeter() {
        int p = (height + width ) * 2;
        notAvailable();
        return p;
        // int x = 1; this is an example of static code analysis by intellij where it detects
        // un-callable code or dead code
    }

    private void notAvailable (){
        //this is only available within the rectangle class itself
        //not available outside the class
    }
    protected void partlyAvailable() {
        // protected is available to everything this package only
    }
    // default is just protected behaviour


}
