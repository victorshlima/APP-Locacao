package com.victation.AppLocacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LocacaoController {

    @GetMapping("/locacao/lista")
    public String getindex (HttpServletRequest request){
        return "/locacao/lista";
    }




}
