package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Automovel;
import com.victation.AppLocacao.model.domain.Usuario;
import com.victation.AppLocacao.service.AutomovelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AutomovelController {

    private final AutomovelService automovelService;
    private String mensagem;
    private String tipo;

    public AutomovelController(AutomovelService automovelService) {
        this.automovelService = automovelService;
    }

    @GetMapping(value = "/automovel")
    public String telaCadastro(@SessionAttribute("user") Usuario user, Model model){
        model.addAttribute("user", user);
        return "automovel/cadastro";
    }

    @GetMapping("/automovel/lista")
    public String telaLista ( Model model, @SessionAttribute("user") Usuario user){
        model.addAttribute("listagem", automovelService.obterLista(user));
        model.addAttribute("user", user);
        return "/automovel/lista";
    }

    @GetMapping("/automovel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        try {
            automovelService.excluir(id);
            mensagem = "Exclusão realizada com sucesso: " + id;
        } catch (Exception e) {
            mensagem = "Impossível excluir usuário:" + id;
            tipo = "danger";
        }

        return "redirect:/automovel/lista";
    }
    @PostMapping(value ="automovel/incluir" )
    public String incluir(Automovel automovel, @SessionAttribute("user")Usuario user){
        automovelService.incluir(automovel, user);
        mensagem = "Inclusão realizada com sucesso: " + automovel;
        tipo = "sucess";
        return  "redirect:/automovel/lista";
    }


}
