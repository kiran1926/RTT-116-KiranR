package org.example.database;

import org.example.database.dao.OrderDAO;
import org.example.database.dao.OrderDetailDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;

public class ClassWork_HW_prob3_4_OneToMany {

        public static void main ( String[] args) {
            ProductDAO productDAO = new ProductDAO();
            OrderDAO orderDao = new OrderDAO();
            OrderDetailDAO orderDetailDAO = new OrderDetailDAO();

            Order o = orderDao.findById(10100);
            Product p = productDAO.findById(1);

            OrderDetail od = orderDetailDAO.findByOrderIdAndProductId(o.getId(), p.getId());

            if (od == null) {
                od = new OrderDetail();

                // this is a create because the combination of orderid and productid was not found in the database so we can create it
                // od.setOrderId(o.getId());
                //od.setProductId(p.getId());
                od.setProduct(p);
                od.setOrder(o);
                od.setQuantityOrdered(100);
                od.setPriceEach(1.99);
                od.setOrderLineNumber(1);

                orderDetailDAO.create(od);
            } else {
                // this is the case where the item already exists as part of the order
                od.setQuantityOrdered( od.getQuantityOrdered() + 100);
                orderDetailDAO.update(od);
            }

        }

}
