package Homework.mod_303.GLAB_303_11_2;
////Example 5: Iterating over an ArrayList
// The following example shows how to iterate over an ArrayList using:
// iterator().
// iterator() and forEachRemaining() method.
//listIterator().
//Simple for loop.
//Enhanced for loop with index.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayList {
    public static void main ( String args[]){

        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");
        //iterate
        System.out.println("\n=== Iterate using an iterator() ===");

        Iterator<String> tvShowIterator = tvShows.iterator();

        while(tvShowIterator.hasNext()){
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("==Iterate using an iterator () and forEachRemaining() method ===");

        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow ->{
            System.out.println(tvShow);
        });

        System.out.println("\n ===== Iterate using simple for each loop====");
        for(String s : tvShows){
            System.out.println(s);
        }

        System.out.println("\n=== Iterate using for loop with index ===");

        for (int i =0; i < tvShows.size(); i++){
            System.out.println(tvShows.get(i));
        }

        System.out.println("\n=== Iterate iterator ===");

        ListIterator iterator = tvShows.listIterator();
        System.out.println("ELements in forward direction");

        System.out.println("\n====== Iterate using while loop=======");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=========Elements in backward direction======");


        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }


        System.out.println("\n ===========================\n");

        //Example 6: Searching for Elements in an ArrayList
        //The example below shows how to:
        //Check if an ArrayList contains a given element | contains().
        //Find the index of the first occurrence of an element in an ArrayList | indexOf().
        //Find the index of the last occurrence of an element in an ArrayList | lastIndexOf().

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        //check if ArrayList contains a given element
        System.out.println("Odes names array contain \"Bob\"? : "+ names.contains("Bob"));

        //find the index of the first occurrence of an element in an arraylist
        System.out.println("index of \"Steve\": " + names.indexOf("Steve"));
        System.out.println("index of \"Steve\": " + names.indexOf("Mark"));

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"John\" : " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));


    }
}
