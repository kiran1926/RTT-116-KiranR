package org.example.database;

import org.example.database.dao.OrderDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;

import java.util.List;

public class HW4_OneToMany {

    public static void main(String args[]) {

            ProductDAO productDAO = new ProductDAO();
            Product p = productDAO.findById(1);
            OrderDAO orderDAO = new OrderDAO();
            Order o = orderDAO.findById(10100);

                List <OrderDetail> odlist = o.getOrderDetails();
                for(OrderDetail od : odlist ){
                    if(od.getProductId() == p.getId()){
                        od.setQuantityOrdered(od.getQuantityOrdered() + 100);
                    }else {
                        od.setOrderId(o.getId());
//                        od.setProductId();
                    }
                }


    }
}