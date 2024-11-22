package sba.sms.services;

import jakarta.persistence.TypedQuery;
import lombok.extern.java.Log;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import sba.sms.dao.StudentI;
import sba.sms.models.Course;
import sba.sms.models.Student;
import sba.sms.models.StudentCourse;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * StudentService is a concrete class. This class implements the
 * StudentI interface, overrides all abstract service methods and
 * provides implementation for each method. Lombok @Log used to
 * generate a logger file.
 */

public class StudentService implements StudentI {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    @Override
    public List<Student> getAllStudents() {

        Session session = factory.openSession();
        session.getTransaction().begin();

        String hql = "SELECT s FROM Student s";
        TypedQuery<Student> query = session.createQuery( hql, Student.class);

        try{
            List<Student> result = query.getResultList();
            if (result == null){
                throw new RuntimeException("Error finding all the students!!");
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

    @Override
    public Student createStudent(Student student) {

        Session session = factory.openSession();
        if(student != null) {
            session.getTransaction().begin();
            try {
                session.persist(student);
                session.getTransaction().commit();
            } catch (Exception e) {
                System.out.println("!!! Error while creating student");
                session.getTransaction().rollback();
            } finally {
                session.close();
            }
        }
        return student;
    }

    @Override
    public Student getStudentByEmail(String email) {

        Session session = factory.openSession();

        session.getTransaction().begin();

        String hql = "SELECT s FROM Student s WHERE s.email = :email";
        TypedQuery<Student> query = session.createQuery( hql, Student.class);

        query.setParameter("email", email);

        try{
            Student result = query.getSingleResult();
            if (result == null){
                throw new RuntimeException("Unable to find student!!");
            }
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            System.out.println("Error finding student");
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public boolean validateStudent(String email, String password) {
        Session session = factory.openSession();

            session.getTransaction().begin();
        try {
            String hql = "SELECT s FROM Student s WHERE s.email = :email and s.password = :password";
            TypedQuery<Student> query = session.createQuery(hql, Student.class);

            query.setParameter("email", email);
            query.setParameter("password", password);

            Student result = query.getSingleResult();
            session.getTransaction().commit();
            if (result != null) {
                System.out.println("Valid Student!");
                return true;
            }else{
                System.out.println("Invalid Email or Password!");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error validating student: Try again!");
            return false;
        }finally {
            session.close();
        }
    }

    @Override
    public void registerStudentToCourse(String email, int courseId) {

        Session session = factory.openSession();
        session.getTransaction().begin();
        try{
//            String hql = "SELECT s FROM Student s WHERE s.email = :email";
//            TypedQuery<Student> query = session.createQuery(hql, Student.class);
//            query.setParameter("email", email);

              Student studentResult = getStudentByEmail(email);
//            Student studentResult = query.getSingleResult();
            if (studentResult == null){
                throw new RuntimeException("Student with email "+ email +" doesn't exist!");
            }
            //get course by courseId
            Course courseResult = session.get(Course.class, courseId);
            if (courseResult == null){
                throw new RuntimeException("Course with courseId "+ courseId +" not found!");
            }
            //check if student already registered for the course
            List<Course> registeredCourses = new ArrayList<>();
            for(StudentCourse sc : studentResult.getStudentCourses()){
                registeredCourses.add(sc.getCourse());
            }
            if(registeredCourses.contains(courseResult)){
                    System.out.println(studentResult.getName()+" is already registered for the course!");
                    session.getTransaction().rollback();
                    session.close();
            }else{
                    StudentCourseService studentCourseService = new StudentCourseService();
                    StudentCourse studentCourse = new StudentCourse();

                    studentCourse.setStudent(studentResult);
                    studentCourse.setCourse(courseResult);

                    studentCourseService.createStudentCourse(studentCourse);

                    // add to studentcourse list
                    studentResult.getStudentCourses().add(studentCourse);
                    courseResult.getStudentCourses().add(studentCourse);

                    session.getTransaction().commit();
                    System.out.println(studentResult.getName() + " successfully registered for the "+ courseResult.getName() + " course!");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful registration.");
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    @Override
    public List<Course> getStudentCourses(String email) {
        Session session = factory.openSession();
        List <Course> resultCourses = new ArrayList<>();

        try{
            session.getTransaction().begin();
            String hql = "SELECT s FROM Student s WHERE s.email = :email";
            TypedQuery<Student> query = session.createQuery(hql, Student.class);
            query.setParameter("email", email);

            Student result = query.getSingleResult();
            //check if student exists
            if (result == null){
                throw new RuntimeException("Student with email "+ email +" doesn't exist!");
            }
            //to get the list of courses
            String hqlCourses = "SELECT sc.course FROM Course c, StudentCourse sc WHERE sc.student.id = :studentId";
            TypedQuery<Course> queryCourses = session.createQuery(hqlCourses, Course.class);
            queryCourses.setParameter("studentId", result.getId());

            resultCourses = queryCourses.getResultList();
            session.getTransaction().commit();

        } catch (Exception e){
            session.getTransaction().rollback();
            System.out.println("Error getting Courses of the student with email "+ email);
            e.printStackTrace();
        }finally {
            session.close();
        }
        return resultCourses;
    }
}
