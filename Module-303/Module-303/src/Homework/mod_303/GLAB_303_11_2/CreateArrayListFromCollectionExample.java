package Homework.mod_303.GLAB_303_11_2;
//Example 2: Creating an ArrayList From Another Collection
//This example shows:
//How to create an ArrayList from another collection using the ArrayList(Collection c) constructor.
//How to add all of the elements from an existing collection to the new ArrayList using the addAll() method.


import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main (String args[]){
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        //creating an ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers); // !!!!!! CHECK THIS OUT
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        //adding an entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);

        System.out.println("\n ===============================================================");
        //Example 3: Accessing Elements from an ArrayList
        //This example shows:
        //The use of the isEmpty() method to check if an ArrayList is empty.
        //The use of the size() method to find the size of an ArrayList.
        //The use of the get() method to access an element at a particular index in an ArrayList.
        //The use of the set() method to modify the element at a particular index in an ArrayList.

        List<String> topCompanies = new ArrayList<>();
        //check if an Arraylist is empty
        System.out.println("Is the topCompanies list empty? : "+ topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        //find the size of an ArrayList
        System.out.println("Here are the top "+ topCompanies.size() + " companies ");
        System.out.println(topCompanies);

        //retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size()-1);

        System.out.println("Best company "+ bestCompany);
        System.out.println("Second best company "+ secondBestCompany);
        System.out.println("last comapany "+ lastCompany);

        //Modify the element at a given index
        topCompanies.set(4,"Walmart");
        System.out.println( "Modified list of top companies : "+ topCompanies);

        System.out.println(" \n ========================================= \n");

        //Example 4: Removing Elements from an ArrayList
        //This example shows:
        //How to remove an element at a given index in an ArrayList | remove(int index).
        //How to remove an element from an ArrayList | remove(Object o).
        //How to remove all of the elements from an ArrayList that exist in a given collection | removeAll().
        //How to remove all of the elements matching a given predicate | removeIf().
        //How to clear an ArrayList | clear().

        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: "+ programmingLanguages);

        //remove the element at index 5

        programmingLanguages.remove(5);
        System.out.println("After remove(5): "+ programmingLanguages);

        //remove the first occurrence of the given element from the ArrayList
        //the remove() method returns false if the element doesnot exist in the ArrayList

        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove (\"Kotlin\"): "+ programmingLanguages);

        //remove all the elements that exist in a given collection
        List<String> scriptLanguages = new ArrayList<>();
        scriptLanguages.add("python");
        scriptLanguages.add("Ruby");
        scriptLanguages.add("Perl");

        programmingLanguages.removeAll(scriptLanguages);
        System.out.println("after removeAll scriptLanguages : "+programmingLanguages);

        //remove all elements from the arraylist
        programmingLanguages.clear();
        System.out.println("After clear(): "+ programmingLanguages);

        System.out.println("\n================================================\n");


    }
}
