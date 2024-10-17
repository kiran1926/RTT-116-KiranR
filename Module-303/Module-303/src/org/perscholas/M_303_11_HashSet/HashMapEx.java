package org.perscholas.M_303_11_HashSet;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String args[]){

        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "Per Scholas New York, NY");
        map1.put(2, "Per Scholas Atlanta GA");
        map1.put(3, "Per Scholas Columbas, OH");
        map1.put(3, "Per Scholas  Florida, Orlando");
        map1.put(4, "Per Scholas Chicago, Ill");
        map1.put(5, "Per Scholas Chicago, Ill");
        map1.put(1, "Per Scholas New Jersey , NJ");
        map1.put(null, "Per Scholas Dallas , TX");
        map1.put(6, null);
        System.out.println(map1);

    }

}
