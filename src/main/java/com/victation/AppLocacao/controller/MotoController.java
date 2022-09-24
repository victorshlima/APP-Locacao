package com.victation.AppLocacao.controller;


import com.victation.AppLocacao.model.domain.Moto;
import com.victation.AppLocacao.model.domain.Usuario;
import com.victation.AppLocacao.model.repository.MotoRepository;
import com.victation.AppLocacao.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MotoController {

    @Autowired
    private MotoService motoService;


    @GetMapping(value = "/moto")
    public String telaCadastro(){
        return "moto/cadastro";
    }

    @GetMapping("/moto/lista")
    public String telaLista (Model model, @SessionAttribute("user") Usuario user){
        model.addAttribute("listagem", motoService.obterLista(user));
        return "/moto/lista";
    }

    @PostMapping(value ="/moto/incluir" )
    public String incluir(Moto moto, @SessionAttribute("user")Usuario user){
        motoService.incluir(moto, user);
        return  "redirect:/moto/lista";
    }

    @GetMapping(value ="/moto/{id}/excluir" )
    public String excluir(@PathVariable Integer id ){
        motoService.excluir(id);
        return  "redirect:/moto/lista";
    }

}
