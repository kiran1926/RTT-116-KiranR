package Homework.mod_303.GLAB_303_11_6;

import java.util.HashMap;

public class ExampleOneHashMap {

    public static void main(String args[]){

        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("HashMap: "+ languages);

        //remove element associated with key 2
        String value = languages.remove(2); //Here, the remove() method takes the key as its parameter.
        // It then returns the value associated with the key and removes the entry.
        System.out.println("Removed value: "+ value);
        System.out.println("Updated HashMap: " + languages);

        System.out.println("/n=================================");

        //example 2 :Create Hashmap and Remove HashMap Elements

        HashMap<String, String> newHashMap = new HashMap<>();

        //adding key and value
        newHashMap.put("key1", "Lenovo");
        newHashMap.put("key2", "Motorola");
        newHashMap.put("key3", "Nokia");
        newHashMap.put("key4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original HashMap contains: "+ newHashMap);

        //getting size of hashmap
        System.out.println("size of original map : " +newHashMap.size());

        //copy contains of one HashMap to another
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("copyHashMap mappings: "+ copyHashMap);

        //remove null key
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println("null key value of copyHashMap: "+ nullKeyValue);
        System.out.println("copyHashMap after removal: "+ copyHashMap);
        System.out.println("size of copyHashMap: "+ copyHashMap.size());


    }
}
