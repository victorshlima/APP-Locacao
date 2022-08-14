package com.victation.AppLocacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String getindex (HttpServletRequest request){
        request.setAttribute("nome", "Victor");
        return "home";
    }



    

}
