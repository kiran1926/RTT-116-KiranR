package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EmployeeDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory(); // at class level factory

    // !! BOILERPLATE to update order
    public Employee update(Employee employee){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.merge(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return employee;
    }

    // BOILERPLATE to INSERT PRODUCT
    public Employee create(Employee employee){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.persist(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return  employee;
    }

    // !!!!!!   BOILERPLATE TO DELETE
    public void delete(Employee employee){

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.delete(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }
    public void deleteById(int id) {
        Session session = factory.openSession();
        session.beginTransaction();
        Employee employee = (Employee) session.get(Employee.class, id);
        try {
            session.delete(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }


    public Employee findById(Integer id){

        Session session = factory.openSession(); //open session

        String hql = "SELECT e FROM Employee e WHERE e.id = :employeeId";

        TypedQuery<Employee> query = session.createQuery(hql);

        query.setParameter("employeeId", id);

        try{
            Employee result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;
        }finally{
            session.close();
        }
    }

    public List<Employee> findByFirstName(String firstName){

        Session session = factory.openSession(); //open session

        String hql = "SELECT e FROM Employee e WHERE e.firstname LIKE concat('%',:firstName,'%')";

        TypedQuery<Employee> query = session.createQuery(hql);

        query.setParameter("firstName", firstName);

        try{
            List<Employee> result = query.getResultList();
            return result;
        } catch (Exception e) {
            return null;
        }finally{
            session.close();
        }
    }

    public Employee findAnEmployeeByFirstName(String firstName){

        Session session = factory.openSession(); //open session

        String hql = "SELECT e FROM Employee e WHERE e.firstname LIKE concat('%',:firstName,'%')";

        TypedQuery<Employee> query = session.createQuery(hql);

        query.setParameter("firstName", firstName);

        try{
            Employee result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;
        }finally{
            session.close();
        }
    }
}
