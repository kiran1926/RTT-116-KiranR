package com.example.module309.controller;

import com.example.module309.database.dao.UserDAO;
import com.example.module309.database.entity.User;
import com.example.module309.form.SignupFormBean;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class LoginController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDAO userDAO;
    // -----------------------------  login page  --------------------------


    @GetMapping("/login/login")
    public ModelAndView theLoginPage(){
        ModelAndView response = new ModelAndView();
        response.setViewName("login/loginPage");

        return response;
    }

    @GetMapping("/login/signup")
    public ModelAndView signup(){
        ModelAndView response = new ModelAndView();
        response.setViewName("login/signUp");

        return response;
    }

    @PostMapping("/login/signupSubmit")
    public ModelAndView signupSubmit(@Valid SignupFormBean form, BindingResult bindingResult){
        ModelAndView response = new ModelAndView();

        //could manually check the email from the database and ADD an error to the binding

        if (bindingResult.hasErrors()) {
            response.setViewName("login/signUp");
            response.addObject("bindingResult", bindingResult);
            response.addObject("form", form);
        }else {
            User user = new User();

            user.setEmail(form.getUsername());
            user.setFullName(form.getFullname());

            String encryptedPassword = passwordEncoder.encode(form.getPassword());
            user.setPassword(encryptedPassword);

            userDAO.save(user);

            //redirect
            response.setViewName("redirect:/");
        }
        return response;
    }
}
