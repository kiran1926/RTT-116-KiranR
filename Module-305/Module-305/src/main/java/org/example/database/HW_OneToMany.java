package org.example.database;

import org.example.database.dao.OrderDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;

public class HW_OneToMany {

    public static void main (String args[]){

        //1) Using the OrderDAO only!!! show me a list of products in a specific order id.
        // Only can use ... orderDAO.findById();After that you should be able to get the list of order details
        // using java / hibernate and loop over the order deails and system.out.println the product
        OrderDAO orderDAO = new OrderDAO();
        Order o = orderDAO.findById(10100);
        for (OrderDetail od : o.getOrderDetails()){
            System.out.println(od);
        }

        //2) Using the ProductDAO only ... find a list of orders that contain that product.
        // productDAO.findById() and use java and hibernate to list the order details and loop over them
        // and print each order.
        ProductDAO productDAO = new ProductDAO();
        Product p = productDAO.findById(1);
        for(OrderDetail ods : p.getOrderDetails()){
            System.out.println(ods);
        }
    }
}
