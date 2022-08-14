package com.victation.AppLocacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MotoController {

    @GetMapping("/moto/lista")
    public String getindex (HttpServletRequest request){
        return "/moto/lista"; // "index" = pagina jsp dentro do template //spring.thymeleaf.prefix=classpath:/templates/
    }




}
