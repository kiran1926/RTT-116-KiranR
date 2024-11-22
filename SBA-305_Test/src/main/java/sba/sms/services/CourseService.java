package sba.sms.services;

import jakarta.persistence.TypedQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import sba.sms.dao.CourseI;
import sba.sms.models.Course;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * CourseService is a concrete class. This class implements the
 * CourseI interface, overrides all abstract service methods and
 * provides implementation for each method.
 */
public class CourseService implements CourseI {

    //    private SessionFactory factory = new Configuration().configure().buildSessionFactory();
    private SessionFactory factory = HibernateUtil.getSessionFactory();

    @Override
    public Course createCourse(Course course) {

        Session session = factory.openSession();

        session.getTransaction().begin();
        try{
            session.persist(course);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occurred while creating course!!");
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return course;
    }

    @Override
    public Course getCourseById(int courseId) {

        Session session = factory.openSession();
        session.getTransaction().begin();

        String hql = "SELECT c FROM Course c WHERE c.id = :courseId";
        TypedQuery<Course> query = session.createQuery(hql, Course.class);

        query.setParameter("courseId", courseId);

        try{
            Course result = query.getSingleResult();
            if (result == null){
                throw new RuntimeException("Error finding course!!");
            }
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public List<Course> getAllCourses() {

        Session session = factory.openSession();
        session.getTransaction().begin();

        String hql = "SELECT c FROM Course c";
        TypedQuery<Course> query = session.createQuery( hql, Course.class);

        try{
            List<Course> result = query.getResultList();
            if (result == null){
                throw new RuntimeException("Error finding all the courses!!");
            }
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return new ArrayList<>();
        }finally {
            session.close();
        }
//        return List.of();
    }
}
