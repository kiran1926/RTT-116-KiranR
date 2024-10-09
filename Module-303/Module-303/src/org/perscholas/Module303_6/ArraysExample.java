package org.perscholas.Module303_6;

public class ArraysExample {
    public static void main ( String args []) {

        //this makes a new array of size 10 and all elements will be 0
        int numbers [] = new int [10];

        //print all the elements of the array
        for (int i = 0 ; i < numbers.length; i++) {
            numbers[i] = 1;
            System.out.println("number [" + i+ "] = " + numbers[i]);
        }

        // array by hard coding it
        // this will create a new int array with size of 6
        //and automatically fill the array with the given values
        int [] numbers1 = { 1, 2, 3, 4, 5, 6};

        //this will create an array of size 5 with the given values
        String [] strings = {"One", "two", "three","four","five"};


    }
}
