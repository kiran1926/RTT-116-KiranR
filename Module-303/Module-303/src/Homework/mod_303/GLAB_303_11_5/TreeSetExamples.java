package Homework.mod_303.GLAB_303_11_5;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExamples {
    public static void main (String args[]){

        TreeSet<Integer> num_TreeSet = new TreeSet<>();
        num_TreeSet.add(20);
        num_TreeSet.add(5);
        num_TreeSet.add(15);
        num_TreeSet.add(25);
        num_TreeSet.add(10);

        //call iterator() method to define Iterator for TreeSet
        Iterator<Integer> iter_Set = num_TreeSet.iterator();
        System.out.println("TreeSet using Iterator: ");
        //access elements using iterator
        while(iter_Set.hasNext()){
            System.out.print(iter_Set.next());
            System.out.print(", ");
        }

        System.out.println("\n========Example 2 : Remove elements =========");
        //remove() - removes the specified element from the set.
        //removeAll() - removes all of the elements from the set.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        //using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed ? " +value1);
        //using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("are all numbers removed? "+ value2);


        System.out.println("\n========Example 3 Methods for Navigation =========");
        // first() and last() Methods
        //first() - returns the first element of the set.
        //last() - returns the last element of the set.
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(2);
        nums.add(5);
        nums.add(6);
        System.out.println("TreeSet: " + nums);
        //usong the first() method
        int first = nums.first();
        System.out.println("First Number: "+ first);
        //using the last() method
        int last = nums.last();
        System.out.println("Last number: "+ last);




    }
}
