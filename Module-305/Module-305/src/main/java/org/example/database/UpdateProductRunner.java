package org.example.database;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

public class UpdateProductRunner {
    public static void main (String args[]){

        ProductDAO pdao = new ProductDAO();

        Product p = pdao.findById(1);

        Product p1 = pdao.findById(1);

        //update the product
        p1.setProductDescription("testing_update");
        p1.setProductCode("123");
        pdao.update(p1);

        System.out.println(p);
        System.out.println(p1);

    }
}
