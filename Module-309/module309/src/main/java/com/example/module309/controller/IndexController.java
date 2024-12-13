package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    //essentially spring boot has created the Dao for us when it started up and it is already in memory all we have to do is
    //autowire it and we can.. this is analogus to creating a new DAO in module 305
    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping("/index")
    public ModelAndView index(){

        ModelAndView response = new ModelAndView();

        //the goal of this controller method is to do 2 things
        // 1) Establish a view na,e if there is to be an HTML page that goes with this
        //this is our /WEB-INF/jsp/index.jsp
        response.setViewName("index");   // 6) on the architecture image converts "index" into "/WEB-INF/jsp/index.jsp"

        // 2) load any information from the database that I need  to dosplay on the page
        // this could be dozens of queries if necessary
        List<Customer> firstNames = customerDAO.findByFirstName("Alexander");
        for(Customer c : firstNames){
            System.out.println(c);
        }

        // once I have gathered something that i want to show on thjs page then I add it to the model
        //the model is nothing more than a HashMap
        response.addObject("names", firstNames); // names is referncing to jsp names

        // When I am finished and I return from this function I give control back to the  DispatcherServlet
        //to continue processing the request
        // this is 5) in the architectural image
        return response;
    }

    @GetMapping("/pathVariable/{varName}")  //pathvariable is static part
    public ModelAndView pathVariable(@PathVariable String varName){  // varName "config by convention"
        ModelAndView response = new ModelAndView();

        System.out.println(varName);

        response.setViewName("xyz789");

        return response;
    }

    @GetMapping("/courses/{courseId}/external_tools/{toolId}")  //pathvariable is static part
    public ModelAndView pathVariable(@PathVariable String courseId, @PathVariable String toolId){  // varName "config by convention"
        ModelAndView response = new ModelAndView();

        System.out.println(courseId+ ".... "+ toolId);

        response.setViewName("xyz789");

        return response;
    }

    @GetMapping("/requestParam")  //pathvariable is static part
    public ModelAndView requestParam(@RequestParam String season){  // varName "config by convention"
        ModelAndView response = new ModelAndView();

        System.out.println(season);

        response.setViewName("xyz789");

        return response;
    }

    @GetMapping(value = {"/index1","/index123"})
    public ModelAndView index1(@RequestParam (required = false) String search){   //IMP

        ModelAndView response = new ModelAndView();

        response.setViewName("index");  //IMP

        List<Customer> firstNames = customerDAO.findByFirstName(search);
        for(Customer c : firstNames){
            System.out.println(c);
        }
        response.addObject("names", firstNames);   //IMP
        return response;
    }


    //incomplete code just to give a brief example
    @GetMapping("/customer/submit")
    public ModelAndView customerSubmit(@RequestParam(required = false) String firstName,
                                       @RequestParam(required = false) String lastName){
        Customer customer = new Customer();
        customer.setContactFirstname(firstName);
        customer.setContactLastname(lastName);

        customerDAO.save(customer);
        return null;
    }



        // for understanding
    @GetMapping("/abc123")
        public ModelAndView abc123(){
            ModelAndView response = new ModelAndView();

            System.out.println("abc1223");

            response.setViewName("xyz789");

            return response;
        }

}
