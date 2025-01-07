package com.example.module309.database.dao;

import com.example.module309.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface CustomerDAO extends JpaRepository<Customer, Long> {

    @Query("select c from Customer c where c.contactFirstname = :firstName")
    List<Customer> findByFirstName(String firstName);

    List<Customer>findByContactLastname(String lastName);

    //adding this for editing customer
    Customer findById (Integer id);

    List<Customer> findByContactLastnameAndContactFirstnameOrderByIdDesc(String contactLastname, String contactFirstname);

    //
    @Query(value = "select c.customer_name, c.contact_lastname, c.contact_firstname, " +
            " e.firstname as employee_firstname, e.lastname as employee_lastname " +
            " from customers c, employees e " +
            " where c.sales_rep_employee_id = e.id ", nativeQuery = true)

    List<Map<String, Object>> findCustomerWithEmployeeNames();

}