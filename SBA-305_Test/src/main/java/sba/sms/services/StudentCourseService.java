package sba.sms.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sba.sms.models.StudentCourse;

public class StudentCourseService {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

        public StudentCourse createStudentCourse(StudentCourse studentCourse){
            Session session = factory.openSession();

                    session.getTransaction().begin();
                    try {
                        session.persist(studentCourse);
                        session.getTransaction().commit();
                    } catch (Exception e) {
                        System.out.println("!!! Error while creating studentCourse");
                        session.getTransaction().rollback();
                    } finally {
                        session.close();
                    }
            return studentCourse;
        }

}
