package org.example.database;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

public class CreateProductDemo {

    public static void main(String args[]){
        ProductDAO pdao = new ProductDAO();

        Product p = new Product();

        String productName = "Product_Insert2";
        p.setProductName(productName);

        p.setProductDescription("Product Description");
        p.setMsrp(4.55);
        p.setProductCode("NPC");
        p.setProductScale("scale");
        p.setProductVendor("vendor");
        p.setBuyPrice(10.33);
        p.setProductlineId(1);
        p.setQuantityInStock(43);


        // id will be null
        System.out.println("before = " + p);
        //id will automatically get set up by database
        if(pdao.search(productName).isEmpty()) {  // to prevent duplication of products
            pdao.create(p);
            System.out.println("after = " + p);
        }else{
            System.out.println("Product already exists : "+ pdao.search(productName));
    }   }
}
