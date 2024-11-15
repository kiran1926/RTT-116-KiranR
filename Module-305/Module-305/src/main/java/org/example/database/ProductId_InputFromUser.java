package org.example.database;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

import java.util.Scanner;

public class ProductId_InputFromUser {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        //to search a product by productId by taking in user input
        System.out.println("Enter the ProductId to search the Product: ");
        Integer id = scan.nextInt();

        ProductDAO pdao = new ProductDAO();
        Product p = pdao.findById(id);
        System.out.println(p);
        // to prompt the user for a description or a price and update the product and save

        System.out.println("Enter the description to update: ");
        String descr = scan.next();
        p.setProductDescription(descr);
        pdao.update(p);
        System.out.println("Enter the price to update: ");
        Double price = scan.nextDouble();
        p.setBuyPrice(price);
        pdao.update(p);
        System.out.println(p);

    }
}
