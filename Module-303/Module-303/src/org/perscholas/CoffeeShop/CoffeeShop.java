package org.perscholas.CoffeeShop;

import java.util.ArrayList;
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

        Product p4 = new Product("Egg Sandwich", 6.49, 0);
        products.add(p4);

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

    //get main menu printed
    private int printMainMenu() {
        System.out.println("1) See Product menu");
        System.out.println("2) Purchase product");
        System.out.println("3) Checkout");
        System.out.println("4) Exit");

        System.out.println(" \nEnter Selection: ");

        int selection = scanner.nextInt();
        scanner.nextLine();

        return selection;


//        try {
//            int selection = scanner.nextInt();
//            scanner.nextLine();
//            return selection;
//        } catch (Exception e) {
//            System.out.println("Invalid Selection " + e.getMessage());
//            return -1;
//        } finally {
//            scanner.nextLine();
//        }

    }

    public void addProductToCart() {
        //1. display items for sale
        printProductMenu();

        // 2 prompt the user to enter an item # number to buy
        System.out.println("Enter product number: ");
        int selection = scanner.nextInt();
        scanner.nextLine();

        // we want to check that the user has entered a valid product number
        if (selection >= 1 && selection <= products.size()) {
            // 3. add to the cart array                                                                                     //
            // we are subtracting 1 from user input to get the real position in the array
            //because most people dont have a concept of the 0th in a list
            Product p = products.get(selection - 1);

            // prompt the user to enter the quantity of selected product
            System.out.println("How many " + p.getName() + " would you like to order? ");
            int quantity = scanner.nextInt();
           // p.setQuantity(quantity);
            p.setQuantity(p.getQuantity() + quantity);

            if (quantity > 0) {
//                for(int i = 0; i < quantity; i++) {
                    cart.add(p);
//                }
                System.out.println(p.getQuantity()+ " quantity of " + p.getName() + " added to your cart.\n");
            }
        } else {
            System.out.println("Invalid item selection");
        }

        // 4. prompt how many do you want to buy
        // 5. make adjustments to quantity on product
    }

    public void checkout() {

        System.out.println(" ==== Items in your cart ====");

        System.out.println(" Item Name " + " \t " + " Price "+ " \t " + " Quantity "+ " \t "+ " Total Price ");
        //list the items in the cart
        double subtotal = 0.0;

        //System.out.println(item.getName() + " \t " + item.getQuantity()+ " \t $" + item.getPrice());
        for (Product item : cart) {
           double total_price_of_item = item.getPrice() * item.getQuantity();
            subtotal = subtotal + item.getPrice() * item.getQuantity();
            //right justify prices
            //String formattedPriceOfItem = String.format("%4.2f",item.getPrice());
           // String formattedTotal_PriceOfItem = String.format("%10.2f",total_price_of_item);


            System.out.println(item.getName() + "\t  $" + item.getPrice()+ " \t\t " + item.getQuantity()+ " \t\t\t\t$" + total_price_of_item);
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


    public void start() {
        //this becomes similar to the main method in that it will be where our project starts and runs
        // initialize the products for sale
        initProducts();
        System.out.println(" \n========= Welcome to the Coffee Shop ========= \n");

        //repeat forever until the user enters selection 4 which will exit the program
        while (true) {
            //print the menu and get back the user selected input
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
            } else {
                System.out.println("Invalid command entered " + selection + "\n");
            }
        }
    }

    public static void main(String[] args) {
        CoffeeShop cs = new CoffeeShop();
        cs.start();

    }
}
//q.setQuantity(q.getQuantity + quantity);
//when adding an item to the cart ...
// first increment the quantity on the product by the amount that the person wanted to order ...
// then loop over the list of items in the cart and if the item is not in the cart then you add to the cart