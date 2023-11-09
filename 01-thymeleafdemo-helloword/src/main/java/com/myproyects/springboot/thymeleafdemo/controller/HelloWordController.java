package com.myproyects.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
}
