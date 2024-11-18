package org.example.database.dao;

import org.example.database.entity.Employee;
import org.junit.jupiter.api.*;

import java.util.List;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class EmployeeDAOTest {

    EmployeeDAO employeeDAO = new EmployeeDAO();

    //test for findById
    @Order(1)
    @Test
    public void findByIdTest(){

        //given
        int givenEmplId = 1619;

        //when
        Employee e = employeeDAO.findById(givenEmplId);

        //then
        Assertions.assertEquals("Tom", e.getFirstname());
        Assertions.assertEquals("King", e.getLastname());

    }

    //test for findByFirstName
    @Order(2)
    @Test
    public void findbyFirstNameTest(){
        //given
        String givenFirstName = "Leslie";

        //when
        List<Employee> employeeList = employeeDAO.findByFirstName(givenFirstName);

        //then
        Assertions.assertEquals(2, employeeList.size());
    }

    //create a new employee
    @Order(3)
    @Test
    public void createTest(){
        //given
        Employee givenEmp = new Employee();
        givenEmp.setFirstname("Veda");
        givenEmp.setLastname("Raj");
        givenEmp.setEmail("veda123456789@classicmodelcars.com");
        givenEmp.setJobTitle("Sales Rep");
        givenEmp.setExtension("x3987");

        givenEmp.setOfficeId(1);

        //when
        Assertions.assertNull(givenEmp.getId());
        Employee actual = employeeDAO.create(givenEmp);

        //then
        Assertions.assertNotNull(actual.getId());
        //assertions for each field
        Assertions.assertEquals("Veda", actual.getFirstname());
        Assertions.assertEquals("Raj", actual.getLastname());
        Assertions.assertEquals("veda123456789@classicmodelcars.com", actual.getEmail());
        Assertions.assertEquals("Sales Rep", actual.getJobTitle());
        Assertions.assertEquals("x3987", actual.getExtension());

    }

    //update test
    @Order(4)
    @Test
    public void updateTest(){

        //given

        Employee given = employeeDAO.findById(1727);
        given.setLastname("Swami");
        given.setExtension("x1020");

        //when
         Employee actual = employeeDAO.update(given);

        //then
        Assertions.assertEquals("Swami", actual.getLastname());
        Assertions.assertEquals("x1020", actual.getExtension());
    }

    //to delete the above created employee
    @Order(5)
    @Test
    public void deleteTest(){

        //given
        Employee given = employeeDAO.findById(1729);
        System.out.println(given);


        //when
        employeeDAO.delete(given);

        Employee actual =employeeDAO.findById(1729);

        //then
        Assertions.assertNull(actual);

    }
}
