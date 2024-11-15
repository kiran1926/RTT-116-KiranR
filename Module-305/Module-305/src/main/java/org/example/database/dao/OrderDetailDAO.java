package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.OrderDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OrderDetailDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory(); //BOILERPLATE to configure

    // update function
    public void update(OrderDetail orderDetail){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try{
            session.merge(orderDetail);
            session.getTransaction().commit();
        } catch(Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    // CREATE function
    public void create(OrderDetail orderDetail){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.persist(orderDetail);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    // DELETE Function
    public void delete(OrderDetail orderDetail){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try{
            session.delete(orderDetail);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    //CREATE findById function
    public OrderDetail findById(Integer id){

        Session session = factory.openSession();

        String hql = "SELECT od FROM OrderDetail od WHERE od.id = :orderDetailId";

        TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);

        query.setParameter("orderDetailId", id);

        try{
            OrderDetail result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;
        }finally{
            session.close();
        }
    }
// search by orderId
    public OrderDetail searchOrderByProductId(Integer productId){

        Session session = factory.openSession();

        String hql = "SELECT od FROM OrderDetail od WHERE od.productId = :productId";

        TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);

        query.setParameter("productId", productId);

        try{
            OrderDetail result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;
        }finally{
            session.close();
        }
    }

    // Use of Object[] to fetch 2 columns from 2 different tables
    public List<Object[]> findByOrderId(Integer orderId){

        Session session = factory.openSession();

        String hql = "SELECT p.productName , od.quantityOrdered AS quantity_ordered FROM Product p , OrderDetail od WHERE od.productId = p.id AND od.orderId = :orderId";

        TypedQuery<Object[]> query = session.createQuery(hql, Object[].class);

        query.setParameter("orderId", orderId);

        try{
            List<Object[]> result = query.getResultList();
            return result;
        } catch (Exception e) {
            return null;
        }finally{
            session.close();
        }
    }

    //just to get list of products by orderId

    public OrderDetail quantByOrderId(Integer orderId){

        Session session = factory.openSession();

        String hql = "SELECT od.quantityOrdered FROM OrderDetail od WHERE od.orderId = :orderId";

        TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);

        query.setParameter("orderId", orderId);

        try{
           OrderDetail result = query.getSingleResult();
           return result;
        } catch (Exception e) {
            return null;
        }finally{
            session.close();
        }
    }

    //class work for problem 3
    public OrderDetail findByOrderIdAndProductId(Integer orderId, Integer productId){

        Session session = factory.openSession();

        String hql = "SELECT od FROM OrderDetail od WHERE od.orderId = :orderId and od.productId = :productId";

        // higher level hibernate query which you will find out there
       // String hq = "SELECT od FROM OrderDetail od WHERE od.order.id = :orderId and od.product.id = :productId";

        TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);

        query.setParameter("orderId", orderId);
        query.setParameter("productId", productId);


        try{
            OrderDetail result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;
        }finally{
            session.close();
        }
    }

}
