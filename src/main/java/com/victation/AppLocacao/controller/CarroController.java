package com.victation.AppLocacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarroController {

    @GetMapping("/carro/lista")
    public String getindex (HttpServletRequest request){
        return "/carro/lista";
    }




}