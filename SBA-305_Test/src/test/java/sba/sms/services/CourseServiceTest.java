package sba.sms.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import sba.sms.models.Course;
import sba.sms.models.Student;

import java.util.List;

public class CourseServiceTest {

    CourseService courseService = new CourseService();

    @Test
    public void createCourseTest(){
        //given
        Course given = new Course();
        given.setName("Full Stack Java Dev");
        given.setInstructor("Eric Heilig");

        //when
        Course actual = courseService.createCourse(given);

        //then
        Assertions.assertNotNull(actual.getId());
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8})
    public void getCourseByIdTest(int courseId){

        //when
        Course actual = courseService.getCourseById(courseId);

        //then
        Assertions.assertEquals(courseId, actual.getId());
        Assertions.assertNotNull(actual.getName());
//        Assertions.assertEquals("Java", actual.getName());
    }

    @Test
    public void getAllCoursesTest(){

        List<Course> actual = courseService.getAllCourses();
        //then
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(9, actual.size());
    }
}
