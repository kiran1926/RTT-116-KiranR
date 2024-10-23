package org.perscholas.M303_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForEachExample {
    public static void main(String args[]) {

        String[] strArray = {"one", "two", "three", "four", "five"};
        List<String> list = Arrays.asList(strArray);


        //why removeIf throws exception
        //creating Arrays.asList gives a fixed size a fixed sized list backed by an array,
        // so you can't add or remove elements from it.
        //You can create an ArrayList in order to support removal:

        //called a lambda expression
        //convert list into a stream and for each element in the stream 'e' loop through it
        //in one line of code we are going to loop over the entire list and print all elements to upper case
        list.stream().forEach(e -> System.out.println(e.toUpperCase()));

        //or
        list.stream().forEach(e -> {
                    //could have many lines
                    System.out.println(e.toUpperCase());
                }
        );
        System.out.println("==========================");
        //super nice fast way of removing an item from a list in one line of code
        //the remove if will affect the original list, modify the list

        //list.removeIf(e -> e.startsWith("o"));

        //filter :  list.sort.filter()
        //primary use for this filter is when you trying to find something in a list of entities
        List<String> filteredList = list.stream().filter(e -> e.startsWith("o")).collect(Collectors.toList());
        //this is better way in recent advancement removed collectors need
        List<String> filteredList5 = list.stream().filter(e -> e.startsWith("o")).toList();

        filteredList.stream().forEach(a-> System.out.println(a));

        System.out.println("====not staring with o====");
        List<String> filteredList2 = list.stream().filter(e -> !e.startsWith("o")).collect(Collectors.toList());
        filteredList2.stream().forEach(a-> System.out.println(a));


        System.out.println("===============");

        //formatting like this help increase readability of code
        List<String> filteredList3 = list.stream()
                .filter(e -> !e.startsWith("o"))
                .filter(e -> e.startsWith("t"))
                .collect(Collectors.toList());

        filteredList3.stream().forEach(a-> System.out.println(a));

        //TODO practice with hashmaps
        HashMap<Integer, String> mapLambda = new HashMap<>();



    }
}
