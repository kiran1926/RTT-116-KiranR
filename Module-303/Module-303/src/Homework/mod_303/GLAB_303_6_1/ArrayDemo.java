package Homework.mod_303.GLAB_303_6_1;

import java.util.Scanner;

public class ArrayDemo {
    public static void main (String args []) {

        // problem 1 : Access Array Elements

        int [] age = {12, 4, 5, 2, 5};
        //access each array element
        System.out.println("Accessing Elements of an Array: ");
        System.out.println("First Element: " + age[0] );
        System.out.println("Second Element: " + age[1] );
        System.out.println("Third Element: " + age[2] );
        System.out.println("Fourth Element: " + age[3] );
        System.out.println("Fifth Element: " + age[4] );

        // problem 2 : Using for loop

        // create an array
        int [] age1 = {12, 4, 5};
        //loop through the array
        System.out.println("Using for loop");
        for(int i = 0; i < age1.length; i++) {
            System.out.println(age1[i]);
        }

        // problem 3 :  Iterating Over an Array using EnhancedForLoop
        String [] names = {"New York", "Dallas", "Las Vegas", "Florida"};
        for (String name : names){
            System.out.println(name);
        }

        // Problem 4 :
        //Compute the Sum and Average of Array Elements

        int [] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        double sum = 0;
        Double average;

        // access all elements using for each loop
        //add each element in sum
        for (int number: numbers ){
            sum = sum + number;
        }
        // average of numbers in the array
        average = sum / numbers.length ;
        System.out.println(" Sum = " + sum + " \n Average = " + average);

        // problem 5 :Mean and Standard deviation

        int [] marks = {74, 43, 58, 60, 90, 64, 70};
        double mean = 0;
        double sum1 = 0;
        double stdDev = 0;
        double sumSq = 0;

        for ( int i = 0; i < marks.length; i++) {
            sum1 += marks[i];
        }
        mean = sum1 / marks.length ;
        for (int mark : marks) {
            stdDev +=  Math.pow((mark - mean), 2);
        }
        stdDev = Math.sqrt( stdDev / marks.length);
        System.out.println("Mean = " + mean);
        System.out.println(" Standard Deviation = " + stdDev);
        // square root of ( ∑ ( Xi – ų ) ^ 2 ) / N, where:
        //
        //∑ is the sum of each element
        //Xi is each element of the array
        //ų is the mean of the elements of the array
        //N is the number of elements

        // or use this method :
        // Compute sum and square-sum using loop
        //       for (int i = 0; i < marks.length; ++i) {
        //           sum += marks[i];
        //           sumSq += marks[i] * marks[i];
        //       }
        //       mean = (double)sum / marks.length;
        //       stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean); // Formula



        // problem 6 : Insert an Element at the end of an Array in Java

        int element = 0;
        int [] arry = new int[11];
        Scanner scan = new Scanner(System.in);

        // input for first 10 elements
        System.out.println("Enter 10 integer elements : ");
        for (int i = 0; i < (arry.length - 1); i++){
            arry[i] = scan.nextInt();
        }

        // insert 11 th element
        System.out.println("Enter an element to Insert: ");
        arry[10] = scan.nextInt();

        System.out.println("New array is :");
        for (int i =0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }



    }
}
