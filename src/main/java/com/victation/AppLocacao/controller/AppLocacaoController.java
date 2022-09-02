package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AppLocacaoController {

    @GetMapping("/")
    public String getHome ( Model model){

        String nome = "";
        model.addAttribute("user",nome);

        return "home";
    }


    @GetMapping("/login")
    public String getTelaLogin ( ){
        return "/login";
    }

    @PostMapping("/login")
    public String getLogin (Model model, @RequestParam String email, @RequestParam  String senha ){

        Cliente cliente =ClienteController.validar(email,senha);

        if( cliente != null){
          //  return "/";
            String nome = "Admin";
            model.addAttribute("user",nome);

            return "home";
           // return "redirect:/";
        }
        //return "/login";
        return "redirect:/login";
    }


    @GetMapping("/cliente/cadastro")
    public String getSignUp (){
        return "/cliente/cadastro";
    }

    @GetMapping("/logout")
    public String getLogout(Model model){
        model.addAttribute("user", "");
        //return "home";//quando vc não usa redirect ele mantem a rota anterior, idela é sempre usar o redirect
        return "redirect:/";//quando vc não usa redirect ele mantem a rota anterior, idela é sempre usar o redirect


    }


}
