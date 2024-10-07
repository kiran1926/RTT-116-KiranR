package org.perscholas.Module303_5;

import java.util.ArrayList;
import java.util.List;

public class ForLoopsExamples {
    public static void main(String args[]){

        //for loop - this is original 1970s for loop, it works great for when you wantr to count or
        // do something a set number of times
        //also good for positioning within an array or string

        //counting up
        for(int count = 1; count<=10; count++){
            System.out.println("For loop iteration " + count);
        }
        //counting down
        for(int count = 10; count>=1; count--) {
            System.out.println("For loop iteration " + count);
        }

        //the array is 0 indexed .. so that means the positions int the array are from 0 to 4
        String [] strings = {"One", "two", "three","four","five"};

        //old for loop
        for (int i = 0; i < strings.length; i++){ //note that array.length is used without ()
            System.out.println("Strings at position "+ i + " = "+ strings[i]);
        }

        // NEW STYLE for loop for array
        for (String s : strings){
            System.out.println("new style for loop for an array "+ s);
        }


        //looping over the characters in a string
        //                   0123456
        String characters = "abcdefg";

        for ( int i = 0; i < characters.length(); i++){ //note that string.length() does use the ()
            System.out.println("Character at position "+ i + " = "+ characters.charAt(i));
        }

        //looping over a List
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five"); //boundary condition another way : i < stringList.size() - 1
        for (int i = 0; i < stringList.size() ; i++){  //note that .size() to get the number of elements in that list
            System.out.println("String at List position "+ i + " = "+ stringList.get(i)); //.get function to get
            //element of the list by its position
        }


        // ====== new style for loop for List =====
        //this for loop is easier to type & read but does not contain the position in the list that each item came from
        //which is okay in lots of cases
        for ( String str : stringList ){ // for ( dataType item : array) {
            System.out.println("New style for loop "+ str);
        }


    }
}
