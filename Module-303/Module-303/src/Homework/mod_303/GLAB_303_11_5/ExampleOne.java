package Homework.mod_303.GLAB_303_11_5;

import java.util.HashSet;

public class ExampleOne {
    public static void main (String args[]){

        HashSet<Integer> evenNumber = new HashSet<>();

        //using add method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: "+ evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        //using addAll method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("new HashSet: " + numbers);
    }
}
