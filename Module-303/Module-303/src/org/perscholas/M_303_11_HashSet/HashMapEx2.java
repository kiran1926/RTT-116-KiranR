package org.perscholas.M_303_11_HashSet;

import java.util.HashMap;

public class HashMapEx2 {
    public static void main ( String args []){

        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");

        System.out.println("HashMap : "+ languages);

        //get() method to get value
        String value = languages.get(1);
        System.out.println("Value at index 1 : " + value);

        //return set of keys using keySet()
        System.out.println("Keys: "+ languages.keySet());

        //return set view of values using values()
        System.out.println("Values: "+ languages.values());

        //return key:value pairs
    }
}
