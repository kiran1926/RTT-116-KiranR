package org.perscholas.Module_303_7;

import java.util.Arrays;

public class ArraysUtilExample {
    public static void main (String args []){

        // !!!!!! SBA initializing players to -1
        //this line creates a new array of size 10
        double[] dValues = new double[6];

        //this utility fills all the values of the array with 50.0
        Arrays.fill(dValues, 50.0);

        // print the entire array
        System.out.println(Arrays.toString(dValues));

        // copying using system class; can copy a portion of a given string
        double [] arr = {13, 7, 6, 45, 21, 34, 12};
        double[] arr1 = new double[6];
        System.arraycopy(arr, 3, arr1, 3, 2);
        System.out.println(Arrays.toString(arr1));
    }
}
