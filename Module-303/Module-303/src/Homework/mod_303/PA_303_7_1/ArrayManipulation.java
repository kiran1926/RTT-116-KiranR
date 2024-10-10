package Homework.mod_303.PA_303_7_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

    // for problem 2 :
    public static int middleElement(int[] array){

        //check if an array is empty
        if ( array.length == 0 || (array.length % 2 == 0)){
            return 0;
        }
        //find the middle element
        int middle = array[0];
        //check if array size is not even
        middle = (array.length / 2 ) + 1;
        return array[middle-1];
    }


    public static void main (String args[]){

        //Task 1: Write a program that creates an array of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each array element.

        int numbers [] = new int[3];
        // assign value to array
        numbers [0] =1;
        numbers [1] =2;
        numbers [2] =3;
        //printing value
        for (int i = 0; i < numbers.length; i++ ){
            System.out.println(numbers[i]);
        }

        //Task 2: Write a program that returns the middle element in an array.
        // Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

        int nums [] = {13,5, 7, 68,2};
        System.out.println("The middle element in this array is " +middleElement(nums));

        // Task 3: Write a program that creates an array of String type and initializes it
        // with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length.
        // Make a copy using the clone( ) method.
        // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.

        String colors [] = {"red", "green", "blue", "yellow"};
        System.out.println("length of array = "+colors.length);;
        String colorsCopy [] = new String [colors.length];
       colorsCopy = colors.clone();
       System.out.println("Copied array is " + Arrays.toString(colorsCopy));

        //Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
        // The numbers can be any integers.  Print out the value at the first index and
        // the last index using length - 1 as the index.
        // Now try printing the value at index = length (e.g., myArray[myArray.length] ).
        // Notice the type of exception which is produced. Now try to assign a value to the array index 5.
        // You should get the same type of exception.

        int numbers1 [] = new int[5];
        for (int i = 0; i < numbers1.length; i++){
            numbers1[i] = ((int) (Math.random()* 5));
        }
        System.out.println("value at first index = "+numbers1[0]+" value at last index = "+numbers1[numbers1.length-1]);
        //System.out.println("value at the index 5 " + numbers1[numbers1.length]);
        //numbers1[5] = 13;

        // problem 5 :
        //Task 5: Write a program where you create an integer array with a length of 5.
        // Loop through the array and assign the value of the loop control variable (e.g., i)
        // to the corresponding index in the array.

        int arr [] = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        // problem 6 :
        // Task 6: Write a program where you create an integer array of 5 numbers.
        // Loop through the array and assign the value of the loop control variable multiplied by 2
        // to the corresponding index in the array.

        int digits [] = new int[5];
        for (int i = 0; i < digits.length; i++){
            digits[i] = i * 2;
        }
        System.out.println(Arrays.toString(digits));

        // problem 7 :
        //Task 7: Write a program where you create an array of 5 elements.
        // Loop through the array and print the value of each element, except for the middle (index 2) element.
        int digits1[] = new int[5];
        for (int i = 0; i < digits1.length; i++){
            digits1[i] = (int) (Math.random() * 5);
        }
        System.out.println("digits = "+ Arrays.toString(digits1));
        for (int i = 0; i < digits1.length; i++){
            if ( i != 2) {
                System.out.println(digits1[i]);
            }
        }

        // prob 8 :
        //Task 8: Write a program that creates a String array of 5 elements and
        // swaps the first element with the middle element without creating a new array.
        String names [] = {"Tia", "Risha", "Yug", "Kira","Snehal"};
        int middl  = names.length / 2 ;
        String temp;
        temp = names[0];
        names[0] = names[middl];
        names[middl] = temp;
        System.out.println(Arrays.toString(names));

        // problem 9 :
        //Task 9:
        //Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        // Print the array in ascending order, and print the smallest and the largest element of the array.
        // The output will look like the following:
        //Array in ascending order: 0, 1, 2, 4, 9, 13
        //The smallest number is 0
        //The biggest number is 13

        int arry [] = {4, 2, 9, 13, 1, 0};
        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));
        System.out.println("smallest number " +arry[0]);
        System.out.println("Biggest number " +arry[arry.length-1]);

        // problem 10 :
        //Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
        Object[] multiple = new Object[5];
        multiple[0] = 5;
        multiple[1] = "kira";
        multiple[2] ="Yug";
        multiple[3] ="Risha";
        multiple[4] = 3.2;
        System.out.println(Arrays.toString(multiple));

        //problem 11 :
        //Task 11: Write some Java code that asks the user how many favorite things they have. Based on their answer,
        // you should create a String array of the correct size. Then ask the user to enter the things
        // and store them in the array you created. Finally, print out the contents of the array.


        Scanner scan = new Scanner(System.in);
        System.out.println("How many favorite things you hav: ");
        int n = scan.nextInt();
        String [] favorites = new String[n];
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter the names of favorite thing: ");
        for (int i = 0; i < favorites.length; i++){
            favorites[i] = scann.nextLine();
        }
        System.out.println(Arrays.toString(favorites));


    }
}
