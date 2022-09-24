package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Carro;
import com.victation.AppLocacao.model.domain.Usuario;
import com.victation.AppLocacao.service.CarroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CarroController {

    private final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    public void excluir(Integer id){
        carroService.excluir(id);
    }

    @GetMapping(value = "/carro")
    public String telaCadastro(){
        return "carro/cadastro";
    }

    @GetMapping("/carro/lista")
    public String telaLista (Model model, @SessionAttribute("user") Usuario user){
        model.addAttribute("listagem", carroService.obterLista(user));
        return "/carro/lista";
    }

    @GetMapping("/carro/{id}/excluir")
    public String exclusao(@PathVariable String id){
        excluir(Integer.valueOf(id));
        System.out.println("excluido co sucesso" + id);
        return "redirect:/carro/lista";
    }
    @PostMapping(value ="/carro/incluir" )
    public String incluir(Carro carro, @SessionAttribute("user")Usuario user){
        carroService.incluir(carro, user);
        return  "redirect:/carro/lista";
    }

}
