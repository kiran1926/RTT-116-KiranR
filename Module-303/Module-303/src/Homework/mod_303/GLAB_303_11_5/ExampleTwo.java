package Homework.mod_303.GLAB_303_11_5;

import java.util.HashSet;

public class ExampleTwo {
    public static void main (String args[]){

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: "+ numbers);
        //Union of two sets
        numbers.addAll(evenNumbers);
        System.out.println("Union is : " + numbers);

        System.out.println("\n ====================================== ");
        //Example 3:
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        //difference between set1 and set2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("difference: "+ primeNumbers);

        System.out.println("\n ================4. Enhanced for() Loop ====================== ");

        HashSet<String> hset = new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");

        //addition of null values
        hset.add(null);
        hset.add(null);
        //using advanced for loop
        for(String str: hset){
            System.out.println("---> "+ str);
        }
    }
}
