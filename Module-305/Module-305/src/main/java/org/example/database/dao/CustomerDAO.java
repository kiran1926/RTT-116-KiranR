package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory(); //BOILERPLATE to configure

    // !! BOILERPLATE to update order
    public Customer update(Customer customer){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.merge(customer);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return customer;
    }

    // BOILERPLATE to INSERT PRODUCT
    public Customer create(Customer customer){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.persist(customer);
            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();
        }finally {

            session.close();
        }
        return customer;
    }

    // !!!!!!   BOILERPLATE TO DELETE
    public void delete(Customer customer){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.delete(customer);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    //CREATE findById function
    public Customer findById(Integer id){

        Session session = factory.openSession();

        String hql = "SELECT c FROM Customer c WHERE c.id = :customerId";

        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);

        query.setParameter("customerId", id);

        try{
            Customer result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;
        }finally{
            session.close();
        }
    }

    //Find by firstname and lastname returns a list of customers
    public List<Customer> serachCustomer(String firstname, String lastname){

        Session session = factory.openSession();

        String hql = "SELECT c FROM Customer c WHERE c.contactFirstname LIKE concat('%',:firstName,'%') AND c.contactLastname LIKE concat('%',:lastName,'%')";

        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);

        query.setParameter("firstName", firstname);
        query.setParameter("lastName", lastname);

        try{
            List<Customer> result = query.getResultList();
            return result;
        } catch (Exception e) {
            return new ArrayList<>();
        }finally{
            session.close();
        }
    }

}
