package org.example.database;

import org.example.database.dao.OrderDetailDAO;

import java.util.List;
import java.util.Scanner;

public class UpdateQuantityRunner {

    public static void main (String args[]){

        OrderDetailDAO orderDetailDAO = new OrderDetailDAO();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter OrderId for getting the order-details:  ");
        Integer orderId = scan.nextInt();

        System.out.println("List of the Products & Quantity in the Order " + orderId+  " : ");
        List<Object[]> ods = orderDetailDAO.findByOrderId(orderId);
        for(Object[] od : ods ){
            System.out.println( od[0] + ", Quantity Ordered: "+od[1]);
        }

        // to update the quantity
        for(Object[] od : ods) {
            System.out.println("Enter quantity to add: ");
            Integer addQuantity = scan.nextInt();
            Object quant = od[1];
            Integer a = (int) quant + addQuantity;
            od[1] = a;
//            OrderDetail orderDetail = orderDetailDAO.quantByOrderId(orderId);10100
//            orderDetail.setQuantityOrdered(a);
//            orderDetailDAO.update(orderDetail);
            System.out.println(od[0] + ", Quantity after: "+od[1]);
        }
    }
}
