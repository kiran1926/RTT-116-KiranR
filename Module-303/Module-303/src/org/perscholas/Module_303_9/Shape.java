package org.perscholas.Module_303_9;

public abstract class Shape implements AreaCalculation {
    //this is also called Superclass
    // in Calcrunner we can also say super.getName()

    // you have 2 different technique for accomplishing polymorphic behaviour
    //1 is by using an interface and allowing the child classes to provide the implementation
    //2 is by usig an abstract method that allows child classes to provide the implementation

    private String name;

    // this is anpther way of declaring that the children must implement
    //abstract methods must be implemneted by the children
    public abstract double calculatePerimeter();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

