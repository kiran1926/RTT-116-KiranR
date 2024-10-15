package org.perscholas;

public class SBAReview {
    public static void main ( String args[]){

        double [] numbers = {4.3, 5.6, 7.2, 1.4, 5.2, 9.8};
        double sum = 0.0;
        // for each loop
        for ( double num : numbers){
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.println("average : " + average);
    }
}
