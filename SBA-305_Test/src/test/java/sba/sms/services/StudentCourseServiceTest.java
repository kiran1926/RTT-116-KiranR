package sba.sms.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sba.sms.models.Student;
import sba.sms.models.StudentCourse;

public class StudentCourseServiceTest {

    CourseService courseService = new CourseService();
    StudentService studentService = new StudentService();
    StudentCourseService studentCourseService = new StudentCourseService();
    @Test

    public void createStudentCourseTest(){

        //given
        StudentCourse given = new StudentCourse();
        given.setCourse(courseService.getCourseById(1));
        given.setStudent(studentService.getStudentByEmail("reema@gmail.com"));
        given.setStudentId(1);
        given.setCourseId(1);

        //when
        StudentCourse actual = studentCourseService.createStudentCourse(given);

        //then
        Assertions.assertNotNull(actual.getId());

    }

}
