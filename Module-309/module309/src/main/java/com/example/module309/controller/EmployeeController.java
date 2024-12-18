package com.example.module309.controller;

import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.dao.OfficeDAO;
import com.example.module309.database.entity.Employee;
import com.example.module309.database.entity.Office;
import com.example.module309.form.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private OfficeDAO officeDAO;

    @GetMapping("/employee/search")
    public ModelAndView searchEmployee(@RequestParam(required = false) String firstName){
        ModelAndView response = new ModelAndView();
        response.setViewName("employee/searchEmp");

        response.addObject("search", firstName);
        if(firstName != null){
            List<Employee> employees = employeeDAO.findByFirstName(firstName);
            response.addObject("employeesKey", employees);
        }
        return response;
    }

    @GetMapping("/employee/create")
    public ModelAndView createEmployee(){
        ModelAndView response = new ModelAndView();
        response.setViewName("employee/createEmployee");

        return response;
    }

    @GetMapping("/employee/create-employee")
    public ModelAndView createEmployeeSubmit(CreateEmployeeFormBean form){
        ModelAndView response = new ModelAndView();
        response.setViewName("employee/createEmployee");

        Employee employee = new Employee();

        employee.setFirstname(form.getFirstName());
        employee.setLastname(form.getLastName());
        employee.setEmail(form.getEmail());
        employee.setJobTitle(form.getJobTitle());
        employee.setExtension(form.getExtension());


        employeeDAO.save(employee);

        return response;
    }
}
