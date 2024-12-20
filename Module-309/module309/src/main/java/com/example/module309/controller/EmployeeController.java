package com.example.module309.controller;

import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.dao.OfficeDAO;
import com.example.module309.database.entity.Customer;
import com.example.module309.database.entity.Employee;
import com.example.module309.database.entity.Office;
import com.example.module309.form.CreateCustomerFormBean;
import com.example.module309.form.CreateEmployeeFormBean;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Slf4j
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private OfficeDAO officeDAO;

    @GetMapping("/employee/search")
    public ModelAndView searchEmployee(@RequestParam(required = false) String firstName){
        ModelAndView response = new ModelAndView();
        //this is essentially translating /WEB-INF/jsp/employee/searchEmp.jsp
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

        //doing this for office dropdown on customer
        List<Office> offices = officeDAO.findAllOffices(); // or without writing native query - List<Employee> employees = employeeDAO.findAll();
        response.addObject("officesKey", offices);

        response.setViewName("employee/createEmployee");

        return response;
    }

    @GetMapping("/employee/edit/{employeeId}")
    public ModelAndView editEmployee(@PathVariable Integer employeeId){

        ModelAndView response = new ModelAndView();

        //this is the page primer for edit
        response.setViewName("employee/createEmployee");

        log.debug("======== EDITING Employee "+ employeeId);

        Employee employee = employeeDAO.findById(employeeId);

        CreateEmployeeFormBean form = new CreateEmployeeFormBean();

        form.setId(employee.getId());
        form.setFirstName(employee.getFirstname());
        form.setLastName(employee.getLastname());
        form.setEmail(employee.getEmail());
        form.setJobTitle(employee.getJobTitle());
        form.setReportsTo(employee.getReportsTo());
        form.setExtension(employee.getExtension());
        form.setVacationHours(employee.getVacationHours());
        form.setProfileImageUrl(employee.getProfileImageUrl());
        form.setOfficeId(employee.getOfficeId());

        response.addObject("form", form);
        //priming this for office dropdown on edit page
        List<Office> offices = officeDAO.findAllOffices();
        response.addObject("officesKey", offices);

        return response;
    }

    @GetMapping("/employee/create-employee")
    public ModelAndView createEmployeeSubmit(@Valid CreateEmployeeFormBean form, BindingResult bindingResult){
        ModelAndView response = new ModelAndView();
        response.setViewName("employee/createEmployee");

        log.debug(form.toString());

        if ( bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.debug(error.toString());
            }
            response.setViewName("employee/createEmployee");
            response.addObject("bindingResult", bindingResult);
            response.addObject("form", form);

            List<Office> offices = officeDAO.findAllOffices();
            response.addObject("officesKey", offices);
        }else{

            Employee employee = employeeDAO.findById(form.getId());
            if( employee == null){
                employee = new Employee();
            }
            employee.setFirstname(form.getFirstName());
            employee.setLastname(form.getLastName());
            employee.setEmail(form.getEmail());
            employee.setJobTitle(form.getJobTitle());
            employee.setExtension(form.getExtension());
            employee.setOfficeId(form.getOfficeId());
            employee.setVacationHours(form.getVacationHours());
            employee.setProfileImageUrl(form.getProfileImageUrl());

            //priming this for employee dropdown for after going to error
            Office office = officeDAO.findById(form.getOfficeId());
            employee.setOfficeId(office.getId());

            employeeDAO.save(employee);
            log.debug("======== SAVING CUSTOMER "+ employee.getId());

            //in either case .... create or edit ... I now want to redirect to the edit url
            response.setViewName("redirect:/employee/edit/" + employee.getId() + "?success=true");
        }
        return response;
    }
}
