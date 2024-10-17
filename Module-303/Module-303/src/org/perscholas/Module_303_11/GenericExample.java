package org.perscholas.Module_303_11;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String args[]) {

        //basically the type between <> is the only type allowed into the List
        // in older version of java it was required on both sides of the =
        List<String> strings = new ArrayList<String>();
        strings.add("String1");
        //strings.add(1);

        // this one will only allow integers to be in the list
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        //ints.add("string2");


        // this is a map// Map < K, V>
    }    //Map<String, >
}
