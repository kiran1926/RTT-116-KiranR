package org.example.database;

import org.example.database.dao.OrderDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;

import java.util.ArrayList;

public class HW_3_OneToMany {

    public static void main (String args[]) {

        ProductDAO productDAO = new ProductDAO();

        //order object
        OrderDAO orderDAO = new OrderDAO();
        Order o = orderDAO.findById(10100);

        //creating a new product
        Product newProduct = new Product();
        //if it doesn't exist productName field is set unique in db
        newProduct.setProductDescription("DescriptionTest");
        newProduct.setMsrp(4.95);
        newProduct.setProductCode("NPCTest");
        newProduct.setProductScale("scaleTest");
        newProduct.setProductVendor("vendorTest");
        newProduct.setProductName("ProductNameTest3");
        newProduct.setBuyPrice(14.33);
        newProduct.setProductlineId(1);
        newProduct.setQuantityInStock(200);
        newProduct.setOrderDetails(new ArrayList<>());
        //creating product
        productDAO.create(newProduct);

        //order detail object
      OrderDetail orderDetail = new OrderDetail();

        //System.out.println(orderDetail);
        orderDetail.setProductId(newProduct.getId());
        orderDetail.setQuantityOrdered(100);
        orderDetail.setPriceEach(30.22);
        orderDetail.setOrderId(o.getId());
        orderDetail.setOrderLineNumber(1);
        orderDetail.setProduct(newProduct); // setting orderDetail with new product
        orderDetail.setOrder(o);

        o.getOrderDetails().add(orderDetail);
        orderDAO.update(o);

        newProduct.getOrderDetails().add(orderDetail);
        productDAO.update(newProduct);

        System.out.println(newProduct);
        System.out.println(orderDetail);

        System.out.println();

    }
}
