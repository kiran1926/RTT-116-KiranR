package org.perscholas.Module_303_11;

import java.util.*;

public class ListSetExample {
    public static void main (String args[]){

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(3);
        for (Integer i : intList){
            System.out.println(i);
        }

        // ========Iterator


        Iterator<Integer> iterator = intList.iterator();
        //loopover the list using iterator

        //you can't remove an element from the list inside a regular for loop, it is always wrong and will cause exception

        while ( iterator.hasNext() ){

            // .next function is actually 2 operations, 1st to return the element at the pointer and 2nd to move the
            //pointer over 1 element
            Integer i = iterator.next();

            //primary use for an iterator is when you want to remove something from the list while you are iterating
            if ( i == 3){
                //this is the correct way to remove  an element
                iterator.remove();
            }
        }




        System.out.println("==================================");
            // set
        Set<Integer> intSet = new HashSet<>();
        intSet.add(4);
        intSet.add(11);
        intSet.add(6);
        intSet.add(6);

        //not only did it not maintain the order in which I added the elements
        //it removed the duplicate 3 that I added
        for (Integer i : intSet){
            System.out.println(i);
        }

    }
}
