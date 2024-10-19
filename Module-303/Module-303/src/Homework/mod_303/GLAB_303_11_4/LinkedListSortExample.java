package Homework.mod_303.GLAB_303_11_4;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortExample {
    public static void main (String args[]){

        //create linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        //unsorted
        System.out.println(linkedList);

        //1. sort the list
        Collections.sort(linkedList);

        //sorted
        System.out.println(linkedList);

        //custom sorting
        Collections.sort(linkedList, Collections.reverseOrder());
        //custom sorted
        System.out.println(linkedList);

    }
}
