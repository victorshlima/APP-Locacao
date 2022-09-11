package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Cliente;
import com.victation.AppLocacao.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@SessionAttributes("user")
@Controller
public class AppLocacaoController {

    @Autowired
    private ClienteService clienteService;

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
        clienteService = new ClienteService();
        Cliente cliente = clienteService.validar(email,senha);
        System.out.println("tentativa login" + email+senha  );
        if( cliente != null){

            System.out.println("localizado login" +cliente.getEmail());
          //  return "/";
            model.addAttribute("user",cliente);

            return "home";
           // return "redirect:/";
        }
        return "login";
        //return "redirect:/login";
    }

    @GetMapping("/cliente/cadastro")
    public String getSignUp (){
        return "/cliente/cadastro";
    }

    @GetMapping("/logout")
    public String getLogout(HttpSession httpSession, SessionStatus sessionStatus){
        sessionStatus.isComplete();
        httpSession.removeAttribute("user");
        System.out.println("Logout");

        return "redirect:/";
    }


}