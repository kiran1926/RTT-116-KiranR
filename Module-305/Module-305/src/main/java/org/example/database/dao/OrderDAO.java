package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class OrderDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory(); //BOILERPLATE to configure

    // !! BOILERPLATE to update order
    public void update(Order order){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.merge(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    // BOILERPLATE to INSERT PRODUCT
    public void create(Order order){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.persist(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    // !!!!!!   BOILERPLATE TO DELETE
    public void delete(Order order){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.delete(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }


    public Order findById(Integer id){

        Session session = factory.openSession();

        String hql = "SELECT o FROM Order o WHERE o.id = :orderId";

        TypedQuery<Order> query = session.createQuery(hql, Order.class);

        query.setParameter("orderId", id);

        try{
            Order result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;
        }finally{
            session.close();
        }

    }

}
