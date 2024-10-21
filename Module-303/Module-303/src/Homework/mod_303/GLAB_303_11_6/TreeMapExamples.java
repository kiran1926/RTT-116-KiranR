package Homework.mod_303.GLAB_303_11_6;

import java.util.TreeMap;

public class TreeMapExamples {
    public static void main (String args[]){

        TreeMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("one", 1);
        numbers.put("two",2);
        numbers.put("three", 3);
        System.out.println("treeMap: "+ numbers);

        //remove method with single parameter
        int value = numbers.remove("two");
        System.out.println("removed value: "+ value);

        //remove method with two parameter
        boolean result = numbers.remove("three", 3);
        System.out.println("is entry{three = 3} removed? "+ result);
        System.out.println("updated treemap: "+ numbers);

        System.out.println("\n=============================");

        //Example Two: Methods for Navigation.
        //TreeMap class also implements NavigableMap; it provides various methods to navigate over the elements of the treemap.
        //firstKey() - returns the first key of the map.
        //firstEntry() - returns the key/value mapping of the first key of the map.
        //lastKey() - returns the last key of the map.
        //lastEntry() - returns the key/value mapping of the last key of the map.

        TreeMap<String, Integer> nums = new TreeMap<>();

        nums.put("first", 1);
        nums.put("second", 2);
        nums.put("third", 3);
        System.out.println("treemap: "+ nums);

        //using the firstKey() method
        String firstKey = nums.firstKey();
        System.out.println("firstKey is "+ firstKey);

        //using lastKey()
        System.out.println("last key is "+ nums.lastKey());

        //using firstEntry() method
        System.out.println("first entry: "+ nums.firstEntry());

        //using lastEntry() method
        System.out.println("last entry : "+nums.lastEntry());

        System.out.println("\n=======================================");




    }
}
