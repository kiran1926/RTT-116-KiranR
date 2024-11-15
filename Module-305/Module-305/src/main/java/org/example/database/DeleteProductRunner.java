package org.example.database;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

public class DeleteProductRunner {
    public static void main (String args[]){

        ProductDAO pdao = new ProductDAO();

        Product p = pdao.findById(111);

        System.out.println(p);
        pdao.delete(p);
        System.out.println(p);

    }
}
