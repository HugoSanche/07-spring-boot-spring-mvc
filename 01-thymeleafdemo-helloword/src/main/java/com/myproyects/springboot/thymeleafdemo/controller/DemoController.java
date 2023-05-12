package com.myproyects.springboot.thymeleafdemo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    // create a mapping for "/hello"
    @GetMapping("/hello")
    public String sayHello(Model theModel){
        //"theDate" es la misma variable que tienes en el archivo resources/templates/helloword.html
        theModel.addAttribute("theDate", new java.util.Date());
        return "helloword"; //va el mismo nombre del archivo que tienes en la carpeta resources/templates
    }
}

