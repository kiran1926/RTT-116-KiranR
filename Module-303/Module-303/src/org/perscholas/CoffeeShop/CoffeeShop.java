package org.perscholas.CoffeeShop;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CoffeeShop {

    //decimal formatting
    DecimalFormat df = new DecimalFormat("$#,##0.00");

    //we will use this is a couple functions to read input from the user
    private Scanner scanner = new Scanner(System.in);

    //menu list of products in coffee shop

    //this is a class level variable that will contain our list of products for sale
    // best practice to write at the top
    private List<Product> products = new ArrayList<>();

    //this will hold the products that we are going to purchase
    private List<Product> cart = new ArrayList<>();

    //product object instantiated
    private void initProducts() {
        Product p1 = new Product("Small Coffee", 4.57, 0);
        products.add(p1);

        Product p2 = new Product("Large Coffee", 7.99, 0);
        products.add(p2);

        Product p3 = new Product("Sugar Cookie", 5.89, 0);
        products.add(p3);

        Product p5 = new Product("Ginger Cookie", 5.89, 0);
        products.add(p5);

        Product p4 = new Product("Egg Sandwich", 6.49, 0);
        products.add(p4);

        //let's sort the list by the price
        //TODO - homework- write this function using a for loop
        //use a bubble sort algorithm - look this up on google
        //sort the list of products by price using 2 nested for loops to implement a bubble sort in a function
        //should create a function that will take in a List<Product> to be sorted and return a sorted LIst<Product>





        //new syntax for comparing each product -  comparing(Product::getPrice)
//        List<Product> sorted = products.stream().sorted(Comparator.comparing(Product::getPrice)).toList();


        //this just prints the products and fix it in product
//        sorted.forEach(p-> System.out.println(p));
        //overwrite the original product list with our new sorted list
//        products = sorted;

        //this will modify original list... using stream will not modify the original list
//        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getName));
//        products.forEach(p -> System.out.println(p));

        sortByPrice(products);

    }
    private List<Product> sortByPrice (List<Product> source) {
        for (int i = 0; i < source.size()-1; i++){
            for(int j = i + 1; j < source.size(); j++ ){

                Product p0 = source.get(i);
                Product p1 = source.get(j);

                if(p0.getPrice() > p1.getPrice()){
                    source.set(i, p1);
                    source.set(j, p0);
                }

            }
            products.forEach(p -> System.out.println(p));
        }
        return null;
    }

    // printing product menu
    private void printProductMenu() {
        for (int count = 0; count < products.size(); count++) {
            Product p = products.get(count);
            System.out.println((count + 1) + ") " + p.getName() + " \t " + " $ " + p.getPrice());
        }
        //give some white space after print
        System.out.println("\n");
    }
    //TODO - homework #2 - create a new main menu option that allows you to search the list of products for a user entered name
    //1a) Add the search capability to the main menu when you start the coffee shop as a new option
    //1) ask the user to enter a search phrase "coffee" and
    //2)filter the list of products to show only the products that match the phrase entered
    //2b) do not alter the original list of products which means use the .stream()
    //2c) use a lambda to print out the sorted list using a product.toString() method
    //2c-p1) create a toString method on your product object
    //3) Add the search capability to the main menu when you start the coffee shop as a new option

    private void productSearch (){
        System.out.println("Enter item name to search: ");
         try {
             String itemName = scanner.nextLine();
             List<Product> searchResult = products.stream().filter(p -> p.getName().toLowerCase().contains(itemName)).toList();
             searchResult.forEach(p -> System.out.println(p));

             if(itemName.isEmpty()){
                 System.out.println("Empty search field.");
             }

         }catch (Exception ee){
             System.out.println("Item not available");
         }
    }

    //get main menu printed
    private int printMainMenu() throws InvalidInputException {
        System.out.println("1) See Product menu");
        System.out.println("2) Purchase product");
        System.out.println("3) Checkout");
        System.out.println("4) Exit");
        System.out.println("5) Search a product");

//        System.out.println(" \nEnter Selection: ");
        return readNumberFromUser("\nEnter Selection : ");

//        int selection = scanner.nextInt();
//        scanner.nextLine();
//
//        return selection;

//        try {
//            int selection = scanner.nextInt();
//            return selection;
//        } catch (Exception e) {
//            System.out.println("Invalid Selection " + e.getMessage());
//            return -1;
//        } finally {
//            scanner.nextLine();
//        }
    }
    // By adding the throws clause here, I am specifically saying this function can (but may not) throw an exception
    //called InvalidInputException
    //this is what is called throwing a checked exception which means that all places in the code that are calling
    //this method now have
    private int readNumberFromUser(String question) throws InvalidInputException {
        System.out.println(question);
        try {
            int selection = scanner.nextInt();
            //normally a return stops executionof code at that point and executes the function
            // *****!!!!!!  in this case it will still call the finally block
            return selection;
            //this is interesting wrinkle ....java will call the finally block even still
        } catch (Exception e) {
            //this is logic we are adding as an engineer so we know there was a problem
            //this is not always the best of handling things
            System.out.println("Invalid input: this is an error" + e.getMessage());
            throw new InvalidInputException("Invalid input: " + e.getMessage());
        } finally {
            // this is a good example of usage for a finally block is to clear the Scanner so it is ready for the
            // next time this function is called.
            scanner.nextLine();
        }
    }

    public void addProductToCart() {
        //1. display items for sale
        printProductMenu();

        // 2 prompt the user to enter an item # number to buy

        try {
            int selection = readNumberFromUser("Enter Product Number: ");  //TRY DEBUGGING HERE

            // we want to check that the user has entered a valid product number
            if (isProductSelectionValid(selection)) {
                //we changed this if (selection >= 1 && selection <= products.size()) {
                // 3. add to the cart array
                // we are subtracting 1 from user input to get the real position in the array
                //because most people dont have a concept of the 0th in a list
                Product p = products.get(selection - 1);

                // prompt the user to enter the quantity of selected product
//            System.out.println("How many " + p.getName() + " would you like to order? ");
//            int quantity = scanner.nextInt();
                int quantity = readNumberFromUser("Enter quantity to buy: ");

                if (quantity <= 0) {
                    System.out.println("Must buy at least one item");
                } else {
                    // p.setQuantity(quantity);
                    p.setQuantity(p.getQuantity() + quantity);

                    if (!doesSelectedProductExistsInCart(p)) {
                        //right here add a for loop to check if the product is already existinf in the cart
                        cart.add(p);
                    }
                    System.out.println(p.getQuantity() + " quantity of " + p.getName() + " added to your cart.\n");
                }
            } else {
                System.out.println("Invalid item selection");
            }
        } catch (InvalidInputException iie) {
            System.out.println("======Here=====");
        }
        // 4. prompt how many do you want to buy
        // 5. make adjustments to quantity on product
    }

    private boolean isProductSelectionValid(int selection) {
        if (selection >= 1 && selection <= products.size()) {
            return true;
        }

        return false;
    }


    private boolean doesSelectedProductExistsInCart(Product purchase) {
        boolean found = false;

        //start looping all over the items in the cart and if the name of the purchased item is the same
        //name as one of the products in the cart then we know it is already in the cart
        for (Product item : cart) {
            if (item.getName().equals(purchase.getName())) {
                found = true;
                break;
            }
        }

        return found;
    }

    public void checkout() {

        System.out.println(" ==== Items in your cart ====");

        System.out.println(" Item Name " + " \t " + " Price " + " \t " + " Quantity " + " \t " + " Total Price ");
        //list the items in the cart
        double subtotal = 0.0;

        //System.out.println(item.getName() + " \t " + item.getQuantity()+ " \t $" + item.getPrice());
        for (Product item : cart) {
            double total_price_of_item = item.getPrice() * item.getQuantity();
            subtotal = subtotal + item.getPrice() * item.getQuantity();
            //right justify prices
            //String formattedPriceOfItem = String.format("%4.2f",item.getPrice());
            // String formattedTotal_PriceOfItem = String.format("%10.2f",total_price_of_item);


            System.out.println(item.getName() + "\t  $" + item.getPrice() + " \t\t " + item.getQuantity() + " \t\t\t\t$" + total_price_of_item);
        }
        System.out.println("");
        //String formatted_subtotal = String.format("%10.2f", subtotal);
        System.out.println("Subtotal\t\t " + df.format(subtotal));

        //assume there is a 9% tax
        //calculate tax
        double tax = subtotal * 0.09;
        //String formatted_tax = String.format("%10.2f", tax);
        System.out.println("Tax\t\t\t\t " + df.format(tax));

        //calculate total
        //String formatted_total = String.format("%10.2f", (formatted_subtotal+ formatted_tax));
        System.out.println("Total\t\t\t " + df.format(tax + subtotal));
    }


    public void start(){
        //this becomes similar to the main method in that it will be where our project starts and runs
        // initialize the products for sale
        initProducts();
        System.out.println(" \n========= Welcome to the Coffee Shop ========= \n");

        //repeat forever until the user enters selection 4 which will exit the program
            while (true) {
                //print the menu and get back the user selected input
                try {
                    int selection = printMainMenu();

                    if (selection == 1) {
                        //print the product menu
                        printProductMenu();
                    } else if (selection == 2) {
                        //purchase product / add to cart
                        addProductToCart();
                    } else if (selection == 3) {
                        // checkout
                        checkout();
                    } else if (selection == 4) {
                        //exit
                        System.out.println("Good Bye");
                        System.exit(0);
                    } else if (selection == 5) {
                        productSearch();
                    } else {
                        System.out.println("Invalid command entered " + selection + "\n");
                    }
                } catch (InvalidInputException iie) {
                    System.out.println("Invalid selection");
                }

            }
    }

    public static void main(String[] args) throws Exception {
        CoffeeShop cs = new CoffeeShop();
        cs.start();
    }
}
//q.setQuantity(q.getQuantity + quantity);
//when adding an item to the cart ...
// first increment the quantity on the product by the amount that the person wanted to order ...
// then loop over the list of items in the cart and if the item is not in the cart then you add to the cart