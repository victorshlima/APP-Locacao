package com.victation.AppLocacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testeController {

    @GetMapping("/index")
    public String getindex (HttpServletRequest request){
        request.setAttribute("nome", "Victor");
        return "index";
    }

}
