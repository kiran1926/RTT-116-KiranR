package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    //TODO

    // for all DAO.... AT the class member level make your session factory
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    // !!!! BOILERPLATE TO UPDATE
    public void update(Product product){

        Session session = factory.openSession();

        session.getTransaction().begin();

        try {
            session.merge(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    // BOILERPLATE to INSERT PRODUCT
    public void create(Product product){

        Session session = factory.openSession();

        session.getTransaction().begin();

        try {
            System.out.println("Creating product");
            session.persist(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    // !!!!!!   BOILERPLATE TO DELETE
    public void delete(Product product){

        Session session = factory.openSession();

        session.getTransaction().begin();

        try {
            session.delete(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    // to search a product by its id
    public Product findById(Integer id) {

        //Hibernate queries must use the java names from the entities
        //this is HQL
        String hqlQuery = "SELECT p FROM Product p WHERE p.id = :productId";
        //this is what is called native SQL - it's for showing difference between hql and native sql
        //String nativeSqlQuery = "SELECT * FROM products WHERE id = ? ";

        // this is needed to get the database connection and let hibernate run the query
        Session session = factory.openSession();

        // hibernate uses this typed query to execute the query and fill "hydrate" the entity with the data from the database
        // passing in the HQL query and setting the datatype for hibernate to use
        TypedQuery<Product> query = session.createQuery(hqlQuery, Product.class);

        // now we can set the parameter on the query
        // the int id is the value that we want to substitute into the query at the
        // :productId location
        query.setParameter("productId", id);

        //we know this is a primary key so this query will return 0 records or 1 record
        // if the product was not found in the database we want to return null from our function
        // otherwise we want to return our product
        // hibernate will run the query and create a new product entity and fill it up with thw data for us
        try {
            Product result = query.getSingleResult();
            return  result;
        } catch(Exception e) {
            // no result was found ..for any number of reasons
            return null;
        } finally{
            //have to close the session at the end .. which tells hibernate to give the connection back to the pool
            session.close();
        }
    }

    // to search a product by its name
    public List<Product> search(String name) {

        String hqlQuery = "SELECT p FROM Product p WHERE p.productName LIKE concat('%',:name,'%')  ORDER BY p.buyPrice"; //LIKE concat('%',:name,'%')

        Session session = factory.openSession();

        TypedQuery<Product> query = session.createQuery(hqlQuery, Product.class);

        query.setParameter("name", name);

        try {
            List<Product> result = query.getResultList();
            return result;
        } catch (Exception e) {
            // no result was found ..for any number of reasons
            return new ArrayList<>();
        } finally {
            session.close();
        }
    }

    // Search a product by orderId
    public List<Product> searchByOrderId(Integer orderId) {

        String hqlQuery = "SELECT p FROM Product p, OrderDetail od WHERE p.id = od.productId AND od.orderId = :orderId";
        Session session = factory.openSession();

        TypedQuery<Product> query = session.createQuery(hqlQuery, Product.class);

        query.setParameter("orderId", orderId);

        try {
            List<Product> result = query.getResultList();
            return result;
        } catch (Exception e) {
            // no result was found ..for any number of reasons
            return new ArrayList<>();
        } finally {
            session.close();
        }
    }

    public List<OrderDetail> getOrderDetailsByOrderId(Integer orderId) {

        String hqlQuery = "SELECT od FROM Product p, OrderDetail od WHERE p.id = od.productId AND od.orderId = :orderId";
        Session session = factory.openSession();

        TypedQuery<OrderDetail> query = session.createQuery(hqlQuery, OrderDetail.class);

        query.setParameter("orderId", orderId);

        try {
            List<OrderDetail> result = query.getResultList();
            return result;
        } catch (Exception e) {
            // no result was found ..for any number of reasons
            return new ArrayList<>();
        } finally {
            session.close();
        }
    }
}
