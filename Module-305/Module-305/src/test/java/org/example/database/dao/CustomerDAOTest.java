package org.example.database.dao;

import org.example.database.entity.Customer;
import org.example.database.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CustomerDAOTest {

    private CustomerDAO customerDAO = new CustomerDAO();
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    @Test
    public void findByIdTest(){                  // tests are public void

        //given
        int givenCustomerId = 103;   //(CustomerId = 125)

        //when
        try {
            Customer actual = new Customer();
            actual = customerDAO.findById(givenCustomerId);
            System.out.println(actual);

            //then
            Assertions.assertEquals("Atelier graphique", actual.getCustomerName());
            Assertions.assertEquals(givenCustomerId, actual.getId());
            Assertions.assertEquals(100000.35, actual.getCreditLimit());
            Assertions.assertNotEquals(1.00, actual.getCreditLimit());
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    @Test
    public void createTest(){

        //given
        Customer given = new Customer();

        given.setCustomerName("New Customer");
        given.setContactFirstname("Eric");
        given.setContactLastname("Eric");
        given.setPhone("5555551212");
        given.setAddressLine1("5555551212");
        given.setAddressLine1("222222");
        given.setCity("city");
        given.setState("asdfasdf");
        given.setPostalCode("023432");
        given.setCountry("USA");
        given.setCreditLimit(234.33);

        // we are not testing the employee, so it is okay to just query one from the database and set it
        Employee employee =  employeeDAO.findById(1216);
        given.setEmployee(employee);

        //when
        // we want to make sure that the given .getId is null before we insert to the database
        Assertions.assertNull(given.getId());
        Customer actual = customerDAO.create(given);

        //then
        //we want to make sure that the object now has id
        Assertions.assertNotNull(actual.getId());
        Assertions.assertNotNull(actual.getSalesRepEmployeeId());

        //typically we would check all fields on the entity to ensure that all
        Assertions.assertEquals(given.getContactFirstname(), actual.getContactFirstname());
        Assertions.assertEquals(given.getContactLastname(), actual.getContactLastname());

        // create an additional assertion to check the employee id is correct
        Assertions.assertEquals(employee.getId(), actual.getEmployee().getId());

    }

    // parametrized test
    @ParameterizedTest
    @CsvSource({
            "103, Atelier graphique",
            "112, Signal Gift Stores",
            "114, 'Australian Collectors, Co.'"
    })
    public void findById(int customerId, String customerName) {
        // this is not a very good test... just doing it to show how this
        //given

        //when
        Customer actual = customerDAO.findById(customerId);

        //then
        Assertions.assertEquals(customerName, actual.getCustomerName());

    }

}
