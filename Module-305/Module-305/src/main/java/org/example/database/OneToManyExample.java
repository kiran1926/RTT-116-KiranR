package org.example.database;

import org.example.database.dao.CustomerDAO;
import org.example.database.dao.EmployeeDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Employee;

public class OneToManyExample {

    public static void main (String args[]){

        EmployeeDAO employeeDAO = new EmployeeDAO();

        CustomerDAO customerDAO = new CustomerDAO();

        Employee e = employeeDAO.findById(1501);
        System.out.println(e);

        for(Customer c : e.getCustomers()){
            System.out.println(c);
        }

        //add a new customer to this employee using hibernate
        Customer newCustomer = new Customer();
        newCustomer.setCustomerName("New Customer");
        newCustomer.setContactFirstname("Yug");
        newCustomer.setContactLastname("Walke");
        newCustomer.setAddressLine1("qwerty");
        newCustomer.setCity("Katy");
        newCustomer.setPhone("1233445");
        newCustomer.setCountry("USA");
        newCustomer.setState("Texas");
        newCustomer.setCreditLimit(3453.33);
        newCustomer.setAddressLine2("fghsf");

        // one of the gotchas is that you have to set the employee on the new customer even though you are adding the customer the list of customers in the next line of code
        newCustomer.setEmployee(e);

        // this is the best way to do this but wanted to show other hibernate features
         //customerDAO.create(newCustomer);

        e.getCustomers().add(newCustomer);

        // to save/create new customer
        employeeDAO.update(e);

    }
}
