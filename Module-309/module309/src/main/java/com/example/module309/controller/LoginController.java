package com.example.module309.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class LoginController {

    // -----------------------------  login page  --------------------------
    @GetMapping("/login/login")
    public ModelAndView theLoginPage(){
        ModelAndView response = new ModelAndView();
        response.setViewName("login/loginPage");

        return response;
    }

    @GetMapping("/user/create")
    public ModelAndView createUser(){
        ModelAndView response = new ModelAndView();
        response.setViewName("user/createUser");

        return response;
    }
}
