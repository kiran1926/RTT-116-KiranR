package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping("/customer/search")
    public ModelAndView searchCustomer(@RequestParam(required = false) String firstName) {
        ModelAndView response = new ModelAndView();

        //this is essentially translating /WEB-INF/jsp/customer/search.jsp
        response.setViewName("customer/search");

        //add the search field to the model so we can use it on the jsp page
        response.addObject("search", firstName);

        if ( firstName != null) {
            List<Customer> customers = customerDAO.findByFirstName(firstName);
            response.addObject("customersKey", customers);
        }

        System.out.println("===here===");
        return response;

    }

    @GetMapping("/customer/create")
    public ModelAndView createCustomer(){
        ModelAndView response = new ModelAndView();

        response.setViewName("customer/createCustomer");

        return response;
    }
}
