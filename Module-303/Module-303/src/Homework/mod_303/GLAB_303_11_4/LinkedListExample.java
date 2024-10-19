package Homework.mod_303.GLAB_303_11_4;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]){

        //LinedList Declaration

        LinkedList<String>  linkedList = new LinkedList<>();

        //add (String Element) is used for adding the elements to the linked list

        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");

        //display content
        System.out.println("linked list contents: " + linkedList);

        //add first and last element
        linkedList.addFirst("first item");
        linkedList.addLast("last item");
        System.out.println("Linked list content after addition: "+ linkedList);

        //this is how to get and set values
        Object firstVar = linkedList.get(0);
        System.out.println("First element: "+ firstVar);
        //set values
        linkedList.set(0, "changed first item");
        System.out.println("First element after update by set method: "+ linkedList.get(0));

        //remove first and last element
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linkedlist after deletion of first and last element: "+ linkedList);

        //add a position and remove from a position
        linkedList.add(0, "newly added item");
        linkedList.remove(2);
        System.out.println("Final Content: "+ linkedList);


    }
}
