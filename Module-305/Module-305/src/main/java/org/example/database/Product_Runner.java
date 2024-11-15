package org.example.database;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

import java.util.List;


public class Product_Runner {
    public static void main (String args[]){
        ProductDAO pdao = new ProductDAO();
//        Product p = pdao.findById(5); // instead System.out.println(pdao.findById(5));
//        System.out.println(p);

        List<Product> p1 = pdao.searchByOrderId(10100);
        for(Product p: p1){
            System.out.println(p);
        }


        List<Product> fords = pdao.search("Ford");
        for ( Product ford : fords){
            System.out.println(ford);
        }
    }
}
