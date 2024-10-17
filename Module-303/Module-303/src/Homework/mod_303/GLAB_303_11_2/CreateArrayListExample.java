package Homework.mod_303.GLAB_303_11_2;
//Example 1: Creating an ArrayList and Adding New Elements
//This example shows:
//How to create an ArrayList using the ArrayList() constructor.
//How to add new elements to an ArrayList using the add() method.

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

    public static void main(String args[]){
        //creating an ArrayList of String

        List<String> animals = new ArrayList<>();
        //adding new elements to arraylist
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Tiger");
        System.out.println(animals);

        //adding an element at a particular index in an ArrayList
        animals.add(2,"Elephant");
        System.out.println(animals);
    }
}
