package com.myproyects.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    //need a controller method to show initial HTML form
    // create a mapping for "/showForm"
    @GetMapping("/showForm")
    public String sayHello(Model theModel){
        //"theDate" es la misma variable que tienes en el archivo resources/templates/helloword.html
        theModel.addAttribute("theDate", new java.util.Date());
        return "helloword-form"; //va el mismo nombre del archivo que tienes en la carpeta resources/templates
    }

    //need a controller method to process the HTML form

    //file helloword.html .- th:action="@{/processForm}"
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloword";
    }

    //need a controller method to read form data and
    //add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        //read the request parameter from the HTML form
        String theName=request.getParameter("studentName");

        //convert the data to all caps
        theName=theName.toUpperCase();

        //create the message
        String result="Yo !"+theName;

        //add message to the model
        model.addAttribute("message",result);

        return "helloword";
    }
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam ("studentName") String theName, Model model){

        //convert the data to all caps
        theName=theName.toUpperCase();

        //create the message
        String result="Bienvenido "+theName;

        //add message to the model
        model.addAttribute("message",result);

        return "helloword";
    }



}

