package sba.sms.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import sba.sms.models.Course;
import sba.sms.models.Student;
import sba.sms.models.StudentCourse;
import sba.sms.utils.CommandLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


class StudentServiceTest {
        StudentService studentService = new StudentService();
        StudentCourseService studentCourseService = new StudentCourseService();
        CourseService courseService =new CourseService();
    @Test
    public void getAllStudentsTest(){

        //given
//        List<Student> given = new ArrayList<>();

        //when
        List<Student> actual = studentService.getAllStudents();

        //then
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(6, actual.size());
    }

    @Test
    public void createStudentTest(){

        //given
        Student given = new Student();
        given.setName("Yug");
        given.setEmail("yug@gmail.com");
        given.setPassword("asdf");

        //when
        Student actual = studentService.createStudent(given);

        //then
        Assertions.assertNotNull(actual.getId());

    }

    @ParameterizedTest
    @ValueSource(strings = {"reema@gmail.com", "annette@gmail.com","anthony@gmail.com" })
    public void getStudentByEmail(String email){
        //given
//        Student given = new Student();
        //when
        Student actual = studentService.getStudentByEmail("reema@gmail.com");
        //then
        Assertions.assertNotNull(actual.getId());

    }

    @ParameterizedTest
    @CsvSource({
            "reema@gmail.com, asdf",
            "annette@gmail.com, asdf",
            "anthony@gmail.com, asdf"
    })
    public void validateStudentTest(String email, String password){
        //given
//        Student given = new Student();
        //when
       Boolean actual = studentService.validateStudent("reema@gmail.com", "asdf");
        //then
        Assertions.assertTrue(actual);
    }

    @ParameterizedTest
    @CsvSource({
            "reema@gmail.com, 7",
            "annette@gmail.com, 2",
            "anthony@gmail.com, 3"
    })
    public void registerStudentToCourse(String email, int courseId){
        //given
        StudentCourse given = new StudentCourse();
        Student student = studentService.getStudentByEmail(email);
        Course course = courseService.getCourseById(courseId);
        given.setStudent(student);
        given.setCourse(course);
        given.setStudentId(student.getId());
        given.setCourseId(course.getId());

        //when
        StudentCourse actual = studentCourseService.createStudentCourse(given);

        //then
        Assertions.assertEquals(courseId,actual.getCourseId());
        Assertions.assertEquals(email, actual.getStudent().getEmail());

    }

    @ParameterizedTest
    @ValueSource(strings = {"reema@gmail.com", "annette@gmail.com","anthony@gmail.com" })
    public void getStudentCoursesTest(String email){

        //given
        Student student = studentService.getStudentByEmail(email);
        List<Course> actualCourses = new ArrayList<>();
        for(StudentCourse sc : student.getStudentCourses()) {
            actualCourses.add(sc.getCourse());
        }
        //when

        //then
        Assertions.assertNotNull(actualCourses);
    }
}