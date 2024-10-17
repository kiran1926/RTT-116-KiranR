package org.perscholas.M_303_11_HashSet;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String args[]){

        //this creates a new hash map where the key is of type string and the value is of the type integer

        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("ten", 10);
        numbers.put("tenn", 10);

        //we can retrieve things from the map using key
        Integer x = numbers.get("one"); //this will return int 1
        System.out.println("Value at key one :" + x);

        Integer x2 = numbers.get("two");

        //to remove a key and a value from the hashmap we can use the remove function
        numbers.remove("tenn");

        //we can also loop over the hash map similar to how we loop over a list
        // first we need to get the set of all the keys in the map
        //!!!!!!!! important to know and understand looping over the keys to get values
        // !!!!!! THIS GETS DONE A LOT : UNDERSTAND LOOPING OVER MAPS

        for( String key: numbers.keySet()){  //the method to get the set of the keys from the map is called keySet
            Integer value = numbers.get(key);
            System.out.println(key + " == " + value);

            //we can also loop over the values in th hashmap
            for( Integer i : numbers.values()) {
                //with this techni
                System.out.println(i);
            }

        }

        System.out.println("value of key at one "+ numbers.get("one"));



    }
}
