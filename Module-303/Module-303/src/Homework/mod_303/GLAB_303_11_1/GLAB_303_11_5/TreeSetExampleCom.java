package Homework.mod_303.GLAB_303_11_1.GLAB_303_11_5;

import java.util.TreeSet;

public class TreeSetExampleCom {
    public static void main (String args[]){
        //Create a TreeSet with user-defined comaparator
        TreeSet<String> cities = new TreeSet<>(new Cities_Comparator());
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);
    }
}

