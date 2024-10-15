package org.perscholas.Module303_6;

public class DynamicArray {

    //loc = 01234567890
    //val = 1234567891
    //                0

    public static double [] insert (double[] array , int position, double value){
        //step 1 : make a new array that is of size one larger

        double [] result = new double [array.length + 1];

        //step 2
        //copy all the elements from 0 to the position we insert to the new array
        for ( int i = 0 ; i < position ; i++ ) {
            result[i] = array[i];
        }

        //step 3
        //we set the incoming value at the insert position
        result[position] = value;

        //step 4
        //move all the remaining values at the end of the new array
        for (int i = position +1; i < array.length ; i++){
            result [i] = array[i - 1];

        }
        return result;
    }

    //to delete element : method
    public static double[] delete (double[] array, int position){
        if ( (position >= array.length) || (position < 0) ){
            System.out.println( "Unable to delete element at  "+ position + " because it is not a valid position");
            return array;
        }


        //step 1 is create a new array that is 1 smaller
        double [] result = new double [array.length -1];
        //step 2 move till 6 to new array
        for (int i = 0; i < position; i++) {
            result[i] = array[i];
        }
        //step3 shift remaining value left or back by 1
        for (int i = position + 1; i<array.length; i++){
            result [i - 1] = array [i];
        }

        return result;

    }
    public static double [] append (double[] array, double value){
        double [] result = new double [array.length+1];

        //cstep 2
        for (int i = 0; i < array.length; i++){
            result[i] = array[i];
        }
        //step 3
        result[array.length] = value;

        return result;
    }

//    public static double [] bubbleSort(double[] array){
//        int n = array.length;
//        double result [] = new double[n];
//        for (int i = 0; i < n; i++){
//            for(int j = i +1; j < n; j++){
//
//            }
//        }







    public static void main (String args []){

        double [] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numbers = insert(numbers ,3 , 3.5);
        numbers = delete(numbers , 8); //this will delete the value 7
        numbers = append (numbers, 20);


    }
}
